import java.util.Objects;

abstract class Veiculo {
    private String placa;
    private double combustivelNoTanque;
    private double quilometragem;
    private boolean alugado;
    private double precoDiaria;
    private double cilindradas;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCombustivelNoTanque() {
        return combustivelNoTanque;
    }

    public void setCombustivelNoTanque(double combustivelNoTanque) {
        this.combustivelNoTanque = combustivelNoTanque;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public double getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(double cilindradas) {
        this.cilindradas = cilindradas;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Veiculo veiculo = (Veiculo) obj;
        return Objects.equals(placa, veiculo.placa);
    }

    public abstract String toString();
}

