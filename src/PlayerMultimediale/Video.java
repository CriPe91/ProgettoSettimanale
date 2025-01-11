package PlayerMultimediale;

public class Video extends ElementoMultimediale implements GestioneLuminosita,GestioneVolume {

    public Video(String titolo,int durata,int luminosita,int volume){
       super(titolo,durata,luminosita,volume);
    }

    public void Play(){
        for (int i = durata; i > 0 ; i--) {
            System.out.println("Titolo: " + titolo + " , "+ "Durata: " + durata +"min" + " "+"luminosita: " + "*".repeat(luminosita) +"Volume: "+"!".repeat(volume));
        }
    }

    @Override
    public void AbbassaLuminosita() {
        if(luminosita>0){
            luminosita--;
        }else{
            System.out.println("Luminosita minima");
        }
    }

    @Override
    public void AlzaLuminosita() {
        if(luminosita<5){
            luminosita++;
        }else{
            System.out.println("Luminosita massima");
        }
    }

    @Override
    public void AbbassaVolume() {
        if(volume>0){
            volume--;
        }else{
            System.out.println("Volume minimo");}
    }

    @Override
    public void AlzaVolume() {
        if(volume<5){
           volume++;
        }else{System.out.println("Volume massimo");}
    }
}
