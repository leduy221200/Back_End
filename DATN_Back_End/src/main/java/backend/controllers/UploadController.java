package backend.controllers;
import backend.Services.FileStorageService;
import backend.models.UploadResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import javax.servlet.http.HttpServletRequest;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UploadController {

    @Autowired
    private FileStorageService fileStorageService;
    
    private void CheckFolder() {
		File f = new File("./src/main/resources/static/upload");
		 
        if (f.exists()) {
            System.out.println("Folder existed " + f.getAbsolutePath());
        } else {
        	File dir = new File("./src/main/resources/static/upload");
        	if (dir.mkdirs()) {
        		System.out.println("Create directory " + dir.getAbsolutePath() + " success.");
        	}
            System.out.println("Foler created!");
        }
	}
    
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public UploadResponse uploadFile(@RequestParam("file") MultipartFile file) {  
    	CheckFolder();
        String fileName = fileStorageService.storeFile(file);  

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .path(fileName)
                .toUriString();

        return new UploadResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
    }

    @RequestMapping(value = "/uploadFiles", method = RequestMethod.POST)
    public List<UploadResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
    	CheckFolder();
        return Arrays.asList(files)
                .stream()
                .map(file -> uploadFile(file))
                .collect(Collectors.toList());
    }

    @RequestMapping(value = "/downloadFile/{fileName:.+}", method = RequestMethod.GET)
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
        // Load file as Resource
        Resource resource = fileStorageService.loadFileAsResource(fileName);

        // Try to determine file's content type
        String contentType = null;
        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException ex) {
            System.out.println("Could not determine file type.");
        }

        // Fallback to the default content type if type could not be determined
        if(contentType == null) {
            contentType = "application/octet-stream";
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
}
