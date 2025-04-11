package DAO.UsuarioDAO;

import java.util.ArrayList;

import modelo.Usuario;

public class UsuarioDAO {
    
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    //Construtor: adiciona usuarios "pre-candidatos";
    public UsuarioDAO(){
        usuarios.add(new Usuario("adimin", "1234"));
        usuarios.add(new Usuario("usuario", "4321"));
    }

    //Construtor: Verifica se o usuario e senha informados existem na lista";
    public boolean autenticar(String login, String senha){

        for (Usuario u : usuarios) {
            if (u.getLogin().equals(login) && u.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }
}
