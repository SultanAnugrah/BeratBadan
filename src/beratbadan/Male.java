package beratbadan;

public class Male implements BeratBadan {
    double berat;
    double tinggi;
    
    public double BeratIdeal (double berat, double tinggi) {
        double meter;
        double bmi;
        double broca;
        meter = tinggi/100;
        bmi = (berat/(meter*meter));
        
        if (bmi<18.5){
            System.out.println("(cungkring)");
        }else if (bmi<=22.9){
            System.out.println("(biasa aja)");
        }else if (bmi<24.9){
            System.out.println("(gendut)"); 
        }else {
            System.out.println("(Obesitas)"); 
        }
        
        broca = (tinggi-100)-(0.10*(tinggi-100));
        
        return broca;
    }
    
    public Male (double initb, double initt){
        berat = initb;
        tinggi = initt;
    }
    
    public void ideal () {
        System.out.println();
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
