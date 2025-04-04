import java.util.Scanner;

class ATM_JAVA {
    public static void main(String[] args) {
        String card, work;
        final int PINN = 12345;
        int pin = 0;
        double amount = 0;
        double money = 100000.75;
        Scanner obj = new Scanner(System.in);

        System.out.println("Please enter ATM card (type 'yes' to proceed):");
        card = obj.nextLine();

        if (!card.equals("yes")) {
            System.out.println("Invalid card. Exiting.");
            return;
        }

        System.out.println("Enter ATM pin please:");
        pin = obj.nextInt();

        if (pin != PINN) {
            System.out.println("Invalid PIN. Exiting.");
            return;
        }

        System.out.println("Please select 'withdraw' or 'deposit':");
        obj.nextLine(); 
        work = obj.nextLine();

        System.out.println("Enter the amount:");
        amount = obj.nextDouble();

        switch (work.toLowerCase()) {
            case "withdraw":
                if (amount > money) {
                    System.out.println("Insufficient funds for withdrawal.");
                } else {
                    money -= amount;
                    System.out.println("Withdrawal amount = " + amount);
                    System.out.println("After withdrawal, remaining amount = " + money);
                }
                break;
            case "deposit":
                if (amount < 0) {
                    System.out.println("Cannot deposit a negative amount.");
                } else {
                    money += amount;
                    System.out.println("Deposited amount = " + amount);
                    System.out.println("After depositing, total amount = " + money);
                }
                break;
            default:
                System.out.println("Invalid operation. Thank you for visiting.");
        }
    }
}