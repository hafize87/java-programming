package day56_abstraction.transportation;

public interface SelfDrivable {

    void autoPiloting();

      // void selfPark(); this ERROR for sub classes, because they must override abstract method cunku sub class olusturduk hersy oldu sonra bu
                          //   methodu ekledigimiz icin bize ERROR verdi. duzeltmemiz icin diger sub class larinada gisip implementation yapmamiz gerekiyor



    public default void selfPark(){

        System.out.println("performing self park steps");
    }



}
