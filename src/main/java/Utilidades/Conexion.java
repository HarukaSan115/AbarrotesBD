package Utilidades;

import com.mongodb.*;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import java.util.Arrays;

import javax.swing.JOptionPane;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

public class Conexion {

    public static MongoClient Mongo = null;
    public static String User;
    public static String Password;
    public static ConnectionString CadenaConexion;
    public MongoDatabase BaseDatos = null;

    public MongoClient CrearConexion(String Usuario, char[] Contraseña) {
        User = Usuario;
        Password = String.valueOf(Contraseña);

        CadenaConexion = new ConnectionString("mongodb+srv://" + User + ":" + Password + "@abarrot.bqavwpj.mongodb.net/?retryWrites=true&w=majority");

        MongoClientSettings configuracion = MongoClientSettings.builder()
                .applyConnectionString(CadenaConexion)
                .build();

        try{ //Abre la conexion
            Mongo = MongoClients.create(configuracion);
            BaseDatos = Mongo.getDatabase("admin");
            
            try { //Hace un ping para autenticar al usuario
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = BaseDatos.runCommand(command);
                System.out.println("Pinged your deployment. You successfully connected to MongoDB!");
                JOptionPane.showMessageDialog(null, "Usuario Autenticado\nBienvenido "+User+", Accediendo al sistema", "Autenticacion Completada", JOptionPane.INFORMATION_MESSAGE);
            
            } catch (MongoException me) {
                Mongo = null;
                JOptionPane.showMessageDialog(null, "Ocurrio un error en la autenticacion\nIntentelo de nuevo", "Error", 0);
                System.err.println(me);
            }
            System.err.println(CadenaConexion);

        } catch (MongoException e) {
            Mongo = null;
            JOptionPane.showMessageDialog(null, "Ocurrio un error inesperado en la conexion\nIntentelo de nuevo mas tarde", "Error", 0);
        }
        return Mongo;
    }
}
