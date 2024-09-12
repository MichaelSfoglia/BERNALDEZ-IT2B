package Bernaldez_IT2B;

public class Functions {
    public void generateList(int ap_id, String ap_name, double ap_income, int ap_credit, double ap_loans, String ap_status){
        System.out.println("ID\tName\tMonthly Income\tCredit Score\tExisiting Loans\tLoan Status");
        // for clarity
        System.out.println(ap_id + "\t" + ap_name + "\t" + ap_income + "\t\t" + ap_credit + "\t\t" + ap_loans  + "\t" + ap_status);
    }
}
