    import java.util.ArrayList;
    import java.util.List;

    public class Tienda {
    
        public String nombre;
        public String direccion;
        public String telefono;
        public List<Producto> productos;
        
        public Tienda(String nombre,String direccion, String telefono) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.telefono = telefono;
            this.productos = new ArrayList<>();
            
        }
        public void agregarProducto(Producto producto) {
            if (productos.size() < 4) {
                productos.add(producto);
            } else {
                System.out.println("La tienda solo puede tener 4 productos.");
            }
        }
    
        public void mostrarInventario() {
            System.out.println("Inventario de la tienda " + nombre);
            System.out.println("==============================");
            for (Producto p : productos) {
                p.mostrarInfo();
            }
        }
    }
    