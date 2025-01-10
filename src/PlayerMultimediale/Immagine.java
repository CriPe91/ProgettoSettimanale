package PlayerMultimediale;

public class Immagine extends ElementoMultimediale implements GestioneLuminosita {

    public Immagine(String titolo, int luminosita) {
        super(titolo, luminosita);
    }


    @Override
    public void AbbassaLuminosita() {
        int luminosita = 3;
        while (luminosita < 0) {
            System.out.println(titolo + "*".repeat(luminosita));
            luminosita --;
        }
    }

    @Override
    public void AlzaLuminosita() {
        int luminosita = 3;
        while (luminosita > 5) {
            System.out.println(titolo + "*".repeat(luminosita));
            luminosita ++;
        }
    }
}
