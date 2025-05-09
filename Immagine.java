class Immagine extends ElementoMultimediale {
    private int luminosità;

    public Immagine(String titolo, int luminosità) {
        super(titolo);
        this.luminosità = luminosità;
    }

    public void aumentaLuminosita() {
        luminosità++;
    }

    public void diminuisciLuminosita() {
        if (luminosità > 0) luminosità--;
    }

    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosità));
    }
}