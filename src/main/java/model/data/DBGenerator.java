package model.data;

import org.jooq.DSLContext;
import org.jooq.DataType;
import org.jooq.impl.DSL;
import java.sql.Connection;
import static org.jooq.impl.DSL.*;
import static org.jooq.impl.SQLDataType.*;
public class DBGenerator {
    //Metodo inicial para crear una base de datos y sus respectivas tablas en caso de que no exista
    public static void iniciarBD(String nombreBD) throws ClassNotFoundException {
        Connection connection = DBConnector.connection("root","");
        DSLContext create = DSL.using(connection);
        crearBaseDato(create,nombreBD);
        create = actualizarConexion(connection,nombreBD);
        crearTablaProductos(create);
        crearTablaTrabajadores(create);
        crearTablaFechaDeVencimiento(create);
        crearTablaCompras(create);
        crearTablaProductosComprados(create);
        DBConnector.closeConnection();
    }
    //Metodo para conectarse a una base de datos ya creada
    public static DSLContext conectarBD(String nombre) throws ClassNotFoundException {
        Connection connection = DBConnector.connection(nombre,"root","");
        DSLContext create = DSL.using(connection);
        return create;
    }
    private static void crearBaseDato(DSLContext create, String nombreBD){
        create.createDatabaseIfNotExists(nombreBD).execute();
    }
    private static DSLContext actualizarConexion(Connection connection,String nombreBD){
        DBConnector.closeConnection();
        connection= DBConnector.connection(nombreBD,"root","");
        DSLContext create=DSL.using(connection);
        return create;
    }
    private static void crearTablaProductos(DSLContext create){
        create.createTableIfNotExists(
                "productos").
                column("id",INTEGER.identity(true)).constraint(primaryKey("id"))
                .column("nombre_producto",VARCHAR(100))
                .column("stock",INTEGER)
                .column("precio",INTEGER).execute();
    }
    private static void crearTablaTrabajadores(DSLContext create){
        create.createTableIfNotExists("trabajadores").column("rut",VARCHAR(50))
                .column("nombre",VARCHAR(100))
                .column("cargo",VARCHAR(100))
                .column("registro_usuario",TIMESTAMP)
                .constraint(primaryKey("rut")).execute();
    }
    public static void crearTablaFechaDeVencimiento(DSLContext create){
        create.createTableIfNotExists("fecha_vencimiento_productos").column("producto_id",INTEGER)
                .constraint(foreignKey("producto_id").references("productos","id"))
                .column("cantidad",INTEGER)
                .column("fecha_vencimiento",DATE)
                .execute();
    }
    public static void crearTablaCompras(DSLContext create){
        create.createTableIfNotExists("compras").column("id",INTEGER.identity(true))
                .constraint(primaryKey("id")).column("estado",VARCHAR(100))
                .column("rut_vendedor",VARCHAR(50))
                .column("fecha_compra",TIMESTAMP)
                .column("total_pagado",INTEGER)
                .constraint(foreignKey("rut_vendedor")
                        .references("trabajadores","rut"))
                .execute();
    }
    public static void crearTablaProductosComprados(DSLContext create){
        create.createTableIfNotExists("productos_comprados").column("compra_id",INTEGER)
                .constraint(foreignKey("compra_id").references("compras","id")).
                column("id_producto",INTEGER).constraint(foreignKey("id_producto").references("productos","id"))
                .execute();
    }
}
