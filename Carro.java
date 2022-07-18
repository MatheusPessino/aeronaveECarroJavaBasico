
import java.lang.Math;

public class Carro {

    ////#region Atributos
    String marca;
    String modelo;

    int numPassageiro;
    double capCombustivel;
    double consCombustivel;
    String tipoCombustivel;
    ////#endregion

    ////#region Regras de Négocios da Classe (Métodos)
    public double calculaAutonomia(){
        return Math.round((this.capCombustivel * this.consCombustivel));
    }

    public double verificarEcoDesempenho(){
            double eco = ((this.calculaAutonomia()/this.numPassageiro) * this.isCombustivel());
            return Math.round(eco);
    }

    public boolean validaEcoDesempenho(double indice){
        if(this.verificarEcoDesempenho() > indice){
            return true;
        } else{
            return false;
        }
    }

    public  double isCombustivel(){
        double modificador = 0;
        if(this.tipoCombustivel == "alcool"){
            modificador = 0.7;
        } else if(this.tipoCombustivel == "gasolina") {
            modificador = 1;
        } else if(this.tipoCombustivel == "diesel"){
            modificador = 1.6;
        }
        return modificador;
    }

    ////#endregion
}