/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author 9spot
 */

import Modelo.Solicitante;
import java.sql.*;


public class Solicitantedao {

    public boolean agregar(Solicitante sol) {
        String sql = "INSERT INTO solicitantes (cedula, extension, nombre_apellido, cargo, centro_costo_dependencia) "
                   + "VALUES (?, ?, ?, ?, ?)";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1,    sol.getCedula());
            ps.setString(2, sol.getExtension());
            ps.setString(3, sol.getNombreApellido());
            ps.setString(4, sol.getCargo());
            ps.setString(5, sol.getCentroCostoDependencia());
            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            if (e.getErrorCode() == 1062) {
                System.err.println("Ya existe un solicitante con esa cédula.");
            } else if (e.getErrorCode() == 1452) {
                System.err.println("El centro de costo ingresado no existe en la tabla dependencias.");
            } else {
                System.err.println("Error al agregar solicitante: " + e.getMessage());
            }
            return false;
        }
    }

    public Solicitante buscar(int cedula) {
        String sql = "SELECT cedula, extension, nombre_apellido, cargo, centro_costo_dependencia "
                   + "FROM solicitantes WHERE cedula = ?";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, cedula);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Solicitante(
                    rs.getInt("cedula"),
                    rs.getString("extension"),
                    rs.getString("nombre_apellido"),
                    rs.getString("cargo"),
                    rs.getString("centro_costo_dependencia")
                );
            }

        } catch (SQLException e) {
            System.err.println("Error al buscar solicitante: " + e.getMessage());
        }
        return null; 
    }

    public boolean eliminar(int cedula) {
        String sql = "DELETE FROM solicitantes WHERE cedula = ?";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, cedula);
            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            if (e.getErrorCode() == 1451) {
                System.err.println("No se puede eliminar: el solicitante tiene órdenes registradas.");
            } else {
                System.err.println("Error al eliminar solicitante: " + e.getMessage());
            }
            return false;
        }
    }
}