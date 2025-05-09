import java.util.Scanner;

public class PlayerMultimediale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci il tipo di elemento (1-Immagine, 2-Video, 3-Audio): ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Inserisci il titolo: ");
            String titolo = scanner.nextLine();

            if (scelta == 1) {
                System.out.print("Inserisci luminosità: ");
                int luminosita = scanner.nextInt();
                elementi[i] = new Immagine(titolo, luminosita);
            } else if (scelta == 2) {
                System.out.print("Inserisci durata, volume e luminosità: ");
                int durata = scanner.nextInt();
                int volume = scanner.nextInt();
                int luminosita = scanner.nextInt();
                elementi[i] = new Video(titolo, durata, volume, luminosita);
            } else if (scelta == 3) {
                System.out.print("Inserisci durata e volume: ");
                int durata = scanner.nextInt();
                int volume = scanner.nextInt();
                elementi[i] = new RegistrazioneAudio(titolo, durata, volume);
            }
        }


        while (true) {
            System.out.println("Scegli un elemento da eseguire (1-5) oppure 0 per uscire:");
            int scelta = scanner.nextInt();

            if (scelta == 0) break;

            if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elemento = elementi[scelta - 1];

                if (elemento instanceof Immagine) {
                    ((Immagine) elemento).show();
                } else if (elemento instanceof Riproducibile) {
                    ((Riproducibile) elemento).play();
                }
            } else {
                System.out.println("Scelta non valida!");
            }
        }

        scanner.close();
    }
}
