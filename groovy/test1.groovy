import java.lang.* // this is the only default import in Java
import java.util.*
import java.io.*
import java.net.*
import groovy.lang.*
import groovy.util.*
import java.math.BigInteger
import java.math.BigDecimal

class Order {
     int orderNo
     Customer orderedByCustomer
     String description
     static main(args) {
       Order order1 = new Order();
       order1.orderNo = 1;
       order1.orderedByCustomer = new Customer(name: "Customer1", email: "cust1@example.com")
       order1.setDescription("Ordered by Customer1")
       println order1.orderedByCustomer.showMail()
     } 
}

class Customer{
  String name
  String email
  String address
  String showMail(){
	email 
  }
}
