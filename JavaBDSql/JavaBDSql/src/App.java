import DAO.ProdutoDAO;
import entidades.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        ProdutoDAO dao = new ProdutoDAO();

        for(Produto p : dao.listar()) {
            System.out.println(p.toString());
        }
    }
}
