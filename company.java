package payable;

import java.util.ArrayList;

public abstract class company implements PayAble {
    String name;
    PayAble list;
        @Override
        public double comuteAmount() {
            super.getClass();
        }



    public company(String name) {
        this.name = name;
    }
    boolean add(PayAble P){

    }

    @Override
    public String toString() {
        return "company{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }


}
