package reserva;

public class ReservaService {
    public String reservar(String cidade, String endereco) {
        if (cidade.equals("Belo Horizonte") || cidade.equals("Contagem")) {
            return "Motorista a caminho";
        } else {
            return "Área fora de cobertura";
        }
    }
}
