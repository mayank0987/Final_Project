package eCommerce.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eCommerce.DAO.OrderDAO;
import eCommerce.model.OrderDetail;

public class OrderUnitTest {

static OrderDAO orderDAO;

@BeforeClass
public static void executeFirst()
{
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(); 
context.scan("eCommerce");
context.refresh();
 orderDAO=(OrderDAO)context.getBean("orderDAO");
}

@Test
public void saveorderTest()
{
	OrderDetail orderDetail=new OrderDetail();
	orderDetail.setOrderDate(new java.util.Date());
orderDetail.setCartId(101);
orderDetail.setShippingAddr("DELHI");
orderDetail.setTotalAmount(4000);
orderDetail.setTranType("COD");
orderDetail.setUsername("shubham");

assertTrue("Problem in saving Order",orderDAO.saveOrder(orderDetail));
}

@Test
public void updateCart()
{
assertTrue("Problem in Updating Cart",orderDAO.updateCart("shubham"));	
}

}
