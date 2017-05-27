/* Francesco Garbo
 * Classe Data
 * 24/02/2017
 * Progetto ASl
 **/
 
/**
   @author Garbo Francesco
   @version 1.0
*/
public class Data{
	private int giorno;
	private int mese;
	private int anno;
	/**
	 * metodo per settare la data
	 * @param giorno giorno
	 * @param mese mese
	 * @param anno anno
	 * */
	public boolean setData(int giorno, int mese, int anno){
		boolean bisesto=false;
		boolean giusto=false;
		
		// controllo anno bisestile
		if(anno%4 == 0){
			if(anno%100 == 0) {
				if(anno%400 == 0) {
					// bisestile
					bisesto = true;
				}else {
					// non bisestile
					bisesto = false;
				}
			}
		}else {
			// non bisestile
			bisesto = false;
		}
		
		//controllo g/m/a
		if(anno<=0){
			// L'anno non puo' essere inferiore a 0
			giusto=false;
		}
		switch(mese){
			case 1: if (giorno <= 31 && giorno>0){
						giusto=true;
					}else{
						//Gennaio puo' avere un massimo di 31 giorni
						giusto=false;
					}break;
			case 2:if (bisesto == true){
						if (giorno <= 29 && giorno>0){
							
							giusto=true;
						}else {

							giusto=false;
						}
					} else{
						if (giorno <= 28){
							giusto=true;
						}else{
							giusto=false;
						}
					}
					
					break;
			case 3: if (giorno <= 31 && giorno>0){
						
						giusto=true;
					}else{
						giusto=false;
					}break;
			case 4: if (giorno <= 30 && giorno>0){
						
						giusto=true;
					}else{
						giusto=false;
					}break;
			case 5: if (giorno <= 31 && giorno>0){
						
						giusto=true;
					}else{
						giusto=false;
					}
			case 6: if (giorno <= 30 && giorno>0){
						
						giusto=true;
					}else{
						giusto=false;
					}break;
			case 7: if (giorno <= 31 && giorno>0){
						
						giusto=true;
					}else{
						giusto=false;
					}break;
			case 8: if (giorno <= 31 && giorno>0){
						
						giusto=true;
					}else{
						giusto=false;
					}break;
			case 9: if (giorno <= 30 && giorno>0){
						
						giusto=true;
					}else{
						giusto=false;
					}break;
			case 10: if (giorno <= 31 && giorno>0){
						
						giusto=true;
					}else{
						giusto=false;
					}break;
			case 11: if (giorno <= 30 && giorno>0){
						
						giusto=true;
					}else{
						giusto=false;
					}break;
			case 12: if (giorno <= 31 && giorno>0){
						
						giusto=true;
					}else{
						giusto=false;
					}break;
			default : giusto=false;
		}
		
		if (giusto){
			this.giorno=giorno;
			this.mese=mese;
			this.anno=anno;
		}
		return giusto;
		
	}
	/**
	 * Metodo get giorno 
	 * @return Ritorna il giorno
	 * */
	public int getGiorno(){
		return giorno;
	}
	/**
	 * Metodo get mese 
	 * @return Ritorna il mese
	 * */
	public int getMese(){
		return mese;
	}
	/**
	 * Metodo get anno 
	 * @return Ritorna l'anno
	 * */
	public int getAnno(){
		return anno;
	}
	
	/**
	 * toString
	 * @return stringa con tutti i dati
	 * */
	public String toString(){
		String data;
		data = giorno+"-"+mese+"-"+anno;
		return data;
	}
}
