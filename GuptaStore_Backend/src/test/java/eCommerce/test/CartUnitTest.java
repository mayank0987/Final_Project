package eCommerce.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eCommerce.DAO.CartDAO;
import eCommerce.model.CartItem;
import eCommerce.model.Category;


public class CartUnitTest {

	static CartDAO cartDAO ;

	@BeforeClass
	public static void executeFirst() 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("eCommerce");
		context.refresh();
		
		cartDAO = (CartDAO)context.getBean("cartDAO");
	}
	@Ignore
	 @Test
		public void addCartItemTest() 
		{
		CartItem cartItem=new CartItem();
		cartItem.setProductId(7);
		cartItem.setProductName("harvards jeans");
		cartItem.setQuantity(8);
		cartItem.setPrice(500);
		cartItem.setPaymentStatus("NP");
		cartItem.setUsername("Amir");
		
		assertTrue("Problem in Adding into cart",cartDAO.addCartItem(cartItem));
		}
	@Ignore
	@Test
	public void updateCartTest()
	{
		CartItem cartItem=cartDAO.getCartItem(15);
		cartItem.setQuantity(5);
		assertTrue("Problem in uploading the cart",cartDAO.updateCartItem(cartItem));
		
	}
	@Ignore
	@Test
	public void deleteCartTest()
	{
		CartItem cartItem=cartDAO.getCartItem(18);
		assertTrue("Problem in deleting the cart",cartDAO.deleteCartItem(cartItem));
	}
	
	
	 @Test
		public void displayCartItems()
		{
			List<CartItem> listCartItems = cartDAO.listCartItems("Amir");
			assertTrue("Problem in displaying CartItems", listCartItems.size()>0);
			
			for(CartItem cartItem:listCartItems)
			{
				System.out.println("CartItem Id:" + cartItem.getProductId()+" \t");
				System.out.println("ProductName:" + cartItem.getProductName()+" \t");
				System.out.println("ProductPrice:" + cartItem.getPrice()+" \t");
				System.out.println("Quantity:" + cartItem.getQuantity()+" \t");
				System.out.println("TotalPrice:" + cartItem.getPrice()*cartItem.getQuantity());
				System.out.println("------------------------------------");
			}
		}
		
}
