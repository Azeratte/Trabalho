import java.util.Scanner;

public class AppVeiculo {
    public static void main(String[] args) {
        
        GerenciarVeiculos Gerencia = new GerenciarVeiculos();

        System.out.println("+---------------------------+");
        System.out.println("| MENU - Gerenciar Veiculos |");
        System.out.println("+---------------------------+");

        String menu = "0";
 

        Scanner entrada = new Scanner(System.in);
        

        while(Integer.parseInt(menu) == 0){
            System.out.println("");
            String modelo = "", marca = "", placa = "", combustivel = "", Va = "", An = "";
            double valor = 0.0;
            int ano = 0;
            System.out.println("1 - Adicionar veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("3 - Remover veículo");
            System.out.println("4 - Buscar por placa");
            System.out.println("5 - Obter valor do imposto");
            System.out.println("6 - Listar veículos por combustível\n");
            System.out.println("Digite a opção desejada conforme acima\n");

        menu = entrada.nextLine();

        switch(Integer.parseInt(menu)) {
            case 1:
                System.out.println("Digite o modelo do veículo");
                modelo = entrada.nextLine();
                System.out.println("Digite a marca do veículo");
                marca = entrada.nextLine();
                System.out.println("Digite a placa veículo");
                placa = entrada.nextLine();
                System.out.println("Digite o tipo de combustível (alcool, gasolina, flex, GNV, diesel)");
                combustivel = entrada.nextLine();
                System.out.println("Digite o valor do veículo");
                Va = entrada.nextLine();
                valor = Integer.parseInt(Va);
                System.out.println("Digite o ano de fabricação do veículo");
                An = entrada.nextLine();
                ano = Integer.parseInt(An);
                Veiculo V = new Veiculo(modelo, marca, placa, combustivel, valor, ano);
                Gerencia.adicionar(V);
                menu = "0";
            break;

            case 2:
                System.out.println(Gerencia.listarVeiculos());
                menu = "0";
            break;

            case 3:
                System.out.println("Digite a placa do veículo que deve ser removido:");
                placa = entrada.nextLine();
                Gerencia.remover(placa);
                menu = "0";
            break;

            case 4:
                System.out.println("Digite a placa para buscar o veículo:");
                placa = entrada.nextLine();
                Veiculo aux = Gerencia.buscarPorPlaca(placa);
                System.out.println(aux);
                menu = "0";
            break;

            case 5:
                System.out.println("Digite a placa para obter o valor do imposto:");
                placa = entrada.nextLine();
                System.out.println(Gerencia.obterValorImposto(placa));
                menu = "0";
            break;

            case 6:
                System.out.println("Digite o tipo de combustível (alcool, gasolina, flex, GNV, diesel):");
                combustivel = entrada.nextLine();
                System.out.println(Gerencia.lisarVeiculoPorCombustivel(combustivel)); 
                menu = "0";
            break;

            default:
                System.out.println("Opção inválida");
                


        }

    }
        

    }
}
