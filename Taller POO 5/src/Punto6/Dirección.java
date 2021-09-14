
package Punto6;


public class Dirección {
    
    private String barriodomi;
    private String nomenclaturadomi;
    private String barriotra;
    private String nomenclaturatra;

    public Dirección() { 
        this.barriodomi="Kennedy";
        this.nomenclaturadomi="Cra 5 A # 19 A 55";
        this.barriotra="San Carlos";
        this.nomenclaturatra="Cra 13 # 7D";
    }
    
    public Dirección(String barriodomi){
        
        this.barriodomi=barriodomi;
        this.nomenclaturadomi="Cra 6 B # 23 B 32";
        this.barriotra="El Cerrito";
        this.nomenclaturatra="Diag 23 A Bis # 24-66";
    }
    
    public Dirección(String barriodomi, String barriotra){
        
        this.barriodomi=barriodomi;
        this.nomenclaturadomi="Mz 9 Casa 10";
        this.barriotra=barriotra;
        this.nomenclaturatra="Cra 4 # 17-25";
    }

    public String getBarriodomi() {
        return barriodomi;
    }

    public void setBarriodomi(String barriodomi) {
        this.barriodomi = barriodomi;
    }

    public String getNomenclaturadomi() {
        return nomenclaturadomi;
    }

    public void setNomenclaturadomi(String nomenclaturadomi) {
        this.nomenclaturadomi = nomenclaturadomi;
    }


    public String getBarriotra() {
        return barriotra;
    }

    public void setBarriotra(String barriotra) {
        this.barriotra = barriotra;
    }

    public String getNomenclaturatra() {
        return nomenclaturatra;
    }

    public void setNomenclaturatra(String nomenclaturatra) {
        this.nomenclaturatra = nomenclaturatra;
    }
    
    
}
