package A.Comparadores;

import java.util.Comparator;

public class ComparadorCompuesto<T> implements Comparator<T>{
    private Comparator <T> c1;
    private Comparator <T> c2;

    public ComparadorCompuesto(Comparator <T>c1,Comparator <T>c2){
        this.c1=c1;
        this.c2=c2;
    }

    @Override
    public int compare(T o1, T o2) {
        int res = c1.compare(o1,o2);
        if(res==0)
            res = c2.compare(o1,o2);
        return res;
    }    

}

