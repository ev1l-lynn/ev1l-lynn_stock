package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import domain.Customer;
import domain.CustomerException;

public class CustomersRepository {
	private final static String SQL_SELECT_ALL = 
			"SELECT	CUSTOMER_ID,\n" +
			"		EMAIL,\n" +
			"		FIRSTNAME,\n" +
			"		LASTNAME,\n" +
			"		GENDER,\n" +
			"		BIRTHDATE,\n" +
			"		CREDITS,\n" +
			"FROM	CUSTOMER";
	private PreparedStatement selectAllStatement;
	
	public List<Customer> selectAll (Connection con) throws CustomerException {
		try {
			if (selectAllStatement  == null) {
				selectAllStatement = con.prepareStatement(SQL_SELECT_ALL);
			}
			ResultSet resultSet = selectAllStatement.executeQuery();
			if (resultSet != null) {
				List<Customer> customers = new ArrayList<>();
				while (resultSet.next()) {
					Long customerId = resultSet.getLong(1);
					String email = resultSet.getString(2);
					String firstname = resultSet.getString(3);
					String lastname = resultSet.getString(4);
					String gender = resultSet.getString(5);
					Date birthdate = resultSet.getDate(6);
					Double credits = resultSet.getDouble(7);
					customers.add(new Customer(customerId, email, firstname, lastname, gender, birthdate, credits));
				}
				return customers;
			}
			else {
				throw new CustomerException("Could not read data from database!");
				
			}
		}
		catch (SQLException e) {
			throw new CustomerException("Could not execute SQL statement!");
		}
	}
			}
