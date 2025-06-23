public class Main {
    public static void main(String[] args) {

        Computer computer1 = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .build();

        Computer computer2 = new Computer.Builder()
                .setCPU("AMD Ryzen 5")
                .setRAM("8GB")
                .setStorage("1TB HDD")
                .build();

        System.out.println(computer1);
        System.out.println(computer2);
    }
}
