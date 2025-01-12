package PlayerMultimediale;

public class RegistrazioneAudio extends ElementoMultimediale implements GestioneVolume {
    public RegistrazioneAudio(String titolo,int durata,int volume){
        super(titolo,durata,volume);
    }

    public void Play(){
        for (int i = durata; i > 0 ; i--) {
            System.out.println("Titolo: " + titolo + " , "+ "Durata: " + durata +"min"+"Volume: "+"!".repeat(volume));
        }
    }
    public void infoAudio(){
        System.out.println("Titolo: " + titolo + " , "+ "Durata: " + durata +"min"+" "+"Volume: "+"!".repeat(volume));
    }


    @Override
    public void AbbassaVolume() {
        if(volume>0){
        }
    }

    @Override
    public void AlzaVolume() {
        if(volume<5){
        }
    }
}
