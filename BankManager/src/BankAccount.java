class BankAccount {
    int account = 10;
    int balance = 10000;
}

class CheckingAccount extends BankAccount
{
    int expiry;
}

class SavingsAccount extends BankAccount
{
    int expiry;
}

class COD extends BankAccount
{
    int expiry;

    public static void main(String[] args)
    {
        BankAccount checking = new CheckingAccount();
        BankAccount savings = new SavingsAccount();
        BankAccount cod = new COD();
        System.out.println(cod.account);
        System.out.println(savings.balance);
        System.out.println(cod instanceof BankAccount);
    }
}


