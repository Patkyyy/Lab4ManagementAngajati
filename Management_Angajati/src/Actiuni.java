public class Actiuni {
    private String asigurare_conditii_de_munca;
    private int ore_munca;
    private int id_sanatate;

    public Actiuni(String asigurare_conditii_de_munca,int ore_munca,int id_sanatate){
        this.asigurare_conditii_de_munca = asigurare_conditii_de_munca;
        this.ore_munca = ore_munca;
        this.id_sanatate = id_sanatate;
    }
    public Actiuni(){
        asigurare_conditii_de_munca = "Igiena";
        ore_munca = 8;
        id_sanatate = 321412;
    }
    public String getAsigurare_conditii_de_munca(){
        return asigurare_conditii_de_munca;
    }
    public void setAsigurare_conditii_de_munca(String asigurare_conditii_de_munca){
        this.asigurare_conditii_de_munca = asigurare_conditii_de_munca;
    }
    public int getOre_munca(){
        return ore_munca;
    }
    public void setOre_munca(int ore_munca){
        this.ore_munca = ore_munca;
    }
    public int getId_sanatate(){
        return id_sanatate;
    }
    public void setId_sanatate(int id_sanatate){
        this.id_sanatate = id_sanatate;
    }
    public String toString(){
        return "Asigurare: " + asigurare_conditii_de_munca + "\nOre de munca: " + ore_munca + "\nId_sanatate: " + id_sanatate;
    }
}
