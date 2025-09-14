import java.util.ArrayList;

/**
 * 18. Un centro de investigación ambiental registra la temperatura 4 veces al
 * día durante los 7
 * días de una semana. Guarde en un arreglo los registros realizados y
 * determine:
 * a) La temperatura promedio de cada día de la semana.
 * b) La temperatura promedio general de todos los registros realizados.
 * c) Cantidad de registros inferiores al promedio general.
 * 
 * @author Nick3030w
 */
public class ejercicio18 {
    public static void main(String[] args) {
        ArrayList<double[]> temperaturas = new ArrayList<>();
        double sumaTotal = 0;
        int cantidadRegistros = 0;

        // Ingreso de datos
        for (int i = 0; i < 7; i++) {
            double[] tempDiarias = new double[4];
            System.out.println("Ingrese las 4 temperaturas del día " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                tempDiarias[j] = Math.random() * 30; // Simulación de ingreso de datos
                sumaTotal += tempDiarias[j];
                cantidadRegistros++;
            }
            temperaturas.add(tempDiarias);
        }

        // a) Temperatura promedio de cada día
        System.out.println("Promedio diario de temperaturas:");
        for (int i = 0; i < temperaturas.size(); i++) {
            double sumaDiaria = 0;
            for (double temp : temperaturas.get(i)) {
                sumaDiaria += temp;
            }
            double promedioDiario = sumaDiaria / 4;
            System.out.printf("Día %d: %.2f°C%n", (i + 1), promedioDiario);
        }

        // b) Temperatura promedio general
        double promedioGeneral = sumaTotal / cantidadRegistros;
        System.out.printf("Promedio general de todas las temperaturas: %.2f°C%n", promedioGeneral);

        // c) Cantidad de registros inferiores al promedio general
        int conteoInferiorPromedio = 0;
        for (double[] dia : temperaturas) {
            for (double temp : dia) {
                if (temp < promedioGeneral) {
                    conteoInferiorPromedio++;
                }
            }
        }
        System.out.println("Cantidad de registros inferiores al promedio general: " + conteoInferiorPromedio);
    }
}
