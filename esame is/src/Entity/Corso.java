package Entity;

public class Corso {
private int Id;
private String NomeDocente;
private String NomeCorso;

private int CFU;


public Corso(int id, String nomedocente,String nomecorso,int cfu)
{this.Id=id;
this.NomeDocente=nomedocente;
this.NomeCorso=nomecorso;
this.CFU=cfu;
}


}
