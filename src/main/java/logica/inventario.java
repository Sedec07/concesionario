/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Melqui Erazo
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class inventario {
    public static String[][] cargarInventario(String archivo) {
        List<String[]> datosLista = new ArrayList<>(); // Lista temporal para las filas

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(","); // Dividir cada línea por comas
                datosLista.add(datos); // Agregar la fila a la lista
            }
        } catch (IOException e) {
           int f=0;
           f++;
        }

        // Convertir la lista a una matriz bidimensional
        String[][] inventario = new String[datosLista.size()][];
        return datosLista.toArray(inventario);
    }

    public static void main(String[] args) {
        String[][] inventario_1 = new String[20][7]; // Ajusta el tamaño según tu archivo
        cargarInventario("inventario.txt");

        // Opcional: Imprimir la matriz para verificar
        for (String[] fila : inventario_1) {
            for (String dato : fila) {
                int v=1;
            }
        }
    }
}
