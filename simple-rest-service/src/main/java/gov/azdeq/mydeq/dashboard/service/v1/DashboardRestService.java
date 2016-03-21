package gov.azdeq.mydeq.dashboard.service.v1;

import gov.azdeq.mydeq.dashboard.dao.DashboardDAO;
import gov.azdeq.mydeq.dashboard.dto.Permit;
import gov.azdeq.mydeq.dashboard.dto.UserDTO;

import java.util.List;
import java.util.Random;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.wso2.carbon.metrics.annotation.Counted;
import org.wso2.carbon.metrics.annotation.Metered;
import org.wso2.carbon.metrics.annotation.Timed;
import org.wso2.msf4j.analytics.httpmonitoring.HTTPMonitored;

@Path("/")
public class DashboardRestService {

	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/getpermit/{emailid}")
	@Metered
    @HTTPMonitored
	public Response getUserPermit (@PathParam("emailid") String emailid) {
		DashboardDAO dashboardDAO = new DashboardDAO();			
		List<Permit> userPermitList = dashboardDAO.getPermit(emailid);
		ResponseBuilder response = Response.ok(userPermitList);
		return response.build();   
	};
	
	@GET
    @Path("/{guid}")
    @Produces("application/json")
    @Timed
    @HTTPMonitored
    public Response getUser(@PathParam("guid") String guid) throws InterruptedException {
		DashboardDAO dashboardDAO = new DashboardDAO();	
		UserDTO user = dashboardDAO.getUser(guid);
		ResponseBuilder response = Response.ok(user);
		Random random = new Random();
		Thread.sleep(random.nextInt(5000));
		return response.build();   
    }
		 
	@GET
    @Produces("application/json")
    @Counted
    @HTTPMonitored
    @Path("/dashboard")
    public String loaddashboard() {
        return "Welcome to MyDEQ";
    }
	
	 
}
