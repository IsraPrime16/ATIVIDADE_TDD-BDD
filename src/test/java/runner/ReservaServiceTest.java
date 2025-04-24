package runner;

import org.junit.Test;
import static org.junit.Assert.*;
import reserva.ReservaService;

public class ReservaServiceTest {
    
    @Test
    public void testReservaDentroDaAreaDeCoberturaBH() {
        ReservaService service = new ReservaService();
        assertEquals("Motorista a caminho", service.reservar("Belo Horizonte", "Av. Afonso Pena"));
    }
    
    @Test
    public void testReservaDentroDaAreaDeCoberturaContagem() {
        ReservaService service = new ReservaService();
        assertEquals("Motorista a caminho", service.reservar("Contagem", "Rua São Paulo"));
    }
    
    @Test
    public void testReservaForaDaAreaDeCobertura() {
        ReservaService service = new ReservaService();
        assertEquals("Área fora de cobertura", service.reservar("Betim", "Av. Edméia Matos"));
    }
}
