import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase donde esta el metodo con la consulta para para listar los códigos.
 */
public class ConsultaSQL {

    /**
     * Metodo que lista las unidades de mayor puntaje
     * @param codigos de tipo List<Integer>
     * @return unidades de tipo List<AdeptaSororitas>
     */
    public List<AdeptaSororitas> listarDescendente(List<Integer> codigos){

        // Creamos una lista de objetos de tipo AdeptaSororitas
        List<AdeptaSororitas> unidades = new ArrayList<>();

        String consulta = "SELECT * FROM adeptasororitas WHERE cod = ?";

        try{
            // Conectamos a la BD
            Connection conectar = Conexion.conexion();

            //Ejecutamos la orden
            PreparedStatement ps = conectar.prepareStatement(consulta);

            // Recorremos la lista de códigos
            for (int cod : codigos) {
                ps.setInt(1, cod);
                ResultSet rs = ps.executeQuery();

                // Recorremos el resultado de la consulta
                if (rs.next()){
                    String nome = rs.getString("nome");
                    int puntos = rs.getInt("puntos");
                    unidades.add(new AdeptaSororitas(nome,puntos,cod));

                } else {
                    System.out.println("No se encontró el código: "+cod);
                }
                rs.close(); // Cerramos el ResultSet
            }
        }catch (SQLException e){
            System.out.println("No se puede ver los productos."+e.getMessage());
        }

        // Ordenamos la lista de unidades de mayor a menor puntaje
        unidades.sort((a,b) -> b.getPuntos() - a.getPuntos());

        // Mostramos las unidades ordenadas
        System.out.println("\nUnidades ordenadas por puntaje descendente:");
        for (AdeptaSororitas unidad : unidades) {
            System.out.println(unidad.getNome() + " " + unidad.getPuntos() + " " + unidad.getCod());
        }

        // Retorna una lista de objetos de tipo AdeptaSororitas
        return unidades;
    }

}
