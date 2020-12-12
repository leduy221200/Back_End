package backend.models;

public class UploadResponse {
	private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;

    public UploadResponse(String fileName, String fileDownloadUri, String fileType, long size) {
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
    }

	public String getFileName() {
		return fileName;
	}

	public String getFileDownloadUri() {
		return fileDownloadUri;
	}

	public String getFileType() {
		return fileType;
	}

	public long getSize() {
		return size;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFileDownloadUri(String fileDownloadUri) {
		this.fileDownloadUri = fileDownloadUri;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public void setSize(long size) {
		this.size = size;
	}
    
}