package Java;

class UberX extends Car {

    String brand;
    String model;
     //Metodo contructor
    public UberX (String license, Account driver, String brand, String model){
      // super representa a la super clase
        super(license, driver);
        // this hace referencia a la clase hija
        this.brand = brand;
        this.model = model;
    }

    
}
