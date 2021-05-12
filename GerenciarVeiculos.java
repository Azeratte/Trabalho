import java.util.ArrayList;


public class GerenciarVeiculos {

    private ArrayList<Veiculo> automotores = new ArrayList<>();

    public GerenciarVeiculos(){
        
    }

    public void adicionar(Veiculo a) {
        automotores.add(a);
    }

    public String listarVeiculos() {
        String retorno = "";
        for (int i = 0; i < automotores.size(); i++) {
            retorno += automotores.get(i).imprimir();
            
        }
        return retorno;

    }

    public boolean remover(String placa) {
        for (int i = 0; i < automotores.size(); i++) {
            if(automotores.get(i).getPlaca().equalsIgnoreCase(placa)){
                automotores.remove(i);
                return true;
            }
        }

        return false;
    }

    public Veiculo buscarPorPlaca(String placa) {
        for (int i = 0; i < automotores.size(); i++) {
            if(automotores.get(i).getPlaca().equalsIgnoreCase(placa)){
                Veiculo aux;
                aux = automotores.get(i);
                return aux;
            }
        }
        return null;
    }

    public double obterValorImposto(String placa) {
        for (int i = 0; i < automotores.size(); i++) {
            if(automotores.get(i).getPlaca().equalsIgnoreCase(placa)){
                Veiculo aux = automotores.get(i);
                double imposto;
                imposto = aux.calcularImposto();
                return imposto;
            }    
        }
        return -1;
    }

    public String lisarVeiculoPorCombustivel(String combustivel){
        
        String retorno = "";
        if(combustivel.equalsIgnoreCase("gasolina")){
        for (int i = 0; i < automotores.size(); i++) {
            if(combustivel.equalsIgnoreCase("gasolina")){
                retorno += automotores.get(i).imprimir();
            }

        }
        return retorno;
        
        }

        if(combustivel.equalsIgnoreCase("alcool")){
            for (int i = 0; i < automotores.size(); i++) {
                if(combustivel.equalsIgnoreCase("alcool")){
                    retorno += automotores.get(i).imprimir();
                }
            }
            return retorno;
    
        }

        if(combustivel.equalsIgnoreCase("flex")){
            for (int i = 0; i < automotores.size(); i++) {
                if(combustivel.equalsIgnoreCase("flex")){
                    retorno += automotores.get(i).imprimir();
                }
            }
            return retorno;
    
        }

        if(combustivel.equalsIgnoreCase("GNV")){
            for (int i = 0; i < automotores.size(); i++) {
                if(combustivel.equalsIgnoreCase("GNV")){
                    retorno += automotores.get(i).imprimir();
                }
            }
            return retorno;
    
        }

        if(combustivel.equalsIgnoreCase("diesel")){
            for (int i = 0; i < automotores.size(); i++) {
                if(combustivel.equalsIgnoreCase("diesel")){
                    retorno += automotores.get(i).imprimir();
                }
            }
            return retorno;
    
        } else {
            return null;
        }

        
    }


}
