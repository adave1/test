package gov.azdeq.mydeq.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.wso2.carbon.metrics.annotation.Metered;

@Path("/hello")
public class HelloService {
	
	 
	@GET
    @Path("/{name}")
	@Metered
    public String hello(@PathParam("name") String name) {
        return "Hello " + name;
    }
 
}