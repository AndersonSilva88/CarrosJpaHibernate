package teste;

import dao.acessorios.AcessoriosDao;
import dao.acessorios.IAcessoriosDao;
import dao.carro.CarroDao;
import dao.carro.ICarroDao;
import dao.marca.IMarcaDao;
import dao.marca.MarcaDao;
import domain.Acessorios;
import domain.Carro;
import domain.Marca;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CarroTeste {

    private ICarroDao carroDao;

    private IMarcaDao marcaDao;
    private IAcessoriosDao acessoriosDao;

    public  CarroTeste() {
        carroDao = new CarroDao();
        marcaDao = new MarcaDao();
        acessoriosDao = new AcessoriosDao();
    }

    @Test
    public void cadastrar() {
        Carro carro = new Carro();
        Marca marca = criarMarca("A1");
        Acessorios acessorios = criarAcessorios("A2");

        carro.setModelo("Jetta");
        carro.setMarca(marca);
        carro.setAnoFabricacao("2022");
        carro.setAcessorios(acessorios);
        carro = carroDao.cadastrar(carro);

        assertNotNull(carro);
        assertNotNull(carro.getId());

    }

    public Marca criarMarca(String codigo) {
        Marca marca = new Marca();
        marca.setNome("VolksWagem");
        return marcaDao.cadastrar(marca);
    }

    public Acessorios criarAcessorios(String codigo) {
        Acessorios acessorios = new Acessorios();
        acessorios.setCdPlayer("Radio");
        acessorios.setStep("Pneu");
        return acessoriosDao.cadastrar(acessorios);
    }
}
