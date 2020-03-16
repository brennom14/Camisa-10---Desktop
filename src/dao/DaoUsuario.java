package dao;

import java.util.List;
import model.Usuarios;

public interface DaoUsuario {

    public void salvar(Usuarios usuario);

    public void alterar(Usuarios usuario);

    public void excluir(Usuarios usuario);

    public List<Usuarios> getUsuarios();
    
    public List<Usuarios> getUsuariosObservador();

}
