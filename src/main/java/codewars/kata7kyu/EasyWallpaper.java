package codewars.kata7kyu;

//Description:
//        John wants to decorate the walls of a room with wallpaper.
//        He wants a fool-proof method for getting it right.
//
//        John knows that the rectangular room has a length of l meters,
//        a width of w meters, a height of h meters.
//        The standard width of the rolls he wants to buy is 52 centimeters.
//        The length of a roll is 10 meters. He bears in mind however,
//        that it’s best to have an extra length of wallpaper handy
//        in case of mistakes or miscalculations so he wants
//        to buy a length 15% greater than the one he needs.
//
//        Last time he did these calculations he got a headache,
//        so could you help John?


public class EasyWallpaper {

    private static String[] nbs = {"zero","one","two","three","four","five",
            "six","seven","eight","nine","ten","eleven","twelve",
            "thirteen","fourteen","fifteen","sixteen","seventeen",
            "eighteen","nineteen","twenty"};

    public static void main(String[] args) {
        double l = 0;
        double w = 0;
        double h = 0;


        if (l*w*h==0)
            System.out.println(nbs[0]);

        double roomM2 = 2 * (l * h) + 2 * (w * h);
        double rollM2 = 10 * .52;
        int r = (int) ((roomM2 / rollM2) * 1.15 + 1);

        System.out.println(nbs[r]);
    }

}
