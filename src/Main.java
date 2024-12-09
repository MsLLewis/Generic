import generics.*;
import interfaces.GenericInterface;
import interfaces.impl.GenericInterfaceImpl;
import model.Customer;
import model.Order;
import model.VIPCustomer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        /**
         * . Lower Bound (? super Type)
         * Definition: Specifies that a wildcard can be any type that is a superclass of (or the same as) a specified type.
         * Keyword: super
         * Purpose: Useful when you need to write data into a collection but don’t care about the exact type.
         * Example Use Case: You want to add Integer values to a list, and the list could be of type List<Integer> or List<Number>.
         */
               List<Number> numbers = new ArrayList<>();
               List<Object> objects = new ArrayList<>();
               LowerBound lowerBound = new LowerBound();
               lowerBound.addNumbers(numbers);
               lowerBound.addNumbers(objects);

               System.out.println("Numbers List: " + numbers);
               System.out.println("Objects List: " + objects);





        /**
         * UpperBound
         *  Upper Bound (? extends Type)
         * Definition: Specifies that a wildcard can be any type that is a subclass of (or the same as) a specified type.
         * Keyword: extends
         * Purpose: Useful when you need to read data but don’t need to modify the collection.
         * Example Use Case: You have a method that works with a list of numbers (e.g., Integer, Double), and you don’t care about the exact type.
         */
//        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
//        List<Double> doubleList = Arrays.asList(1.1,2.2,3.3,4.4);
//        List<String> stringList = Arrays.asList("Jane", "John");
//
//        UpperBound upperBound = new UpperBound();
//        upperBound.processList(integerList);
//        upperBound.processList(doubleList);


        /**
         * WildcardClass demo
         *
         */
//        List<String> stringList = List.of("A", "B", "C");
//        List<Integer> integerList = List.of(1, 2, 3);
//
//        WildcardClass wildcardClass = new WildcardClass();
//        wildcardClass.printList(stringList);
//        wildcardClass.printList(integerList);

        /**
         * VIPCustomer using the BoundedType class
         */

//        Customer customer = new Customer(1001, "Lisa Jones");
//        BoundedType<Customer> customerBoundedType = new BoundedType<>(customer);
//        System.out.println("Customer Details: " + customerBoundedType.getCustomerDetails());
//
//
//        VIPCustomer vipCustomer = new VIPCustomer(2002, "Bob Jones","Gold");
//        BoundedType<VIPCustomer> vipCustomerBoundedType =  new BoundedType<>(vipCustomer);
//        System.out.println("VIP Customer Details: " + vipCustomerBoundedType.getCustomerDetails());



        /**
         * GenericInterfaceImpl using the GenericInterface<T>
         */

//        Customer customer = new Customer(8001, "John Doe");
//        GenericInterface<Customer> custImpl = new GenericInterfaceImpl<>();
//        custImpl.display(customer);
//
//        Order order = new Order(2001, "Laptop");
//        GenericInterface<Order> orderImpl = new GenericInterfaceImpl<>();  //programming to the interface
//        orderImpl.display(order);
        /**
         * Customer and Order POJO's using the GenericClassTwoParams
         */
          //Create a Customer object
//          Customer customer = new Customer(101, "Joan of Arch");
//          //Create a Order object
//          Order order = new Order(7001, "Macbook");
//
//           //GenericClassTwoParams
//        GenericClassTwoParams<Customer, Order> custOrder =  new GenericClassTwoParams<>(customer, order);
//
//        //Display the intial values for Customer and Order
//        System.out.println("Customer: " + custOrder.getValue());
//        System.out.println("Order: " + custOrder.getSvalue());

        /**
         *

         * Customer POJO using the Generic Class
         *
         */
         //Create a Customer Object
//        Customer customer = new Customer(100, "Alice Smith");
//
//        //Use GenericClass with Customer
//        GenericClass<Customer> customerGeneric = new GenericClass<>(customer);
//
//        System.out.println(customerGeneric.getValue());


        /**
         * Generic Class
         *          //String object
         *         generics.GenericClass<String > stringInstance = new generics.GenericClass<>("Good Morning");
         *         System.out.println(stringInstance.getValue());
         *
         *          //Integer object
         *         generics.GenericClass<Integer> integerInstance = new generics.GenericClass<>(12345);
         *         System.out.println(integerInstance.getValue());
         *
         *         integerInstance.setValue(7890);
         *
         *         System.out.println(integerInstance.getValue());
         */


        /**
         * Generic Method
         *  generics.GenericMethod genericMethod = new generics.GenericMethod();
         *   genericMethod.createArray();
         */

    }
}