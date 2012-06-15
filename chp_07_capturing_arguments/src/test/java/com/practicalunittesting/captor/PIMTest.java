package com.practicalunittesting.captor;

import com.practicalunittesting.Calendar;
import com.practicalunittesting.Meeting;
import com.practicalunittesting.PIM;
import org.mockito.ArgumentCaptor;
import org.testng.annotations.Test;

import java.util.Date;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.testng.Assert.assertEquals;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class PIMTest {

    private static final int ONE_HOUR = 60;
    private static final Date START_DATE = new Date();
    private static final int MILLIS_IN_MINUTE = 1000 * 60;
    private static final Date END_DATE = new Date(START_DATE.getTime() + ONE_HOUR * MILLIS_IN_MINUTE);

    @Test
    public void shouldAddNewEventToCalendar() {
        Calendar calendar = mock(Calendar.class);
        PIM pim = new PIM(calendar);
        ArgumentCaptor<Meeting> argument = ArgumentCaptor.forClass(Meeting.class);

        pim.addMeeting(START_DATE, ONE_HOUR);

        verify(calendar).addEvent(argument.capture());
        Meeting meeting = argument.getValue();
        assertEquals(meeting.getStartDate(), START_DATE);
        assertEquals(meeting.getEndDate(), END_DATE);
    }
}
