import java.util.Date;
public class Producto {
    int codigo;
	    String nombre;
	    TipoProducto tipo;
	    Date fechaExpiracion;
	    String fabricante;
	    int cantidadInventario;
	    double precioUnitario;

	    public Producto(int codigo, String nombre, TipoProducto tipo, Date fechaExpiracion, String fabricante, int cantidadInventario, double precioUnitario) {
	        this.codigo = codigo;
	        this.nombre = nombre;
	        this.tipo = tipo;
	        this.fechaExpiracion = fechaExpiracion;
	        this.fabricante = fabricante;
	        this.cantidadInventario = cantidadInventario;
	        this.precioUnitario = precioUnitario;
	    }
	    public void mostrarInfo() {
	        System.out.println("Código: " + codigo);
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Tipo: " + tipo);
	        System.out.println("Fecha de Expiración: " + fechaExpiracion);
	        System.out.println("Fabricante: " + fabricante);
	        System.out.println("Cantidad en Inventario: " + cantidadInventario);
	        System.out.println("Precio Unitario: $" + precioUnitario);
	        System.out.println("------------------------------");
	    }

}
