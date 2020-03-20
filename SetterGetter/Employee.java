public class Employee{

    public static void main(String []args){
        Emp EmpOne = new Emp(); // Membuat objek dari class Emp;

        /*
        / Melakukan pengiriman nilai ke class Emp, dengan memanggil method setter dan mengirimkan nilainya melalui parameter
        */
        EmpOne.setEmployeeName("Kelvin Kurniawan");
        EmpOne.setEmployeeSalary(1000);
        EmpOne.setEmployeePosition("Manager");

        /*
        / Memanggil method getter dari class Emp
        / Nilai dari class Emp tadi disimpan dalam variable yang sesuai dengan tipe datanya
        */
        String name = EmpOne.getEmployeeName();
        int salary = EmpOne.getEmployeeSalary();
        int salaryYear = EmpOne.getSalaryPerYear();
        String position = EmpOne.getEmployeePosition();


        /*
        / Mencetak dan menampilkan data yang sudah dipanggil 
        */
        System.out.println("Employee Name \t\t= " + name);
        System.out.println("Employee Salary \t= " + salary);
        System.out.println("Employee Salary @ Year \t= " + salaryYear);
        System.out.println("Employee Position \t= " + position);
    }

}