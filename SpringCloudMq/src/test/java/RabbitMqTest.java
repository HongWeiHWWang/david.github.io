import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nbs.Sender;
import com.nbs.SpringCloudMq;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringCloudMq.class)
public class RabbitMqTest {
	
	@Autowired
	private Sender sender;
	
	@Test
	public void test1() throws InterruptedException{
		//while (true) {
			//Thread.sleep(1000);
			this.sender.send("Hello RabbitMq");
		//}
		
	}

}
