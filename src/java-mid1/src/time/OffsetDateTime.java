package time;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class OffsetDateTime {
    private final LocalDateTime dateTime;
    private final ZoneOffset offset;

    public OffsetDateTime(LocalDateTime dateTime, ZoneOffset offset) {
        this.dateTime = dateTime;
        this.offset = offset;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public ZoneOffset getOffset() {
        return offset;
    }
}
