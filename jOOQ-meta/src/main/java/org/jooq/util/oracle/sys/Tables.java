/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys;


import javax.annotation.Generated;

import org.jooq.util.oracle.sys.tables.AllArguments;
import org.jooq.util.oracle.sys.tables.AllColComments;
import org.jooq.util.oracle.sys.tables.AllCollTypes;
import org.jooq.util.oracle.sys.tables.AllConsColumns;
import org.jooq.util.oracle.sys.tables.AllConstraints;
import org.jooq.util.oracle.sys.tables.AllIdentifiers;
import org.jooq.util.oracle.sys.tables.AllMviewComments;
import org.jooq.util.oracle.sys.tables.AllObjects;
import org.jooq.util.oracle.sys.tables.AllProcedures;
import org.jooq.util.oracle.sys.tables.AllQueueTables;
import org.jooq.util.oracle.sys.tables.AllQueues;
import org.jooq.util.oracle.sys.tables.AllSequences;
import org.jooq.util.oracle.sys.tables.AllSynonyms;
import org.jooq.util.oracle.sys.tables.AllTabCols;
import org.jooq.util.oracle.sys.tables.AllTabComments;
import org.jooq.util.oracle.sys.tables.AllTypeAttrs;
import org.jooq.util.oracle.sys.tables.AllTypes;
import org.jooq.util.oracle.sys.tables.AllUsers;


/**
 * Convenience access to all tables in SYS
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * Arguments in object accessible to the user
	 */
	public static final AllArguments ALL_ARGUMENTS = org.jooq.util.oracle.sys.tables.AllArguments.ALL_ARGUMENTS;

	/**
	 * Comments on columns of accessible tables and views
	 */
	public static final AllColComments ALL_COL_COMMENTS = org.jooq.util.oracle.sys.tables.AllColComments.ALL_COL_COMMENTS;

	/**
	 * Description of named collection types accessible to the user
	 */
	public static final AllCollTypes ALL_COLL_TYPES = org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES;

	/**
	 * Information about accessible columns in constraint definitions
	 */
	public static final AllConsColumns ALL_CONS_COLUMNS = org.jooq.util.oracle.sys.tables.AllConsColumns.ALL_CONS_COLUMNS;

	/**
	 * Constraint definitions on accessible tables
	 */
	public static final AllConstraints ALL_CONSTRAINTS = org.jooq.util.oracle.sys.tables.AllConstraints.ALL_CONSTRAINTS;

	/**
	 * All identifiers in stored objects accessible to the user
	 */
	public static final AllIdentifiers ALL_IDENTIFIERS = org.jooq.util.oracle.sys.tables.AllIdentifiers.ALL_IDENTIFIERS;

	/**
	 * Comments on materialized views accessible to the user
	 */
	public static final AllMviewComments ALL_MVIEW_COMMENTS = org.jooq.util.oracle.sys.tables.AllMviewComments.ALL_MVIEW_COMMENTS;

	/**
	 * Objects accessible to the user
	 */
	public static final AllObjects ALL_OBJECTS = org.jooq.util.oracle.sys.tables.AllObjects.ALL_OBJECTS;

	/**
	 * Functions/procedures/packages/types/triggers available to the user
	 */
	public static final AllProcedures ALL_PROCEDURES = org.jooq.util.oracle.sys.tables.AllProcedures.ALL_PROCEDURES;

	/**
	 * All queues accessible to the user
	 */
	public static final AllQueues ALL_QUEUES = org.jooq.util.oracle.sys.tables.AllQueues.ALL_QUEUES;

	/**
	 * All queue tables accessible to the user
	 */
	public static final AllQueueTables ALL_QUEUE_TABLES = org.jooq.util.oracle.sys.tables.AllQueueTables.ALL_QUEUE_TABLES;

	/**
	 * Description of SEQUENCEs accessible to the user
	 */
	public static final AllSequences ALL_SEQUENCES = org.jooq.util.oracle.sys.tables.AllSequences.ALL_SEQUENCES;

	/**
	 * All synonyms for base objects accessible to the user and session
	 */
	public static final AllSynonyms ALL_SYNONYMS = org.jooq.util.oracle.sys.tables.AllSynonyms.ALL_SYNONYMS;

	/**
	 * Columns of user's tables, views and clusters
	 */
	public static final AllTabCols ALL_TAB_COLS = org.jooq.util.oracle.sys.tables.AllTabCols.ALL_TAB_COLS;

	/**
	 * Comments on tables and views accessible to the user
	 */
	public static final AllTabComments ALL_TAB_COMMENTS = org.jooq.util.oracle.sys.tables.AllTabComments.ALL_TAB_COMMENTS;

	/**
	 * Description of attributes of types accessible to the user
	 */
	public static final AllTypeAttrs ALL_TYPE_ATTRS = org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS;

	/**
	 * Description of types accessible to the user
	 */
	public static final AllTypes ALL_TYPES = org.jooq.util.oracle.sys.tables.AllTypes.ALL_TYPES;

	/**
	 * Information about all users of the database
	 */
	public static final AllUsers ALL_USERS = org.jooq.util.oracle.sys.tables.AllUsers.ALL_USERS;
}
