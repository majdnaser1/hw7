package payable;

public  abstract class Parttime extends Employee {
    int workhours;
    int wage;


    public Parttime(String name, int id, int workhours, int wage) {
        super(name, id);
        this.workhours = workhours;
        this.wage = wage;

    }
    public double comuteAmount(){

        return workhours*wage;
    }


}
