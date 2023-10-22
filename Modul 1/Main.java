import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account m = new Account("M_SI4601", "102022380465", 123456);
        Account maul = new Account("Maul", "102023380465", 234567);
        Account maulaaa = new Account("Maulaaa", "102024380465", 345678);

        bank.addAccount(m);
        bank.addAccount(maul);
        bank.addAccount(maulaaa);

        System.out.println("");
        
        System.out.println("Saldo akun M: " + m.getBalance());
        System.out.println("Saldo akun Maul: " + maul.getBalance());
        System.out.println("Saldo akun Maulaaa: " + maulaaa.getBalance());
        System.out.println("");
   
        m.deposit(500000);
        maul.withdraw(100000);
        System.out.println("");
       
        System.out.println("Saldo akun M setelah menyetor: " + m.getBalance());
        System.out.println("Saldo akun Maul setelah menarik: " + maul.getBalance());
        System.out.println("");
 
        bank.removeAccount("1010102");
        System.out.println("Akun maul berhasil di hapus!");
        System.out.println("");

       
        ArrayList<Account> allAccounts = Bank.getAllAccounts();
        System.out.println("Daftar nama semua akun:");
        for (Account account : allAccounts) {
            System.out.println("Nama: " + account.getName() + ", Nomor Akun: " + account.getAccountNumber() + ", Saldo: " + account.getBalance());
        }
    }
}



