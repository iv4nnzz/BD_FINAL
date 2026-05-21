/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author 9spot
 */

import Modelo.Dependencia;
import java.sql.*;

public class Dependenciadao {

    public boolean agregar(Dependencia dep) {
        String sql = "INSERT INTO dependencias (centro_costo, nombre) VALUES (?, ?)";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, dep.getCentroCosto());
            ps.setString(2, dep.getNombre());
            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            if (e.getErrorCode() == 1062) {
                System.err.println("Ya existe una dependencia con ese centro de costo.");
            } else {
                System.err.println("Error al agregar dependencia: " + e.getMessage());
            }
            return false;
        }
    }

    public Dependencia buscar(String centroCosto) {
        String sql = "SELECT centro_costo, nombre FROM dependencias WHERE centro_costo = ?";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, centroCosto);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Dependencia(
                    rs.getString("centro_costo"),
                    rs.getString("nombre")
                );
            }

        } catch (SQLException e) {
            System.err.println("Error al buscar dependencia: " + e.getMessage());
        }
        return null; 
    }

    public boolean eliminar(String centroCosto) {
        String sql = "DELETE FROM dependencias WHERE centro_costo = ?";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, centroCosto);
            int filas = ps.executeUpdate();
            return filas > 0; 

        } catch (SQLException e) {
            if (e.getErrorCode() == 1451) {
                System.err.println("No se puede eliminar: hay solicitantes vinculados a esta dependencia.");
            } else {
                System.err.println("Error al eliminar dependencia: " + e.getMessage());
            }
            return false;
        }
    }
}