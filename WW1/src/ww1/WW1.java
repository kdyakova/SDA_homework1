/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ww1;

import java.util.Scanner;

/**
 *
 * @author Krisi
 */
public class WW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        IFrontBookkeeper book = new FrontBookkeeper61765();
        String[] arr = new String[20];
        String str="[1, 2, 3, 4, 5, 6, 7, 8, 9, 0,"
                + "11, 12, 13, 14, 15, 16, 17, 18, 19, 10,"
                + "21, 22, 23, 24, 25, 26, 27, 28, 29, 20,"
                + "31, 32, 33, 34, 35, 36, 37, 38, 39, 30,"
                + "41, 42, 43, 44, 45, 46, 47, 48, 49, 40,"
                + "51, 52, 53, 54, 55, 56, 57, 58, 59, 50]";
        
        arr[0] = "regiment_Stoykov = "+ str;
        arr[1] = "show regiment_Stoykov";
        arr[2] = "regiment_Chaushev = [13]";
        arr[3] = "show soldier 13";
        arr[4] = "division_Dimitroff = []";
        arr[5] = "regiment_Stoykov attached to division_Dimitroff";
        arr[6] = "regiment_Chaushev attached to division_Dimitroff";
        arr[7] = "show division_Dimitroff";
        arr[8] = "show soldier 13";
        arr[9] = "brigade_Ignatov = []";
        arr[10] = "regiment_Stoykov attached to brigade_Ignatov";
        arr[11] = "regiment_Chaushev attached to brigade_Ignatov after soldier 3";
        arr[12] = "show brigade_Ignatov";
        arr[13] = "show division_Dimitroff";
        arr[14] = "brigade_Ignatov attached to division_Dimitroff";
        arr[15] = "show division_Dimitroff";
        arr[16] = "soldiers 2..3 from division_Dimitroff died heroically";
        arr[17] = "show regiment_Stoykov";
        arr[18] = "show brigade_Ignatov";
        arr[19] = "show division_Dimitroff";

        for (int i = 0; i < 1000000; i++) {

            String update = book.updateFront(arr);
            System.out.print(update);
        }
    }

}
