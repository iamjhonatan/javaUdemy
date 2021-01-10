import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void main(String[] args) throws SQLException {

        Scanner s = new Scanner(System.in);
        System.out.println("Informe o código: ");
        int codigo = s.nextInt();

        Connection conexao = FabricaConexao.getConexao();
        String sql = "DELETE FROM pessoas WHERE codigo = ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigo);

        if(stmt.executeUpdate() > 0){
            System.out.println("Pessoa excluída com sucesso!");
        } else {
            System.out.println("Nenhum alteração feita.");
        }

        s.close();
        conexao.close();
    }
}
