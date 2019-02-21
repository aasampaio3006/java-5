package challenge;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="scripts")
public class Quote {

	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="actor")
	private String actor;
	
	@Column(name="detail")
	private String quote;
	
	public Integer getId() {
		return null;
	}

	public void setId(Integer id) {

	}

	public String getActor() {
		return null;
	}

	public void setActor(String actor) {

	}

	public String getQuote() {
		return null;
	}

	public void setQuote(String quote) {

	}
	
	@Override
	public String toString() {
		return "Quote [id=" + id + ", actor=" + actor + ", quote=" + quote + "]";
	}

}
