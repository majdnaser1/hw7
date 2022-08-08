package payable;

public  abstract class Employee implements PayAble {
    String name;
    int id;

    public Employee(String name,int id){
        this.name=name;
        this.id=id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}'; }

}

