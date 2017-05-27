/* Francesco Garbo
 * Catalogo Libri On Line
 * copyright (c) 2017
 * 24/02/2017
 * Progetto ASl
 **/

import java.util.Scanner;
public class CatalogoLibriOnLine
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		
		int giorno, mese, anno;
		Double prezzo;
		int indice=0;
	
		String stringa, risposta;
		Catalogo primoCatalogo;
		
		Libro libri[]= new Libro[1];
		Libro libroDaAggiungere;
		String casaEditrice, titolo, nome, cognome, nazionalita, isbn;
		int numAutori, edizione, annoPubblicazioneEdizione, annoPrimaPubblicazione;
		boolean disponibile=true;	
		
		Data date= new Data();
	
		System.out.println("Benvenuto nella libreria! \n\nCome prima operazione inserisci la data di oggi secondo l'ordine gg/mm/aaaa separando i valori con invio");
		System.out.println();
		System.out.print("gg> ");
		giorno = in.nextInt(); 
		System.out.print("mm> ");
		mese = in.nextInt(); 
		System.out.print("aaaa> ");
		anno = in.nextInt(); 
		date.setData(giorno, mese, anno);
		
		System.out.println();
		
		System.out.println("In questo momento la libreria e' vuota. \nProcediamo con l'inserimento di un libro...");
		
		System.out.println();
		
		System.out.print("Titolo> ");
		titolo=in.next(); 
		System.out.println();
		
		System.out.println("Quanti autori vuoi inserire?");
		
		System.out.println();
		
		System.out.print("n_autori> ");
		numAutori = in.nextInt();
		
		Autore [] autori = new Autore [numAutori];
		
		for (int i = 0; i < numAutori; i++)
		{
			System.out.println("Inserisci nome, cognome e nazionalita' dell'autore (separa i valori con invio)");
			System.out.print("cognome> ");
			cognome=in.next();
			System.out.print("nome> ");
			nome=in.next();
			System.out.print("nazionalita> ");
			nazionalita=in.next();
			autori [i] = new Autore (cognome, nome, nazionalita);
			
			System.out.println();
		}
			
		System.out.println();
		
		System.out.println("Tipologia (scegli tra: scolastico, narrativo, scientifico, sportivo, artistico. Altre opzioni non saranno considerate)");
		stringa=in.next();
		
		System.out.println();
		
		System.out.print("Casa_editrice> ");
		casaEditrice=in.next();
		
		System.out.println();
		
		System.out.print("Prezzo> ");
		prezzo=in.nextDouble();
		
		System.out.println();
		
		System.out.print("isbn> ");
		isbn=in.next();
		
		System.out.println();
		
		System.out.print("Edizione_(numero)> ");
		edizione=in.nextInt();
		
		System.out.println();
		
		System.out.print("Edizione_(anno)> ");
		annoPubblicazioneEdizione=in.nextInt();
		
		System.out.println();
		
		System.out.print("Prima_edizione_(anno)> ");
		annoPrimaPubblicazione=in.nextInt();
		
		System.out.println();
		
		System.out.println("Il libro e' disponibile? [si/no]");
		System.out.print("disponibile> ");
		risposta=in.next();

		switch (risposta)
		{
			case "si": disponibile=true;
			break;
			case "no": disponibile=false;
			break;
			default: disponibile=true;
			break;			
		}			
		
		System.out.println();
		
		libri[0]=new Libro(autori, casaEditrice, titolo, stringa, isbn, prezzo, edizione, annoPubblicazioneEdizione, annoPrimaPubblicazione, disponibile);
		
		
		primoCatalogo= new Catalogo (libri, date);
		
		System.out.println();		
		System.out.println("Il libro e' stato inserito nel catalogo con successo");
		System.out.println();
		do
		{
			System.out.println("Ora scegli una tra le seguenti opzioni");
			System.out.println();
			System.out.println("add: aggiungi un libro\n" +
							   "remove: rimuovi un libro in base al codice isbn\n" +
							   "search: ricerca un libro per isbn, restituisce true se è stato trovato\n"+
							   "superiore: ricerca prezzo superiore a quello inserito, restituisce il numero di libri che hanno un prezzo superiore a quello inserito\n" +
							   "autori: ricerca i libri che hanno pi\u00F9 di un autore, restituisce il numero di libri che rispettano il criterio\n" +
							   "extend: espandi il numero massimo di elementi del catalogo (raddoppia) \n" +
							   "ordina: ordina i libri in ordine alfabetico \n" +
							   "archivio: visualizza l'intero archivio attuale \n"+
							   "exit: esci \n");
						   
			System.out.print("operazione> ");
			risposta=in.next();
			risposta=risposta.toLowerCase();
			
			switch (risposta)
			{
				case "add" :
				System.out.println("In questo momento la libreria contiene "+primoCatalogo.getDim()+" libri. \n\nProcediamo con l'inserimento di un libro...");
				System.out.println("Stai modificando la tua libreria. Per favore inserisci la data di oggi secondo l'ordine gg/mm/aaaa separando i valori con invio");
				System.out.println();
				System.out.print("gg> ");
				giorno = in.nextInt(); 
				System.out.print("mm> ");
				mese = in.nextInt(); 
				System.out.print("aaaa> ");
				anno = in.nextInt(); 
				
				Data date2 =new Data();
				date2.setData(giorno, mese, anno);
				
				System.out.println();
				
				
				
				System.out.println();
				
				System.out.print("Titolo> ");
				titolo=in.next(); 
				System.out.println();
				
				System.out.println("Quanti autori vuoi inserire?");
				
				System.out.println();
				
				System.out.print("n_autori> ");
				numAutori = in.nextInt();
				
				Autore [] autori2 = new Autore [numAutori];
				
				for (int i = 0; i < numAutori; i++)
				{
					System.out.println("Inserisci nome, cognome e nazionalita' dell'autore (separa i valori con invio)");
					System.out.print("cognome> ");
					cognome=in.next();
					System.out.print("nome> ");
					nome=in.next();
					System.out.print("nazionalita> ");
					nazionalita=in.next();
					autori2 [i] = new Autore (cognome, nome, nazionalita);
					
					System.out.println();
				}
					
				System.out.println();
				
				System.out.println("Tipologia (scegli tra: scolastico, narrativo, scientifico, sportivo, artistico. Altre opzioni non saranno considerate)");
				stringa=in.next();
				
				System.out.println();
				
				System.out.print("Casa_editrice> ");
				casaEditrice=in.next();
				
				System.out.println();
				
				System.out.print("Prezzo> ");
				prezzo=in.nextDouble();
				
				System.out.println();
				
				System.out.print("isbn> ");
				isbn=in.next();
				
				System.out.println();
				
				System.out.print("Edizione_(numero)> ");
				edizione=in.nextInt();
				
				System.out.println();
				
				System.out.print("Edizione_(anno)> ");
				annoPubblicazioneEdizione=in.nextInt();
				
				System.out.println();
				
				System.out.print("Prima_edizione_(anno)> ");
				annoPrimaPubblicazione=in.nextInt();
				
				System.out.println();
				
				System.out.println("Il libro e' disponibile? [si/no]");
				System.out.print("disponibile> ");
				risposta=in.next();

				switch (risposta)
				{
					case "si": disponibile=true;
					break;
					case "no": disponibile=false;
					break;
					default: disponibile=true;
					break;			
				}			
					
				
				System.out.println();
				
				libroDaAggiungere=new Libro(autori2, casaEditrice, titolo, stringa, isbn, prezzo, edizione, annoPubblicazioneEdizione, annoPrimaPubblicazione, disponibile);
				primoCatalogo.aggiungiLibro(libroDaAggiungere, date2);
				System.out.println("\nIl libro e' stato aggiunto \n");
											
				
				break;
					
				case "remove" :
					
					System.out.println("Stai modificando la tua libreria. Per favore inserisci la data di oggi secondo l'ordine gg/mm/aaaa separando i valori con invio");
					giorno = in.nextInt(); 
					mese = in.nextInt(); 
					anno = in.nextInt(); 
					date.setData(giorno, mese, anno);
					
					System.out.println();
					
					System.out.println("inserisci il codice del libro da rimuovere");
					isbn = in.next();
					primoCatalogo.eliminaLibro(isbn, date);
					System.out.println("Il libro con isbn "+isbn+" \u00E8 stato rimosso con successo\n");
					break;
					
				case "search" :System.out.println("inserisci il codice del libro da cercare");
					isbn = in.next();
					if (primoCatalogo.trovaLibroIsbn(isbn) == true)
					{
						System.out.println("Il libro \u00E8 stato trovato\n");
					}
					else
					{
						System.out.println("Non corrisponde nessun libroa questo codice isbn\n");
					}
					break;
					
				case "superiore" :System.out.println("inserisci il criterio di ricerca (prezzo)");
					prezzo = in.nextDouble();
					System.out.println("Sono stati trovati "+primoCatalogo.prezzoSuperioreA(prezzo)+" con prezzo superiore a "+prezzo+" euro\n");
					break;
						
				case "autori" :System.out.println("inserisci il codice del libro da cercare \n");
					System.out.println("Nella libreria sono presesnti "+primoCatalogo.piuAutori()+" libri con piu' di un autore\n");
					break;
						
				case "extend" :	primoCatalogo.cambiaDimensione();
					System.out.println("Catalogo raddoppiato \n");
					break;

				case "ordina" :	primoCatalogo.ordinaLibri();
					System.out.println("La libreria \u00E8 stata ordinata con successo. Ora tutti i libri sono disposti in ordine alfabetico \n");
					break;
						
				case "archivio" : System.out.println(primoCatalogo.toString());
					break;
								
				case "exit" : break;	

				default: break;
			}
				
		}
		while(!risposta.equals("exit"));
	}
}
