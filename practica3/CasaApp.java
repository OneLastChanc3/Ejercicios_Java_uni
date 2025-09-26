public class  CasaApp {
     public static void main(String[] args) {
        Hijo hijo = new Hijo(40, 60, 80);
        Hijo hermano = new Hijo(100);
        int total = hijo.getDineroAbuelo() + hijo.getDineroPapa() +hijo.getDineroHijo() + hermano.getDineroHijo();
        hijo.buscar(total);
        hijo.comprar(total);
        
    }
}