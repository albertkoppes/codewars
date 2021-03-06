package codewars2020;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HumanReadableTimeTest
{
    @Test
    void Tests() {
        assertEquals("00:00:05", HumanReadableTime.makeReadable(5), "makeReadable(5)");
        assertEquals( "00:01:00", HumanReadableTime.makeReadable(60), "makeReadable(60)");
        assertEquals( "23:59:59", HumanReadableTime.makeReadable(86399), "makeReadable(86399)");
        assertEquals( "99:59:59", HumanReadableTime.makeReadable(359999), "makeReadable(359999)");
    }

}