public class Vendedor extends Empleado {
    public Vendedor(String nombre, double ventasMes, EstrategiaComision estrategia) {
        super(nombre, ventasMes, estrategia);
    }
    Override
    public void mostrarDetalle() {
        System.out.println("Vendedor: " + nombre);
        System.out.println("Venta total: " + ventasMes);
        System.out.println("Comision: " + estrategia.calcularComision(ventasMes));
    }
}
