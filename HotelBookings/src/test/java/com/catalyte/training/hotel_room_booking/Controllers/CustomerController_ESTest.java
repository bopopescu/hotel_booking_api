/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 05 05:34:03 GMT 2018
 */

package com.catalyte.training.hotel_room_booking.Controllers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.catalyte.training.hotel_room_booking.Controllers.CustomerController;
import com.catalyte.training.hotel_room_booking.Entities.Address;
import com.catalyte.training.hotel_room_booking.Entities.Customer;
import com.catalyte.training.hotel_room_booking.Repositories.CustomerRepository;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CustomerController_ESTest extends CustomerController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CustomerController customerController0 = new CustomerController();
      Vector<Customer> vector0 = new Vector<Customer>();
      Customer customer0 = new Customer();
      CustomerRepository customerRepository0 = mock(CustomerRepository.class, new ViolatedAssumptionAnswer());
      doReturn(vector0, vector0, (List) null).when(customerRepository0).findAll();
      Injector.inject(customerController0, (Class<?>) CustomerController.class, "customerRepository", (Object) customerRepository0);
      Injector.validateBean(customerController0, (Class<?>) CustomerController.class);
      customerController0.updateUser("[%S]@N @N0W", "[%S]@N @N0W", "[%S]@N @N0W", (Address) null, customer0);
      List<Customer> list0 = customerController0.getCustomerParam((String) null, (String) null, (String) null, (Address) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CustomerController customerController0 = new CustomerController();
      CustomerRepository customerRepository0 = mock(CustomerRepository.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(customerRepository0).findAll();
      Injector.inject(customerController0, (Class<?>) CustomerController.class, "customerRepository", (Object) customerRepository0);
      Injector.validateBean(customerController0, (Class<?>) CustomerController.class);
      Address address0 = new Address();
      Customer customer0 = new Customer();
      // Undeclared exception!
      try { 
        customerController0.updateUser("(^=WR &h(bTmJ7M[e=", "(^=WR &h(bTmJ7M[e=", "", address0, customer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.catalyte.training.hotel_room_booking.Controllers.CustomerController", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CustomerController customerController0 = new CustomerController();
      CustomerRepository customerRepository0 = mock(CustomerRepository.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(customerRepository0).findAll();
      Injector.inject(customerController0, (Class<?>) CustomerController.class, "customerRepository", (Object) customerRepository0);
      Injector.validateBean(customerController0, (Class<?>) CustomerController.class);
      Address address0 = new Address();
      // Undeclared exception!
      try { 
        customerController0.getCustomerParam("Customer successfully added.", "", ".jG=)83MDp'c&NTc", address0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.catalyte.training.hotel_room_booking.Controllers.CustomerController", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CustomerController customerController0 = new CustomerController();
      Vector<Customer> vector0 = new Vector<Customer>();
      Customer customer0 = new Customer();
      CustomerRepository customerRepository0 = mock(CustomerRepository.class, new ViolatedAssumptionAnswer());
      doReturn(vector0).when(customerRepository0).findAll();
      Injector.inject(customerController0, (Class<?>) CustomerController.class, "customerRepository", (Object) customerRepository0);
      Injector.validateBean(customerController0, (Class<?>) CustomerController.class);
      customerController0.updateUser((String) null, (String) null, (String) null, (Address) null, customer0);
      assertNull(customer0.getFirstName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CustomerController customerController0 = new CustomerController();
      Vector<Customer> vector0 = new Vector<Customer>();
      Customer customer0 = new Customer();
      vector0.add(customer0);
      CustomerRepository customerRepository0 = mock(CustomerRepository.class, new ViolatedAssumptionAnswer());
      doReturn(vector0).when(customerRepository0).findAll();
      Injector.inject(customerController0, (Class<?>) CustomerController.class, "customerRepository", (Object) customerRepository0);
      Injector.validateBean(customerController0, (Class<?>) CustomerController.class);
      // Undeclared exception!
      try { 
        customerController0.deleteCustomer("}%d]!NN0");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CustomerController customerController0 = new CustomerController();
      Vector<Customer> vector0 = new Vector<Customer>();
      Customer customer0 = new Customer();
      vector0.add(customer0);
      CustomerRepository customerRepository0 = mock(CustomerRepository.class, new ViolatedAssumptionAnswer());
      doReturn(vector0).when(customerRepository0).findAll();
      Injector.inject(customerController0, (Class<?>) CustomerController.class, "customerRepository", (Object) customerRepository0);
      Injector.validateBean(customerController0, (Class<?>) CustomerController.class);
      // Undeclared exception!
      try { 
        customerController0.getCustomer("}%d]!NN0");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CustomerController customerController0 = new CustomerController();
      Vector<Customer> vector0 = new Vector<Customer>();
      CustomerRepository customerRepository0 = mock(CustomerRepository.class, new ViolatedAssumptionAnswer());
      doReturn(vector0).when(customerRepository0).findAll();
      Injector.inject(customerController0, (Class<?>) CustomerController.class, "customerRepository", (Object) customerRepository0);
      Injector.validateBean(customerController0, (Class<?>) CustomerController.class);
      Address address0 = new Address();
      // Undeclared exception!
      try { 
        customerController0.getCustomerParam((String) null, (String) null, "}%d]!NN0", address0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.catalyte.training.hotel_room_booking.Controllers.CustomerController", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CustomerController customerController0 = new CustomerController();
      Vector<Customer> vector0 = new Vector<Customer>();
      Customer customer0 = new Customer();
      vector0.add(customer0);
      CustomerRepository customerRepository0 = mock(CustomerRepository.class, new ViolatedAssumptionAnswer());
      doReturn(vector0).when(customerRepository0).findAll();
      Injector.inject(customerController0, (Class<?>) CustomerController.class, "customerRepository", (Object) customerRepository0);
      Injector.validateBean(customerController0, (Class<?>) CustomerController.class);
      Address address0 = new Address();
      // Undeclared exception!
      try { 
        customerController0.getCustomerParam((String) null, (String) null, (String) null, address0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.catalyte.training.hotel_room_booking.Controllers.CustomerController", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CustomerController customerController0 = new CustomerController();
      Vector<Customer> vector0 = new Vector<Customer>();
      Customer customer0 = new Customer();
      LinkedList<Customer> linkedList0 = new LinkedList<Customer>();
      linkedList0.add(customer0);
      CustomerRepository customerRepository0 = mock(CustomerRepository.class, new ViolatedAssumptionAnswer());
      doReturn(vector0, vector0, vector0, linkedList0).when(customerRepository0).findAll();
      Injector.inject(customerController0, (Class<?>) CustomerController.class, "customerRepository", (Object) customerRepository0);
      Injector.validateBean(customerController0, (Class<?>) CustomerController.class);
      Address address0 = customer0.getAddress();
      customerController0.updateUser("[%S]@N @N0W", "[%S]@N @N0W", "[%S]@N @N0W", (Address) null, customer0);
      customerController0.getCustomerParam((String) null, (String) null, (String) null, (Address) null);
      // Undeclared exception!
      try { 
        customerController0.getCustomerParam("B8 8{6>yZL-", "aLDRB*p3Zlf;2^", "g9Z(2|L$yeeVpsl&tHm", address0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.catalyte.training.hotel_room_booking.Controllers.CustomerController", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Address address0 = new Address();
      CustomerController customerController0 = new CustomerController();
      LinkedList<Customer> linkedList0 = new LinkedList<Customer>();
      CustomerRepository customerRepository0 = mock(CustomerRepository.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(customerRepository0).findAll();
      Injector.inject(customerController0, (Class<?>) CustomerController.class, "customerRepository", (Object) customerRepository0);
      Injector.validateBean(customerController0, (Class<?>) CustomerController.class);
      // Undeclared exception!
      try { 
        customerController0.getCustomerParam((String) null, "[%S]@N @N0W", (String) null, address0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.catalyte.training.hotel_room_booking.Controllers.CustomerController", e);
      }
  }
}
