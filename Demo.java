import Demo.Katten;

class Demo{
	public static void main(String [] args){
		
		Demo demo = new Demo();
		
		Katten Kat1 = new Katten();
		Katten Kat2 = new Katten();
		Katten Kat3 = new Katten();
		
		Kat1.kleur = "grijs";
		Kat2.kleur = "rood";
		Kat3.kleur = "zwart";
		
		Kat1.naam = "Thijsje";
		Kat2.naam = "Kjeld";
		Kat3.naam= "Hiro";
		
		Kat1.leeftijd = 2;
		Kat2.leeftijd = 1.5;
		Kat3.leeftijd = 11.5;
		
		Kat1.vrouw = true;
		Kat2.vrouw = false;
		Kat3.vrouw = true;
		
		Kat1.kittens();
		Kat2.kittens();
		Kat3.kittens();
		
		demo.katHernoemen(Kat3);
	}
		void katHernoemen(Katten s) {
			s.naam = "Poes";
		
		}
	
	   //Hem z'n voornaam de . zegt dat
	}


class Katten{
	String kleur; // Fields
	String naam;
	double leeftijd;
	Boolean vrouw = true; 
	void kittens() {
		System.out.println("De kleur van de kat is " + 
				kleur + ", de naam van de kat is " + 
				naam + " en deze kat is " + 
				leeftijd + " jaren oud" + ". Deze kat is een meisje: " + 
				vrouw);
		//defaultwaarden 0 0 0 /u000 false 0.0 null
	}
}
