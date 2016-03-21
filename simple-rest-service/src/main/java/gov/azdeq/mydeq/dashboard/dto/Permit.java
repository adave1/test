/**
 * 
 */
package gov.azdeq.mydeq.dashboard.dto;

import java.util.List;

/**
 * @author np3
 *
 */
public class Permit {

  public List<Documents> documents;
  public List<Action> actions;
  public String expiration_date;
  public String id;
  public String program_name;
  public String program_type;
  public String status;
  public String issued_date;
  public String activity;

  /**
   * @return the activity
   */
  public String getActivity() {
    return activity;
  }

  /**
   * @return the actions
   */
  public List<Action> getActions() {
    return actions;
  }

  /**
   * @param actions the actions to set
   */
  public void setActions(List<Action> actions) {
    this.actions = actions;
  }

  /**
   * @param activity the activity to set
   */
  public void setActivity(String activity) {
    this.activity = activity;
  }

  /**
   * @return the documents
   */
  public List<Documents> getDocuments() {
    return documents;
  }

  /**
   * @param documents the documents to set
   */
  public void setDocuments(List<Documents> documents) {
    this.documents = documents;
  }

  /**
   * @return the expiration_date
   */
  public String getExpiration_date() {
    return expiration_date;
  }

  /**
   * @param expiration_date the expiration_date to set
   */
  public void setExpiration_date(String expiration_date) {
    this.expiration_date = expiration_date;
  }

  /**
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * @return the program_name
   */
  public String getProgram_name() {
    return program_name;
  }

  /**
   * @param program_name the program_name to set
   */
  public void setProgram_name(String program_name) {
    this.program_name = program_name;
  }

  /**
   * @return the program_type
   */
  public String getProgram_type() {
    return program_type;
  }

  /**
   * @param program_type the program_type to set
   */
  public void setProgram_type(String program_type) {
    this.program_type = program_type;
  }

  /**
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * @param status the status to set
   */
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * @return the issued_date
   */
  public String getIssued_date() {
    return issued_date;
  }

  /**
   * @param issued_date the issued_date to set
   */
  public void setIssued_date(String issued_date) {
    this.issued_date = issued_date;
  }

}
