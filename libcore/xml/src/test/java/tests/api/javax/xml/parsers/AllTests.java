/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tests.api.javax.xml.parsers;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.apache.harmony.xml.ExpatParserTest;

/**
 * This is autogenerated source file. Includes tests for package tests.api.javax.xml.parsers;
 */

public class AllTests {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(AllTests.suite());
    }

    public static Test suite() {
        TestSuite suite = new TestSuite("All tests for package tests.api.javax.xml.parsers;");
        // $JUnit-BEGIN$

// Has one failing test due to coalescing not being supported.
        suite.addTestSuite(DocumentBuilderFactoryTest.class);
// Has one failing test due to limitation (input must be file or stream).
        suite.addTestSuite(DocumentBuilderTest.class);
        suite.addTestSuite(FactoryConfigurationErrorTest.class);
        suite.addTestSuite(ParserConfigurationExceptionTest.class);
        suite.addTestSuite(SAXParserFactoryTest.class);
// Has a couple of failures due to limitations of the XmlPull SAX wrapper.          
        suite.addTestSuite(SAXParserTest.class);
        suite.addTestSuite(ExpatParserTest.class);

        // $JUnit-END$
        return suite;
    }
}