public class Salarii {
    private int bonus;
    private int average;
    private int high;

    public Salarii(int bonus, int average, int high){
        this.bonus = bonus;
        this.average = average;
        this.high = high;
    }
    public Salarii(){
        bonus = 0;
        average = 3200;
        high = 0;
    }

    public void getBonus(int bonus,int ore,int average){
        if(ore > 160 && average <= 3200){
            this.average = this.average + this.bonus;
        }
    }
    public String toString(){
        return "Salariu: " + average + "\nBonus: " + bonus;
    }

}
