package Utilidades;

import com.mongodb.*;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

import javax.swing.JOptionPane;

public class Conexion {

    public MongoClient Mongo = null;
    public static String User;
    public static String Password;
    public static ConnectionString CadenaConexion;
    public MongoDatabase BaseDatos = null;

    public MongoClient CrearConexion(String Usuario, String Contraseña) {
        User = Usuario;
        Password = Contraseña;

        CadenaConexion = new ConnectionString("mongodb+srv://" + User + ":" + Password + "@abarrot.bqavwpj.mongodb.net/?retryWrites=true&w=majority");
        
        MongoClientSettings configuracion = MongoClientSettings.builder()
                .applyConnectionString(CadenaConexion)
                .retryWrites(true)
                .build();
        
        try {
            Mongo = MongoClients.create(configuracion);
            BaseDatos = Mongo.getDatabase("Abarrotes");
            if (BaseDatos != null) {
                JOptionPane.showMessageDialog(null, "Conexion al Usuaion - Exitosa\nConexion al cluser - Exitosa", "Conexion Exitosa", JOptionPane.INFORMATION_MESSAGE);
                Mongo.startSession();
            } else {

                JOptionPane.showMessageDialog(null, "Conexion al Usuaion - Exitosa\nConexion al cluser - Fracasó\nVerifique las conexiones con el cluster", "Error", JOptionPane.ERROR_MESSAGE);
            }
            System.out.println(Mongo.toString());
            System.out.println(BaseDatos.getName());
            System.err.println(CadenaConexion);

        } catch (MongoException e) {
            Mongo = null;
            JOptionPane.showMessageDialog(null, "Error en la conexion\nIntentelo de nuevo", "Error", 0);
        }
        return Mongo;
    }
}
