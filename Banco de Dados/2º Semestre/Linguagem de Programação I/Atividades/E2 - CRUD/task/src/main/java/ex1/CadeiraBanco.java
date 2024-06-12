package ex1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CadeiraBanco {
    private String jdbcURL = "jdbc:mysql://localhost:3306/CadeiraDB";
    private String jdbcUsername = "root";
    private String jdbcPassword = "";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
    }

    public void insertCadeira(Cadeira cadeira) throws SQLException {
        String sql = "INSERT INTO Cadeira (marca, cor, material) VALUES (?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, cadeira.getMarca());
            ps.setString(2, cadeira.getCor());
            ps.setString(3, cadeira.getMaterial());
            ps.executeUpdate();
        }
    }

    public Cadeira selectCadeira(int id) throws SQLException {
        String sql = "SELECT * FROM Cadeira WHERE id = ?";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Cadeira(rs.getString("marca"), rs.getString("cor"), rs.getString("material"));
            }
        }
        return null;
    }

    public List<Cadeira> selectAllCadeiras() throws SQLException {
        String sql = "SELECT * FROM Cadeira";
        List<Cadeira> cadeiras = new ArrayList<>();
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cadeiras.add(new Cadeira(rs.getString("marca"), rs.getString("cor"), rs.getString("material")));
            }
        }
        return cadeiras;
    }

    public void deleteCadeira(int id) throws SQLException {
        String sql = "DELETE FROM Cadeira WHERE id = ?";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    public void updateCadeira(Cadeira cadeira, int id) throws SQLException {
        String sql = "UPDATE Cadeira SET marca = ?, cor = ?, material = ? WHERE id = ?";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, cadeira.getMarca());
            ps.setString(2, cadeira.getCor());
            ps.setString(3, cadeira.getMaterial());
            ps.setInt(4, id);
            ps.executeUpdate();
        }
    }
}