package javarevision;
public class Bank {
static int total=100;
public static void deposit(int deposit)

{
System.out.println("deposited "+deposit);
 total=total+deposit;
System.out.println("Balance after deposit "+total);
}
public static void withdrawn(int withdrawal)
{

 
if(total>=withdrawal)
{
System.out.println("Withdrawn  "+withdrawal);
total=total-withdrawal;
System.out.println("Balance after withdrawl "+total);
}
else
{
System.out.println("withdrawal failed");
}
}
public static void main(String[] args) {
deposit(100);
withdrawn(20);			
}
}
