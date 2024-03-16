
public class Main {

	public static void main(String[] args) {
		
		Resolution resolution = new Resolution(1920,1080);
		Monitör monitör = new Monitör("V5197DE","ASUS","18.5",resolution);
		Kasa kasa = new Kasa("Shadow blade","Shadow","temperli can");
		Anakart anakart = new Anakart("B250-pro","ASUS",10,"windows 10");
		Bilgisayar bilgisayar = new Bilgisayar(anakart,kasa,monitör);
		
		bilgisayar.getKasa().pcAc();
		bilgisayar.getAnakart().isletimSistemiYukle("pardus");
		bilgisayar.getMonitör().monitoruKapat();

	}

}
