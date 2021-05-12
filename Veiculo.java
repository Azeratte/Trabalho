import java.time.Year;

public class Veiculo {
    
    private String modelo, marca, placa, combustivel;
    private double valor;
    private int ano;

    public Veiculo(String modelo, String marca, String placa, String combustivel, double valor, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.valor = valor;
        this.ano = ano;
        this.combustivel = combustivel;
    }

    public String imprimir() {
        return marca+" - "+modelo+" - "+placa+" - "+combustivel+"\n"+ano+"\n"+valor+"\n";
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularImposto() {
        int ano = Year.now().getValue();
        double imposto;
            if((ano - this.ano) >= 20){
                return 0.0;
            }

            if(this.getCombustivel().equalsIgnoreCase("gasolina") || this.getCombustivel().equalsIgnoreCase("diesel") || this.getCombustivel().equalsIgnoreCase("flex")) {
                imposto = (this.valor)*0.04;
                return imposto;
            } else {
                imposto = (this.valor)*0.03;
                return imposto;
            }


    }

    public String toString() {
        return marca+" - "+modelo+" - "+placa+" - "+combustivel+"\n"+ano+"\n"+valor+"\n";
    }


}