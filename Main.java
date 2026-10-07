public class Main {
     public static void main (String[]args) {

           Hospede hospede = new Hospede();

           hospede.nome = "kaléb";
           hospede.telefone = "99999-9999";
           hospede.cpf = "123.456.789-10";
           
           Quarto quarto = new Quarto();

           quarto.numero = 127;
           quarto.categoria = "luxo";
           quarto.disponibilidade = true;

           Reserva reserva = new Reserva();

           reserva.hospede = hospede;
           reserva.quarto = quarto;
           reserva.encerrado = true;
           
           

           System.out.println("nome:"+ hospede.getNome());
           System.out.println("telefone:"+ hospede.getTelefone());
           System.out.println("quarto:"+ reserva.getQuarto().numero);

    }
}
