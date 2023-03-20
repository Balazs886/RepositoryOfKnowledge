package Basic;

public class PrintF {
    public static void main(String[] args) {

        /*

        %c character
        %d decimal (integer) number (base 10)
        %e exponential floating-point number
        %f floating-point number
        %i integer (base 10)
        %o octal number (base 8)
        %s String
        %u unsigned decimal (integer) number
        %x number in hexadecimal (base 16)
        %t formats date/time
        %% print a percent sign
        \% print a percent sign

        \b backspace
        \f next line first character starts to the right of current line last character
        \n newline
        \r carriage return
        \t tab
        \\ backslash

         */

        int number = 42;
        System.out.println("meter/second\u00b2");
        System.out.printf("%4d\n", number);
    }
}
