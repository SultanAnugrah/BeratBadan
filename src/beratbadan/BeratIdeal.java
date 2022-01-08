package beratbadan;

public class BeratIdeal {

    public double CalculateBerat (BeratBadan ideal) {
        double meter;
        double bmi;
        double broca = 0;
        
        if(ideal instanceof Male){
            Male male = (Male) ideal;
            meter = male.getTinggi()/100;
            bmi = (male.getBerat()/(meter*meter));
            System.out.print("BMI: "+bmi+" ");

            if (bmi<18.5){
                System.out.println("(Kurus)");
            }else if (bmi<=22.9){
                System.out.println("(Normal)");
            }else if (bmi<24.9){
                System.out.println("(Overweight)"); 
            }else {
                System.out.println("(Obesitas)"); 
            }
            broca = (male.getTinggi()-100)-(0.10*(male.getTinggi()-100));
            
        }else if(ideal instanceof Female){
            Female female = (Female) ideal;
            meter = female.getTinggi()/100;
            bmi = (female.getBerat()/(meter*meter));
            System.out.print("BMI: "+bmi+" ");

            if (bmi<18.5){
                System.out.println("(Kurus)");
            }else if (bmi<=22.9){
                System.out.println("(Normal)");
            }else if (bmi<24.9){
                System.out.println("(Overweight)"); 
            }else {
                System.out.println("(Obesitas)"); 
            }
            broca = (female.getTinggi()-100)-(0.15*(female.getTinggi()-100));
        }
            return broca;
    }
    
    public static String nama(){
        String nama = "Angkasa";
            
        System.out.println("Silahkan masukkan nama anda :" + nama);
        
        return nama;
    }
    
    public static Integer umur(){
        int umur = 20;

        System.out.println("Silahkan masukkan umur anda :" + umur);
        
        if (umur < 18){
             System.out.println("Diumur anda saat ini belum bisa melakukan BMI, karena masih masa pertumbuhan");
        } else {
        }
        return umur;
    }
    
    
    public static String rumusByJenisKelamin(){
        String jawabanJenisKelamin = "P";
           
        System.out.println("Silahkan masukkan jenis kelamin Anda (P/L) :" + jawabanJenisKelamin);
        
        //If else untuk memilih rumus berdasarkan jenis kelamin
            BeratIdeal idealObj = new BeratIdeal();
            if(jawabanJenisKelamin.equals("L")){
                System.out.println("Hasil Perhitungan");   
                
                 Male male = new Male(80,180);
                 System.out.println("Berat badan ideal anda (menurut rumus Broca): "+idealObj.CalculateBerat(male)+" Kg");
            
            }else{         
                System.out.println("Hasil Perhitungan");
                Female female = new Female(50,180);
                System.out.println("Berat badan ideal anda (menurut rumus Broca): "+idealObj.CalculateBerat(female)+" Kg");   
            }
        
            return jawabanJenisKelamin;
    }
    
    
    public static void main(String[] args) {
        System.out.println("Program Menghitung berat badan ideal");
        System.out.println("-------------------------------------------");
        System.out.println("Identitas");
        
        nama();
        umur();
        rumusByJenisKelamin();
    }
}
