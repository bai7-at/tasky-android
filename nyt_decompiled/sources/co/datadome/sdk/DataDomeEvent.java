package co.datadome.sdk;

import androidx.annotation.Keep;
import java.util.Date;
import java.util.Locale;

@Keep
/* loaded from: classes.dex */
public class DataDomeEvent {
    private final long date = new Date().getTime();
    private final int id;
    private final String message;
    private final String source;

    public DataDomeEvent(int i, String str, String str2) {
        this.id = i;
        this.message = str;
        this.source = str2;
    }

    public String customJsonString() {
        return String.format(Locale.getDefault(), "{\"id\":%d, \"message\":\"%s\", \"source\":\"%s\", \"date\":%d}", Integer.valueOf(this.id), this.message, this.source, Long.valueOf(this.date));
    }
}
