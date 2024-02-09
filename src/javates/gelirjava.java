package javates;

import java.util.Scanner;

public class gelirjava {

	public static void main(String[] args) {
		HesapTakip hesap = new  HesapTakip();
		Scanner input = new Scanner(System.in);	
		boolean devam = true;
		
		
	while(devam) {
		System.out.println("1 . Gelir Ekle  ");
		System.out.println("2 . Gider Ekle  ");
		System.out.println("3 . Toplam Gelir  ");
		System.out.println("4 . Toplam Gider  ");
		System.out.println("5 . Ne kar / Zarar  ");
		System.out.println("6 . Çıkış  ");
		 System.out.print("Seçiminiz: ");
		 
		 
		 
		 	int secim = input.nextInt();
		 	
		 	
		 	switch(secim) {
		 	case 1:
		 		System.out.println("Gelir Miktarı");
		 		double gelirEkle = input.nextDouble();
		 		hesap.gelirEkle(gelirEkle);
		 		break;
		 	case 2: 
		 		System.out.println("Gider Miktarı");
		 		double giderEkle = input.nextDouble();
		 		hesap.giderEkle(giderEkle);
		 		break;
		 	case 3 : 
		 		System.out.println("Toplam Gelir :  " + hesap.toplamGelir());
		 		break;
		 	case 4 :
		 		System.out.println("Topam Gider : " + hesap.toplamGider());
		 		break;
		 	case 5 :
		 		System.out.println("Ne kar / Zarar " + hesap.KararZarar());
		 		break;
		 	case 6 :
		 		devam = false;
		 		break;
		 		default:
		 			System.out.println("Çıkıldı ");
		 			break;
		 		
		 	}
		 	 input.close();
		 
	}

	
	}
	 
		
	}

	 	
	 	


	


