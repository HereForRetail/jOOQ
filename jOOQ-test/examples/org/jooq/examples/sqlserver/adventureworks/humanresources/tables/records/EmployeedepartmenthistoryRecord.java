/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "EmployeeDepartmentHistory", schema = "HumanResources", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"EmployeeID", "StartDate", "DepartmentID", "ShiftID"})
})
public class EmployeedepartmenthistoryRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeedepartmenthistoryRecord> {

	private static final long serialVersionUID = 2134684220;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [HumanResources.EmployeeDepartmentHistory.EmployeeID]
	 * REFERENCES Employee [HumanResources.Employee.EmployeeID]
	 * </pre></code>
	 */
	public void setEmployeeid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY.EMPLOYEEID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [HumanResources.EmployeeDepartmentHistory.EmployeeID]
	 * REFERENCES Employee [HumanResources.Employee.EmployeeID]
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "EmployeeID")
	public java.lang.Integer getEmployeeid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY.EMPLOYEEID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [HumanResources.EmployeeDepartmentHistory.DepartmentID]
	 * REFERENCES Department [HumanResources.Department.DepartmentID]
	 * </pre></code>
	 */
	public void setDepartmentid(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY.DEPARTMENTID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [HumanResources.EmployeeDepartmentHistory.DepartmentID]
	 * REFERENCES Department [HumanResources.Department.DepartmentID]
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "DepartmentID")
	public java.lang.Short getDepartmentid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY.DEPARTMENTID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [HumanResources.EmployeeDepartmentHistory.ShiftID]
	 * REFERENCES Shift [HumanResources.Shift.ShiftID]
	 * </pre></code>
	 */
	public void setShiftid(java.lang.Byte value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY.SHIFTID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [HumanResources.EmployeeDepartmentHistory.ShiftID]
	 * REFERENCES Shift [HumanResources.Shift.ShiftID]
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ShiftID")
	public java.lang.Byte getShiftid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY.SHIFTID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setStartdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY.STARTDATE, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Column(name = "StartDate")
	public java.sql.Timestamp getStartdate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY.STARTDATE);
	}

	/**
	 * An uncommented item
	 */
	public void setEnddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY.ENDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "EndDate")
	public java.sql.Timestamp getEnddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY.ENDDATE);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY.MODIFIEDDATE);
	}

	/**
	 * Create a detached EmployeedepartmenthistoryRecord
	 */
	public EmployeedepartmenthistoryRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeedepartmenthistory.EMPLOYEEDEPARTMENTHISTORY);
	}
}
