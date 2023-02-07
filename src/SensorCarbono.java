import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.security.SecureRandom;

public class SensorCarbono {
    public void sensor_Carbono() {

        SecureRandom secureRandom = new SecureRandom();
        Calendar Date_hours = Calendar.getInstance();

        int linhas = 48;
        int colunas = 2;
        int aux;
        int[][] elements_matriz = new int[linhas][colunas];

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                elements_matriz[l][c] = secureRandom.nextInt(80);
            }
        }

        //ordenando os elementos matriz_
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                for (int a = 0; a < linhas; a++) {
                    for (int b = 0; b < colunas; b++) {
                        if (elements_matriz[l][c] < elements_matriz[a][b]) {
                            aux = elements_matriz[l][c];
                            elements_matriz[l][c] = elements_matriz[a][b];
                            elements_matriz[a][b] = aux;
                        }
                    }
                }
            }
        }

        System.out.println("--------- EXIBIÇÃO DA MEDIÇÃO DO GÁZ CARBONICO DO AMBIENTE --------");
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                Format hours_formatt = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                Date_hours.add(Calendar.MINUTE, 30);
                hours_formatt = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                System.out.printf("[Sensor Gás Carbonico: " + elements_matriz[l][c] + "CO²] --> Hora da Medição: " + hours_formatt.format(Date_hours.getTime()));
                System.out.println("");
            }
        }
        System.out.println(" ");
    }

}