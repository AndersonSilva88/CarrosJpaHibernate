package teste;

import dao.marca.IMarcaDao;
import dao.marca.MarcaDao;
import domain.Marca;
import org.junit.Test;

public class MarcaTeste {

    private IMarcaDao marcaDao;

    public MarcaTeste() {
        marcaDao = new MarcaDao();
    }

    @Test
    public void cadastrar() {
        Marca marca = new Marca();
        marca.setNome("VolksWagem");
    }
}
