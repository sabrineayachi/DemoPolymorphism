package Polymorphism;

class IllustrationPolymorphisme {
	
	public static void main(String[] args) {
		Animal[] tab = {new Tigre(), new Lion(), new Tigre(), new Ours() };
		for (int i =0; i<tab.length; i++)
			tab[i].dormir();
		
	
	}

}
