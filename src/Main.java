import java.util.List;

/**
 * Clase principal que ejecuta el programa.
 * @autor: Susana Santos
 * @version: 1.0
 */
public class Main {

    private static String archivoCodigos = "codigosUnidades.txt";
    private static String archivoPuntos = "puntosOrdered.txt";

    public static void main(String[] args) {
        // Leemos los códigos del archivo
        List<Integer> codigos = new Documento().leerArchivo(archivoCodigos);

        // Ontenemos las unidades de mayor puntaje
        ConsultaSQL crud = new ConsultaSQL();
        List<AdeptaSororitas> unidades = crud.listarDescendente(codigos);

        // Escribimos las unidades de mayor puntaje en un archivo
        new Documento().escribirUnidadesOrdenadas(unidades, archivoPuntos);
    }
}