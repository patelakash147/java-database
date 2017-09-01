package pro;

public class beans2 {
	
	int id;
	int albumidentifier;
	String format;
	String copyrightdate;
    String 	title;
	String m_ssn;
	public beans2(int id, int albumidentifier, String format, String copyrightdate, String title, String m_ssn) {
		super();
		this.id = id;
		this.albumidentifier = albumidentifier;
		this.format = format;
		this.copyrightdate = copyrightdate;
		this.title = title;
		this.m_ssn = m_ssn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAlbumidentifier() {
		return albumidentifier;
	}
	public void setAlbumidentifier(int albumidentifier) {
		this.albumidentifier = albumidentifier;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getCopyrightdate() {
		return copyrightdate;
	}
	public void setCopyrightdate(String copyrightdate) {
		this.copyrightdate = copyrightdate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getM_ssn() {
		return m_ssn;
	}
	public void setM_ssn(String m_ssn) {
		this.m_ssn = m_ssn;
	}
	

}
