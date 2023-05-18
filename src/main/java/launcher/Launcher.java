package launcher;

import model.data.DBGenerator;

public class Launcher {
    public static void main(String[] args) {
        inicializar();
    }
    public static void inicializar(){
        DBGenerator dbGenerator= new DBGenerator();
        try {
            dbGenerator.iniciarBD("Tienda");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
