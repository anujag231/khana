package urbanspoon;

import java.util.List;
import java.util.Map;

	
	public class RestaurantDO {
		private List<AddressDO> address;
		private String phoneNumber;
		private String name;
	        private String resturantId;
		private String timeStamp;
	        private String longitude;
	        private String lattitude;
	        private String restCusine;
	        private Map<String,String> apiURL;
	        private String pricing;
	        private String restRating;
	        private Map<String,String> apiID;
	        
		public List<AddressDO> getAddress() {
			return address;
		}


		public void setAddress(List<AddressDO> address) {
			this.address = address;
		}


		public String getPhoneNumber() {
			return phoneNumber;
		}


		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}

	    /**
	     * @return the resturantId
	     */
	    public String getResturantId() {
	        return resturantId;
	    }

	    /**
	     * @param resturantId the resturantId to set
	     */
	    public void setResturantId(String resturantId) {
	        this.resturantId = resturantId;
	    }

	    /**
	     * @return the timeStamp
	     */
	    public String getTimeStamp() {
	        return timeStamp;
	    }

	    /**
	     * @param timeStamp the timeStamp to set
	     */
	    public void setTimeStamp(String timeStamp) {
	        this.timeStamp = timeStamp;
	    }

	    /**
	     * @return the longitude
	     */
	    public String getLongitude() {
	        return longitude;
	    }

	    /**
	     * @param longitude the longitude to set
	     */
	    public void setLongitude(String longitude) {
	        this.longitude = longitude;
	    }

	    /**
	     * @return the lattitude
	     */
	    public String getLattitude() {
	        return lattitude;
	    }

	    /**
	     * @param lattitude the lattitude to set
	     */
	    public void setLattitude(String lattitude) {
	        this.lattitude = lattitude;
	    }

	    /**
	     * @return the restCusine
	     */
	    public String getRestCusine() {
	        return restCusine;
	    }

	    /**
	     * @param restCusine the restCusine to set
	     */
	    public void setRestCusine(String restCusine) {
	        this.restCusine = restCusine;
	    }

	    /**
	     * @return the apiURL
	     */
	    public Map<String,String> getAPIURL() {
	        return apiURL;
	    }

	    /**
	     * @param apiURL the apiURL to set
	     */
	    public void setAPIURL(Map<String,String> apiURL) {
	        this.apiURL = apiURL;
	    }

	    /**
	     * @return the pricing
	     */
	    public String getPricing() {
	        return pricing;
	    }

	    /**
	     * @param pricing the pricing to set
	     */
	    public void setPricing(String pricing) {
	        this.pricing = pricing;
	    }

	    /**
	     * @return the restRating
	     */
	    public String getResturantRating() {
	        return restRating;
	    }

	    /**
	     * @param restRating the restRating to set
	     */
	    public void setResturantRating(String restRating) {
	        this.restRating = restRating;
	    }

	    /**
	     * @return the apiID
	     */
	    public Map<String,String> getApiID() {
	        return apiID;
	    }

	    /**
	     * @param apiID the apiID to set
	     */
	    public void setApiID(Map<String,String> apiID) {
	        this.apiID = apiID;
	    }
	        

}
