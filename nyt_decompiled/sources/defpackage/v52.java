package defpackage;

import com.nytimes.android.eventtracker.model.Event;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;

/* loaded from: classes4.dex */
public final class v52 {
    private final JsonAdapter a = new i.b().d().c(Event.class).serializeNulls();

    public final String a(Event event) {
        zq3.h(event, "event");
        return this.a.toJson(event);
    }

    public final Event b(String str) {
        zq3.h(str, "jsonString");
        return (Event) this.a.fromJson(str);
    }
}
