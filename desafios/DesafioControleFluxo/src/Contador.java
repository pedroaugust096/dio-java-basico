import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        terminal.nextLine();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();
        terminal.nextLine();

        //tentando chamar o método contendo a lógica de contagem com o try
        try{
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {

            //imprimindo mensagem para a exceção capturada
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }
    }
        
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        //validar se parametroUm é maior que parametroDois
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } 
        int contagem = parametroDois - parametroUm;

        //impressão dos números com base na variável contagem
        for(int cont = 1; cont <= contagem; cont++) {
            System.out.println("Imprimindo o número " + cont);
        }
    }
}
