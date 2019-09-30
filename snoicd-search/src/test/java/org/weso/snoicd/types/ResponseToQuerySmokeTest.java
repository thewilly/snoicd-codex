package org.weso.snoicd.types;

import TestKit.SmokeTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import pl.pojo.tester.api.assertion.Method;

import static org.junit.Assert.assertTrue;
import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

@Category(SmokeTest.class)
public class ResponseToQuerySmokeTest {

    @Test
    public void allPropertiesTest() {
        assertPojoMethodsFor(ResponseToQuery.class).testing(
                Method.GETTER,
                Method.SETTER,
                Method.EQUALS,
                Method.HASH_CODE,
                Method.TO_STRING,
                Method.CONSTRUCTOR).areWellImplemented();
    }

    @Test
    public void canEqualsTest() {
        ResponseToQuery rtq1 = new ResponseToQuery();
        ResponseToQuery rtq2 = new ResponseToQuery();

        assertTrue(rtq1.canEqual(rtq2));
    }
}
