/**
 * 
 */
package gov.azdeq.mydeq.dashboard.dto;

/**
 * @author np3
 *
 */
public class Action {

  public int id;
  public String action;
  public String url;
  public String tooltip;

  /**
   * @return the url
   */
  public String getUrl() {
    return url;
  }

  /**
   * @param url the url to set
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * @return the id
   */
  public int getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * @param action the action to set
   */
  public void setAction(String action) {
    this.action = action;
  }

  /**
   * @return the tooltip
   */
  public String getTooltip() {
    return tooltip;
  }

  /**
   * @param tooltip the tooltip to set
   */
  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }

}
