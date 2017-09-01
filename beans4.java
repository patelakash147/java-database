package pro;

public class beans4 {
	int place_id;
	 String address;
	 String phone_number;
	 String M_ssn;
	public beans4(int place_id, String address, String phone_number, String m_ssn) {
		super();
		this.place_id = place_id;
		this.address = address;
		this.phone_number = phone_number;
		M_ssn = m_ssn;
	}
	public int getPlace_id() {
		return place_id;
	}
	public void setPlace_id(int place_id) {
		this.place_id = place_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getM_ssn() {
		return M_ssn;
	}
	public void setM_ssn(String m_ssn) {
		M_ssn = m_ssn;
	}
	 

}
