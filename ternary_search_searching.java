    private double ternarySearch(){
        double precision=1e-9;
        double l=0;
        double r=1e9;
        while((r-l)>precision){
            double m1=l+((r-l)/3);
            double m2=r-((r-l)/3);
            double fm1=f(m1);
            double fm2=f(m2);
            if(fm1<fm2) l=m1;
            else r=m2;
        }
        return f(l);
    }
    private double f(double x){
        return -x*x;
    }
