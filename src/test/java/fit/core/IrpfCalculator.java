package fit.core;

public class IrpfCalculator {



    public static double calculateBaseSalary(double totalSalary) {
        return totalSalary - (totalSalary * 0.11);
    }


    public static double calculateExemption() {
        return 1903.98;
    }

    public static double calculateDiscount(double baseSalary) {
        return baseSalary - calculateExemption();
    }


    public static double calculateTaxLayer(double baseSalary) {
       if(baseSalary > 1903.98 && baseSalary <  2826.66) {
           return 7.5 / 100;
       }

       if(baseSalary > 2826.67) {
            return 15 / 100;
       }

       if(baseSalary > 3751.05) {
            return 22.50 / 100;
       }

       if(baseSalary > 4664.68) {
            return 27.5 / 100;
       }

        return 0.0;
    }


    public static double calculateIrpf(double totalSalary) {

        double baseSalary = calculateBaseSalary(totalSalary);
        double discount = baseSalary - calculateExemption();
        double tax = calculateTaxLayer(baseSalary);

        return discount * tax;

    }
}
