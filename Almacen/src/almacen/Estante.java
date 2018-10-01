package almacen;

import becker.robots.Thing;

/**
 *
 * @author Jhon
 */
public class Estante {

    private Espacio[][] espacio;
    private Thing thing;

    public Estante(Espacio[][] espacio, Thing thing) {
        this.espacio = espacio;
        this.thing = thing;
    }

    public Espacio[][] getEspacio() {
        return espacio;
    }

    public Thing getThing() {
        return thing;
    }

    public boolean buscar_producto(String producto) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (espacio[i][j].getProducto() != null) {
                    if (espacio[i][j].getProducto().getDescripcion().equals(producto)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int can_espacios() {
        int contador = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (espacio[i][j].getProducto() == null) {
                    contador++;
                }
            }
        }
        return contador;
    }
///////////////////////AAAAQUIII EL ERRORRRRR!!!!!
    public void ingresa(Producto producto) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (espacio[i][j].getProducto() == null) {
                    espacio[i][j].setProducto(producto);
                    return;
                }
            }
        }
    }

    public boolean espacio_vacio() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (espacio[i][j].getProducto() == null) {
                    return true;
                }
            }
        }
        return false;
    }
}
