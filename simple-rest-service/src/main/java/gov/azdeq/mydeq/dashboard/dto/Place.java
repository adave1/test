package gov.azdeq.mydeq.dashboard.dto;

public class Place {

  public Permit permits[];
  public Address address;
  public int place_id;
  public String place_name;

  /**
   * @return the permits
   */
  public Permit[] getPermits() {
    return permits;
  }

  /**
   * @param permits the permits to set
   */
  public void setPermits(Permit[] permits) {
    this.permits = permits;
  }

  /**
   * @return the address
   */
  public Address getAddress() {
    return address;
  }

  /**
   * @param address the address to set
   */
  public void setAddress(Address address) {
    this.address = address;
  }

  /**
   * @return the place_id
   */
  public int getPlace_id() {
    return place_id;
  }

  /**
   * @param place_id the place_id to set
   */
  public void setPlace_id(int place_id) {
    this.place_id = place_id;
  }

  /**
   * @return the place_name
   */
  public String getPlace_name() {
    return place_name;
  }

  /**
   * @param place_name the place_name to set
   */
  public void setPlace_name(String place_name) {
    this.place_name = place_name;
  }


}
