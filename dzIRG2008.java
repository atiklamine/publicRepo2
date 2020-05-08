/*
 * IRG2008 that calculats the value
 * of IRG2008 based on the value passed in the parameters
 * Version 2020
 * email : atiklamine@gmail.com
 */
package dz.irg.twenty_o_eight;

/**
 *
 * @author Atik Mohamed lamine
 */
public class dzIRG2008 {

    public static int getIRG(int IMPOSABLE) {
        int IRG_A;

        IRG_A = getIRG_A(IMPOSABLE);
        return IRG_A -getAbattement(IRG_A);
    }

    public static int getIRG_A(int IMPOSABLE){
        if (IMPOSABLE <= 10000) {
            return 0;
        } else if (IMPOSABLE <= 30000) {
            return ((IMPOSABLE - 10000) * 20 / 100);
        } else if (IMPOSABLE <= 120000) {
            return (4000 + (IMPOSABLE - 30000) * 30 / 100);
        } else {
            return (31000 + (IMPOSABLE - 120000) * 35 / 100);
        }
    }
    public static int getAbattement(int IRG_A) {
        int val = IRG_A * 40 / 100;
        if (val < 1000) {
            return 1000;
        } else if (val > 1500) {
            return 1500;
        }

        return val;
    }
}
