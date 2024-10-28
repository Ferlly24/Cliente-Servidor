
package Fide_Cars;

import javax.swing.*;
import java.awt.*;

public class PanelInventario extends JPanel {
    public PanelInventario() {
        setLayout(new BorderLayout());

        // Aquí puedes añadir una tabla para listar productos y botones para agregar, editar y eliminar
        JTable tablaProductos = new JTable();
        JScrollPane scrollPane = new JScrollPane(tablaProductos);

        JPanel panelBotones = new JPanel();
        JButton btnAgregar = new JButton("Agregar Producto");
        JButton btnEditar = new JButton("Editar Producto");
        JButton btnEliminar = new JButton("Eliminar Producto");

        panelBotones.add(btnAgregar);
        panelBotones.add(btnEditar);
        panelBotones.add(btnEliminar);

        add(scrollPane, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);
    }
}
