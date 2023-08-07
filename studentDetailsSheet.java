import java.util.Scanner;

public class studentDetailsSheet{
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String RED = "\033[31;1m";
        String RESET = "\033[0;0m";
        String BOLD = "\033[0;1m";
        String GREEN = "\033[32;1m";
        String BLUE = "\033[34;1m";

        int age=0;
        String subject1="";
        double marks1=0;
        String subject2="";
        double marks2=0;
        String subject3="";
        double marks3=0;
        int count = 0;


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        count++;
        if(name.strip().length()==0){
            System.out.println("Invalid name...");

        }else{
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
            count++;
            if(age>9 && age<19){
                System.out.print("Enter your subject 1: ");
                scanner.nextLine();
                subject1 = scanner.nextLine();
                count++;
                if(subject1.startsWith("SE-")){
                    System.out.print("Enter your marks 1: ");
                    marks1 = scanner.nextDouble();
                    count++;
                    if(marks1>0 && marks1<100){
                        System.out.print("Enter your subject 2: ");
                        scanner.nextLine();
                        count++;
                        subject2 = scanner.nextLine();
                        if(subject2.startsWith("SE-") && subject2 != subject1){
                            System.out.print("Enter your marks 2: ");
                            marks2 = scanner.nextDouble();
                            count++;
                            if(marks2>0 && marks2<100){
                                System.out.print("Enter your subject 3: ");
                                scanner.nextLine();
                                subject3 = scanner.nextLine();
                                count++;
                                if(subject3.startsWith("SE-") && subject3 != subject2 && subject3 != subject1){
                                    System.out.print("Enter your marks 3: ");
                                    marks3 = scanner.nextDouble();
                                    count++;
                                    if(!(marks3>0 && marks3<100)){
                                        System.out.println("Invalid marks...");               
                                    }
                                }else{
                                    System.out.printf("%s%s%s",RED,"Invalid subject...\n",RESET);                
                                }

                            }else{
                                System.out.printf("%s%s%s",RED,"Invalid marks...\n",RESET);                
                            }
                
                        }else{
                            System.out.printf("%s%s%s",RED,"Invalid subject...\n",RESET);                
                        }


                    }else{
                        System.out.printf("%s%s%s",RED,"Invalid marks...\n",RESET);                
                    }
                
                }else{
                    System.out.printf("%s%s%s",RED,"Invalid subject...\n",RESET);                
                }
            }else{
                System.out.printf("%s%s%s",RED,"Invalid age...\n",RESET);                
            }
        }
        if(count == 8){
            System.out.println();
            String tableLine = "-".repeat(30);
            System.out.printf("+%s+\n",tableLine);
            //System.out.printf("|%30s|\n","");
            System.out.printf("| %-6s : %s%-20s%s|\n","Name",BLUE,name.toUpperCase(),RESET);
            System.out.printf("| %-6s : %-20d|\n","Age",age);
            double total = marks1 + marks2 + marks3;
            double avg = total/3;
            String status = (avg >=75) ? "Credit Pass" : (avg >= 55) ? "Pass" : "Fail";
            System.out.printf("| %-6s : %s%-20s%s|\n","Status",(status=="Credit Pass" ? GREEN : status=="Pass" ? BLUE : RED),status,RESET);
            System.out.printf("| %-6s : %-6.2f %s : %.2f%-2s|\n","Total",total,"Avg",avg,"%");
            System.out.printf("+%s+\n",tableLine);
            System.out.printf("|%-8s| %-5s | %-11s |\n","Subject","Marks","Status");
            System.out.printf("+%s+\n",tableLine);
            System.out.printf("| SE-%03d | %-5.2f | %s%-12s%s|\n",Integer.valueOf(subject1.substring(3,subject1.length())),marks1,(marks1>=75 ? GREEN : marks1>=55 ? BLUE : RED),(marks1>=75 ? "Credit Pass" : marks1>=55 ? "Pass" : "Fail"),RESET);
            System.out.printf("| SE-%03d | %-5.2f | %s%-12s%s|\n",Integer.valueOf(subject2.substring(3,subject2.length())),marks2,(marks2>=75 ? GREEN : marks2>=55 ? BLUE : RED),(marks2>=75 ? "Credit Pass" : marks2>=55 ? "Pass" : "Fail"),RESET);
            System.out.printf("| SE-%03d | %-5.2f | %s%-12s%s|\n",Integer.valueOf(subject3.substring(3,subject3.length())),marks3,(marks3>=75 ? GREEN : marks3>=55 ? BLUE : RED),(marks3>=75 ? "Credit Pass" : marks3>=55 ? "Pass" : "Fail"),RESET);
            System.out.printf("+%s+\n",tableLine);
        }

    }
}

