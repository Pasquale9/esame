package Entity;

import java.util.ArrayList;
import java.util.Date;

public class Appello {
	
private Date DataAppello;
private ArrayList<Prova> Elenco_prove= new ArrayList<Prova>();
private ArrayList<Studente> Elenco_Studenti= new ArrayList<Studente>();

private int IdCorso;
private int IdAppello;

public Appello(Date dataAppello,Prova[] prove,int idcorso,int idappello)
{
	this.DataAppello=dataAppello;
	this.IdCorso=idcorso;
	this.IdAppello=idappello;
	for(int i =0; i<prove.length; i++) {
	this.Elenco_prove.add( prove[i]);
	}
}

public Appello(Date dataAppello,int idcorso,int idappello)
{
	this.DataAppello=dataAppello;
	this.IdCorso=idcorso;
	this.IdAppello=idappello;

}

public void SetProva(Prova p)
	{
	this.Elenco_prove.add(p);
	};
	

	public void Aggiungi_Studente(Studente stud) {
		Elenco_Studenti.add(stud);
	}
	
	
	public ArrayList<Studente>  Get_Studenti() {
		return Elenco_Studenti;
}
	
	
	public int Get_id() {
		return this.IdCorso;
		
	}
	public int Get_id_appello() {
		return this.IdAppello;
		
	}
	
public String toString() {
		
		StringBuffer buf = new StringBuffer();
		
		buf.append("DataAppello=" + this.DataAppello + "\n");
		buf.append("Id Corso " + this.IdCorso + "\n");
		buf.append("Id Appello " + this.IdAppello + "\n");
		buf.append("\n Elenco Prove: \n \n");
		
		
		for ( Prova c : this.Elenco_prove ) {
			buf.append(c);
		}
		
		return buf.toString();
	}
 	
	
}
