class Carro extends Veiculo {
    // Implementação da classe Carro
    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + getPlaca() + '\'' +
                ", combustivelNoTanque=" + getCombustivelNoTanque() +
                ", quilometragem=" + getQuilometragem() +
                ", alugado=" + isAlugado() +
                ", precoDiaria=" + getPrecoDiaria() +
                ", cilindradas=" + getCilindradas() +
                '}';
    }
}