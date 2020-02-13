import com.lagou.edu.LagouBean;
import com.lagou.edu.aspect.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description:
 * @Author: 长灵
 * @Date: 2020-02-13 18:42
 */

public class AopTest {



	/**
	 *  Ioc 容器源码分析基础案例
	 */
	@Test
	public void testAnnoWithAspectJ() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.lagou.edu.aspect");
		MyBean bean = applicationContext.getBean(MyBean.class);
		System.out.println(bean.print());
	}
}
