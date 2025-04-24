# language: pt

Funcionalidade: Reserva de carro por aplicativo
  Como passageiro de um aplicativo de transporte
  Quero reservar um carro informando meu local
  Para que eu possa me deslocar com comodidade e segurança

  Cenário: Reserva dentro da área de cobertura - Belo Horizonte
    Dado que estou no aplicativo de reserva de carros
    Quando informo a cidade "Belo Horizonte" e endereço "Av. Afonso Pena"
    Então o sistema deve confirmar com a mensagem "Motorista a caminho"

  Cenário: Reserva dentro da área de cobertura - Contagem
    Dado que estou no aplicativo de reserva de carros
    Quando informo a cidade "Contagem" e endereço "Rua São Paulo"
    Então o sistema deve confirmar com a mensagem "Motorista a caminho"

  Cenário: Reserva fora da área de cobertura
    Dado que estou no aplicativo de reserva de carros
    Quando informo a cidade "Betim" e endereço "Av. Edméia Matos"
    Então o sistema deve informar "Área fora de cobertura"
