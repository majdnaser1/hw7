package payable;

public  abstract class Fulltime  extends Employee {

    int weeklysalary;

    public Fulltime(String name, int id, int weeklysalary) {
        super(name, id);
        this.weeklysalary=weeklysalary;
    }
     public double comuteAmount(){

        return 4*weeklysalary;
    }

}
