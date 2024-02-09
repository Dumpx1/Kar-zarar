package javates;

public class HesapTakip {
	private double gelir;
	private double gider;
	 
	public HesapTakip() {
		this.gelir = 0;
		this.gider = 0;
		
		
	}
	public void gelirEkle(double miktar ) {
		this.gelir += miktar;
			
	}
	public void giderEkle(double miktar) {
		this.gider += miktar;
	}
	public double toplamGelir(){
		return this.gelir;
		
	}
	public double toplamGider() {
		return this.gider;
		
	}
	public double KararZarar() {
		return this.gelir - this.gider;
	}
	
	
		
	}
	
	

		

