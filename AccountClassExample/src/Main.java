import java.util.Scanner;
    public class Main
    {
        public static void main(String[] args){
            Account account1=new Account("Sumeyye Arslan", 50.00);
            Account account2=new Account("Furkan Arslan",40.45);

            System.out.printf("%s balance:%f\n",
                    account1.getName(),account1.getBalance());
            System.out.printf("%s,balance:%f\n",
                    account2.getName(),account2.getBalance());

            Scanner input=new Scanner(System.in);
            System.out.print("enter the account1 deposit:");
            double depositAmount=input.nextDouble();
            account1.deposit(depositAmount);
            System.out.printf("%s balance: %f\n",
                    account1.getName(),account1.getBalance());

            System.out.print("enter the account2 deposit:\n");
            depositAmount= input.nextDouble();
            account2.deposit(depositAmount);

            System.out.printf("%s balance: %f",
                    account2.getName(),account2.getBalance());
        }

    }