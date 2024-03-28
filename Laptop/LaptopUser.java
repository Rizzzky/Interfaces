public class LaptopUser {
    private Laptop laptop;

    public LaptopUser(Laptop laptop){
        this.laptop = laptop;
    }

    void turnOnLaptop(){
        this.laptop.powerOn();
    }

    void turnOffLaptop(){
        this.laptop.powerOFF();
    }

    void makeLaptopLouder(){
        this.laptop.volumeUp();
    }    

    void makeLaptopSilence(){
        this.laptop.volumeDown();
    }
}
