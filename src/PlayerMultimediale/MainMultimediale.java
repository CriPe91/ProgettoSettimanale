package PlayerMultimediale;

import java.util.Scanner;

public class MainMultimediale {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < elementi.length; i++) {
            System.out.println("Inserisci tipo elemento: immagine, video, audio ");
            String tipoElemento = sc.nextLine();
            System.out.println("Inserisci titolo: ");
            String titolo = sc.nextLine();

            if (tipoElemento.equalsIgnoreCase("immagine")) {
                System.out.println("Inserisci luminosita: ");
                int luminosita = sc.nextInt();
                sc.nextLine();  // Consuma il newline
                elementi[i] = new Immagine(titolo, luminosita);
            } else if (tipoElemento.equalsIgnoreCase("video")) {
                System.out.println("Inserisci durata: ");
                int durata = sc.nextInt();
                System.out.println("Inserisci luminosita: ");
                int luminosita = sc.nextInt();
                System.out.println("Inserisci volume: ");
                int volume = sc.nextInt();
                sc.nextLine();  // Consuma il newline
                elementi[i] = new Video(titolo, durata, luminosita, volume);
            } else if (tipoElemento.equalsIgnoreCase("audio")) {
                System.out.println("Inserisci durata");
                int durata = sc.nextInt();
                System.out.println("Inserisci volume");
                int volume = sc.nextInt();
                sc.nextLine();  // Consuma il newline
                elementi[i] = new RegistrazioneAudio(titolo, durata, volume);
            }
        }

        for (int i = 0; i < elementi.length; i++) {
            if (elementi[i] instanceof Immagine) {
                ((Immagine) elementi[i]).infoImmagine();
            } else if (elementi[i] instanceof Video) {
                ((Video) elementi[i]).infoVideo();
            } else if (elementi[i] instanceof RegistrazioneAudio) {
                ((RegistrazioneAudio) elementi[i]).infoAudio();
            }
        }

        System.out.println("Scegli un numero da 1 a " + elementi.length + " per riprodurre un elemento:");

        while(true){

            int scelta = sc.nextInt();

            if(scelta == 0){
                sc.close();
                System.out.println("FINE");
                break;
            }

            else if (scelta >= 1 && scelta <= elementi.length) {
                ElementoMultimediale elementoSelezionato = elementi[scelta - 1];

                if (elementoSelezionato instanceof Video) {
                    ((Video) elementoSelezionato).Play();
                } else if (elementoSelezionato instanceof RegistrazioneAudio) {
                    ((RegistrazioneAudio) elementoSelezionato).Play();
                } else if (elementoSelezionato instanceof Immagine) {
                    ((Immagine) elementoSelezionato).Show();
                }
                else {
                    System.out.println("Elemento errato");
                }
            } else {
                System.out.println("Numero errato");
            }

            System.out.println("Scegli un numero da 1 a " + elementi.length + " per riprodurre un elemento:");
        }




//    Immagine i = new Immagine("Spiaggia",4);
//    i.Show();
//        i.AbbassaLuminosita();
//        i.AbbassaLuminosita();
//        i.AbbassaLuminosita();
//
//        i.Show();
//        i.AlzaLuminosita();
//        i.AlzaLuminosita();
//        i.AlzaLuminosita();
//
//    Video v = new Video("Video Sportivo",2,5,4);
//
//        v.AbbassaLuminosita();
//        v.AbbassaLuminosita();
//        v.AbbassaLuminosita();
//
//        v.AlzaLuminosita();
//        v.AlzaLuminosita();
//        v.AlzaLuminosita();
//
//
//        v.AbbassaVolume();
//        v.AbbassaVolume();
//        v.AbbassaVolume();
//
//        v.AlzaVolume();
//        v.AlzaVolume();
//        v.AlzaVolume();
//        v.Play();
//
//
//    RegistrazioneAudio rg= new RegistrazioneAudio("Registrazione intervista",1,4);
//
//        rg.AbbassaVolume();
//        rg.AbbassaVolume();
//        rg.AbbassaVolume();
//
//        rg.AlzaVolume();
//        rg.AlzaVolume();
//        rg.AlzaVolume();
//        rg.Play();
//
//

    }
}