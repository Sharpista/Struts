package net.viralpatel.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class AjaxAutoComplete extends ActionSupport {
	
	 private String data = "Afghanistan, Zimbabwe, India, United States, Germany, China,
			 Israel";
			  private List<String> countries;
			  private String country;

			  public String execute() {
			  countries = new ArrayList<String>();
			  StringTokenizer st = new StringTokenizer(data, ",");
			  
			  while (st.hasMoreTokens()) {
			  countries.add(st.nextToken().trim());
			  }
			  return SUCCESS;
			  }
			  public String getCountry() {
			  return this.country;
			  }

			  public List<String> getCountries() {
			  return countries;
			  }

			  public void setCountries(List<String> countries) {
			  this.countries = countries;
			  }
			  public void setCountry(String country) {
			  this.country = country;
			  }


}
