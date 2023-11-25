package banking_test;

import java.util.Scanner;

	public class Banking {
		public static void main(String[] args) {
			Bank bank = new Bank();
			Scanner input = new Scanner(System.in);
			
			while (true) {
				System.out.println("1. Check Balance");
				System.out.println("2. Deposit");
				System.out.println("3. Withdraw");
				System.out.println("4. Transfer");
				System.out.println("5. Exit");
				System.out.print("Enter your choice: ");
				int choice = input.nextInt();
				switch (choice) {
				
				case 1:
					System.out.print("Enter account number: ");
					String checkAcc = input.next();
					System.out.println("Balance: " +
					bank.checkbalance(checkAcc));
					break;
					
				case 2:
					System.out.print("Enter account number: ");
					String depositAcc = input.next();
					System.out.print("Enter deposit amount: ");
					double depositAmount = input.nextDouble();
					bank.deposit(depositAcc, depositAmount);
					break;
					
				case 3:
					System.out.print("Enter account number: ");
					String withdrawAcc = input.next();
					System.out.print("Enter withdrawal amount: ");
					double withdrawAmount = input.nextDouble();
					bank.withdraw(withdrawAcc, withdrawAmount);
					break;
					
				case 4:
					System.out.print("Enter sender account number: ");
					String fromAcc = input.next();
					System.out.print("Enter receiver account number: ");
					String toAcc = input.next();
					System.out.print("Enter transfer amount: ");
					double transferAmount = input.nextDouble();
					bank.transfer(fromAcc, toAcc, transferAmount);
					break;
					
				case 5:
					System.out.println("Exiting...");
					input.close();
					System.exit(0);
					break;
					
				default:
					System.out.println("Invalid choice. Please try again.");
				}
			}
		}
	}

