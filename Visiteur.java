class Visiteur {

// DEBUT PACKAGE (animal)

//visiteur abstrait

	static abstract class VisiteurAnimal {
		public void visiter(Animal a) {
			System.out.println("On appelle visiter(Animal)");
			a.accepter(this);
		}
		abstract public void visiter(Vache v);
		abstract public void visiter(Chat v); 
	}

// hierarchie de classe

  static abstract class Animal {
    abstract public void accepter(VisiteurAnimal v) ;
    
  }

  static class Chat extends Animal {
    public void accepter(VisiteurAnimal v) {
          v.visiter(this);
    }
  }

  static class Vache extends Animal {
    public void accepter(VisiteurAnimal v) {
          v.visiter(this);
    }
  }

// FIN PACKAGE

/*
  static void crier(Animal a) {
    if (a instanceof Vache) {
    	System.out.println("Meuh!");
    }
    if (a instanceof Chat) {
    	System.out.println("Miaou!");
    }

  }
*/
static class MangerVisiteur extends VisiteurAnimal {
    public void visiter(Vache v) {
      System.out.println("Je mange de l'herbe");
    }
    public void visiter(Chat v) {
      System.out.println("Je mange des souris");
    }
  }


static class CriVisiteur extends VisiteurAnimal {
  public void visiter(Vache v) {
  	System.out.println("Meuh!");
  }
  public void visiter(Chat c) {
  	System.out.println("Miaou!");
  }
}

  public static void main(String [] args) {

  Animal v = new Vache();
  Animal c = new Chat();

  VisiteurAnimal vis = new MangerVisiteur();

  vis.visiter(v);
  vis.visiter(c);
/*
  crier(v); // afficher Meuh
  crier(c); // afficher Miaou
*/

  
  }
}

