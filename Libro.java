/* Francesco Garbo
 * Classe libro
 * 24/02/2017
 * Progetto ASl
 **/
/**
   @author Garbo Francesco
   @version 1.0
*/
public class Libro
{
		
	public enum Tipologia {
		
		SCOLASTICO,
		NARRATIVA, 
		SCIENTIFICO,
		SPORTIVO, 
		ARTISTICO,
        ALTRO;
		
	}
	private Autore [] autori;
	private String casaEditrice, titolo, isbn;
	private double prezzo;
	private int edizione, annoPubblicazione, annoPrimaPubblicazione;
	private boolean disponibile;
	private String tipo;
    private Tipologia tipologia;

	/**
	  Costruise gli oggetti relativi al libro quali autore, casaEditrice, titolo, isbn, prezzo, edizione, annoPubblicazione ...
	  @param autori Autore[] array autori
	  @param casaEditrice String casa editrice
	  @param titolo String titolo libro
	  @param tipo Tipologia tipologia del libro (SCOLASTICO,NARRATIVA,SCIENTIFICO,SPORTIVO,ARTISTICO)
	  @param isbn String codice isbn
	  @param prezzo double prezzo libro
	  @param edizione int Numero dell'edizione
	  @param annoPubblicazione int Anno pubblicazione libro
	  @param annoPrimaPubblicazione int  Anno prima pubblicazione libro
	  @param disponibile boolean true se il libro è disponibile, false se non è disponibile
	*/
	public Libro (Autore[] autori, String casaEditrice,String titolo, String tipo, String isbn, double prezzo, int edizione, int annoPubblicazione, int annoPrimaPubblicazione, boolean disponibile){
			
		this.casaEditrice = casaEditrice;
		this.titolo = titolo;
		this.tipo = tipo;
		this.isbn = isbn;
		this.prezzo = prezzo;
		this.edizione = edizione;
		this.annoPubblicazione = annoPubblicazione;
		this.annoPrimaPubblicazione = annoPrimaPubblicazione;
		this.disponibile = disponibile;
        switch (tipo)
        {
            case "scolastico": tipologia = Tipologia.SCOLASTICO; break;
            case "narrativo": tipologia =Tipologia.NARRATIVA; break;
            case "scientifico": tipologia =Tipologia.SCIENTIFICO; break;
            case "sportivo": tipologia =Tipologia.SPORTIVO; break;
            case "artistico": tipologia =Tipologia.ARTISTICO; break;
            default: tipologia =Tipologia.ALTRO; break;
        }
        
		this.autori = new Autore[autori.length];
		for (int i = 0; i < autori.length; i++)
		{
			this.autori[i]=new Autore(autori[i].getNome(), autori[i].getCognome(), autori[i].getNazionalita());
		}
		
	}
	/**
	  Metodo get autori
	  @return Ritorna array autori
	 */
	public Autore[] getAutori(){
		return autori;
	}
	/**
	  Metodo get casa editrice
	  @return Ritorna casa editrice
	 */
	public String getCasaEditrice(){
		return casaEditrice;
	}
	/**
	  Metodo get titolo
	  @return Ritorna la stringa titolo
	 */
	public String getTitolo(){
		return titolo;
	}
	/**
	  Metodo Tipologia get Tipologia
	  @return Ritorna la tipologia 
	 */
	public Tipologia getTipologia(){
		return tipologia;
	}
    public String getTipo(){
		return tipo;
	}
	/**
	  Metodo get isbn
	  @return Ritorna la stringa dell'isbn
	 */
	public String getIsbn(){
		return isbn;
	}
	/**
	  Metodo get prezzo
	  @return Ritorna il prezzo
	 */
	public double getPrezzo(){
		return prezzo;
	}
	/**
	  Metodo get edizione
	  @return Ritorna l'edizione
	 */
	public int getEdizione(){
		return edizione;
	}
	/**
	  Metodo get anno pubblicazione
	  @return Ritorna l'anno di pubblicazione
	 */
	public int getAnnoPubblicazione(){
		return annoPubblicazione;
	}
	/**
	  Metodo get anno prima pubblicazione
	  @return Ritorna l'anno della prima pubblicazione
	 */
	public int getAnnoPrimaPubblicazione(){
		return annoPrimaPubblicazione;
	}
	/**
	  Metodo get disponibile
	  @return Ritorna true se è disponibile, false se non lo è
	 */
	public boolean getDisponibile(){
		return disponibile;
	}
	/**
	  Metodo toString
	  @return Ritorna la stringa delle variabili
	 */
	public String toString(){
		String s = "";
		for (int i = 0; i < autori.length; i++)
		{
			s+="Cognome: "+autori[i].getCognome()+"\nNome: "+autori[i].getNome()+"\nNazionalita': "+autori[i].getNazionalita();
		}
		s+= "Casa editrice: "+casaEditrice+"\n Titolo: "+titolo+"\nISBN: "+isbn+"\nPrezzo: "+prezzo+"\nEdizione: "+edizione+"\nAnno Pubblicazione: "+annoPubblicazione+"\nAnno Prima Pubblicazione"+annoPrimaPubblicazione;
		return s;
	}
}
