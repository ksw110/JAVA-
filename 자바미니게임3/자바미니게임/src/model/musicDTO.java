package model;

public class musicDTO {
	
	private String title;
	private String singer;
	private String path;

	public musicDTO(String title,String singer,String path) {
		
		this.title = title;
     	this.singer =singer;
     	this.path =path;
		
	}

	public String getPath() {
		return path;
	}

	

	public String getTitle() {
		return title;
	}

	

	public String getSinger() {
		return singer;
	}

	
	
}

