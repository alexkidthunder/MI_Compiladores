import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.MatchResult;
import java.io.IOException;
import java.io.Reader;

/*
 * Classe principal que vai reconhecer os arquivos de entrada na pasta input,
 * faz a Análise Léxica e cria um arquivo de saída com a mesma numeração na
 * pasta output
 */

public class main {
    public static void main(String[] args) {
        File arquivoInput;
        File[] caminhoArq;

        try {

            boolean enderecoEndsWith = new File(".").getCanonicalPath().endsWith("output");
            String caminhoRelativo = enderecoEndsWith ? "..\\" : "";

            arquivoInput = new File(caminhoRelativo + "input");
            System.out.println("Entrada do arquivo: " + arquivoInput.getAbsolutePath());

            File arquivoOutput = new File(caminhoRelativo + "output");
            System.out.println("Saida do arquivo: " + arquivoOutput.getAbsolutePath());

            if (arquivoOutput.exists()) {// Limpa a pasta output
                File[] listFiles = arquivoOutput.listFiles();
                for (File file : listFiles) {
                    file.delete();
                }
            }

            caminhoArq = arquivoInput.listFiles(); // Quantidade dos arquivos contidos na parta input
            // System.out.println(caminhoArq.length);

            if (caminhoArq == null) {
                System.out.println("    Arquivo de input não encontrado.    ");
                System.out.println("    Crie o diretório no local: " + arquivoInput.getAbsolutePath());
            }

        } catch (

        IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Não foi possível criar o diretório");
        }

    }
}