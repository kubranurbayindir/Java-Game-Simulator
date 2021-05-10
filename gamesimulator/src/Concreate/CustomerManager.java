package Concreate;

import Abstract.BaseManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class CustomerManager extends BaseManager {
	
	public void add(Customer customer) {
		System.out.println("M��teri veritaban�na eklendi : " + customer.getFirstName() + " " + customer.getLastName());
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri veritaban�ndan silindi : " + customer.getFirstName() + " " + customer.getLastName());
	}
	
	public void update(Customer customer) {
		System.out.println("M��teri veritaban�nda g�ncellendi : " + customer.getFirstName() + " " + customer.getLastName());
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
