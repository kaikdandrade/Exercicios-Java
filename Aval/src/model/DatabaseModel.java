package Model;

import Control.PopUp;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

/**
 * @author Kaik D' Andrade
 * @author Gabriel Souza
 */
public class DatabaseModel {

    private static final String URL = "jdbc:mysql://localhost:3306/idealmusic?user=root&password=";
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
     * @param title é o título do livro
     * @param author é o autor do livro
     * @param isbn é o ISBN(Padrão Internacional de Numeração de Livro)
     * @param pages é quantidade de páginas
     * @param price é o valor do livro
     */
    public void createBook(String title, String author, String isbn, int pages, String price) {

        // Comando SQL
        sql = "INSERT INTO users(uname, uemail, upassword, uavatar, utype) VALUES (?, ?, sha2(?, 512), 1, ?)";

        try {
            // Conecta ao banco de dados, depois prepara, filtra e sanitiza o sql para executa-lo
            setConnection();
            setPstm(getConn().prepareStatement(sql));

            // Alterando os "?" pelos valores corretos
//            getPstm().setString(1, userName);
//            getPstm().setString(2, userEmail);
//            getPstm().setString(3, userPass);
//            getPstm().setString(4, userType);

            // Executa o comando SQL no banco de dados
            getPstm().execute();

            // Exibe uma notificação ao usuário
            PopUp.showNotefy("Sucesso!!! Usuário criado, seja bem vindo(a).");

        } catch (SQLException error) {
            // Caso gere um erro
            PopUp.showWarning("DatabaseModel\\createUser\n" + error);

        } finally {
            // Finaliza toda a conexão com o banco de dados
            setClose();
            sql = null;
        }
    }

    /**
     * Método responsável por ler e retornar todas os registro de uma coluna de
     * alguma tabela do banco de dados
     *
     * @param table é a tabela do banco de dados
     * @param field é nome da coluna
     * @return
     */
    public ArrayList<String> readAll(String table, String field) {

        // Varíavel que armazená os dados
        ArrayList<String> data = new ArrayList<>();

        // Comando SQL
        sql = "SELECT * FROM " + table;

        try {
            // Conecta ao banco de dados, depois prepara, filtra e sanitiza o sql para executa-lo
            setConnection();
            setPstm(getConn().prepareStatement(sql));

            // Executa o comando SQL no banco de dados
            setRes(getPstm().executeQuery());

            // Se for true, salva o dado do campo `field` dentro de `data`
            while (getRes().next()) {
                data.add(getRes().getString(field));
            }

            return data;

        } catch (SQLException error) {
            // Caso gere um erro
            PopUp.showWarning("DatabaseModel\\readAll\n" + error);

            // Retorna null
            return null;

        } finally {
            // Finaliza toda a conexão com o banco de dados
            setClose();
            sql = null;
            data = null;
        }
    }

    /**
     * Método responsável por alterar os dados de nome e email do usuário
     *
     * @param userId é o id do usuário
     * @param userName é o nome do usuário
     * @param userEmail é o email do usuário
     * @return (false => erro; true => sucesso)
     * @author Gabriel Souza
     */
    public boolean updateUser(int userId, String userName, String userEmail) {

        // Comando SQL
        sql = "UPDATE users SET uname = ?, uemail = ? WHERE uid = ?";

        try {
            // Conecta ao banco de dados, depois prepara, filtra e sanitiza o sql para executa-lo
            setConnection();
            setPstm(getConn().prepareStatement(sql));

            // Alterando os "?" pelos valores corretos
            getPstm().setString(1, userName);
            getPstm().setString(2, userEmail);
            getPstm().setInt(3, userId);

            // Executa o comando SQL no banco de dados
            getPstm().execute();

            // Exibe uma notificação ao usuário
            PopUp.showNotefy("Sucesso!!! Dados do usuário alterados.");

            // Retorna true
            return true;

        } catch (SQLException error) {
            // Caso gere um erro
            PopUp.showWarning("DatabaseModel\\updateUser\n" + error);

            // Retorna false
            return false;

        } finally {
            // Finaliza a toda a conexão com o banco de dados
            setClose();
            sql = null;
        }
    }

    /**
     * Método responsável por "deletar" o usuário do banco de dados
     *
     * @param userId é o id do usuário
     * @author Gabriel Souza
     */
    public void deleteUser(int userId) {

        // Verifica se o usuário confirmou a "exclusão" dos dados
        if (PopUp.showConfirm("Aviso:", "Deseja realmente excluir este usuário?")) {
            if (PopUp.showConfirmAlert("Realmente Deseja excluir esse registro.\nIsso Será permanente! Isto é sem volta!\\nAo clicar em proseguir automaticamente você assina o termo de responsabilidade...\nIsto é qualquer problema gerado por conta da exclusão desse dado cabe apenas a você!")) {

                // Comando SQL
                sql = "UPDATE users SET ustatus = 'del' WHERE uid = ?";

                try {
                    // Conecta ao banco de dados, depois prepara, filtra e sanitiza o sql para executa-lo
                    setConnection();
                    setPstm(getConn().prepareStatement(sql));

                    // Altera os "?" pelos valores corretos
                    getPstm().setInt(1, userId);

                    // Executa o comando SQL no banco de dados
                    getPstm().execute();

                } catch (SQLException error) {
                    // Caso gere um erro
                    PopUp.showWarning("DatabaseModel\\deleteUser\n" + error);

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
