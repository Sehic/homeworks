package ba.bitcamp.hajrudin.homeworkPolymorphism.task01;

public class KompleksnoTijelo {
	
	private double povrsina=0;
	
	private Krug [] krugovi = new Krug[50];
	private Pravougaonik [] pravougaonici = new Pravougaonik[50];
	private Kvadrat[] kvadrati = new Kvadrat[50];
	
	
	public void dodajDio(KompleksnoTijelo kt){
		if(kt instanceof Krug){
			Krug k = (Krug) kt;
			for(int i = 0; i<krugovi.length; i++){
				if(this.krugovi[i]==null){
					this.krugovi[i]=k;
					break;
				}
			}
		} else if(kt instanceof Pravougaonik){
			Pravougaonik p = (Pravougaonik) kt;
			for(int i = 0; i<pravougaonici.length; i++){
				if(this.pravougaonici[i]==null){
					this.pravougaonici[i]=p;
					break;
				}
			}
		} else if (kt instanceof Kvadrat){
			Kvadrat k = (Kvadrat) kt;
			for(int i = 0; i<kvadrati.length; i++){
				if(this.kvadrati[i]==null){
					this.kvadrati[i]=k;
					break;
				}
			}
		} else {
			this.krugovi=kt.krugovi;
			this.kvadrati=kt.kvadrati;
			this.pravougaonici=kt.pravougaonici;
		}
	}
	
	public double getPovrsina(){
		for(int i = 0; i<this.krugovi.length; i++){
			if(this.krugovi[i]!=null){
				this.povrsina+=this.krugovi[i].getPovrsina();
			}
			if(this.pravougaonici[i]!=null){
				this.povrsina+=this.pravougaonici[i].getPovrsina();
			}
			if(this.kvadrati[i]!=null){
				this.povrsina+=this.kvadrati[i].getPovrsina();
			}
		}
		return this.povrsina;
	}

	@Override
	public String toString() {
		String s = "";
		for(int i = 0; i<krugovi.length;i++){
			if(this.krugovi[i]!=null){
				s+=this.krugovi[i].toString();
			}
			if(this.pravougaonici[i]!=null){
				s+=this.pravougaonici[i].toString();
			}
			if(this.kvadrati[i]!=null){
				s+=this.kvadrati[i].toString();
			}
		}
		return s;
	}
	
	
	
}
