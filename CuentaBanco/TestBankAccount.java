public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount cuenta1 = new BankAccount();
        BankAccount cuenta2 = new BankAccount();
        BankAccount cuenta3 = new BankAccount();

        cuenta1.depositarAhorro(30);
        cuenta1.verSaldo();
        cuenta2.retirarCorriente(5);
        cuenta2.verSaldo();
        cuenta3.depositarCorriente(60);
        cuenta3.verSaldo();
    }
}
