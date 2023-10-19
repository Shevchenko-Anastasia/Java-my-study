package net.study.basic.lesson8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchCaseTest {

    @Test
    void resolveStatusAccepted() {
                String actualStatus = SwitchCase.resolveStatus(1);
                String exceptedStatus = "accepted";
                assertEquals(exceptedStatus, actualStatus);
    }

    @Test
    void resolveStatusRejected() {
        String actualStatus = SwitchCase.resolveStatus(2);
        String exceptedStatus = "rejected";
        assertEquals(exceptedStatus, actualStatus);
    }

    @Test
    void resolveStatusPendingAccepted() {
        String actualStatus = SwitchCase.resolveStatus(3);
        String exceptedStatus = "pending accepted";
        assertEquals(exceptedStatus, actualStatus);
    }

    @Test
    void resolveStatusProcessing4() {
        String actualStatus = SwitchCase.resolveStatus(4);
        String exceptedStatus = "processing";
        assertEquals(exceptedStatus, actualStatus);
    }

    @Test
    void resolveStatusProcessing5() {
        String actualStatus = SwitchCase.resolveStatus(5);
        String exceptedStatus = "processing";
        assertEquals(exceptedStatus, actualStatus);
    }

    @Test
    void resolveStatusUnknown() {
        String actualStatus = SwitchCase.resolveStatus(8);
        String exceptedStatus = "unknown";
        assertEquals(exceptedStatus, actualStatus);
    }

}