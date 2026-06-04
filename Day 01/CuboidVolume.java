// package Task1;

import java.util.Scanner;

public class CuboidVolume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        int volume=l*b*h;
        System.out.println("volume of the cuboid is: "+volume);
    }
}
