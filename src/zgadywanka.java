public class zgadywanka {
    public static void main(String[] args)
        throws java.io.IOException {
            char ch, ignore, answer = 'K';
            do {
                System.out.println("Wybierz literę od A do Z");

                ch = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

                if (ch == answer) System.out.println("**Dobrze**");
                else {
                    System.out.println("nie trafiłes");
                    if (ch < answer) System.out.println("zbyt nisko");
                    else System.out.println("za wysoko");
                    System.out.println("spróbuj jeszcze raz\n ");
                }
            } while ( answer != ch);
        }
    }
