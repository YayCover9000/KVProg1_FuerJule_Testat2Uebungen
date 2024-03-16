package Kandidatin;

public class Kandidatin {
	private String name;
	private float groesselnM;
	
	public Kandidatin() {
		this(null,0.0f);
	}
	public Kandidatin(String name) {
		this(name,0.0f);
	}
	public Kandidatin(float groesselnM) {
		this(null,groesselnM);
	}
	public Kandidatin(String name, float groesselnM) {
		setName(name);
		setGroesselnM(groesselnM);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setGroesselnM (float groesselnM) {
		this.groesselnM = groesselnM;
	}
	public float getGroesselnM() {
		return groesselnM;
	}

}
