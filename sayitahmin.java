package eylüll;

import java.util.Random;
import java.util.Scanner;

public class sayitahmin {

	public static void main(String[] args) {
	Random rand= new Random();
	Scanner scan = new Scanner(System.in);
	int can=5, sayi,tahmin,i=0;
	sayi= rand.nextInt(100);
	boolean oyundurum = false;
	int[] tahminler = new int [5];
	System.out.println(sayi);
	System.out.println("Bir sayı tuttum.");
	while(can>0) {
	System.out.println("Tahminde bulununuz.");
	tahmin =scan.nextInt();
	tahminler[i++]= tahmin;
	if(sayi==tahmin) {
		oyundurum=true;
		System.out.println("Doğru tahminde bulundunuz. Tuttuğum sayı:"+tahmin);
		break; 
	}else {
		System.out.println("Yanlış taminde bulundunuz. Tekrar deneyiniz.");
		System.out.println("Kalan can sayınız:"+ --can);
	}if(oyundurum) {
		
	}else {
		System.out.println("Başaramadınız.");
	}
		
	}System.out.print("Tahminleriniz:");
	
			for(int value: tahminler)
	{if(value!=0)
		System.out.print(+value+",");			
	}
	
	
	
	
	
	}

}
