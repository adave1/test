package gov.azdeq.mydeq;

import java.io.IOException;

import org.wso2.msf4j.MicroservicesRunner;
import org.wso2.msf4j.analytics.httpmonitoring.HTTPMonitoringInterceptor;
import org.wso2.msf4j.analytics.metrics.MetricReporter;
import org.wso2.msf4j.analytics.metrics.MetricsInterceptor;
import org.wso2.msf4j.security.JWTSecurityInterceptor;

public class AppRunner {
	public static void main(String[] args) throws IOException {
		new MicroservicesRunner().
	//	addInterceptor(new JWTSecurityInterceptor()).
	//	addInterceptor(new HTTPMonitoringInterceptor().init()).
    //    addInterceptor(new MetricsInterceptor().init(
    //            MetricReporter.CONSOLE, MetricReporter.JMX, MetricReporter.DAS)).
		deploy(new MyDEQServlet()).start();
	}
}
