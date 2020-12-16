/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informe;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Rebeca ch
 */
public class conectar {
    
    private final String DB="bcipqey8hlsffnhjlrhb";
    private final String URL="jdbc:mysql://bcipqey8hlsffnhjlrhb-mysql.services.clever-cloud.com:3306/"+DB+"?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false";
    private final String USER="u1yn5f0lutfcmu0a";
    private final String PASS="E3Jy1O8KldnQuwwrPAq5";
   
    public Connection getConexion() {
       
        Connection connect = null;
       
        try{
           
            Class.forName("com.mysql.jdbc.Driver");
            connect=(Connection) DriverManager.getConnection(URL,USER,PASS);
           
            if(connect!=null){
                System.out.println("Conexión exitosa"); 
            }else{
                System.out.println("Conexión Fallida");           
            }
           
        }catch( Exception ex){
            System.out.println("error "+ex.getMessage());
        }finally{
            return connect;
        }
       
    }   
   
   
    public void cerrarConexion(Connection connect){
        try {
            connect.close();
            System.out.println("Conexión Cerrada Exitosamente");
        } catch (Exception ex) {
            
        }
    }
   /* //La url para conectar a la base de datos
    //private static String url = "jdbc:mysql://localhost/canasta_basica_sv";
    private static String url = "jdbc:mysql://bcipqey8hlsffnhjlrhb-mysql.services.clever-cloud.com:3306/bcipqey8hlsffnhjlrhb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    //El usuario de la base de datos
    private static String user = "u1yn5f0lutfcmu0a";
    //private static String user = "root";
    //La clave del usuario de la base de datos
    private static String password = "E3Jy1O8KldnQuwwrPAq5";
    //private static String password = "";
    //Metodo para obtener la conexion con la base de datos

    public static synchronized Connection getConexion() {
        Connection cn = null;
        try {
            //Cargamos el driver y le decimos que vamos a usar
            //una conexion con mysql
            Class.forName("com.mysql.jdbc.Driver");
            //Obtenemos la conexion
            cn = DriverManager.getConnection(url,user,password);
            System.out.println("conexion establecida");
        } catch (Exception e) {
            cn = null;
            System.out.println("error");
        } finally {
            return cn;
        }
    }

    //Metodo utilizado para cerrar la conexion
    public static synchronized void cerrarConexion(Connection cn) {
        try {
            cn.close();
        } catch (Exception e) {
        }
    }
*/

}

