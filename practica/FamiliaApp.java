import java.util.Random;


public class FamiliaApp {
    public static void main(String[] args) {
        // Crear los miembros de la familia
        Abuelo ab = new Abuelo("Abuelo");
        Papa pa = new Papa("Papá", ab);
        Hijo hijo1 = new Hijo("Hijo1", pa);
        Hijo hijo2 = new Hijo("Hijo2", pa);

        Random rand = new Random();
        int totalMeta = 300; // en miles de soles (300 mil)
        int totalAcumulado = 0;

        // Totales por persona
        int totalAb = 0, totalPa = 0, totalH1 = 0, totalH2 = 0;

        System.out.println("Contribuciones en miles de soles");
        System.out.printf("%-6s %-6s %-6s %-6s %-6s %-6s%n",
                "Cuota", "Abuelo", "Papá", "Hijo1", "Hijo2", "Total");

        int cuota = 1;
        while (totalAcumulado < totalMeta) {
            // Generar ahorros aleatorios
            int ahAb = rand.nextInt(10 - 1 + 1) + 1;   // [1,10]
            int ahPa = rand.nextInt(20 - 10 + 1) + 10; // [10,20]
            int ahH1 = rand.nextInt(40 - 30 + 1) + 30; // [30,40]
            int ahH2 = rand.nextInt(30 - 20 + 1) + 20; // [20,30]

            // Aplicar ahorros (usando los métodos que acumulan)
            
            hijo1.ahorrarPapa(ahPa);   // hijo1 gestiona al papá
            hijo1.ahorrar(ahH1);       // su propio ahorro
            hijo2.ahorrarAbuelo(ahH2); // hijo2 gestiona al abuelo
            hijo2.ahorrar(ahH2);       // su propio ahorro

            // Acumulados
            totalAb += ahAb;
            totalPa += ahPa;
            totalH1 += ahH1;
            totalH2 += ahH2;

            int totalCuota = ahAb + ahPa + ahH1 + ahH2;
            totalAcumulado += totalCuota;

            // Imprimir fila
            System.out.printf("%-6d %-6d %-6d %-6d %-6d %-6d%n",
                    cuota, ahAb, ahPa, ahH1, ahH2, totalCuota);

            cuota++;
        }

        // Totales finales
        System.out.printf("%-6s %-6d %-6d %-6d %-6d %-6d%n",
                "Total", totalAb, totalPa, totalH1, totalH2, totalAcumulado);

        // Saldo remanente (queda en hijo1)
        int saldo = totalAcumulado - totalMeta;
        System.out.println("Saldo remanente en hijo1: " + saldo);

        if (totalAcumulado >= totalMeta) {
            System.out.println("Felicidades por la nueva casa.");
            System.out.println("Se lo merecen.");
        }
          System.out.println(hijo1.getAhorro() + " " + hijo2.getAhorro());

    }
 
}
