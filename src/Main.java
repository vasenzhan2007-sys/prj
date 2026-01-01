import java.util.ArrayList;
import java.util.Scanner;

        public class Main{
            private static ArrayList<Member> members = new ArrayList<>();
            private static ArrayList<Trainer> trainers = new ArrayList<>();
            private static ArrayList<Membership> memberships = new ArrayList<>();
            private static Scanner scanner = new Scanner(System.in);

            public static void main(String[] args){
                System.out.println("===Gym Management System===");
                System.out.println( );

                members.add(new Member("Dias", 26, 70, 187));
                members.add(new Member("Merey", 19, 50, 165));
                trainers.add(new Trainer("Azamat", 25, "Male", 2));
                trainers.add(new Trainer("Aizada", 32, "Female", 6));
                memberships.add(new Membership(01, "Basic", 15000.00, 3));
                memberships.add(new Membership(02, "Premium", 25000.00, 8));

                boolean run = true;
                while (run){
                    displayMenu();
                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice){
                        case 1:
                            addMember();
                            break;
                        case 2:
                            viewMembers();
                            break;
                        case 3:
                            addTrainer();
                            break;
                        case 4:
                            viewTrainers();
                            break;
                        case 5:
                            addMembership();
                            break;
                        case 6:
                            viewMemberships();
                            break;
                        case 0:
                            System.out.println("Goodbye!");
                            run = false;
                            break;
                        default:
                            System.out.println("Invalid number");
                    }
                    if (run){
                        System.out.println("Press Enter to continue...");
                        scanner.nextLine();
                    }
                }
                scanner.close();
            }
            private static void displayMenu() {
                System.out.println("==============================");
                System.out.println("     GYM MANAGEMENT SYSTEM");
                System.out.println("==============================");
                System.out.println("1. Add member");
                System.out.println("2. View all members");
                System.out.println("3. Add trainer");
                System.out.println("4. View all trainers");
                System.out.println("5. Add membership");
                System.out.println("6. View all memberships");
                System.out.println("0. Exit");
                System.out.println("==============================");
                System.out.println("Enter your choice");
            }
            private static void addMember(){
                System.out.println("-----ADD MEMBER-----");
                System.out.println("Enter member name");
                String name = scanner.nextLine();

                System.out.println("Enter member age");
                int age = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter member weight");
                int weight = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter member height");
                int height = scanner.nextInt();
                scanner.nextLine();

                members.add(new Member(name, age, weight, height));
                System.out.println("Member added");
            }
            private static void viewMembers(){
                System.out.println("============================");
                System.out.println("     VIEW ALL MEMBERS");
                System.out.println("============================");

                if (members.isEmpty()){
                    System.out.println("No members found");
                    return;
                }
                for (Member m : members){
                    System.out.println(m);
                }
            }
            private static void addTrainer(){
                System.out.println("-----ADD TRAINER-----");
                System.out.println("Enter trainer name");
                String name = scanner.nextLine();

                System.out.println("Enter trainer age");
                int age = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter trainer gender");
                String gender = scanner.nextLine();

                System.out.println("Enter trainer experience year");
                int experienceYear = scanner.nextInt();
                scanner.nextLine();

                trainers.add(new Trainer(name, age, gender, experienceYear));
                System.out.println("Trainer added");
            }
            private static void viewTrainers(){
                System.out.println("=========================");
                System.out.println("    VIEW ALL TRAINERS");
                System.out.println("=========================");

                if (trainers.isEmpty()){
                    System.out.println("No trainers found");
                    return;
                }
                for (Trainer t : trainers){
                    System.out.println(t);
                }
            }
            private static void addMembership(){
                System.out.println("-----ADD MEMBERSHIP-----");
                System.out.println("Enter membership Id");
                int membershipId = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter membership type");
                String type = scanner.nextLine();

                System.out.println("Enter membership price");
                double price = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Enter membership duration months");
                int durationMonths = scanner.nextInt();
                scanner.nextLine();

                memberships.add(new Membership(membershipId, type, price, durationMonths));
                System.out.println("Membership added");
            }
            private static void viewMemberships(){
                System.out.println("===============================");
                System.out.println("    VIEW ALL MEMBERSHIPS");
                System.out.println("===============================");

                if (memberships.isEmpty()){
                    System.out.println("No memberships found");
                    return;
                }
                for (Membership s : memberships){
                    System.out.println(s);
                }
            }
        }