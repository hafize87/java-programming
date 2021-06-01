package day06_arithmetic_operator;

public class CarDriverInfo {
    public static void main(String[] args) {

        String carModel = "Nissan";
        String driverName = "Kemal";
        int licenseNum = 34567;
        byte speed = 45;
        boolean isAutomatic = true;
        boolean isSalvage = false;
        char licenseClass = 'A';

        System.out.println("Car model: " + carModel);
        System.out.println("Driver number: " + driverName);
        System.out.println("license number: " + licenseNum);
        System.out.println("Speed: " + speed);
        System.out.println("Automatic: " + isAutomatic);
        System.out.println("License class: " +licenseClass);
      // System.out.println(licenseClass + isAutomatic);  //  Operator '+' cannot be applied to 'char', 'boolean'
                                                            // char ile boolean ni beraber yazamassin aralarina " " (Bosluk) koyman gerekiyor
                                                            // koymassan sana error verir.
        System.out.println(licenseClass + "" + isAutomatic); // bu sekilde yapmak gerekiyor. Bosluk koymak gerekiyor.
        System.out.println(driverName+licenseNum);  // it can work
        System.out.println(isAutomatic + "" + isSalvage);


    }
}
