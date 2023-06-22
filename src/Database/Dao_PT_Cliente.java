package Database;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao_PT_Cliente extends Base_Dao implements Dao_PT_Cliente_Interface{
    public Dao_PT_Cliente() {
        super();
    }

    @Override
    public void createPT_Cliente(int idPT, int idCliente) {
        String query="INSERT INTO \"PT_Cliente\" (idC,idI) VALUES (?,?)";
        try {
            PreparedStatement statement=super.connection.prepareStatement(query);
            statement.setInt(1, idPT);
            statement.setInt(2, idCliente);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletePT_Cliente(int idCliente) {
        String query="DELETE FROM \"PT_Cliente\" WHERE idC=?";
        try {
            PreparedStatement statement=super.connection.prepareStatement(query);
            statement.setInt(1, idCliente);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}