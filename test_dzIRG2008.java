/*
 * this class allow to test the dzIRG2008 class
 * it will generat the value of IRG2008 of based IRG vlues from 15000 to 500 000 DZD
 */
package dzIRG2008;

import dz.irg.twenty_o_eight.IRGMainClass;

/**
 *
 * @author AdminUser
 */
public class IRG2008DZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max_irg = 500000;
        for(int i = 15000;  i <= max_irg; i=i+10){
            System.out.println(i+"\t" + dzIRG2008.getIRG(i));
        }
    }

}
