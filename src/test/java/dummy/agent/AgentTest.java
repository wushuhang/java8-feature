package dummy.agent;

import org.junit.Test;
/**
 * 
 * http://blog.javabenchmark.org/2013/05/java-instrumentation-tutorial.html
 * 
 * @author shuha
 *
 */
public class AgentTest {
	 @Test
	    public void shouldInstantiateSleepingInstance() throws InterruptedException {
	 
	        Sleeping sleeping = new Sleeping();
	        sleeping.randomSleep();
	    }
}
