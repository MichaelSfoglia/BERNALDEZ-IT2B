package Bernaldez_IT2B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Functions inList = new Functions();
        
        int members, i;
        
        int[] id = new int[100], credit_score = new int[100];
        String[] name = new String[100], status = new String[100];
        double[] mm_income = new double[100], ex_loans = new double[100];
        
        System.out.printf("Enter number of applications: ");
        members = in.nextInt();
        
        for(i = 0; i < members; i++){
            System.out.printf("ID: ");
            id[i] = in.nextInt();
            
            System.out.printf("Name: ");
            name[i] = in.next();
            
            /* while(name[i] == null && name[i].isEmpty()){
                System.out.printf("Empty name, try again: ");
                name[i] = in.next();
            }                                                                      */
            
            System.out.printf("Monthly Income: ");
            mm_income[i] = in.nextDouble();
            
            System.out.printf("Credit Score: ");
            credit_score[i] = in.nextInt();
            
            System.out.printf("Existing Loans: ");
            ex_loans[i] = in.nextDouble();
            
            if(mm_income[i] >= 30000 && ex_loans[i] <= 500000){
                status[i] = "Approved";
            }
            else{
                status[i] = "Denied";
            }
            
            System.out.println(" ");
        }
        
        for(i = 0; i < members; i++){
            inList.generateList(id[i], name[i], mm_income[i], credit_score[i], ex_loans[i], status[i]);
        }
    }
}
