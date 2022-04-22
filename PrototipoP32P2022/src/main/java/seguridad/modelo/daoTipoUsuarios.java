/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.modelo;

import seguridad.controlador.clsTipoUsuarios;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author visitante
 */
public class daoTipoUsuarios {

    private static final String SQL_SELECT = "SELECT tipousuid, tipousunombre FROM tbl_tipousuarios";
    private static final String SQL_INSERT = "INSERT INTO tbl_tipousuarios(tipousunombre ) VALUES(?)";
    private static final String SQL_UPDATE = "UPDATE tbl_tipousuarios SET tipousunombre=? WHERE tipousuid = ?";
    private static final String SQL_DELETE = "DELETE FROM tbl_tipousuarios WHERE tipousuid=?";
    private static final String SQL_QUERY = "SELECT tipousuid, tipousunombre FROM tbl_tipousuarios WHERE tipousuid=?";
       

    public List<clsTipoUsuarios> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        clsTipoUsuarios tipousuario = null;
        List<clsTipoUsuarios> tipousuarios = new ArrayList<clsTipoUsuarios>();
        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("tipousuid");
                String nombre = rs.getString("tipousunombre");
  
                tipousuario = new clsTipoUsuarios();
                tipousuario.setTipousuid(id);
                tipousuario.setTipousunombre(nombre);
                tipousuarios.add(tipousuario);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(rs);
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return tipousuarios;
    }

    public int insert(clsTipoUsuarios tipousuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, tipousuario.getTipousunombre());           

            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return rows;
    }

    public int update(clsTipoUsuarios tipousuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = clsConexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, tipousuario.getTipousunombre());    
            stmt.setInt(9, tipousuario.getTipousuid());

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return rows;
    }

    public int delete(clsTipoUsuarios tipousuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, tipousuario.getTipousuid());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return rows;
    }

    public clsTipoUsuarios query(clsTipoUsuarios tipousuario) 
    {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = clsConexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setInt(1, tipousuario.getTipousuid());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("tipousuid");
                String nombre = rs.getString("tipousunombre");

                tipousuario = new clsTipoUsuarios();
                tipousuario.setTipousuid(id);
                tipousuario.setTipousunombre(nombre);
               
                
            }
            //System.out.println("Registros buscado:" + persona);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(rs);
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        //return personas;  // Si se utiliza un ArrayList
        return tipousuario;
    }
}




