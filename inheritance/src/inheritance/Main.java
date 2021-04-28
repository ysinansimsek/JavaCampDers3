package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setFirstName("Sinan");
		individualCustomer.setLastName("ŞİMŞEK");
		individualCustomer.setCustomerNumber("123456");
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setCompanyName("Microsoft");
		corporateCustomer.setCustomerNumber("456789");
		Sendika sendika = new Sendika();
		sendika.setCustomerNumber("99999");
		sendika.setSendikaName("İşçi");
	
		
		
		CustomerManager customerManager = new CustomerManager();
		System.out.println("Müşteri Id si : ");
		//customerManager.add(individualCustomer);
		//customerManager.add(corporateCustomer);
		//customerManager.add(sendika);
		Customer [] customers = {individualCustomer,corporateCustomer,sendika};
		customerManager.addMultiple(customers);
		
	}

}
