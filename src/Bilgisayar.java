
public class Bilgisayar {
	private Anakart anakart;
	private Kasa kasa;
	private Monitör monitör;
	public Bilgisayar(Anakart anakart, Kasa kasa, Monitör monitör) {
		this.anakart = anakart;
		this.kasa = kasa;
		this.monitör = monitör;
	}
	public Anakart getAnakart() {
		return anakart;
	}
	public void setAnakart(Anakart anakart) {
		this.anakart = anakart;
	}
	public Kasa getKasa() {
		return kasa;
	}
	public void setKasa(Kasa kasa) {
		this.kasa = kasa;
	}
	public Monitör getMonitör() {
		return monitör;
	}
	public void setMonitör(Monitör monitör) {
		this.monitör = monitör;
	}
	
	
	

}
