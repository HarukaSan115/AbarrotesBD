package Utilidades;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
    

public class AsignarDiseño {
    ModeloDeTablas moTabla;
    DiseñoEncabezado Encabezado;
    JTableHeader moEncabezado;
    
    
    public void DiseñoConDatos (JTable tEnviada, String[] Titulos, Object[][] Datos){
        moTabla = new ModeloDeTablas(Titulos, Datos);
        tEnviada.setModel(moTabla);

        for (int i = 0; i < tEnviada.getColumnCount(); i++) {
            tEnviada.getColumnModel().getColumn(i).setCellRenderer(new DiseñoCeldas());
        }

        tEnviada.getTableHeader().setReorderingAllowed(false);
        tEnviada.getTableHeader().setResizingAllowed(false);
        tEnviada.setRowHeight(20);
        tEnviada.setShowGrid(true);
        tEnviada.setGridColor(Color.BLACK);

        Encabezado = new DiseñoEncabezado();
        moEncabezado = tEnviada.getTableHeader();
        moEncabezado.setDefaultRenderer(Encabezado);
        tEnviada.setTableHeader(moEncabezado);
    }
    
    public void DiseñoDefault (JTable tEnviada, String[] Titulos){
        moTabla = new ModeloDeTablas(Titulos);
        tEnviada.setModel(moTabla);

        for (int i = 0; i < tEnviada.getColumnCount(); i++) {
            tEnviada.getColumnModel().getColumn(i).setCellRenderer(new DiseñoCeldas());
        }

        tEnviada.getTableHeader().setReorderingAllowed(false);
        tEnviada.getTableHeader().setResizingAllowed(false);
        tEnviada.setRowHeight(20);
        tEnviada.setShowGrid(true);
        tEnviada.setGridColor(Color.BLACK);

        Encabezado = new DiseñoEncabezado();
        moEncabezado = tEnviada.getTableHeader();
        moEncabezado.setDefaultRenderer(Encabezado);
        tEnviada.setTableHeader(moEncabezado);
    }
}
