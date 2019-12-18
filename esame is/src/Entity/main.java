package Entity;

import java.util.Date;
import Control.*;
public class main {
	

	public static void main(String[] args) {
	

		
		Prova[] prove=new Prova[3];
		Date dat;
		dat=new Date();
		dat.setDate(23);
		dat.setMonth(12);
		dat.setYear(2019);
		prove[0]=new Prova(dat, "I2", Tipo_Prova.SCRITTO);
		prove[1]=new Prova(dat, "I2", Tipo_Prova.CALCOLATORE);
		prove[2]=new Prova(dat, "I2", Tipo_Prova.ORALE);
	
		Gestione_appelli g =new Gestione_appelli();
		g.CreaCorso(0, "Natella","IInsgsd", 9);
		Appello a=g.Crea_Appello(dat, prove, 0);
		g.Crea_Appello(dat, prove, 0);
		Studente stud=new Studente("carlo", "rossi", "crl12");
		Studente stude=new Studente("crlo", "rosi", "crl2");
		g.Prenota_Appello(stud, 0);
		g.Prenota_Appello(stude, 1);
		g.Visualizza_Appelli();
	    int err=g.Visualizza_Prenotati("1");
	    System.out.println(err);
		

}
	
}