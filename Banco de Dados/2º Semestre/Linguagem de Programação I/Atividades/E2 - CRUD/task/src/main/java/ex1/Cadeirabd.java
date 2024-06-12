package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Cadeirabd {
    private Connection connect() {
        String url = "jdbc:mysql://localhost:3306/CadeiraDB";
        String user = "root";
        String password = "";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void criar(Cadeira cadeira) {
        String sql = "INSERT INTO Cadeiras (marca, cor, material) VALUES (?, ?, ?)";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cadeira.getMarca());
            pstmt.setString(2, cadeira.getCor());
            pstmt.setString(3, cadeira.getMaterial());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Cadeira ler(int id) {
        String sql = "SELECT * FROM Cadeiras WHERE id = ?";
        Cadeira cadeira = null;
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                cadeira = new Cadeira(rs.getString("marca"), rs.getString("cor"), rs.getString("material"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cadeira;
    }

    public List<Cadeira> readAll() {
        String sql = "SELECT * FROM Cadeiras";
        List<Cadeira> cadeiras = new ArrayList<>();
        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                cadeiras.add(new Cadeira(rs.getString("marca"), rs.getString("cor"), rs.getString("material")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cadeiras;
    }

    public void atualizar(int id, Cadeira cadeira) {
        String sql = "UPDATE Cadeiras SET marca = ?, cor = ?, material = ? WHERE id = ?";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cadeira.getMarca());
            pstmt.setString(2, cadeira.getCor());
            pstmt.setString(3, cadeira.getMaterial());
            pstmt.setInt(4, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletar(int id) {
        String sql = "DELETE FROM Cadeiras WHERE id = ?";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
