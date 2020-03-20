public class Puppy{

    public String name; 
    public int age;

    public Puppy(){
        this.name = "Tanpa parameter";
    }

    public Puppy(String name){ 
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        System.out.println("Puppy age is = " + age);
        return age;
    }

    public String displayName(){
        System.out.println("Puppy name = " + name);
        return name;
    }

}