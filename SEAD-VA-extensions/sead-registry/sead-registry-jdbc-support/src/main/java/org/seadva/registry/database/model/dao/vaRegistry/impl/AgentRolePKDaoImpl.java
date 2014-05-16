package org.seadva.registry.database.model.dao.vaRegistry.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import org.seadva.registry.database.model.obj.vaRegistry.AgentRolePK;
import org.springframework.stereotype.Repository;
import org.seadva.registry.database.model.dao.vaRegistry.AgentRolePKDao;
import java.io.Serializable;
 
/**
 * DAO for table: AgentRolePK.
 * @author autogenerated
 */
@Repository
public class AgentRolePKDaoImpl extends GenericHibernateDaoImpl<AgentRolePK, Serializable> implements AgentRolePKDao {
	
	/** Constructor method. */
		public AgentRolePKDaoImpl() {
			super(AgentRolePK.class);
		}
	}
