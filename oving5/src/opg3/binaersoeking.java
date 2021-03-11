package opg3;

public class binaersoeking {
	
	public static<T extends Comparable<T>> 
	boolean binaerSoek(T[] data, int min, int maks, T el){
		
		if(min > maks){ // basistilfelle, ingen element
			return false;
		}
		int midtpunkt = (min + maks) / 2;
		int resultat = el.compareTo(data[midtpunkt]);
		if(resultat == 0){ // basistilfelle, finner elementet
			return true;
		}  // kunne brukt elseif
		if(resultat < 0){
			return binaerSoek(data, min, midtpunkt -1, el);
		} else{
			return binaerSoek(data, midtpunkt + 1, maks, el);
			}
		}
		

	public static void main(String[] args) {
		int[] tab = {2,4,5,7,8,10,12,15,18,21,23,27,29,30,31};
		binaerSoek(tab, 2,31, 2);
	}
}
