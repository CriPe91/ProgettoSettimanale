package PlayerMultimediale;

public abstract class ElementoMultimediale {
    protected String titolo;
    protected int durata;
    protected int luminosita;
    protected int volume;

    public  ElementoMultimediale(String titolo,int durata,int volume){
     this.titolo=titolo;
        this.durata=durata;
        this.volume=volume;
    }
    public ElementoMultimediale(String titolo, int durata, int luminosita, int volume){
        this.titolo=titolo;
        this.durata=durata;
        this.luminosita=luminosita;
        this.volume=volume;
    }

    public ElementoMultimediale(String titolo,int luminosita){
        this.titolo=titolo;
        this.luminosita=luminosita;
    }

}
