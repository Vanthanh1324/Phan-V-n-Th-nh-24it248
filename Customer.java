package OOP7baitap;
import java.util.Date;

public class Customer {

	    private String name;
	    private boolean member = false;
	    private String memberType;

	    public Customer(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public boolean isMember() {
	        return member;
	    }

	    public void setMember(boolean member) {
	        this.member = member;
	    }

	    public String getMemberType() {
	        return memberType;
	    }

	    public void setMemberType(String type) {
	        if (member) {
	            this.memberType = type;
	        } else {
	            this.memberType = null;
	        }
	    }

	    @Override
	    public String toString() {
	        return "Customer{name='" + name + "', member=" + member + ", memberType='" + memberType + "'}";
	    }
	}

	class DiscountRate {
	    private static final double serviceDiscountPremium = 0.2;
	    private static final double serviceDiscountGold = 0.15;
	    private static final double serviceDiscountSilver = 0.1;
	    private static final double productDiscount = 0.1;

	    public static double getServiceDiscountRate(String type) {
	        switch (type) {
	            case "Premium":
	                return serviceDiscountPremium;
	            case "Gold":
	                return serviceDiscountGold;
	            case "Silver":
	                return serviceDiscountSilver;
	            default:
	                return 0.0;
	        }
	    }

	    public static double getProductDiscountRate() {
	        return productDiscount;
	    }
	}

	class Visit {
	    private Customer customer;
	    private Date date;
	    private double serviceExpense;
	    private double productExpense;

	    public Visit(String name, Date date) {
	        this.customer = new Customer(name);
	        this.date = date;
	    }

	    public String getName() {
	        return customer.getName();
	    }

	    public double getServiceExpense() {
	        return serviceExpense;
	    }

	    public void setServiceExpense(double ex) {
	        this.serviceExpense = ex;
	    }

	    public double getProductExpense() {
	        return productExpense;
	    }

	    public void setProductExpense(double ex) {
	        this.productExpense = ex;
	    }

	    public double getTotalExpense() {
	        double serviceDiscount = customer.isMember() ? 
	            DiscountRate.getServiceDiscountRate(customer.getMemberType()) : 0.0;
	        double productDiscount = DiscountRate.getProductDiscountRate();

	        double totalServiceCost = serviceExpense * (1 - serviceDiscount);
	        double totalProductCost = productExpense * (1 - productDiscount);

	        return totalServiceCost + totalProductCost;
	    }

	    public String toString() {
	        return "Visit{customer=" + customer + ", date=" + date + 
	               ", serviceExpense=" + serviceExpense + ", productExpense=" + productExpense + 
	               ", totalExpense=" + getTotalExpense() + "}";
	    }
	}