package Control;
import java.util.ArrayList;
import java.util.Date;

import Entity.*;
public class Gestione_appelli {
	public ArrayList<Appello> Elenco_Appelli= new ArrayList<Appello>();
	int IdAppello=0;
	
	public Corso CreaCorso(int id, String nomedocente,String  Nomecorso,int cfu) {
		Corso c= new Corso(id,nomedocente,Nomecorso,cfu);
		return c;
		
	}
	
	
	
	public Appello Crea_Appello(Date dataAppello,Prova[] prove,int idcorso) {
		Appello a=new Appello(dataAppello,prove,idcorso,IdAppello);
		Elenco_Appelli.add(a);
		IdAppello++;
		return a;
	}
	
	public Prova Crea_Prova(Date dataProva,String aula,Tipo_Prova tipo) {
		Prova a= new Prova(dataProva, aula, tipo);
		return a;
	}
	
	
	
	
	public void Prenota_Appello(Studente stud, int id)
	{
		for(Appello a : Elenco_Appelli)
		{
		
			if(a.Get_id_appello()==id)
			{
				a.Aggiungi_Studente(stud);
				
			}
		}
	}
	
	public void Visualizza_Appelli()
	{
		for(Appello a : Elenco_Appelli)
		{
		
			System.out.println(a+"\n");
		}
	}
	
	
	public int Visualizza_Prenotati(String idappello)
	{
		try {
		int id=Integer.parseInt(idappello.trim());
		for(Appello a : Elenco_Appelli)
		{
		
			if(a.Get_id_appello()==id)
			{
				System.out.println(a.Get_Studenti());
				return a.Get_Studenti().size();
				
			}}
		}
		catch (NumberFormatException nfe){
			 System.out.println("hai inserito un id che non corrisponde a nessun appello! Inserisci un id valido");
		      System.out.println("NumberFormatException: " + nfe.getMessage());
		      return -1;
		    }
		catch (NullPointerException e){
		      System.out.println("hai inserito un valore nullo! Inserisci un id valido");
		      return -1;
		    }
		
		
			return -1;
		
	}
	
	
}

