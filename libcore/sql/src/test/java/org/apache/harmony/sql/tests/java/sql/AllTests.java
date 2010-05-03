/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.harmony.sql.tests.java.sql;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * This is autogenerated source file. Includes tests for package org.apache.harmony.sql.tests.java.sql;
 */

public class AllTests {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(AllTests.suite());
    }

    public static Test suite() {
        TestSuite suite = tests.TestSuiteFactory.createTestSuite("All tests for package org.apache.harmony.sql.tests.java.sql;");
        // $JUnit-BEGIN$

        suite.addTestSuite(BatchUpdateExceptionTest.class);
        suite.addTestSuite(ConnectionTest.class);
        suite.addTestSuite(DataTruncationTest.class);
        suite.addTestSuite(DatabaseMetaDataTest.class);
        suite.addTestSuite(DateTest.class);
        suite.addTestSuite(DriverManagerTest.class);
        suite.addTestSuite(DriverPropertyInfoTest.class);
        suite.addTestSuite(ParameterMetaDataTest.class);
        suite.addTestSuite(ResultSetMetaDataTest.class);
        suite.addTestSuite(ResultSetTest.class);
        suite.addTestSuite(SQLExceptionTest.class);
        suite.addTestSuite(SQLPermissionTest.class);
        suite.addTestSuite(SQLWarningTest.class);
        suite.addTestSuite(StatementTest.class);
        suite.addTestSuite(TimeTest.class);
        suite.addTestSuite(TimestampTest.class);
        suite.addTestSuite(TypesTest.class);

        // $JUnit-END$
        return suite;
    }
}