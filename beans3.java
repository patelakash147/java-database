package pro;

public class beans3 {
	int instrument_id ;
	String name ;
	 String i_key ;
	 String m_ssn ;
	public beans3(int instrument_id, String name, String i_key, String m_ssn) {
		super();
		this.instrument_id = instrument_id;
		this.name = name;
		this.i_key = i_key;
		this.m_ssn = m_ssn;
	}
	public int getInstrument_id() {
		return instrument_id;
	}
	public void setInstrument_id(int instrument_id) {
		this.instrument_id = instrument_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getI_key() {
		return i_key;
	}
	public void setI_key(String i_key) {
		this.i_key = i_key;
	}
	public String getM_ssn() {
		return m_ssn;
	}
	public void setM_ssn(String m_ssn) {
		this.m_ssn = m_ssn;
	}
	
}
