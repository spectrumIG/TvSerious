package com.spectrum.tvserious.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/** Database connection class & utilities **/

public abstract class Db {

	public String driver = "";
	public String url = null;
	public int timeout = 30;
	public Connection connection = null;
	public Statement statement = null;

	public void init(String sDriverVar, String sUrlVar) throws Exception {
		setDriver(sDriverVar);
		setUrl(sUrlVar);
		setConnection();
		setStatement();
	}

	private void setDriver(String driverLoad) {
		this.driver = driverLoad;
	}

	private void setUrl(String urlLoad) {
		this.url = urlLoad;
	}

	public void setConnection() throws Exception {
		Class.forName(driver);
		this.connection = DriverManager.getConnection(url);
	}

	public Connection getConnection() {
		return this.connection;
	}

	public void setStatement() throws Exception {
		if (this.connection == null) {
			setConnection();
		}
		this.statement = this.connection.createStatement();
		this.statement.setQueryTimeout(timeout); 
	}

	public Statement getStatement() {
		return this.statement;
	}

	public void executeStatement(String instruction) throws SQLException {
		this.statement.executeUpdate(instruction);
	}

	public void executeStatement(String[] instructionSet) throws SQLException {
		for (int i = 0; i < instructionSet.length; i++) {
			executeStatement(instructionSet[i]);
		}
	}

	public ResultSet executeQuery(String instruction) throws SQLException {
		return this.statement.executeQuery(instruction);
	}

	public void closeConnection() {
		try {
			this.connection.close();
		} catch (Exception ignore) {
		}
	}

}