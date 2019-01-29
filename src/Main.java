/*
 Çok biçimlilik; işlei kolaylaştırmaya yarar. Bir nesnenin birden fazla nesne gibi davranmasıdır. 
 */

/**
 *
 * @author Ibrahim Ali Metin
 */
class Araba{
    
    private String model;

    public Araba(String model) {
        this.model = model;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }
    public String sur(){
        return "Araba gidiyor...";
    }
}   

    class Dizel extends Araba{

    public Dizel(String model) {
        super(model);
    }

    @Override
    public String sur() {
        //return super.sur(); //To change body of generated methods, choose Tools | Templates.
       return this.getModel() + " Az yakıyor...";
    }
    
    }

class YarisArabasi extends Araba{

    public YarisArabasi(String model) {
        super(model);
    }

    @Override
    public String sur() {
       // return super.sur(); //To change body of generated methods, choose Tools | Templates.
          return this.getModel() + " Hızlanıyor...";
    }
    
}

class Suv extends Araba{

    public Suv(String model) {
        super(model);
    }

    /*@Override
    public String sur() {
        //return super.sur(); //To change body of generated methods, choose Tools | Templates.
          return this.getModel() + " Tırmanıyor....";
    }*/
    
    //NOT: Alt classlarda override edilmemişse method direk kendi class fonksiyonunu çağırır. 
    
    @Override
    public String sur() {
        //return super.sur(); //To change body of generated methods, choose Tools | Templates.
          return this.getModel() + " Tırmanıyor....";
    }
}

public class Main {
    
    public static void surdur(Araba araba) { // Herhangi bir tür dönüşümü yapılmadan tek fonksiyon kullamış olduk. 
        System.out.println(araba.sur());
    }
    
    public static void main(String[] args) {
      /*  
        //Araba araba = new Araba("Renault"); Herhangi bir araba tanımladığımızda!
        //System.out.println(araba.sur()); 
        
        Araba araba = new YarisArabasi("BMW"); // Bizim araba referansımız var biz buna yarış arabası referansı atadık sıkıntı çıkmadı. Çok biçimlilik budur.
        // Bunun için bir tane ana class olarak bizim burada Araba class 'ı gibi. Geri kalanlar alt class olacak. Alt class 'ların referansları üst class referanslarına eşitlenebilir. 
        Araba araba2 = new Suv("Nissan");
        System.out.println(araba2.sur());
        System.out.println(araba.sur());
        
        // Burada gördüğümüz gibi bir obje birden çok obje şeklinde kullanılabilir. Bunun için Inheritance şeklince olmalıdır yapı.
        
        Araba araba3 = new Dizel("Fiat");
        System.out.println(araba3.sur());
        
        */
        surdur(new Dizel ("Linea"));
        surdur(new Suv("Jeep"));
    }
    
}
