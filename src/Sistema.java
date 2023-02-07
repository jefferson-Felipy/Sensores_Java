public class Sistema {
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------------");
        System.out.println("------------------ INICIO DO RELATÓRIO DOS DADOS -----------------");
        System.out.println("------------------------------------------------------------------");

        //Intanciando a classe temperatura_
        SensorTemperatura temperatura = new SensorTemperatura();
        temperatura.sensor_Temperatura();

        //Intanciando a classe gás carbonico_
        SensorCarbono carbono = new SensorCarbono();
        carbono.sensor_Carbono();

        //Intanciando a classe umidade_
        SensorUmidade umidade = new SensorUmidade();
        umidade.sensor_Umidade();

        System.out.println("\n----------------------------------------------------------------");
        System.out.println("-------------------- FIM DO RELATÓRIO DOS DADOS ------------------");
        System.out.println("------------------------------------------------------------------");
    }
}
