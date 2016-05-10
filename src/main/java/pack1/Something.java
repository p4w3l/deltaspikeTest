package pack1;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Something implements Serializable {
	
	@Id @GeneratedValue
	private Long id;
	private String name;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean equals( final Object other ) {
		if (other instanceof Something) {
			return this.getName().equals(((Something)other).getName());
		}
		return false;
  }
  
  public int hashCode() {
  	return getName().hashCode();
  }
  
  public String toString() {
		return getName();
	}
	
}

