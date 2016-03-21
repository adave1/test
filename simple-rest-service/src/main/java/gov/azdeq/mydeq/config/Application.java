package gov.azdeq.mydeq.config;

import gov.azdeq.mydeq.dashboard.service.v1.DashboardRestService;
import gov.azdeq.mydeq.service.HelloService;

import org.wso2.msf4j.MicroservicesRunner;
import org.wso2.msf4j.analytics.httpmonitoring.HTTPMonitoringInterceptor;
import org.wso2.msf4j.analytics.metrics.MetricReporter;
import org.wso2.msf4j.analytics.metrics.MetricsInterceptor;

public class Application {
    public static void main(String[] args) {          	 
    	new MicroservicesRunner().addInterceptor(new HTTPMonitoringInterceptor().init())
        .addInterceptor(
                new MetricsInterceptor().init(MetricReporter.CONSOLE, 
                		MetricReporter.JMX, MetricReporter.DAS))
        
        .deploy(new DashboardRestService())
        .deploy(new HelloService())
        .start();
                 
    }
}
