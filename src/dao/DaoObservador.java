package dao;

import java.util.List;
import model.Observador;

public interface DaoObservador {

    public void salvar(Observador observador);

    public void alterar(Observador observador);

    public void excluir(Observador observador);

    public List<Observador> getObservador();
public List<Observador > getObservadorPorClube (String clube);
}
