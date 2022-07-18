

public class progama {
    public static void main(String[] args) {
        
        Carro van = new Carro();
        van.marca = "Toyota";
        van.modelo = "Hiace";
        van.capCombustivel= 76;
        van.numPassageiro = 10;
        van.consCombustivel = 10.2;
        van.tipoCombustivel = "diesel";

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.capCombustivel = 42;
        fusca.numPassageiro = 4;
        fusca.consCombustivel = 8.6;
        fusca.tipoCombustivel = "alcool";

        System.out.println("----- Impressão do Objeto -----");
        System.out.println(van);
        System.out.println("Modelo: " + van.modelo + "| Autonomia: " + van.calculaAutonomia() + " | Combustivel:" + van.tipoCombustivel);
        System.out.println("Eco taxa: " + van.verificarEcoDesempenho());
        if(van.validaEcoDesempenho(105) == true){
            System.out.println("Eco eficiente.");
        } else{
            System.out.println("Não é Eco Eficiente.");
        }

        System.out.println(fusca);
        System.out.println("Modelo: " + fusca.modelo + "| Autonomia: " + fusca.calculaAutonomia() +  " | Combustivel:" + fusca.tipoCombustivel);
        System.out.println("Eco taxa: " + fusca.verificarEcoDesempenho());
        if(fusca.validaEcoDesempenho(106) == true){
            System.out.println("Eco eficiente.");
        } else{
            System.out.println("Não é Eco Eficiente.");
        }
        System.out.println("-------- exercicio de aeronave-----------");

        Aeronave boeng77 = new Aeronave();
        boeng77.tripulacao = 20;
        boeng77.combustivel = "querosene";
        boeng77.consumo = 10.2;
        boeng77.passageiros = 500;
        boeng77.passagem = 2300.20;
        boeng77.tanque = 2500;
        
        Aeronave jumbo = new Aeronave();
        jumbo.tripulacao = 25;
        jumbo.combustivel = "querosene";
        jumbo.consumo = 12.2;
        jumbo.passageiros = 700;
        jumbo.passagem = 2500.20;
        jumbo.tanque = 3500;

        Aeronave biMotor = new Aeronave();
        biMotor.tripulacao = 2;
        biMotor.combustivel = "gasolinaDeAviao";
        biMotor.consumo = 8.5;
        biMotor.passageiros = 10;
        biMotor.passagem = 2000.50;
        biMotor.tanque = 500;

        Aeronave jatinho = new Aeronave();
        jatinho.tripulacao = 4;
        jatinho.combustivel = "alcool de aviao";
        jatinho.consumo = 8.2;
        jatinho.passageiros = 20;
        jatinho.passagem = 3000.20;
        jatinho.tanque = 1000;

        System.out.println(boeng77);
        System.out.println("Tripulacao: " + boeng77.tripulacao + "| Autonomia: " + boeng77.calcAutonomia() +  " | Combustivel:" + boeng77.combustivel + " | Passageiros:  " + boeng77.passageiros);
        System.out.println("Media autonomia: " + boeng77.mediaAutonomia() + " Indice Passageiro: " + boeng77.indicePassageiro());

        System.out.println(jumbo);
        System.out.println("Tripulacao: " + jumbo.tripulacao + "| Autonomia: " + jumbo.calcAutonomia() +  " | Combustivel:" + jumbo.combustivel + " | Passageiros:  " + jumbo.passageiros);
        System.out.println("Media autonomia: " + jumbo.mediaAutonomia() + " Indice Passageiro: " + jumbo.indicePassageiro());

        System.out.println(biMotor);
        System.out.println("Tripulacao: " + biMotor.tripulacao + "| Autonomia: " + biMotor.calcAutonomia() +  " | Combustivel:" + biMotor.combustivel + " | Passageiros:  " + biMotor.passageiros);
        System.out.println("Media autonomia: " + biMotor.mediaAutonomia() + " Indice Passageiro: " + biMotor.indicePassageiro());

        System.out.println(jatinho);
        System.out.println("Tripulacao: " + jatinho.tripulacao + "| Autonomia: " + jatinho.calcAutonomia() +  " | Combustivel:" + jatinho.combustivel + " | Passageiros:  " + jatinho.passageiros);
        System.out.println("Media autonomia: " + jatinho.mediaAutonomia() + " Indice Passageiro: " + jatinho.indicePassageiro());
    }
}
