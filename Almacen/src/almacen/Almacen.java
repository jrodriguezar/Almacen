package almacen;

import becker.robots.*;
import java.awt.Color;
import java.util.Scanner;

/**
 *
 * @author Jhon
 */

public class Almacen {
    private City almacen;
    private Robot empleado;
    private Robot[] robot;
    private Scanner teclado;
    private Estante[][] matriz;
    
    public Almacen(){
        teclado = new Scanner(System.in);
        this.almacen = new City();

        int num = 1;
        int iter = 0;
        robot = new Robot[10];
        for (int i = 0; i < 11; i++) {
            Wall norte = new Wall(almacen, 0, i, Direction.NORTH);
        }
        for (int i = 0; i < 10; i++) {
            //Wall norte = new Wall(almacen, 0, i, Direction.NORTH);
            //pared izquierda
            if (i < 6) {
                Wall izqui = new Wall(almacen, i, 0, Direction.WEST);
            }
            
            if (i > 6 && i<8 ) {
                Wall izqui = new Wall(almacen, i, 0, Direction.WEST);
            }

            if (i < 2) {
                //pared derecha
                Wall derecha = new Wall(almacen, i, 10, Direction.EAST);
            }

            Wall sur_divisiones = new Wall(almacen, 7, i, Direction.EAST);
            Wall sur = new Wall(almacen, 7, i, Direction.SOUTH);
            //creo robots almacenadores
            Robot reobot = new Robot(almacen, 7, i, Direction.NORTH, 0);
            reobot.setIcon(new Robotamazon());
            reobot.setLabel("Robot" + " " + num);
            robot[iter] = reobot;
            num++;
            iter++;
        }

        Producto alimentos = new Producto("Alimento", 123);
        Producto robotica = new Producto("Memoria", 1234);
        Producto maletas = new Producto("Maleta", 4325);
        Producto juguetes = new Producto("Munieco", 1234);
        Producto ropa1 = new Producto("Camisa", 12876);
        Producto ropa2 = new Producto("Pantalon", 123);
        Producto robotica1 = new Producto("Chip", 1234);
        Producto maletas1 = new Producto("Bolso", 4325);
        Producto juguetes1 = new Producto("Munieca", 1234);
        Producto alimento1 = new Producto("Frijol", 12876);
        
        Espacio[][] espacio1 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacio1[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacio1[i][j] = new Espacio(robotica);
                }
            }
        }
            
        Espacio[][] espacio2 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacio2[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacio2[i][j] = new Espacio(alimentos);
                }
            }
        }
        
        Espacio[][] espacio3 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacio3[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacio3[i][j] = new Espacio(maletas);
                }
            }
        }
        
        Espacio[][] espacio4 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacio4[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacio4[i][j] = new Espacio(juguetes);
                }
            }
        }
        
        Espacio[][] espacio5 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacio5[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacio5[i][j] = new Espacio(ropa1);
                }
            }
        }
        
        Espacio[][] espacio6 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacio6[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacio6[i][j] = new Espacio(ropa2);
                }
            }
        }
        
        Espacio[][] espacio7 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacio7[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacio7[i][j] = new Espacio(robotica1);
                }
            }
        }
        
        Espacio[][] espacio8 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacio8[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacio8[i][j] = new Espacio(maletas1);
                }
            }
        }
        
        Espacio[][] espacio9 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacio9[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacio9[i][j] = new Espacio(juguetes1);
                }
            }
        }
        
        Espacio[][] espacio10 = new Espacio[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    espacio10[i][6] = new Espacio(null);
                }
                if (j < 6) {
                    espacio10[i][j] = new Espacio(alimento1);
                }
            }
        }
        
        matriz = new Estante[10][2];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == 0) {
                    Thing zona = new Thing(this.almacen, j, i);
                    Estante estante1 = new Estante(espacio1, zona);
                    matriz[i][j] = estante1;
                    zona.getIcon().setColor(Color.GREEN);
                    zona.getIcon().setLabel("Memoria");
                }

                if (i == 1) {
                    Thing zona1 = new Thing(this.almacen, j, i);
                    Estante estante2 = new Estante(espacio2, zona1);
                    matriz[i][j] = estante2;
                    zona1.getIcon().setColor(Color.GREEN);
                    zona1.getIcon().setLabel("Alimento");
                }

                if (i == 2) {
                    Thing zona2 = new Thing(this.almacen, j, i);
                    Estante estante3 = new Estante(espacio3, zona2);
                    matriz[i][j] = estante3;
                    zona2.getIcon().setColor(Color.GREEN);
                    zona2.getIcon().setLabel("Maleta");
                }

                if (i == 3) {
                    Thing zona3 = new Thing(this.almacen, j, i);
                    Estante estante4 = new Estante(espacio4, zona3);
                    matriz[i][j] = estante4;
                    zona3.getIcon().setColor(Color.GREEN);
                    zona3.getIcon().setLabel("Munieco");
                }

                if (i == 4) {
                    Thing zona4 = new Thing(this.almacen, j, i);
                    Estante estante5 = new Estante(espacio5, zona4);
                    matriz[i][j] = estante5;
                    zona4.getIcon().setColor(Color.GREEN);
                    zona4.getIcon().setLabel("Camisa");
                }

                if (i == 5) {
                    Thing zona5 = new Thing(this.almacen, j, i);
                    Estante estante6 = new Estante(espacio6, zona5);
                    matriz[i][j] = estante6;
                    zona5.getIcon().setColor(Color.GREEN);
                    zona5.getIcon().setLabel("Pantalon");
                }

                if (i == 6) {
                    Thing zona6 = new Thing(this.almacen, j, i);
                    Estante estante7 = new Estante(espacio7, zona6);
                    matriz[i][j] = estante7;
                    zona6.getIcon().setColor(Color.GREEN);
                    zona6.getIcon().setLabel("Chip");
                }

                if (i == 7) {
                    Thing zona7 = new Thing(this.almacen, j, i);
                    Estante estante8 = new Estante(espacio8, zona7);
                    matriz[i][j] = estante8;
                    zona7.getIcon().setColor(Color.GREEN);
                    zona7.getIcon().setLabel("Bolso");
                }

                if (i == 8) {
                    Thing zona8 = new Thing(this.almacen, j, i);
                    Estante estante9 = new Estante(espacio9, zona8);
                    matriz[i][j] = estante9;
                    zona8.getIcon().setColor(Color.GREEN);
                    zona8.getIcon().setLabel("Munieca");
                }

                if (i == 9) {
                    Thing zona9 = new Thing(this.almacen, j, i);
                    Estante estante10 = new Estante(espacio10, zona9);
                    matriz[i][j] = estante10;
                    zona9.getIcon().setColor(Color.GREEN);
                    zona9.getIcon().setLabel("Frijol");
                }
            }
        }

        empleado = new Robot(almacen, 12, 10, Direction.NORTH, 0);
        empleado.setIcon(new Trabajador());
        empleado.setLabel("Empleado");
    }
    
    public void mover(int pasos, int posicion) {
        for (int i = pasos; i > 0; i--) {
            robot[posicion].move();
        }
    }

    public void girar(int giros, int posicion) {
        for (int i = giros; i > 0; i--) {
            robot[posicion].turnLeft();
        }
    }

    public void giroDerecha(int posicion) {
        girar(3, posicion);
    }
    
    public void recoger(int posicion){
        if(robot[posicion].canPickThing()){
            robot[posicion].pickThing();
        }
    }
    
    public boolean espacio_vacio() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz[i][j].espacio_vacio()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean buscar_producto(String Producto) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz[i][j].buscar_producto(Producto)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public int buscar_avenueingresar(String Producto) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz[i][j].buscar_producto(Producto)) {
                    if (matriz[i][j].espacio_vacio()) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public int buscar_streetingresar(String product) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz[i][j].buscar_producto(product)) {
                    if (matriz[i][j].espacio_vacio()){
                        return j;
                    }
                }
            }
        }
        return -1;
    }
    
    public void mira_este(int posicion) {
        while (robot[posicion].getDirection() != Direction.EAST) {
            robot[posicion].turnLeft();
        }
    }

    public void mira_abajo(int posicion) {
        while (robot[posicion].getDirection() != Direction.SOUTH) {
            robot[posicion].turnLeft();
        }
    }
    
    public void fila(int posicion, int num_disp_cola){
        while(robot[posicion].frontIsClear() != false){
            robot[posicion].move();
        }
        mira_abajo(posicion);
        mover(1,posicion);
        girar(1,posicion );
        if(!robot[posicion].frontIsClear()){
        girar(3,posicion );
        mover(1,posicion);
        girar(1,posicion);
        }
        mira_abajo(posicion);
        mover(num_disp_cola, posicion);
    }
    
    public int can_espacios(int columna, int fila){
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (i==columna) {
                    if (j==fila) {
                        contador+=matriz[i][j].can_espacios();
                    }
                }
            }
        }
        return contador;
    }
    
    public void mover_robot(int posicion, String nombre){
        while (robot[posicion].getStreet() != buscar_streetingresar(nombre)) {
                robot[posicion].move();
            }
            if (robot[posicion].getAvenue() == buscar_avenueingresar(nombre)) {
                mira_este(posicion);
            }
            if (robot[posicion].getAvenue() > buscar_avenueingresar(nombre)) {
                girar(1, posicion);
                while (robot[posicion].getAvenue() != buscar_avenueingresar(nombre)) {
                    robot[posicion].move();
                }
                mira_este(posicion);
            } else {
                giroDerecha(posicion);
                while (robot[posicion].getAvenue() != buscar_avenueingresar(nombre)) {
                    robot[posicion].move();

                }
                mira_este(posicion);
            }
    }
    
    public void movimiento_robot(String nombre, int num_disp_cola) {
        if (robot[0].getStreet() == 7) {
            mover_robot(0, nombre);
            recoger(0);
            fila(0,num_disp_cola);
        } else {
            if (robot[1].getStreet() == 7) {
                 mover_robot(1, nombre);
                 recoger(1);
                 fila(1,num_disp_cola);
            } else {
                if (robot[2].getStreet() == 7) {
                     mover_robot(2, nombre);
                     recoger(2);
                     fila(2,num_disp_cola);
                } else {
                    if (robot[3].getStreet() == 7) {
                         mover_robot(3, nombre);
                         recoger(3);
                         fila(3,num_disp_cola);
                    } else {
                        if (robot[4].getStreet() == 7) {
                             mover_robot(4, nombre);
                             recoger(4);
                             fila(4,num_disp_cola);
                        } else {
                            if (robot[5].getStreet() == 7) {
                                 mover_robot(5, nombre);
                                 recoger(5);
                                 fila(5,num_disp_cola);
                            } else {
                                if (robot[6].getStreet() == 7) {
                                     mover_robot(6, nombre);
                                     recoger(6);
                                     fila(6,num_disp_cola);
                                } else {
                                    if (robot[7].getStreet() == 7) {
                                         mover_robot(7, nombre);
                                         recoger(7);
                                         fila(7,num_disp_cola);
                                    } else {
                                        if (robot[8].getStreet() == 7) {
                                             mover_robot(8, nombre);
                                             recoger(8);
                                             fila(8,num_disp_cola);
                                        } else {
                                            if (robot[9].getStreet() == 7) {
                                                 mover_robot(9, nombre);
                                                 recoger(9);
                                                 fila(9,num_disp_cola);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public int iden_colum(String producto) {
        int columna = 0;
        switch (producto) {
            case "Memoria":
                columna = 0;
                break;
            case "Alimento":
                columna = 1;
                break;
            case "Maleta":
                columna = 2;
                break;
            case "Munieco":
                columna = 3;
                break;
            case "Camisa":
                columna = 4;
                break;
            case "Pantalon":
                columna = 5;
                break;
            case "Chip":
                columna = 6;
                break;
            case "Bolso":
                columna = 7;
                break;
            case "Munieca":
                columna = 8;
                break;
            case "Frijol":
                columna = 9;
                break;
            default:
                System.out.println("el producto no se encuentra en nuestro inventario o esta mal escrito intente de nuevo");
                break;
        }
        return columna;
    }
    
    public boolean ingresar_productoal() {
        int num_disp_cola = 9;
        if (espacio_vacio() == false) {
            System.out.println("No hay espacio disponible en el inventario");
            return false;
        } else {
            System.out.println("Cuantos tipos de productos va a ingresar?(maximo 10)");
            int tip = teclado.nextInt();
            int s = 0;
            int f = s;
            if (tip <= 10) {
                while (f < tip) {
                    while (s < tip) {
                        teclado.nextLine();
                        System.out.println("Ingrese el nombre del producto: ");
                        String nombre = teclado.nextLine();
                        System.out.println("Ingrese el valor del producto: ");
                        int valor = teclado.nextInt();
                        Producto product = new Producto(nombre, valor);
                        if (buscar_producto(nombre)) {
                            System.out.println("Ingrese la cantidad de este producto: ");
                            int cantidad = teclado.nextInt();
                            int columna = iden_colum(nombre);
                            if (cantidad <= can_espacios(columna,0)+can_espacios(columna,1)) {
                                ////////////////////////////////////////////////////falta arreglar la funcion de ingresa, y revisar la funcion de buscar street ingresar
                                if (cantidad <= can_espacios(columna,0)) {
                                    movimiento_robot(nombre, num_disp_cola);
                                    for(int i=0; i < cantidad; i++){
                                        matriz[columna][0].ingresa(product);
                                        System.out.println("Cantidad de esapcios vacios " + can_espacios(columna,0));
                                    }
                                    num_disp_cola--;
                                    s++;
                                } else {
                                    movimiento_robot(nombre, num_disp_cola);
                                    int g=0;
                                    int can_espacios = can_espacios(columna,0);
                                    while(g < can_espacios){
                                        matriz[columna][0].ingresa(product);
                                        System.out.println("Cantidad de esapcios vacios " + can_espacios(columna,0));
                                        g++;
                                    }
                                    num_disp_cola--;
                                    movimiento_robot(nombre, num_disp_cola);
                                    int y=0;
                                    can_espacios = can_espacios(columna,1);
                                    while(y < can_espacios && g < cantidad){
                                        matriz[columna][1].ingresa(product);
                                        System.out.println("Cantidad de esapcios vacios " + can_espacios(columna,0));
                                        y++;
                                        g++;
                                    }
                                    num_disp_cola--;
                                    s++;
                                    //////////////////////////////////////////////////////////////////////////////////7
                                }
                            } else {
                                System.out.println("Lo sentimos, no hay espacio suficiente");
                            }
                        } else {
                            System.out.println("El producto ingresado no se maneja en este almacen, para volver a intentarlo presione enter.");
                        }
                    }
                    f++;
                }
            } else {
                System.out.println("No tenemos tantos tipos disponibles. Vuelva a intentarlo por favor");
                return false;
            }
        }
        return true;
    }
    
    public void sacar_estante() {
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = teclado.nextLine();
        System.out.println(can_espacios(2,0));
    }
}