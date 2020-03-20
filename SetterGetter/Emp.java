public class Emp {

    /* 
    / Mendeklarasikan attribut / property / variable dengan modifier Private
    / Tujuannya agar varible tidak bisa diakses secara langsung oleh class lain
    */
    private String EmployeeName;
    private int EmployeeSalary;
    private String EmployeePosition;

    /*
    / Membuat method void yang nantinya digunakan untuk mengisi variable private yang tadi dibuat
    / Method ini biasa disebut method setter, karena digunakan untuk mengeset nilai ke variable
    */
    public void setEmployeeName(String En){
        this.EmployeeName = En;
    }

    public void setEmployeeSalary(int Es){
        this.EmployeeSalary = Es;
    }

    public void setEmployeePosition(String Ep){
        this.EmployeePosition = Ep;
    }

    /*
    / Membuat method lagi yang mereturn nilai dari varible private yang dibuat
    / Method ini disebut method getter karena berguna untuk mengirimkan kembali nilai dari variable private
    */
    public String getEmployeeName(){
        return this.EmployeeName;
    }

    public int getEmployeeSalary(){
        return this.EmployeeSalary;
    }

    public String getEmployeePosition(){
        return this.EmployeePosition;
    }

    public int getSalaryPerYear(){
        return getEmployeeSalary() * 12;
    }
}