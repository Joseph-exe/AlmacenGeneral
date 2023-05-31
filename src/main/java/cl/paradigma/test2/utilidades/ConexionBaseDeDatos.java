/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.paradigma.test2.utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aspire-E15
 */
public class ConexionBaseDeDatos {
    protected Connection conexion;
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/almacen";
    //ACA LA MODIFIQUE EL USUARIO Y CONTRASEÑA
    private final String USER ="root";
    private final String PASS ="ianethan12";
    //FIN
    public void Conectar()
    {
        try {
            conexion = DriverManager.getConnection(DB_URL,USER,PASS);
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Cerrar()
    {
        if (conexion != null)
        {
            try {
                if(!conexion.isClosed())
                {
                    conexion.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConexionBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}