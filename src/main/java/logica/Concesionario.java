/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package logica;

import java.util.logging.Logger;
import igu.Pantalla;
public class Concesionario extends javax.swing.JFrame {

    private static final Logger logger = Logger.getLogger(Concesionario.class.getName());
    
    public static void main(String[] args) {
        
        String[][] inventario_1 = {
            {"1", "Vehículo", "Toyota", "Model C", "2018", "Verde", "112295", "9", "Manual", "Diésel", "2", "Toyota Model C del año 2018 en color Verde.", "19665.39", "7"},
    {"2", "Vehículo", "Toyota", "Model C", "2012", "Blanco", "24746", "10", "Manual", "Diésel", "3", "Toyota Model C del año 2012 en color Blanco.", "13447.13", "2"},
    {"3", "Camión", "Nissan", "Model A", "2020", "Negro", "33602", "3484", "Manual", "Eléctrico", "3", "Nissan Model A del año 2020 en color Negro.", "6221.49", "7"},
    {"4", "Motocicleta", "Nissan", "Model B", "2014", "Rojo", "121741", "8", "Automática", "Gasolina", "0", "Nissan Model B del año 2014 en color Rojo.", "29000.21", "3"},
    {"5", "Motocicleta", "Honda", "Model B", "2009", "Gris", "118176", "9", "Manual", "Eléctrico", "0", "Honda Model B del año 2009 en color Gris.", "24444.2", "9"},
    {"6", "Motocicleta", "Honda", "Model C", "2016", "Negro", "165700", "8", "Automática", "Eléctrico", "0", "Honda Model C del año 2016 en color Negro.", "34296.45", "4"},
    {"7", "Vehículo", "Kawasaki", "Model B", "2011", "Blanco", "2423", "19", "Automática", "Diésel", "5", "Kawasaki Model B del año 2011 en color Blanco.", "12663.18", "2"},
    {"8", "Motocicleta", "Ford", "Model A", "2017", "Rojo", "105968", "18", "Automática", "Gasolina", "0", "Ford Model A del año 2017 en color Rojo.", "14952.57", "5"},
    {"9", "Motocicleta", "Toyota", "Model B", "2022", "Rojo", "136010", "7", "Automática", "Gasolina", "0", "Toyota Model B del año 2022 en color Rojo.", "42858.54", "8"},
    {"10", "Motocicleta", "Ford", "Model D", "2022", "Gris", "126233", "10", "Automática", "Gasolina", "0", "Ford Model D del año 2022 en color Gris.", "35652.42", "2"},
    {"11", "Vehículo", "Yamaha", "MT-07", "2020", "-", "-", "-", "-", "-", "-", "-", "19161.74", "4"},
    {"12", "Motocicleta", "Toyota", "Ninja", "2016", "-", "-", "-", "-", "-", "-", "-", "13315.4", "2"},
    {"13", "Camión", "Toyota", "MT-07", "2006", "-", "-", "-", "-", "-", "-", "-", "7828.39", "5"},
    {"14", "Vehículo", "Honda", "Civic", "2023", "-", "-", "-", "-", "-", "-", "-", "34502.46", "6"},
    {"15", "Camión", "Chevrolet", "F-150", "2002", "-", "-", "-", "-", "-", "-", "-", "26831.24", "4"},
    {"16", "Motocicleta", "Kawasaki", "F-150", "2006", "-", "-", "-", "-", "-", "-", "-", "5586.86", "4"},
    {"17", "Vehículo", "Yamaha", "Silverado", "2013", "-", "-", "-", "-", "-", "-", "-", "26289.33", "1"},
    {"18", "Vehículo", "Yamaha", "Ram", "2012", "-", "-", "-", "-", "-", "-", "-", "37560.75", "3"},
    {"19", "Vehículo", "Yamaha", "Ninja", "2007", "-", "-", "-", "-", "-", "-", "-", "15527.55", "4"},
    {"20", "Motocicleta", "Toyota", "Ram", "2022", "-", "-", "-", "-", "-", "-", "-", "20184.54", "3"}
};
        var panta = new Pantalla();
        
        panta.pack();
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);
        panta.ocultarLabel();
        //String[][] inventario_1 = inventario.cargarInventario("java/source/vehiculos.txt");
        panta.datos(inventario_1);
        logger.info("");  // Mensaje en blanco
        
        
    }
}
