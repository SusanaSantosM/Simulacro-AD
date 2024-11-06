public class AdeptaSororitas {
    private String nome;
    private int puntos;
    private int cod;

    /**
     * Constructor de la clase AdeptaSororitas
     * @param nome de tipo String
     * @param puntos de tipo int
     * @param cod de tipo int
     */
    public AdeptaSororitas(String nome, int puntos, int cod) {
        this.nome = nome;
        this.puntos = puntos;
        this.cod = cod;
    }

    /**
     * Metodo que devuelve el nombre
     * @return nome de tipo String
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo que devuelve los puntos
     * @return puntos de tipo int
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * Metodo que devuelve el codigo
     * @return cod de tipo int
     */
    public int getCod() {
        return cod;
    }
}
