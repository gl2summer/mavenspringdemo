package msid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hao.msid.Atm;
import com.hao.msid.Card;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
//		Card card = appContext.getBean("card1", Card.class);
//		card.read();
		
		Atm atm = appContext.getBean("atm", Atm.class);
		atm.read();
	}

}
