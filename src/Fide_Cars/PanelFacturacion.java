
package Fide_Cars;

import javax.swing.*;
import java.awt.*;

public class PanelFacturacion extends JPanel {
    public PanelFacturacion() {
        setLayout(new BorderLayout());

        // Puedes añadir campos de texto para ingresar información de facturas
        JLabel labelNumero = new JLabel("Número de Factura:");
        JTextField campoNumero = new JTextField(10);
        JLabel labelTotal = new JLabel("Total:");
        JTextField campoTotal = new JTextField(10);

        JPanel panelCampos = new JPanel();
        panelCampos.add(labelNumero);
        panelCampos.add(campoNumero);
        panelCampos.add(labelTotal);
        panelCampos.add(campoTotal);

        JButton btnGenerar = new JButton("Generar Factura");

        add(panelCampos, BorderLayout.CENTER);
        add(btnGenerar, BorderLayout.SOUTH);
    }
}
