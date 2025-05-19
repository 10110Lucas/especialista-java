public class CalculadoraPesosDasCargas {

  public static void main(String[] args) {
    double pesoCarga1 = 1_033.49;
    double pesoCarga2 = 849.88;

    double pesoSomados = pesoCarga1 + pesoCarga2;
    int pesoTotalCargas = (int) pesoSomados;

      // O resultado deve ser 1883
      System.out.println("Peso total das cargas: " + pesoTotalCargas);
  }

}