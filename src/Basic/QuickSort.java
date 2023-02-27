package Basic;

import java.util.Random;

public class QuickSort {
    public static void main(String args[]) {
        Random rnd = new Random();
//        int[] tomb = new int[10];

//        for (int i = 0; i < tomb.length; i++) {
//            tomb[i] = rnd.nextInt(50) + 1;
//            System.out.print(tomb[i] + " ");
//        }
        int[] tomb = {7, 27, 11, 32, 43, 26, 29, 9, 9, 13 };

        System.out.println();
        gyorsRendezes(tomb, 0, tomb.length - 1);

        tombKiiratasa(tomb);
    }

        static void gyorsRendezes(int[] tomb, int bal, int jobb) {
        if (bal < jobb) {
            int also = bal, felso = jobb + 1, valaszto = tomb[bal]; // also = 0, felso = 10, tomb[0]
            for (; ; ) {
                //while (++also < felso && tomb[also] < valaszto) ; // ha az alsó már nagyobb a felsőnél egyben a tomb[also] eleme már nagyobb a választóvonalnál, tovább lép
                also++;
                while (also < felso) {
                    if (tomb[also] > valaszto) {
                        System.out.printf("%2d > %2d -- > break\n", tomb[also], valaszto);
                        tombKiiratasa(tomb);
                        break;
                    }
                    System.out.printf("%2d > %2d\n", tomb[also], valaszto);
                    tombKiiratasa(tomb);
                    also++;
                }

                //while (tomb[--felso] > valaszto) ; // ha a tomb[--felso] kisebb mint a választóvonal, tovább lép
                felso--;
                while (tomb[felso] > valaszto) {
                    felso--;
                }

                if (also >= felso) { // ha az also >= felso, kilép a for ciklusból
                    break;
                }
                csere(tomb, also, felso); // ha az also < felso, cserélje ki a tömb felso és bal elemét egymással
            }
            csere(tomb, bal, felso);
            gyorsRendezes(tomb, bal, felso - 1);
            gyorsRendezes(tomb, felso + 1, jobb);
        }
    }


    static void csere(int[] tomb, int i, int j) {
        int seged = tomb[i];
        tomb[i] = tomb[j];
        tomb[j] = seged;
    }

    private static void tombKiiratasa(int[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i] + " ");
        }
        System.out.println();
        System.out.println();
    }


}