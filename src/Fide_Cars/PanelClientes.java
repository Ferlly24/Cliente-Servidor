
package Fide_Cars;

import javax.swing.*;
import java.awt.*;

public class PanelClientes extends JPanel {
    public PanelClientes() {
        setLayout(new BorderLayout());

        // Añade una tabla para mostrar clientes
        JTable tablaClientes = new JTable();
        JScrollPane scrollPane = new JScrollPane(tablaClientes);

        JPanel panelBotones = new JPanel();
        JButton btnAgregar = new JButton("Agregar Cliente");
        JButton btnEditar = new JButton("Editar Cliente");
        JButton btnEliminar = new JButton("Eliminar Cliente");

        panelBotones.add(btnAgregar);
        panelBotones.add(btnEditar);
        panelBotones.add(btnEliminar);

        add(scrollPane, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);
    }
}

