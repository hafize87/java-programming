package mypractice;



public class Home {


    int channel=1;
    int volumeLevel=0;
    boolean on = false;
    String brand = "undefined";

    public Home(){

        System.out.println("Creating TV object using no args-constructor");
    }

    public Home(String brand){
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {

        if(channel <= 0 && channel >=120 & isOn()== false){

            System.out.println("ERROR: TV is either OFF or invalid Channel.");
        }
        else{
            this.channel = channel;
        }

    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {

        if(volumeLevel >= 0 && volumeLevel <= 7 && isOn() == true ){

            this.volumeLevel = volumeLevel;
        }
        else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp() {

        while (channel == 1){
            channel++;
        }
    }

    public void channelDown() {

        while (channel == 1){
            channel--;
        }
    }

    public void volumeUp(){

        while (volumeLevel == 1){
            volumeLevel++;
        }
    }

    public void volumeDown(){

        while (volumeLevel == 1){
            volumeLevel--;
        }
    }

    public boolean isOn(){
        return this.on;

    }

    public void turnOn(){

        if(on){
            System.out.println("TV is already ON");
        }
        else {
           this.on = false;
        }


    }

    public void turnOff(){

        if(on == false){
            System.out.println("TV is already OFF");
        }
        else{
            this.on = true;
        }


    }




}
