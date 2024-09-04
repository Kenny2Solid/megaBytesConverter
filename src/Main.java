public class Main {

    public static void main(String[] args) {
        printMegaAndKiloBytes(2500);
        printMegaAndKiloBytes(-1024);
        printMegaAndKiloBytes(5000);
    }
    public static void printMegaAndKiloBytes(int kilobytes) {
        if (kilobytes >= 0) {
            int mega = kilobytes / 1024;
            int kb = kilobytes % 1024;
            System.out.println(kilobytes + " KB = " + mega + " MB and " + kb + " KB");
            String result = String.format("%s KB = %s MB and %s KB", kilobytes, mega, kb);
            System.out.println(result);
        } else {
            System.out.println("Invalid Value");

        }

    }


    }
