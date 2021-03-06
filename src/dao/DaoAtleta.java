package dao;

import java.util.List;
import model.Atleta;

public interface DaoAtleta {

    public void salvar(Atleta atleta);

    public void alterar(Atleta atleta);

    public void excluir(Atleta atleta);

    public List<Atleta> getAtleta();

    public void alterarImagem(String[] img, int id);

    public List<Atleta> getAtletaPorClube(String clube);

    public List<Atleta> getAtletaPorAltura(String clube);

    public List<Atleta> getAtletaPorPosicao(String clube);

}
