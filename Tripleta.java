package elJuegoDeLaVida;
/**
 * En esta clase creamos el objeto "Tripleta".
 * 
 * @author Alexis Nikolas Rodriguez de Aysa
 *
 */
public class Tripleta {
	/*
	 * Creamos los atributos
	 */
	private int numI;
	private int alive;
	private int newC;
	/**
	 * pre: Le pasamos los atributos como parametros.
	 * post: Creamos el primer constructor.
	 */
	public Tripleta(int numI, int alive, int newC) {
		super();
		this.numI = numI;
		this.alive = alive;
		this.newC = newC;
	}
	/**
	 * pre:---
	 * post: Creamos el segundo constructor por defecto.
	 */
	public Tripleta() {
		
	}
	/**
	 * pre:---
	 * post: Creamos los Getter y los Setter.
	 */
	public int getNumI() {
		return numI;
	}
	public void setNumI(int numI) {
		this.numI = numI;
	}
	public int getAlive() {
		return alive;
	}
	public void setAlive(int alive) {
		this.alive = alive;
	}
	public int getNewC() {
		return newC;
	}
	public void setNewC(int newC) {
		this.newC = newC;
	}
	/**
	 * Creamos el toString.
	 */
	@Override
	public String toString() {
		return "La generacion en la que nos encontramos actualmente es "
				+ "la que corresponde a la cifra ==)> " + numI +
				"\nEl digito de celulas que restan con vida es "
				+ "el que se muestra a continuacion ==)> " + alive +
				"\nEl numero de entes que han aparecido dependiendo de las "
				+ "condiciones se trata del equivalente a ==)> " + newC;
	}
}