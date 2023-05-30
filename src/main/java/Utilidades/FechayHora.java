package Utilidades;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class FechayHora{
    Calendar Calendario;
    public int Dia, Mes, Año, Hora, Minutos, Segundos;
    
    public FechayHora(){
        Calendario = new GregorianCalendar();
        
        Dia = Calendario.get(Calendar.DAY_OF_MONTH);
        Mes = Calendario.get(Calendar.MONTH)+1;
        Año = Calendario.get(Calendar.YEAR);
        Hora = Calendario.get(Calendar.HOUR_OF_DAY);
        Minutos = Calendario.get(Calendar.MINUTE);
    }
    
    public String ObtenerFormato(){
        String Formato = (Dia + "/" + Mes + "/" + Año + " a las " + Hora + ":" + Minutos);     
        return  Formato;
    }
    
    public String ObtenerFecha() {
        String Fecha = (Dia + "/" + Mes + "/" + Año);
        return Fecha;
    }
}
