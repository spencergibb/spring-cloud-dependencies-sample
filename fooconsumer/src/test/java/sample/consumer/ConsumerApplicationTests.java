package sample.consumer;

import com.ofg.config.BasicProfiles;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ConsumerApplication.class)
@WebIntegrationTest(/*value = "curator.testingserver.port=-1", */randomPort = true)
@ActiveProfiles(BasicProfiles.SPRING_CLOUD)
public class ConsumerApplicationTests {

	@Test
	public void contextLoads() {
	}

}
