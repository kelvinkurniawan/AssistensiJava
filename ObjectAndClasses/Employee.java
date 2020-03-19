/**
 *
 * @author Kelvin
 */
import java.io.*;
public class Employee {

   // Membuat property / Attribut / Variable
   String name;
   int age;
   String designation;
   double salary;

   // Merupakan constructor dari class Employee
   public Employee(String name) {
      this.name = name;
   }

   // Mengisi variable age dengan nilai yang ada di empAge
   public void empAge(int empAge) {
      age = empAge;
   }

   // Mengisi variable designation dengan nilai yang ada di empDesig
   public void empDesignation(String empDesig) {
      designation = empDesig;
   }

   // Mengisi variable salary dengan nilai yang ada di empSalary
   public void empSalary(double empSalary) {
      salary = empSalary;
   }

   // Mencetak semua variable
   public void printEmployee() {
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Designation:" + designation );
      System.out.println("Salary:" + salary);
   }
}
