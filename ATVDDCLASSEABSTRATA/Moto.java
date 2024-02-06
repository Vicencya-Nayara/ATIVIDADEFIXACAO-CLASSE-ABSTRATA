class Moto extends Veiculo {
    // Implementação da classe Moto
    @Override
    public String toString() {
        return "Moto{" +
                "placa='" + getPlaca() + '\'' +
                ", combustivelNoTanque=" + getCombustivelNoTanque() +
                ", quilometragem=" + getQuilometragem() +
                ", alugado=" + isAlugado() +
                ", precoDiaria=" + getPrecoDiaria() +
                ", cilindradas=" + getCilindradas() +
                '}';
    }
}