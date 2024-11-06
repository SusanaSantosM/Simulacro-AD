import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Documento
 * Clase que permite leer un archivo
 */

public class Documento {

    private List<Integer> codigos = new ArrayList<>();

    /**
     * Lee un archivo
     * @param archivo de tipo String
     * @return codigos de tipo List<Integer>
     */
    public List<Integer> leerArchivo(String archivo) {
        try{
            // Creamos un buffer para leer el archivo
            BufferedReader buffer = new BufferedReader(new FileReader(archivo));
            String linea;

            // Leemos el archivo línea por línea
            while((linea = buffer.readLine()) != null){
                codigos.add(Integer.parseInt(linea));  // Convertimos el código a entero
            }
            buffer.close(); // Cerramos el buffer

        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
            e.printStackTrace();
        }
        return codigos; // Retorna una lista de códigos
    }

    /**
     * Escribe un archivo con las unidades ordenadas
     * @param unidades de tipo List<AdeptaSororitas>
     * @param archivo de tipo String
     */
    public void escribirUnidadesOrdenadas(List<AdeptaSororitas> unidades, String archivo) {
        try{
            // Creamos un buffer para escribir el archivo
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));

            // Escribimos el archivo línea por línea
            for (AdeptaSororitas unidad : unidades) {
                String linea = unidad.getNome() + " " + unidad.getPuntos() + " " + unidad.getCod();
                bw.write(linea);
                bw.newLine();
            }
            bw.close(); // Cerramos el buffer

        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
            e.printStackTrace();
        }
    }
}
