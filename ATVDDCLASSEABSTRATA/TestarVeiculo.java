public class TestarVeiculo {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setPlaca("PYF423");
        carro1.setCombustivelNoTanque(40);
        carro1.setQuilometragem(10000);
        carro1.setAlugado(false);
        carro1.setPrecoDiaria(50.0);
        carro1.setCilindradas(200.0);

        Moto moto1 = new Moto();
        moto1.setPlaca("XUA589");
        moto1.setCombustivelNoTanque(30);
        moto1.setQuilometragem(5000);
        moto1.setAlugado(true);
        moto1.setPrecoDiaria(20.0);
        moto1.setCilindradas(150);

        System.out.println("Informações do Carro:");
        System.out.println(carro1.toString());

        System.out.println("\nInformações da Moto:");
        System.out.println(moto1.toString());

        Carro carro2 = new Carro();
        carro2.setPlaca("PYF423");

        System.out.println("\nComparação de placas:");
        System.out.println("carro 1 igual carro 2? " + carro1.equals(carro2));
    }
}