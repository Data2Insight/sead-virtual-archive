package org.seadva.registry.database.model.dao.vaRegistry.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import org.seadva.registry.database.model.obj.vaRegistry.Aggregation;
import org.springframework.stereotype.Repository;
import org.seadva.registry.database.model.dao.vaRegistry.AggregationDao;
import org.seadva.registry.database.model.obj.vaRegistry.AggregationPK;
 
/**
 * DAO for table: Aggregation.
 * @author autogenerated
 */
@Repository
public class AggregationDaoImpl extends GenericHibernateDaoImpl<Aggregation, AggregationPK> implements AggregationDao {
	
	/** Constructor method. */
		public AggregationDaoImpl() {
			super(Aggregation.class);
		}
	}
