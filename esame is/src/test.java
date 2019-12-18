import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import Control.Gestione_appelli;
import Entity.Appello;
import Entity.Prova;
import Entity.Studente;
import Entity.Tipo_Prova;

public class test {


	@Test
	public void test0() {
		Gestione_appelli g =new Gestione_appelli();
		Prova[] prove=new Prova[3];
		Date dat;
		dat=new Date();
		dat.setDate(23);
		dat.setMonth(12);
		dat.setYear(2019);
		prove[0]=new Prova(dat, "I2", Tipo_Prova.SCRITTO);
		prove[1]=new Prova(dat, "I2", Tipo_Prova.CALCOLATORE);
		prove[2]=new Prova(dat, "I2", Tipo_Prova.ORALE);
		g.CreaCorso(0, "Natella","Analisi", 9);
		g.Crea_Appello(dat, prove, 0);
		int err=g.Visualizza_Prenotati("0");
		assertEquals(0,err);
	}
	@Test
	public void test1() {
		Gestione_appelli g =new Gestione_appelli();
		Prova[] prove=new Prova[3];
		Date dat;
		dat=new Date();
		dat.setDate(23);
		dat.setMonth(12);
		dat.setYear(2019);
		prove[0]=new Prova(dat, "I2", Tipo_Prova.SCRITTO);
		prove[1]=new Prova(dat, "I2", Tipo_Prova.CALCOLATORE);
		prove[2]=new Prova(dat, "I2", Tipo_Prova.ORALE);
		g.CreaCorso(0, "Natella","Analisi", 9);
		g.Crea_Appello(dat, prove, 0);
		Studente stud=new Studente("carlo", "rossi", "n46000");
		g.Prenota_Appello(stud, 0);
		int err=g.Visualizza_Prenotati("0");
		
		
		assertEquals(1,err);
	}
	@Test
	public void test2() {
		Gestione_appelli g =new Gestione_appelli();
		Prova[] prove=new Prova[3];
		Date dat;
		dat=new Date();
		dat.setDate(23);
		dat.setMonth(12);
		dat.setYear(2019);
		prove[0]=new Prova(dat, "I2", Tipo_Prova.SCRITTO);
		prove[1]=new Prova(dat, "I2", Tipo_Prova.CALCOLATORE);
		prove[2]=new Prova(dat, "I2", Tipo_Prova.ORALE);
		g.CreaCorso(0, "Natella","Analisi", 9);
		g.Crea_Appello(dat, prove, 0);
		Studente stud1=new Studente("carlo", "rossi", "n46000");
		g.Prenota_Appello(stud1, 0);
		Studente stud2=new Studente("pino", "rossi", "n46001");
		g.Prenota_Appello(stud2, 0);
		Studente stud3=new Studente("franco", "rossi", "n46002");
		g.Prenota_Appello(stud3, 0);
		int err=g.Visualizza_Prenotati("0");
	
		assertEquals(3,err);
	}
	
	@Test
		public void test3() {
			Gestione_appelli g =new Gestione_appelli();
			Prova[] prove=new Prova[3];
			Date dat;
			dat=new Date();
			dat.setDate(23);
			dat.setMonth(12);
			dat.setYear(2019);
			prove[0]=new Prova(dat, "I2", Tipo_Prova.SCRITTO);
			prove[1]=new Prova(dat, "I2", Tipo_Prova.CALCOLATORE);
			prove[2]=new Prova(dat, "I2", Tipo_Prova.ORALE);
			g.CreaCorso(0, "Natella","Analisi", 9);
			g.Crea_Appello(dat, prove, 0);
			Studente stud1=new Studente("carlo", "rossi", "n46000");
			g.Prenota_Appello(stud1, 0);
			Studente stud2=new Studente("pino", "rossi", "n46001");
			g.Prenota_Appello(stud2, 0);
			Studente stud3=new Studente("franco", "rossi", "n46002");
			g.Prenota_Appello(stud3, 0);
			int err=g.Visualizza_Prenotati("7");
		
			assertEquals(-1,err);
		}
	@Test
		public void test4() {
			Gestione_appelli g =new Gestione_appelli();
			Prova[] prove=new Prova[3];
			Date dat;
			dat=new Date();
			dat.setDate(23);
			dat.setMonth(12);
			dat.setYear(2019);
			prove[0]=new Prova(dat, "I2", Tipo_Prova.SCRITTO);
			prove[1]=new Prova(dat, "I2", Tipo_Prova.CALCOLATORE);
			prove[2]=new Prova(dat, "I2", Tipo_Prova.ORALE);
			g.CreaCorso(0, "Natella","Analisi", 9);
			g.Crea_Appello(dat, prove, 0);
			Studente stud1=new Studente("carlo", "rossi", "n46000");
			g.Prenota_Appello(stud1, 0);
			Studente stud2=new Studente("pino", "rossi", "n46001");
			g.Prenota_Appello(stud2, 0);
			Studente stud3=new Studente("franco", "rossi", "n46002");
			g.Prenota_Appello(stud3, 0);
			int err=g.Visualizza_Prenotati("x12");
		
			assertEquals(-1,err);
		}
		
		
	}


