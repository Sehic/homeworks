package ba.bitcamp.hajrudin.homeworkPolymorphism.task01;

public class Main {
	
	public static void main(String[] args) {
		
		KompleksnoTijelo vagon = new KompleksnoTijelo();
		vagon.dodajDio(new Krug(10));
		vagon.dodajDio(new Krug(10));
		vagon.dodajDio(new Pravougaonik(100, 60));
		
		KompleksnoTijelo lokomotiva = new KompleksnoTijelo();
		vagon.dodajDio(new Krug(10));
		vagon.dodajDio(new Krug(10));
		vagon.dodajDio(new Pravougaonik(100, 60));
		
		KompleksnoTijelo putnickiVagon = new KompleksnoTijelo();
		vagon.dodajDio(new Krug(10));
		vagon.dodajDio(new Krug(10));
		vagon.dodajDio(new Pravougaonik(100, 60));
		
		KompleksnoTijelo voz = new KompleksnoTijelo();
		voz.dodajDio(lokomotiva);
		voz.dodajDio(putnickiVagon);
		voz.dodajDio(vagon);
		
		System.out.printf("Povrsina voza je %.2f \n",voz.getPovrsina());
		
		System.out.println(voz);
	}
}
