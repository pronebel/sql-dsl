package com.thoughtworks.sql;

import static com.thoughtworks.sql.Field.field;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FieldTest {

    @Test
    public void should_return_true_if_field_has_alias_name() {
        Field field = field("ss");
        assertFalse(field.hasAlias());
        field.as("s");
        assertTrue(field.hasAlias());
    }

}