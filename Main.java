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

           Reserva reserva = new Reserva(hospede, quarto);

           reserva.hospede = hospede;
           reserva.quarto = quarto;
           reserva.encerrado = true;
           
           
           System.out.println("-------Dados da Reserva-------");
           System.out.println("Hospede: " + reserva.getHospede().getNome());
           System.out.println("CPF: " + reserva.getHospede().getCpf());
           System.out.println("Quarto numero: " + reserva.getHospede().getCpf());
           System.out.println("Categoria: " + reserva.getQuarto().getCategoria());
           System.out.println("Status da reserva: " + reserva.getEncerrado());

    }
}
