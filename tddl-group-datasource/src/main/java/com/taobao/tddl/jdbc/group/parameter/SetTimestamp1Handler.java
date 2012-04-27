/*(C) 2007-2012 Alibaba Group Holding Limited.	

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class SetTimestamp1Handler implements ParameterHandler {
	public void setParameter(PreparedStatement stmt, Object[] args)
			throws SQLException {
		stmt.setTimestamp((Integer) args[0], (Timestamp) args[1]);
	}
}