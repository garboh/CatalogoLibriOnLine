/* Francesco Garbo
 * Classe Autore
 * 24/02/2017
 * Progetto ASl **/
/**
   @author Garbo Francesco
   @version 1.0
*/

public class Autore{
	private String cognome;
	private String nome;
	private String nazionalita;
	
	
	/**
	  Costruise gli oggetti dell'autore, quali cognome, nome e nazionalità
	  @param cognome String del cognome dell'autore
	  @param nome String del nome dell'autore
	  @param nazionalita String nazionalità dell'autore
	*/
	public Autore(String cognome, String nome, String nazionalita){
		this.cognome = cognome;
		this.nome = nome;
		this.nazionalita = nazionalita;
	}
	/**
	  Metodo get per ottenere il cognome dell'autore
	  @return Ritorna la stringa del cognome dell'autore
	 */
	public String getCognome(){
		return cognome;
	}
	/**
	  Metodo get per ottenere il nome dell'autore
	  @return Ritorna la stringa del nome dell'autore
	 */
	public String getNome(){
		return nome;
	}
	/**
	  Metodo get per ottenere la nazionalià dell'autore
	  @return Ritorna la stringa della nazionalità dell'autore
	 */
	public String getNazionalita(){
		return nazionalita;
	}
	/**
	  Metodo toString
	  @return Ritorna la stringa delle variabili di istanza 
	 */
	public String toString(){
		String s;
		s = "Nome: "+nome+"\nCognome: "+cognome+"\nNazionalita': "+nazionalita;
		return s;
	}
}
