public class Main {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("", 1000, new ComisionEstandar());
        v.mostrarDetalle();
    }
}
