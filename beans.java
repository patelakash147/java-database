package pro;

public class beans {
	int id;
	String ssn;
	String name;
	public beans(int id, String ssn, String name) {
		super();
		this.id = id;
		this.ssn = ssn;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
