import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o CEP desejado ou digite \"sair\" para encerrar o programa: ");
            String pesquisa = leitor.nextLine();

            if (pesquisa.equalsIgnoreCase("sair")){
                break;
            }
            ConsultaCep meuCep = new ConsultaCep();
            try {
                Endereco novoEndereco = meuCep.buscaEndereco(pesquisa);
                System.out.println(novoEndereco);
                GeradorArquivo gerador = new GeradorArquivo();
                gerador.salvaJson(novoEndereco);
            } catch (RuntimeException | IOException e){
                System.out.println(e.getMessage());
                System.out.println("Finalizando aplicação");
            }




        }
    }
}