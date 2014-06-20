package org.seadva.registry.database.model.dao.vaRegistry.impl;

import org.apache.log4j.Logger;
import org.seadva.registry.database.common.DBConnectionPool;
import org.seadva.registry.database.common.ObjectPool;
import org.seadva.registry.database.model.dao.vaRegistry.RelationDao;
import org.seadva.registry.database.model.obj.vaRegistry.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO for table: Relation.
 * @author autogenerated
 */

public class RelationDaoImpl implements RelationDao {
    private static Logger log = Logger.getLogger(BaseEntityDaoImpl.class);

    protected Connection getConnection() throws SQLException {
        return connectionPool.getEntry();
    }
    public RelationDaoImpl(){
        connectionPool = DBConnectionPool.getInstance();
    }


    protected ObjectPool<Connection> connectionPool = null;

    @Override
    public List<Relation> getRelations(String causeId) {
        Connection connection = null;
        PreparedStatement statement = null;
        List<Relation> relationList = new ArrayList<Relation>();

        try {
            connection = getConnection();
            statement = connection.prepareStatement("Select * from relation where cause_id=?");
            statement.setString(1, causeId);
            ResultSet resultSet = null;
            resultSet = statement.executeQuery();


            while (resultSet.next()) {
                Relation relation = new Relation();
                BaseEntity cause = new BaseEntity();
                BaseEntity effect = new BaseEntity();

                cause.setId(resultSet.getString("cause_id"));
                effect.setId(resultSet.getString("effect_id"));

                RelationPK relationPk = new RelationPK();
                relationPk.setCause(cause);
                relationPk.setEffect(effect);
                RelationType relationType = new RelationType();
                relationType.setId(resultSet.getString("relation_type_id"));
                relationPk.setRelationType(relationType);
                relation.setId(relationPk);

                relationList.add(relation);
            }


        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    log.warn("Unable to close statement", e);
                }
                statement = null;
            }
            connectionPool.releaseEntry(connection);

        }
        return relationList;
    }

    @Override
    public boolean putRelation(Relation relation){
    Connection connection = null;
    PreparedStatement statement = null;
    try {
        connection = getConnection();

        statement = connection.prepareStatement("INSERT IGNORE INTO relation values(?,?,?)");
        statement.setString(1, relation.getId().getCause().getId());
        statement.setString(2, relation.getId().getRelationType().getId());
        statement.setString(3, relation.getId().getEffect().getId());
        statement.executeUpdate();
        statement.close();
        log.debug("Done resetting unfinished raw notifications");
    } catch (SQLException sqle) {
        throw new RuntimeException(sqle);
    } finally {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                log.warn("Unable to close statement", e);
            }
            statement = null;
        }
        connectionPool.releaseEntry(connection);

    }

    return true;
    }
}

