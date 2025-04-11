package controle;

import DAO.UsuarioDAO.UsuarioDAO;

public class ControleLogin {
   
    private UsuarioDAO usuarioDAO;

    //Construtor: Cria o DAO.
    public ControleLogin(){
        usuarioDAO = new UsuarioDAO();
    }

    //Metodo que será chamado pela interface (view).
    public boolean autenticar(String login, String senha){
        return usuarioDAO.autenticar(login, senha);
    }
}