package main;

public class Haromszog {
    int a, b, c;
    public Haromszog(int a, int b, int c){
        if(a <= 0 || b <=0 || c <= 0){
            System.out.println("Nem lehet 0 vagy negatív számmal dolgozni");
        }else{
            this.a = a;
            this.b = b; 
            this.c = c;
        }
    }
    
    public double kerulet(){
       double kerulet = 0;
       boolean szerkeztheto = this.szerkeztheto();
       if(szerkeztheto){
           kerulet = a+b+c;
       }
       return kerulet;
    }
    public boolean szerkeztheto (){
        if(a + b > c && a + c > b && b + c > a){
            return true;
        }else{
            return false;
        }
    }
    public void oldalakAdatai(){
        double kerulet = this.kerulet();
        if(szerkeztheto()){
            System.out.println("A " +a+ " " +b+ " " +c+ " " + "oldalú háromszög kerülete " + kerulet);
        }else{
            System.out.println("Nem szerkezthető a háromszög");
        }
        
    }
}
