package Entity;

import java.util.Date;

public class Prova {
	private Date Data_prova;
	private String Aula;
	private Tipo_Prova Tipo;
	
public Prova(Date data_prova,String aula,Tipo_Prova tipo)
{
	this.Data_prova= new Date();
	this.Data_prova=data_prova;
	this.Aula=aula;
	this.Tipo=tipo;
}
	


public String toString() {
	
	StringBuffer buf = new StringBuffer();
	buf.append("Tipo: "+this.Tipo+"\n");
	buf.append("Data_prova=" + this.Data_prova.toString() + "\n");
	buf.append("Aula " + this.Aula+"\n\n");
	return buf.toString();
}


}
