package Model;

import Control.PopUp;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kaik D' Andrade
 * @author Gabriel Souza
 */
public class DatabaseModel {

    private static final String URL = "jdbc:mysql://localhost:3306/jbooker?user=root&password=";
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet res;
    public String sql;

    /**
     * Método responsável por realizar a conexão com o banco de dados
     */
    public void setConnection() {
        try {
            // Inicializa a conexão se ocorrer nenhum error
            setConn(DriverManager.getConnection(URL));
        } catch (SQLException error) {
            // Caso gere um erro
            PopUp.showWarning(error);
        }
    }

    /**
     * Método responsável por finalizar a conexão com o banco de dados
     */
    public void setClose() {
        if (getRes() != null) try {
            getRes().close();
        } catch (SQLException ignore) {
        }

        if (getPstm() != null) try {
            getPstm().close();
        } catch (SQLException ignore) {
        }

        if (getConn() != null) try {
            getConn().close();
        } catch (SQLException ignore) {
        }
    }

    /**
     * Método responsável por registrar o livro no banco de dados
     *
     * @param title é o título do livro
     * @param author é o autor do livro
     * @param isbn é o ISBN(Padrão Internacional de Numeração de Livro)
     * @param pages é quantidade de páginas
     * @param price é o valor do livro
     */
    public void create(String title, String author, String isbn, int pages, double price) {

        // Comando SQL
        sql = "INSERT INTO book(title, author, isbn, pages, price) VALUES (?, ?, ?, ?, ?)";

        try {
            // Conecta ao banco de dados, depois prepara, filtra e sanitiza o sql para executa-lo
            setConnection();
            setPstm(getConn().prepareStatement(sql));

            // Alterando os "?" pelos valores corretos
            getPstm().setString(1, title);
            getPstm().setString(2, author);
            getPstm().setString(3, isbn);
            getPstm().setInt(4, pages);
            getPstm().setDouble(5, price);

            // Executa o comando SQL no banco de dados
            getPstm().execute();

            // Exibe uma notificação ao usuário
            PopUp.showNotefy("Sucesso!!! Livro Cadastrado.");

        } catch (SQLException error) {
            // Caso gere um erro
            PopUp.showWarning("DatabaseModel\\create\n" + error);

        } finally {
            // Finaliza toda a conexão com o banco de dados
            setClose();
            sql = null;
        }
    }

    /**
     * Método responsável por retonar os dados de todos registros
     *
     * @return
     */
    public List<Object[]> readAll() {
        try {
            sql = "SELECT title, author, isbn, pages, price FROM book";

            setConnection();
            setPstm(getConn().prepareStatement(sql));
            setRes(getPstm().executeQuery());

            List<Object[]> linhas = new ArrayList<>();

            // Pegando os dados do banco de dados
            while (getRes().next()) {
                Object[] newLine = {
                    getRes().getString("title"),
                    getRes().getString("author"),
                    getRes().getString("isbn"),
                    getRes().getInt("pages"),
                    getRes().getDouble("price")
                };

                linhas.add(newLine);
            }

            return linhas;

        } catch (SQLException error) {
            // Caso gere um erro
            PopUp.showWarning("Main.readAll\n" + error);

            // retorna nulo
            return null;

        } finally {
            // Finaliza toda a conexão com o banco de dados
            setClose();
            sql = null;
        }
    }

    /**
     * Método responsável por retonar os dados do registro de acordo com o id
     *
     * @param bookId é o ID do livro
     * @return
     */
    public List<Object[]> read(int bookId) {
        try {
            sql = "SELECT title, author, isbn, pages, price FROM book WHERE id = ?";

            setConnection();
            setPstm(getConn().prepareStatement(sql));
            getPstm().setInt(1, bookId);
            setRes(getPstm().executeQuery());

            List<Object[]> linhas = new ArrayList<>();

            // Pegando os dados do banco de dados
            while (getRes().next()) {
                Object[] newLine = {
                    getRes().getString("title"),
                    getRes().getString("author"),
                    getRes().getString("isbn"),
                    getRes().getInt("pages"),
                    getRes().getDouble("price")
                };

                linhas.add(newLine);
            }

            return linhas;

        } catch (SQLException error) {
            // Caso gere um erro
            PopUp.showWarning("Main.readAll\n" + error);

            // retorna nulo
            return null;

        } finally {
            // Finaliza toda a conexão com o banco de dados
            setClose();
            sql = null;
        }
    }

    /**
     * Método responsável por alterar os dados de um determinado registro
     *
     * @param id é o ID do livro
     * @param title é o título do livro
     * @param author é o autor do livro
     * @param isbn é o ISBN(Padrão Internacional de Numeração de Livro)
     * @param pages é a quantidade de páginas do livro
     * @param price é o valor do livro
     */
    public void update(int id, String title, String author, String isbn, int pages, double price) {

        // Comando SQL
        sql = "UPDATE book SET title = ?, author = ?, isbn = ?, pages = ?, price = ? WHERE id = ?";

        try {
            // Conecta ao banco de dados, depois prepara, filtra e sanitiza o sql para executa-lo
            setConnection();
            setPstm(getConn().prepareStatement(sql));

            // Alterando os "?" pelos valores corretos
            getPstm().setString(1, title);
            getPstm().setString(2, author);
            getPstm().setString(3, isbn);
            getPstm().setInt(4, pages);
            getPstm().setDouble(5, price);
            getPstm().setInt(6, id);

            // Executa o comando SQL no banco de dados
            getPstm().execute();

            // Exibe uma notificação ao usuário
            PopUp.showNotefy("Sucesso!!! Os dados do livro foram alterados.");

        } catch (SQLException error) {
            // Caso gere um erro
            PopUp.showWarning("DatabaseModel\\updateUser\n" + error);

        } finally {
            // Finaliza a toda a conexão com o banco de dados
            setClose();
            sql = null;
        }
    }

    /**
     * Método responsável por deletar um determinado registro
     *
     * @param id é o ID do livro
     */
    public void delete(int id) {

        // Verifica se o usuário confirmou a exclusão do registro
        if (PopUp.showConfirm("Aviso:", "Deseja realmente excluir este registro?")) {
            if (PopUp.showConfirmAlert("Isso Será permanente! Isto é sem volta!\\nAo proseguir automaticamente você assina o termo de responsabilidade...\nIsto é qualquer problema gerado por conta da exclusão desse dado cabe apenas a você!")) {

                // Comando SQL
                sql = "DELETE book WHERE id = ?";

                try {
                    // Conecta ao banco de dados, depois prepara, filtra e sanitiza o sql para executa-lo
                    setConnection();
                    setPstm(getConn().prepareStatement(sql));

                    // Altera os "?" pelos valores corretos
                    getPstm().setInt(1, id);

                    // Executa o comando SQL no banco de dados
                    getPstm().execute();

                } catch (SQLException error) {
                    // Caso gere um erro
                    PopUp.showWarning("DatabaseModel\\delete\n" + error);

                } finally {
                    // Finaliza toda a conexão com o banco de dados
                    setClose();
                    sql = null;
                }
            }
        }
    }

    /**
     * @return the conn
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * @param conn the conn to set
     */
    public void setConn(Connection conn) {
        this.conn = conn;
    }

    /**
     * @return the pstm
     */
    public PreparedStatement getPstm() {
        return pstm;
    }

    /**
     * @param pstm the pstm to set
     */
    public void setPstm(PreparedStatement pstm) {
        this.pstm = pstm;
    }

    /**
     * @return the res
     */
    public ResultSet getRes() {
        return res;
    }

    /**
     * @param res the res to set
     */
    public void setRes(ResultSet res) {
        this.res = res;
    }
}
