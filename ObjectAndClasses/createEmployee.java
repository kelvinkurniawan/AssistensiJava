/**
 *
 * @author Kelvin
 */
 
import java.io.*;
public class createEmployee {

   public static void main(String args[]) {
      /* Create two objects using constructor */
      Employee empOne = new Employee("James Smith"); // Membuat object dengan nama empOne dari class employee
      Employee empTwo = new Employee("Mary Anne"); // Membuat object dengan nama empTwo dari class employee

      // Invoking methods for each object created
      empOne.empAge(26); // memanggil method empAge dari object empOne
      empOne.empDesignation("Senior Software Engineer"); // memanggil method empDesignation dari object empOne
      empOne.empSalary(1000); // memanggil method empSalary dari object empOne
      empOne.printEmployee(); // memanggil method printEmployee dari object empOne

      empTwo.empAge(21); // memanggil method empAge dari object empTwo
      empTwo.empDesignation("Software Engineer"); // memanggil method empDesignation dari object empTwo
      empTwo.empSalary(500); // memanggil method empSalary dari object empTwo
      empTwo.printEmployee(); // memanggil method printEmployee dari object empTwo
   }
}
