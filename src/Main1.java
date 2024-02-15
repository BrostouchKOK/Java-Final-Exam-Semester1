
class DiscountRate {
    static double serviceDiscountPremium = 0.2;
    static double serviceDiscountGold = 0.15;
    static double serviceDiscountSilver = 0.1;

    static double productDiscountPremium = 0.1;
    static double productDiscountGold = 0.1;
    static double productDiscountSilver = 0.1;
}

class Customer {
    private String name;
    private String customerType;

    public Customer(String name) {
        this.name = name;
        this.customerType = "Regular"; // Default customer type
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerType() {
        return customerType;
    }

    // Other methods for Customer class
}

class Sale {
    private Customer customer;
    private String date;
    private double productExpense;
    private double serviceExpense;

    public Sale(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public void displayInfo() {
        double totalExpense = productExpense + serviceExpense;

        // Apply discount based on customer type
        double discountRate;
        switch (customer.getCustomerType()) {
            case "Premium":
                discountRate = DiscountRate.serviceDiscountPremium + DiscountRate.productDiscountPremium;
                break;
            case "Gold":
                discountRate = DiscountRate.serviceDiscountGold + DiscountRate.productDiscountGold;
                break;
            case "Silver":
                discountRate = DiscountRate.serviceDiscountSilver + DiscountRate.productDiscountSilver;
                break;
            default:
                discountRate = 0.0; // No discount for regular customers
        }

        double discountedExpense = totalExpense - (totalExpense * discountRate);

        System.out.println("Sale Information:");
        System.out.println("Date: " + date);
        System.out.println("Customer: " + customer.getCustomerType());
        System.out.println("Total Expense: $" + totalExpense);
        System.out.println("Discounted Expense: $" + discountedExpense);
        System.out.println("------------------------------");
    }
}

    public class Main1 {
        public static void main(String[] args) {
            Customer c1 = new Customer("Sovisal");
            Customer c2 = new Customer("Sokchea");
            Customer c3 = new Customer("Sokpov");
            Customer c4 = new Customer("Vitou");

            c2.setCustomerType("Premium");
            c3.setCustomerType("Gold");
            c4.setCustomerType("Silver");

            Sale sale_c1 = new Sale(c1,"2024-02-11");
            Sale sale_c2 = new Sale(c2,"2024-02-12");
            Sale sale_c3 = new Sale(c3,"2024-02-13");
            Sale sale_c4 = new Sale(c4,"2024-02-14");

            sale_c1.setProductExpense(100);
            sale_c1.setServiceExpense(100);
            sale_c1.displayInfo();

            sale_c2.setProductExpense(100);
            sale_c2.setServiceExpense(100);
            sale_c2.displayInfo();

            sale_c3.setProductExpense(100);
            sale_c3.setServiceExpense(100);
            sale_c3.displayInfo();

            sale_c4.setProductExpense(100);
            sale_c4.setServiceExpense(100);
            sale_c4.displayInfo();
        }
    }
