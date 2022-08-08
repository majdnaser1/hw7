package payable;

public  abstract class main {
    Fulltime fullTimeEmployee1=new Fulltime(1,"Saleh",100);
    Fulltime fullTimeEmployee2=new Fulltime(2,"Ali",50);
    Parttime partTimeEmployee1=new Parttime(1,"Khalid",8,100);
    Parttime partTimeEmployee2=new Parttime(2,"Noura",5,3);
    company company1=new company("Tuwaiq");
        company.add(fullTimeEmployee1);
        company.add(fullTimeEmployee2);
        company.add(partTimeEmployee1);
        company.add(partTimeEmployee2);
        System.out.println(company);
        System.out.println(company.computeAmount());
}
