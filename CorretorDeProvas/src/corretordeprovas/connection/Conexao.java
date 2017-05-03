package corretordeprovas.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    
    private String local;
    private String usuario;
    private String senha;
    private String url;
    private String nomeBanco;
    private Connection connection;
 
    public Conexao(String local, String usuario, String senha, String porta, String nomeBanco){
        this.local = local;
        this.usuario = usuario;
        this.senha = senha;
        this.nomeBanco = nomeBanco;
        url = ("jdbc:postgresql://"+local+":" + porta +"/"+nomeBanco);
        
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro de conexão!");
            e.printStackTrace();
        }
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
