/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author 9spot
 */

import Modelo.Orden;
import java.sql.*;
import java.time.LocalDate;

public class Ordendao {

    public int agregar(Orden orden) {
        String sql = "INSERT INTO ordenes (fecha_solicitud, observaciones, tipo, cedula_solicitante) "
                   + "VALUES (?, ?, ?, ?)";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setDate(1, Date.valueOf(orden.getFechaSolicitud()));

            ps.setString(2, orden.getObservaciones());

            ps.setString(3, orden.getTipoCedula());

            ps.setInt(4, orden.getCedulaSolicitante());

            ps.executeUpdate();

            ResultSet claves = ps.getGeneratedKeys();
            if (claves.next()) {
                return claves.getInt(1);
            }

        } catch (SQLException e) {
            if (e.getErrorCode() == 1452) {
                System.err.println("La cédula del solicitante no existe en la tabla solicitantes.");
            } else {
                System.err.println("Error al agregar orden: " + e.getMessage());
            }
        }
        return -1; 
    }

    public Orden buscar(int numero) {
        String sql = "SELECT numero, fecha_solicitud, observaciones, tipo, cedula_solicitante "
                   + "FROM ordenes WHERE numero = ?";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, numero);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Orden(
                    String.valueOf(rs.getInt("numero")),
                    rs.getDate("fecha_solicitud").toLocalDate(),
                    rs.getString("observaciones"),
                    rs.getString("tipo"),          
                    rs.getInt("cedula_solicitante")
                );
            }

        } catch (SQLException e) {
            System.err.println("Error al buscar orden: " + e.getMessage());
        }
        return null;
    }

    public boolean eliminar(int numero) {
        String sql = "DELETE FROM ordenes WHERE numero = ?";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, numero);
            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            if (e.getErrorCode() == 1451) {
                System.err.println("No se puede eliminar: la orden tiene registros vinculados (solicitudes, liquidaciones, etc.).");
            } else {
                System.err.println("Error al eliminar orden: " + e.getMessage());
            }
            return false;
        }
    }
}