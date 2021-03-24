
public class Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("Ahmed",22);
        p.printInfo();
    }
    
}
class Person{
    public String name;
    public int age;
    public Person(String n,int a){
        name=n;
        age=a;
    }
    public void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
	}

}
