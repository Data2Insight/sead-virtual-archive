package org.seadva.registry.database.model.obj.vaRegistry;

import com.google.gson.annotations.Expose;
import org.hibernate.proxy.HibernateProxy;
import org.seadva.registry.database.enums.subtype.vaRegistry.BaseEntitySubclassType;
import org.seadva.registry.database.model.obj.vaRegistry.iface.IAgent;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


/** 
 * Object mapping for hibernate-handled table: agent.
 * @author autogenerated
 */

@Entity
@PrimaryKeyJoinColumn(name = "agent_id")
@Table(name = "agent", catalog = "va_registry")
public class Agent extends BaseEntity implements IAgent {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559002660L;

	

    @Expose
	/** Field mapping. */
	private Set<AgentProfile> agentProfiles = new HashSet<AgentProfile>();

    @Expose
	/** Field mapping. */
	private Set<AgentRole> agentRoles = new HashSet<AgentRole>();

    @Expose
	/** Field mapping. */
	private String firstName;

    @Expose
	/** Field mapping. */
	private String lastName;
 

	/**
 	 * Return an enum of the type of this subclass. This is useful to be able to use switch/case in your code.
 	 *
 	 * @return BaseEntitySubclassType enum.
 	 */
 	@Transient
 	@Override
 	public BaseEntitySubclassType getBaseEntitySubclassType() {
		return BaseEntitySubclassType.AGENT;
 	}  

 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Override
	@Transient
	public Class<?> getClassType() {
		return Agent.class;
	}
 

    /**
     * Return the value associated with the column: agentProfile.
	 * @return A Set&lt;AgentProfile&gt; object (this.agentProfile)
	 */
 	@OneToMany( fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "id.agent"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	public Set<AgentProfile> getAgentProfiles() {
		return this.agentProfiles;
		
	}
	
	/**
	 * Adds a bi-directional link of type AgentProfile to the agentProfiles set.
	 * @param agentProfile item to add
	 */
	public void addAgentProfile(AgentProfile agentProfile) {
		agentProfile.getId().setAgent(this);
		this.agentProfiles.add(agentProfile);
	}

  
    /**  
     * Set the value related to the column: agentProfile.
	 * @param agentProfile the agentProfile value you wish to set
	 */
	public void setAgentProfiles(final Set<AgentProfile> agentProfile) {
		this.agentProfiles = agentProfile;
	}

    /**
     * Return the value associated with the column: agentRole.
	 * @return A Set&lt;AgentRole&gt; object (this.agentRole)
	 */
 	@OneToMany( fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "id.agent"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	public Set<AgentRole> getAgentRoles() {
		return this.agentRoles;
		
	}
	
	/**
	 * Adds a bi-directional link of type AgentRole to the agentRoles set.
	 * @param agentRole item to add
	 */
	public void addAgentRole(AgentRole agentRole) {
		//agentRole.getId().setAgent(this);
		this.agentRoles.add(agentRole);
	}

  
    /**  
     * Set the value related to the column: agentRole.
	 * @param agentRole the agentRole value you wish to set
	 */
	public void setAgentRoles(final Set<AgentRole> agentRole) {
		this.agentRoles = agentRole;
	}

    /**
     * Return the value associated with the column: firstName.
	 * @return A String object (this.firstName)
	 */
	@Basic( optional = false )
	@Column( name = "first_name", nullable = false, length = 256  )
	public String getFirstName() {
		return this.firstName;
		
	}
	

  
    /**  
     * Set the value related to the column: firstName.
	 * @param firstName the firstName value you wish to set
	 */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

    /**
     * Return the value associated with the column: lastName.
	 * @return A String object (this.lastName)
	 */
	@Basic( optional = false )
	@Column( name = "last_name", nullable = false, length = 256  )
	public String getLastName() {
		return this.lastName;
		
	}
	

  
    /**  
     * Set the value related to the column: lastName.
	 * @param lastName the lastName value you wish to set
	 */
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public Agent clone() throws CloneNotSupportedException {
		
        final Agent copy = (Agent)super.clone();

		if (this.getAgentProfiles() != null) {
			copy.getAgentProfiles().addAll(this.getAgentProfiles());
		}
		if (this.getAgentRoles() != null) {
			copy.getAgentRoles().addAll(this.getAgentRoles());
		}
		copy.setFirstName(this.getFirstName());
		copy.setLastName(this.getLastName());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("firstName: " + this.getFirstName() + ", ");
		sb.append("lastName: " + this.getLastName());
		if (this.getClass().getSuperclass() != this.getClass()) {
			sb.append("(super.toString=" + super.toString() + ")");
		}
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see Object#equals(Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		
		if (aThat instanceof HibernateProxy) {
 			// narrow down the proxy to the class we are dealing with.
 			try {
				proxyThat = ((HibernateProxy) aThat).getHibernateLazyInitializer().getImplementation(); 
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		   	}
		}
		if (aThat == null)  {
			 return false;
		}
		
		final Agent that;
		try {
			that = (Agent) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		if (this.getClass().getSuperclass() != this.getClass()) {
			result = super.equals(that);
		}
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((getFirstName() == null) && (that.getFirstName() == null)) || (getFirstName() != null && getFirstName().equals(that.getFirstName())));
		result = result && (((getLastName() == null) && (that.getLastName() == null)) || (getLastName() != null && getLastName().equals(that.getLastName())));
		return result;
	}
	
	

	
}
