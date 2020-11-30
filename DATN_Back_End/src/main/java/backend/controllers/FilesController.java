package backend.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class FilesController {

	@RequestMapping(value = "/fileHtml", method = RequestMethod.GET)
	public void renameFileHtml(@RequestParam Integer idPost) {
		InputStream inStream = null;
		OutputStream outStream = null;

		try {
			File oldfile = new File("D:\\Fpoly\\Fall_2020\\DATN\\Front_End\\Front-End\\modules\\post\\post.html");
			File newfile = new File("D:\\Fpoly\\Fall_2020\\DATN\\Front_End\\Front-End\\modules\\post\\" + String.valueOf(idPost) + ".html");

			if (oldfile.renameTo(newfile)) {
				File file = new File("D:\\Fpoly\\Fall_2020\\DATN\\Front_End\\Front-End\\modules\\post\\post.html");

				if (file.createNewFile()) {
					inStream = new FileInputStream(newfile);
					outStream = new FileOutputStream(file);

					int length;
					byte[] buffer = new byte[1024];

					while ((length = inStream.read(buffer)) > 0) {
						outStream.write(buffer, 0, length);
					}

					System.out.println("File is copied successful!");

					System.out.println("File is created!");
				} else {
					System.out.println("File already exists.");
				}

				System.out.println("Rename succesful");
			} else {
				System.out.println("Rename failed");
			}
		} catch (Exception e) {
			System.out.println("file rename error: " + e);
		} finally {
			try {
				inStream.close();
				outStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
