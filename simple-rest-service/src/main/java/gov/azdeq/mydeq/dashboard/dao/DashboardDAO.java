package gov.azdeq.mydeq.dashboard.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import gov.azdeq.mydeq.dashboard.dto.Action;
import gov.azdeq.mydeq.dashboard.dto.Permit;
import gov.azdeq.mydeq.dashboard.dto.Documents;
import gov.azdeq.mydeq.dashboard.dto.UserDTO;


public class DashboardDAO {
	
	private String mailDomain = "iwantitall.com"; 
	private List<UserDTO> users = 
			Arrays.asList(new UserDTO("Ankit", "Dave", "adave", "ad5@" + mailDomain),
			new UserDTO("Udai", "Inuganti", "2", "uinuga" + mailDomain));

	public List<Permit> getPermit(String customerID) {
		
		List<Permit> permitList = new ArrayList<Permit>();
		
		Permit userPermit = new Permit();
		userPermit.setExpiration_date("2017-08-19T00:00:00.000-07:00");
		userPermit.setId("58549");
		userPermit.setProgram_name("WATER");
		userPermit.setProgram_type("AZPDES Permit");
		userPermit.setStatus("ISSUED");
		userPermit.setIssued_date(null);
		userPermit.setActivity("LTF");
		
		Documents document = new Documents();
		
		document.setId("58549");
		document.setUrl("/mydeq/dashboard_doc?permitId=58549&process=AZPDES Permit");
		document.setAuthor(null);
		document.setPath("/mydeq/dashboard_doc?permitId=58549&process=AZPDES Permit");
		document.setTitle(null);
		document.setSize(0);
		List <Documents> doclist = new ArrayList <Documents>();
		doclist.add(document);
		userPermit.setDocuments(doclist); 
		
		Action action = new Action();
		action.setAction("Step 1 - Download DMR");
		action.setId(0);
		action.setTooltip("Download a myDEQ Data Entry Spreadsheet to get started.");
		action.setUrl("/mydeq/dmr#/download/items?ltf=58549&place=429");
		
		List <Action> actionList = new ArrayList <Action>();
		actionList.add(action);
		
		userPermit.setActions(actionList);
		
		
	
		
		permitList.add(userPermit);
		return permitList;
	}
	
	public UserDTO getUser(String guid) {
		return users.get(0);
	}
}
