package Utilidades;
import javax.swing.table.DefaultTableModel;
public class ModeloDeTablas extends DefaultTableModel {
    
    public ModeloDeTablas(String[] Titulos, Object[][] Datos){
        super();
        setDataVector(Datos , Titulos);
    }
    
    public ModeloDeTablas(String[] Titulos){
        super();
        setDataVector(null, Titulos);
    }
    
    
    @Override
    public boolean isCellEditable(int row, int column){
        return false;
    }
}
