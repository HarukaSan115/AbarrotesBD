package Utilidades;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

public class DiseñoEncabezado implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JComponent Componente = null;
        if (value instanceof String){
            Componente = new JLabel((String) value);
            ((JLabel)Componente).setHorizontalAlignment(SwingConstants.CENTER); 
            ((JLabel)Componente).setSize(26, Componente.getWidth());
            ((JLabel)Componente).setPreferredSize(new Dimension(10, Componente.getWidth())); 
            //((JLabel)Componente) al hacer esto el componente adopta propiedades de un JLabel    
        }
        Componente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new Color(255, 255, 255)));
        Componente.setOpaque(true);
        Componente.setFont(new Font("Plantagenet Cherokee", Font.BOLD, 16));
        Componente.setBackground(new Color(0, 0, 0));
        Componente.setForeground(new Color(255, 255, 255));
        return Componente;
    }
}
