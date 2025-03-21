public class Conta {
    private String numero;
    private String titular;
    private double saldo;

    public void setNumero(String numero) throws ExcecaoDadoInvalido {
        if (numero == null || numero.isEmpty()) {
            throw new ExcecaoDadoInvalido("Número da conta inválido.");
        }
        this.numero = numero;
    }

    public void setTitular(String titular) throws ExcecaoDadoInvalido {
        if (titular == null || titular.isEmpty()) {
            throw new ExcecaoDadoInvalido("Nome do titular inválido.");
        }
        this.titular = titular;
    }

    public void setSaldo(double saldo) throws ExcecaoDadoInvalido {
        if (saldo < 0) {
            throw new ExcecaoDadoInvalido("Saldo não pode ser negativo.");
        }
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}