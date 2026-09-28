public class Main {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("Samaria", 2000, new ComisionPersonalizada("Samaria"));
        v.mostrarDetalle();
    }
}
