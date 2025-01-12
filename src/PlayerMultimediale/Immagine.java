package PlayerMultimediale;

public class Immagine extends ElementoMultimediale implements GestioneLuminosita {

    public Immagine(String titolo, int luminosita) {
        super(titolo, luminosita);
    }

    public void Show(){
        System.out.println("Titolo Immagine : "+ titolo);
        System.out.println(titolo + " " + "luminosita: " + "*".repeat(luminosita));
    }

    public void infoImmagine(){
        System.out.println("Titolo: "+ titolo + " " + "luminosita: " + "*".repeat(luminosita));
    }

    @Override
    public void AbbassaLuminosita() {
       if(luminosita<5){
           System.out.println("Titolo: "+ titolo +" " +"Luminosita: "+"*".repeat(luminosita--));
       }else{
           System.out.println("Luminosita minima");
       }
    }

    @Override
    public void AlzaLuminosita() {
        if (luminosita>0){
            System.out.println("Titolo: "+ titolo +" "+"Luminosita: "+"*".repeat(luminosita++));
      }else{
            System.out.println("Luminosita massima");
        }
    }
}
