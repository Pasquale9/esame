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
	
	
	public int Visualizza_Prenotati(int idappello)
	{
		//System.out.println(a);
		for(Appello a : Elenco_Appelli)
		{
		
			if(a.Get_id_appello()==idappello)
			{
				System.out.println(a.Get_Studenti());
				return a.Get_Studenti().size();
				
			}
		}
			return -1;
		
	}
	
	
}

