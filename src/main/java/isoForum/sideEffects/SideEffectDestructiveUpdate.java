package isoForum.sideEffects;

public class SideEffectDestructiveUpdate {

    class Insurance {

        public int price;
        public Insurance includedInsurance;


        public Insurance(int price, Insurance includedInsurance) {
            this.price = price;
            this.includedInsurance = includedInsurance;
        }
    }


    // Side effects
    Insurance link(Insurance a, Insurance b) {
        if (a == null) return b;
        Insurance insurance = a;
        while (insurance.includedInsurance != null) {
            insurance = insurance.includedInsurance;
        }
        insurance.includedInsurance = b;
        return a;
    }


    // Functional Style
    Insurance append(Insurance a, Insurance b) {
        return a == null ? b : new Insurance(a.price, append(a.includedInsurance, b));
    }
}
