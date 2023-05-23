package launcher;

import model.*;

public class Launcher {
    public static void main(String[] args) {
        inicializar();
    }
    public static void inicializar() {
        //Este Launcher incial es para probar la funcionalidad de las funciones preliminares de la tienda

        //Se crea una tienda.
        Tienda tienda = new Tienda("RANDOM", "8 AM - 20 PM", "TEMUCO");

        //Se crean y agregan trabajadores.
        AdministradorDeCajero administradorDeCajero = new AdministradorDeCajero("18.747.344.6", "Juan", "8am - 12 pm", "Contabilidad", "954332554", "juan@gmail.com");
        JefeDeLocal jefeDeLocal = new JefeDeLocal("12.733.342-3", "Pedro", "7am - 16 pm", "Administrador", "982432533", "pedro@gmail.com");
        JefeDeBodega jefeDeBodega = new JefeDeBodega("12.844.883-2", "Diego", "8am - 16pm", "Mantención", "938238328", "diego@gmail.com");
        tienda.addTrabajador(administradorDeCajero);
        tienda.addTrabajador(jefeDeLocal);
        tienda.addTrabajador(jefeDeBodega);


        //Se crea y agregan bodegas
        Bodega bodega = new Bodega("0000001", "Temuco", "6am -20 pm", jefeDeBodega);
        tienda.addBodega(bodega);

        //Se crea y agregan productos a la bodega
        tienda.addProductoBodega(bodega, new Producto("0001", "Leche", 23, "Lacteos", null));
        tienda.addProductoTienda(new Producto("00002", "Naranja", 200, "Frutas", null));

        //Se muestran en pantalla los datos
        tienda.mostrarTrabajadores();
        tienda.mostrarProductosTienda();
        tienda.mostrarProductosBodega(bodega);

        //Se eliminan datos
        tienda.removeTrabajador("18.747.344.6");
        tienda.removeProductoTienda("00002");
        tienda.removeProductoBodega(bodega, "0001");

        //Se muestran nuevamente en pantalla los datos
        tienda.mostrarTrabajadores();
        tienda.mostrarProductosTienda();
        tienda.mostrarProductosBodega(bodega);


    }
}
