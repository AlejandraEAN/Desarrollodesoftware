import java.util.Date;

public class Main {

	public static void main(String[] args) {
        Tienda tienda = new Tienda("Supermercado EAN", "Chapinero", "7026828293");

        Producto p1 = new Producto(100, "Leche", TipoProducto.LACTEO, new Date(), "Colanta", 20, 1.50);
        Producto p2 = new Producto(200, "Carne de Res", TipoProducto.CARNICO, new Date(), "Frigorifico San Martin", 10, 5.99);
        Producto p3 = new Producto(300, "Cerezas", TipoProducto.FRUTA, new Date(), "La campesina", 30, 0.80);
        Producto p4 = new Producto(400, "Frijol", TipoProducto.ENLATADO, new Date(), "Goya", 15, 2.50);

        tienda.agregarProducto(p1);
        tienda.agregarProducto(p2);
        tienda.agregarProducto(p3);
        tienda.agregarProducto(p4);

        tienda.mostrarInventario();
    }
}
