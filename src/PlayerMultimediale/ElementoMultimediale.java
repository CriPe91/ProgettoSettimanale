package PlayerMultimediale;

public abstract class ElementoMultimediale {
    protected String titolo;
    protected int durata;
    protected int luminosita;
    protected int volume;

    public  ElementoMultimediale(int durata,String titolo){
     this.titolo=titolo;
        this.durata=durata;
    }

    public ElementoMultimediale(String titolo,int luminosita){
        this.titolo=titolo;
        this.luminosita=luminosita;
    }

    public void Show(){
        System.out.println("Titolo Immagine : "+ titolo);
        System.out.println(titolo + " " + "luminosita: " + luminosita);
    }

    public void Play(){
        System.out.println("Titolo: " + titolo + " , "+ "Durata, minuti:" + durata);
    }

}
