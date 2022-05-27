package test;

import controller.ContaCorrenteController;
import entity.Cliente;
import entity.ContaCorrente;
import entity.Telefone;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaCorrenteControllerTest {

    ContaCorrenteController controller = new ContaCorrenteController();
    Cliente cliente = new Cliente("Marcos", "111", true, null);
    ContaCorrente conta = new ContaCorrente(1, 1, 50., cliente, 10.);

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll");
    }

    @BeforeEach
    void before( ){
        System.out.println("TESTE");
    }

    @AfterEach
    void after( ){
        System.out.println("After Executado");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll");
    }

    @Test
    public void testDebitarSaldo(){
        controller.addConta(conta);
        controller.debitarSaldo(10.);
        assertEquals(40., conta.getSaldo());
    }

    @Test
    public void testCreditarSaldo(){
        controller.addConta(conta);
        controller.creditarSaldo(10.);
        assertEquals(60., conta.getSaldo());
    }
}
