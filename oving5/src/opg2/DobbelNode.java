package opg2;

public class DobbelNode<T> {
	private T element;
	private DobbelNode<T> neste;
	private DobbelNode<T> forrige;
	
	public DobbelNode(T element,DobbelNode<T> neste,DobbelNode<T> forrige) {
		this.element=element;
		this.neste=neste;
		this.forrige=forrige;
	}
	public DobbelNode(T element) {
		this.element=element;
		this.neste=null;
		this.forrige=null;
	}
	
	public T getElement() {
		return element;
	}
	public void setElement(T element) {
		this.element = element;
	}
	public DobbelNode<T> getNeste() {
		return neste;
	}
	public void setNeste(DobbelNode<T> neste) {
		this.neste = neste;
	}
	public DobbelNode<T> getForrige() {
		return forrige;
	}
	public void setForrige(DobbelNode<T> forrige) {
		this.forrige = forrige;
	}
	
}
