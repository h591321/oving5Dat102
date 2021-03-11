package opg2;

public class DobbelKjedetListeS<T extends Comparable<T>>  {
	private DobbelNode<T> foerste;
	private DobbelNode<T> siste;
	private int antall;
	
	public DobbelKjedetListeS(T minVerdi, T maksVerdi){
		foerste=new DobbelNode(minVerdi);
		siste=new DobbelNode(maksVerdi);
		antall=0;
		}
	
	public boolean fins(T el) {
		boolean funnet=false;
		DobbelNode<T> aktuell=foerste;
		
		int i=0;
		while(!funnet||i<antall) {
			if(aktuell.getElement().equals(el)) {
				funnet=true;
			}
			aktuell=aktuell.getNeste();
			i++;
		}
		return funnet;
	}
	public void leggTil(T ny){
		DobbelNode<T> nyNode = new DobbelNode<T>(ny);
		DobbelNode<T> aktuell=foerste;
		
		boolean funnet=false;
		int i=0;
		while(!funnet||i<antall) {
			if(ny.compareTo(aktuell.getElement())>0){
				aktuell=aktuell.getNeste();
			}
			else {
				nyNode.setNeste(aktuell);
				nyNode.setForrige(aktuell.getForrige());
				aktuell.getForrige().setNeste(nyNode);
				aktuell.setForrige(nyNode);
				funnet=true;
			}
			i++;
		}
		antall++;
	}
	public T fjern(T el){
		DobbelNode<T> peker=foerste;
		for(int i=0;i<antall;i++) {
			if(peker.getElement().equals(el)) {
				peker.getForrige().setNeste(peker.getNeste());
				peker.getNeste().setForrige(peker.getForrige());
				antall--;
				return el;
			}
			else {
				peker=peker.getNeste();
			}
		}
		return null;
		
	}

	public void visListe(){
		DobbelNode<T> peker=foerste.getNeste();
		
		System.out.println("Listen: ");
		for(int i=0;i<antall;i++) {
			System.out.println(peker.getElement());
			System.out.println();
			peker=peker.getNeste();
		}
	}
}
