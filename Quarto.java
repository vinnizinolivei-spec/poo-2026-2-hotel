public class Quarto {
    int numero;
    String categoria;
    Boolean disponibilidade;

    public int getNumero() {
        return numero;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean disponibilidade() {
        return disponibilidade;
    }

    public Quarto() {
    }

    public Quarto(int numero, String categoria, boolean disponibilidade) {
        this.numero = numero;
        this.categoria = categoria;
        this.disponibilidade = disponibilidade;
    }
}