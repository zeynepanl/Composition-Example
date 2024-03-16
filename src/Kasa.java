
public class Kasa {
	
	private String model;
	private String uretici;
	private String malzeme;
	
	public Kasa(String model,String uretici,String malzeme) {
		this.model=model;
		this.malzeme=malzeme;
		this.uretici=uretici;
	}
	
	public void pcAc() {
		System.out.println("Bilgisayar açılıyor..");
	}
	
	public String getmodel() {
		return model;
	}
	public void setmodel(String model) {
		this.model=model;
	}

	public String getUretici() {
		return uretici;
	}

	public void setUretici(String uretici) {
		this.uretici = uretici;
	}

	public String getMalzeme() {
		return malzeme;
	}

	public void setMalzeme(String malzeme) {
		this.malzeme = malzeme;
	}
	

}
