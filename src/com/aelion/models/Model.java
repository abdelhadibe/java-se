package com.aelion.models;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.aelion.models.annotations.Column;
import com.aelion.models.annotations.Table;

public abstract class Model {
	protected String tableName;
	protected ArrayList<String> columns;
	private String sqlStatement;
	
	public Model() {
		this.tableName = this._tableName();
		System.out.println("This class maps to " + tableName + " table in the database");
		this.columns = this._getSQLColumns();		
	}
	
	public String select() {
		sqlStatement = "SELECT ";
		
		this.columns.forEach((column) -> {
			sqlStatement += column + ",";
		});
		
		// Suppress the last coma
		sqlStatement = sqlStatement.substring(0, sqlStatement.length() - 1);
		
		sqlStatement += " FROM " + tableName + ";";
		
		return sqlStatement;
	}
	
	/**
	 * Read self Table annotation to get the name attribute (aka table name)
	 * @return
	 */
	private String _tableName() {
		// Get the class definition of this class (Actor)
		Class<? extends Model> myself = this.getClass();
		
		// Get the Table annotation (Table is an annotation interface)
		Table table = myself.getAnnotation(Table.class);
		
		if (table != null) {
			// Use the name() method defined in the annotation Table
			return table.name();
		}
		return null;
	}
	
	private ArrayList<String> _getSQLColumns() {
		ArrayList<String> columns = new ArrayList<String>();
		
		// Get the class definition of this class (Actor)
		Class<? extends Model> myself = this.getClass();
		
		// List all properties of this class
		Field[] allProperties = myself.getDeclaredFields();
		
		// Debug purpose
		for (int i = 0; i < allProperties.length; i++) {
			Field field = allProperties[i];
			Column sqlColumn = field.getAnnotation(Column.class);
			if (sqlColumn != null) {
				String sqlColumnName = sqlColumn.name();
				columns.add(sqlColumnName);
				System.out.println("Reading field " + field.getName() + " annoted as " + sqlColumnName);
			}
		}
		return columns;
	}

	public abstract void hydrate(ResultSet res);
}
