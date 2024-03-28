import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih tipe laptop:");
        System.out.println("1. Lenovo");
        System.out.println("2. MacBook");
        System.out.println("3. Toshiba");
        System.out.print("Masukkan pilihan: ");
        int pilihanLaptop = scanner.nextInt();

        Laptop laptop;
        switch (pilihanLaptop) {
            case 1:
                laptop = new Lenovo();
                break;
            case 2:
                laptop = new MacBook();
                break;
            case 3:
                laptop = new Toshiba();
                break;
            default:
                System.out.println("Pilihan tidak valid. Menggunakan Lenovo secara default.");
                laptop = new Lenovo();
                break;
        }

        LaptopUser pengguna = new LaptopUser(laptop);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nMenu:");
            System.out.println("ON - Menyalakan laptop");
            System.out.println("OFF - Mematikan laptop");
            System.out.println("UP - Menambah volume");
            System.out.println("DOWN - Mengurangi volume");
            System.out.println("EXIT - Keluar dari program");
            System.out.print("Masukkan pilihan: ");
            String input = scanner.next().toUpperCase();

            switch (input) {
                case "ON":
                    pengguna.turnOnLaptop();
                    break;
                case "OFF":
                    pengguna.turnOffLaptop();
                    break;
                case "UP":
                    pengguna.makeLaptopLouder();
                    break;
                case "DOWN":
                    pengguna.makeLaptopSilence();
                    break;
                case "EXIT":
                    isRunning = false;
                    System.out.println("Terima kasih telah menggunakan program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
        scanner.close();
    }
}
