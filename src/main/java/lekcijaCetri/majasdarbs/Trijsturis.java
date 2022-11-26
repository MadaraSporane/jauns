package lekcijaCetri.majasdarbs;

public class Trijsturis {
    int vienaMala;
    int otraMala;
    int tresaMala;
    double laukums;
    public Trijsturis(){
       System.out.println("Veidojam trijstūri");
       vienaMala= 5;
       otraMala=6;
       tresaMala=7;
    }
 public double heronaLaukums(){
        return (vienaMala+otraMala+tresaMala/2);
 }
public void trijsturaLaukumaFormula()
{
    System.out.println("Laukuma pēc herona formulas ir:"+heronaLaukums());
}
public boolean vaiIrVienadmalu() {
    return  (vienaMala == otraMala && otraMala == tresaMala) ;

}
public boolean vaiIrVienadsanu(){
        return  (vienaMala==otraMala);


}





}















