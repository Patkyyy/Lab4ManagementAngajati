public class Recrutare {
    private String nume;
    private String prenume;
    private int varsta;
    private String abilitati_profesii;
    private String departament;

    public Recrutare(String nume,String prenume,int varsta, String abilitati_profesii, String departament){
        this.nume = nume;
        this.prenume = prenume;
        this.abilitati_profesii = abilitati_profesii;
        this.varsta = varsta;
        this.departament = departament;
    }
    public Recrutare(){
        nume = "Patcas";
        prenume = "Rares";
        varsta = 20;
        abilitati_profesii = "Engineer";
        departament = "IT";
    }

    public String getNume(){
        return nume;
    }
    public void setNume(String nume){
        this.nume = nume;
    }
    public String getPrenume(){
        return prenume;
    }
    public void setPrenume(String prenume){
        this.prenume = prenume;
    }
    public int getVarsta(){
        return varsta;
    }
    public void setVarsta(int varsta){
        this.varsta = varsta;
    }
    public String getAbilitati_profesii(){
        return abilitati_profesii;
    }
    public void setAbilitati_profesii(String abilitati_profesii){
        this.abilitati_profesii = abilitati_profesii;
    }
    public String getDepartament(){
        return departament;
    }
    public void setDepartament(String departament){
        this.departament = departament;
    }
    public String toString(){
        return "Nume: " + nume + "\nPrenume: " + prenume + "\nVarsta: " + varsta +
                "\nAbilitati_profesii: " + abilitati_profesii + "\nDepartament: " + departament;
    }
}
