public class Reserva {
    Hospede hospede;
    Quarto quarto;
    Boolean encerrado;

    public Hospede getHospede() {
        return hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public boolean getEncerrado() {
        return encerrado;
    }


    public Reserva(Hospede hospede, Quarto quarto) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.encerrado = false;
    }
}