package mypractice;

public class AnimalSpecies {

    String name;
    int population;
    int growthRate;

    public void setInfo(String na, int po, int gr){

    }
    public String getName(){
        return name;
    }
    public int getpopulation(){
        return population;
    }
    public int getGrowthRate(){
        return growthRate;
    }
}
class Earth{
    public static void main(String[] args) {

        AnimalSpecies animal = new AnimalSpecies();

        animal.setInfo("cat", 30, 45);

    }

}