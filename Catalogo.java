/* Francesco Garbo
 * Catalogo
 * 24/02/2017
 * Progetto ASl
 **/
public class Catalogo
{
	private Libro[] libri;
	private int dim;
	private Data dataAggiornamentoCatalogo;
	
	/**
	 * Costruttore che assegna all'array gli array di libri
	 * @param libri array di libri
	 * @param dataAgg oggetto di tipo Data per passare la data di creazione
	 * */
	public Catalogo(Libro [] libri, Data dataAgg)
	{
		this.dataAggiornamentoCatalogo=new Data();
		this.libri = new Libro[libri.length];
		for (int i = 0; i <libri.length; i++)
		{
		
			this.libri[i]=new Libro(libri[i].getAutori(), libri[i].getCasaEditrice(), libri[i].getTitolo(), libri[i].getTipo(), libri[i].getIsbn(), libri[i].getPrezzo(), libri[i].getEdizione(), libri[i].getAnnoPubblicazione(), libri[i].getAnnoPrimaPubblicazione(), libri[i].getDisponibile());
			
			
		}	
		this.dim=libri.length;
		this.dataAggiornamentoCatalogo.setData(dataAgg.getGiorno(), dataAgg.getMese(), dataAgg.getAnno());
	}
	/**
 * metodo trova libro
 * @param inputIsbn codice isbn da cercare
 * @return true se il libro è stato trovato ed è disponibile, false se non è disponibile o non è trovato 
 * 
 * */
	public boolean trovaLibroIsbn(String inputIsbn){
		boolean esistente=false;
		for (int i = 0; i <dim; i++)
		{
			if (libri[i].getIsbn().equals(inputIsbn))
			{
				esistente=true;
			}
			
		}
		return esistente;
	}
	/**
 * metodo per la ricerca dei libri con prezzo superiore o uguale a quello dato
 * @param p prezzo per fare la ricerca
 * @return numero di libri con prezzo superiore o uguale a quello inserito
 *  
 * */
	public int prezzoSuperioreA(double p){
		int conta=0;
		for (int i = 0; i < dim; i++)
		{
			if (libri[i].getPrezzo() > p)
			{
				conta++;
			}
			
		}
		return conta;		
	}
	/**
	 * metodo che cerca libri con più autori
	 * @return numero di libri con più autori
	 * */
	public int piuAutori(){
		int conta=0;
		for (int i = 0; i < dim; i++)
		{
			if (libri[1].getAutori().length > 1)
			{
				conta++;
			}
			
		}
		return conta;
	}
	/**
	 * metodo che restituisce la dimensione logica di libri
	 * @return dimensione logica array libri
	 * */
	public int getDim(){
		return dim;
	}
	/**
	 * metodo che restituisce la dimensione fisica di libri
	 * @return dimensione fisica array libri
	 * */
	public int getLLength(){
		return libri.length;
	}
	/**
	 * metodo che cambia demensione fisica array
	 * */	
	public void cambiaDimensione(){
		Libro[] app = new Libro[libri.length*2];
		for (int i = 0; i < dim-1; i++)
		{
			app[i] = new Libro(libri[i].getAutori(), libri[i].getCasaEditrice(),libri[i].getTitolo(), libri[i].getTipo(), libri[i].getIsbn(),libri[i].getPrezzo(),libri[i].getEdizione(),libri[i].getAnnoPubblicazione(),libri[i].getAnnoPrimaPubblicazione(),libri[i].getDisponibile());
		}
		libri = app;
	}
	/**
	 * metodo per aggiungere libri al catalogo
	 * @param nuovoLibro oggetto di tipo libro da aggiungere
	 * @param dataAgg data di aggiornamento
	 * */
	public void aggiungiLibro(Libro nuovoLibro, Data dataAgg){
		
		if (dim == libri.length){
			cambiaDimensione();
		}
		libri[dim-1] = new Libro(nuovoLibro.getAutori(), nuovoLibro.getCasaEditrice(),nuovoLibro.getTitolo(), nuovoLibro.getTipo(), nuovoLibro.getIsbn(),nuovoLibro.getPrezzo(),nuovoLibro.getEdizione(),nuovoLibro.getAnnoPubblicazione(),nuovoLibro.getAnnoPrimaPubblicazione(),nuovoLibro.getDisponibile());
		dataAggiornamentoCatalogo.setData(dataAgg.getGiorno(), dataAgg.getMese(), dataAgg.getAnno());
		dim++;
	}
	/**
	 * metodo per rimuovere libri dal catalogo
	 * @param isbnCerca String codice isbn
	 * @param dataAgg data di aggiornamento
	 * */
	public void eliminaLibro(String isbnCerca, Data dataAgg){
        
		for (int i = 0; i < dim-1; i++)
		{
            
			if (isbnCerca.equals(libri[i].getIsbn()))
			{
				
				for (int z = i; z < dim-1; z++)
				{
					this.libri[z] = new Libro(libri[z+1].getAutori(), libri[z+1].getCasaEditrice(),libri[z+1].getTitolo(), libri[z+1].getTipo(), libri[z+1].getIsbn(),libri[z+1].getPrezzo(),libri[z+1].getEdizione(),libri[z+1].getAnnoPubblicazione(),libri[z+1].getAnnoPrimaPubblicazione(),libri[z+1].getDisponibile());
					
				}
				libri[dim-1]=null;
				dim--;
				break;
			}
			
		}
		
		this.dataAggiornamentoCatalogo.setData(dataAgg.getGiorno(), dataAgg.getMese(), dataAgg.getAnno());

	}
	/**
	 * metodo per riordinare il catalogo in ordine alfabetico
	 * */
	public void ordinaLibri(){
		Libro app;
		for (int i = 0; i < dim-1; i++)
		{
			for (int j = i+1; j<dim-2; j++){
				
				if (libri[j].getTitolo().compareTo(libri[i].getTitolo())<0)
				{
					app = libri[j];
					libri[j] = libri[i];
					libri[i]= app;
				}
			
			}
			
		}
		
	}
	/**
	 * metodo che restituisce la data di aggiornamento
	 * @return data di aggiornamento
	 * */
	public Data getDataAggiornamentoCatalogo(){
		return dataAggiornamentoCatalogo;
	}
	/**
	  Metodo toString
	  @return Ritorna la stringa delle variabili
	 */
	public String toString(){
		String s="";
		int c=0;
		for (int i = 0; i < dim-1; i++)
		{
			c++;
			s+="\n\nLibro n. "+c+"\nTitolo Libro: \n"+libri[i].getTitolo()+"\nCasa editrice: "+libri[i].getCasaEditrice()+"\nTipologia: "+libri[i].getTipologia()+"\nISBN: "+libri[i].getIsbn()+"\nPrezzo: "+libri[i].getPrezzo()+"\nEdizione n: "+libri[i].getEdizione()+"\nAnno Pubblicazione: "+libri[i].getAnnoPubblicazione()+"\nAnno Prima Pubblicazione: "+libri[i].getAnnoPrimaPubblicazione()+"\nDisponibile: "+libri[i].getDisponibile();
		}
		
		s+="\nDataAggiornamentoCatalogo: "+dataAggiornamentoCatalogo.getGiorno()+"-"+dataAggiornamentoCatalogo.getMese()+"-"+dataAggiornamentoCatalogo.getAnno();
		
		return s;
	}
	
}
