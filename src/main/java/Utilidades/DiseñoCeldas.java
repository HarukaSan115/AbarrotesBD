package Utilidades;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class DiseñoCeldas extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
        Color ColorDeFondo = null;

        if (selected) {
            this.setBackground(new Color(192, 192, 192));
        } else {
            this.setBackground(Color.WHITE);
        }

        if (focused) {
            ColorDeFondo = new Color(140, 140, 140);
        } else {
            ColorDeFondo = new Color(192, 192, 192);
        }
        
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setText((String) value);
        this.setBackground((selected) ? ColorDeFondo : Color.WHITE);
        this.setFont(new Font("Verdana", Font.PLAIN, 12));
        return this;
    }
}
