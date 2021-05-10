package Concreate;

import Abstract.BaseManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class CustomerManager extends BaseManager {
	
	public void add(Customer customer) {
		System.out.println("Müþteri veritabanýna eklendi : " + customer.getFirstName() + " " + customer.getLastName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri veritabanýndan silindi : " + customer.getFirstName() + " " + customer.getLastName());
	}
	
	public void update(Customer customer) {
		System.out.println("Müþteri veritabanýnda güncellendi : " + customer.getFirstName() + " " + customer.getLastName());
	}
	
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			this.add(customer);
		}
	}
	
	ICustomerCheckService customerCheckService;
	
	public CustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {	
		
		if (customerCheckService.CheckIfRealPerson(customer))
        {
            System.out.println("Person Checked!");
        }else{
            System.out.println("Not a valid person!");
        }
	}
}
