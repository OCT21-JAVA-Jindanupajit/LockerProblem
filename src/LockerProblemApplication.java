public class LockerProblemApplication {

    public static final String RESET  = "\u001B[0m";
    public static final String WHITE  = "\u001B[96m";
    public static final String OPEN   = "\u001B[92m";
    public static final String CLOSED = "\u001B[91m";
    public static void main(String[] args) {

        boolean[] locker = new boolean[100];

        for (int n = 0; n < locker.length; n++) {
            locker[n] = false;
            if ((n % 10)==0)
                System.out.println();
            if (locker[n])
                System.out.printf("%s[ %s%03d%s ]%s",WHITE,OPEN,n+1,WHITE,RESET);
            else
                System.out.printf("%s[ %s%03d%s ]%s", WHITE,CLOSED,n+1,WHITE,RESET);



        }

        System.out.println();

        for (int n = 0; n < locker.length ; n++) {
            for (int i = n; i < locker.length ; i+=(n+1)) {
                locker[i] = !locker[i];
            }
        }

        for (int n = 0; n < locker.length; n++) {

            if ((n % 10)==0)
                System.out.println();
            if (locker[n])
                System.out.printf("%s[ %s%03d%s ]%s",WHITE,OPEN,n+1,WHITE,RESET);
            else
                System.out.printf("%s[ %s%03d%s ]%s", WHITE,CLOSED,n+1,WHITE,RESET);




        }
        System.out.println();
    }
}
