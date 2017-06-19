package isoForum.immutableData;

/**
 * Created by gen on 19.06.2017.
 */
public class SideEffectDestructiveUpdate {
    class Insurance {
        public int price;
        public Insurance includedInsurance;
        public Insurance(int price, Insurance includedInsurance) {
            this.price = price;
            this.includedInsurance = includedInsurance;
        }
    }

    static Insurance link(Insurance a, Insurance b) {
        Insurance insurance = a;
        while (insurance.includedInsurance != null) {
            insurance = insurance.includedInsurance;
        }
        insurance.includedInsurance = b;
        return a;
    }
}
