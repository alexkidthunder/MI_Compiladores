package Model;

import java.util.Formatter;

public class token {
    public enum T {
        PalavResevervada, Identificador, INT, REAL, OperadorAritmetico, OperadorRelacional, OperadorLogico, Delimitador, Comentarios
    };

    public T tipo;
    public Object valor;
    public int linha;

    public token(T tipo, int posicaoLine) {
        this.tipo = tipo;
        this.linha = posicaoLine;
    }

    public token(T tipo, Object valor, int posicaoLine) {
        this.tipo = tipo;
        this.valor = valor;
        this.linha = posicaoLine;
    }

    @Override
    public String toString() {
        Formatter out = new Formatter();
        out.format("%d %s", linha, tipo);
        if (valor != null) {
            out.format(" %s", valor);
        }
        return out.toString();
    }

}
