package defpackage;

import com.nytimes.android.logging.remote.stream.data.JsonObjectAdapter;
import com.nytimes.android.logging.remote.stream.eventtracker.EventTrackerRemoteStreamMessage;
import com.nytimes.android.logging.remote.stream.eventtracker.EventTrackerRemoteStreamMessageKind;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import defpackage.r42;

/* loaded from: classes4.dex */
public final class l52 {
    private final String a;
    private final String b;
    private final String c;
    private final i d;
    private JsonAdapter e;

    public l52(String str, String str2, String str3) {
        zq3.h(str3, "sessionId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        i d = new i.b().b(new JsonObjectAdapter()).d();
        this.d = d;
        this.e = d.c(EventTrackerRemoteStreamMessage.class);
    }

    private final EventTrackerRemoteStreamMessage b(r42.b bVar) {
        if (!(bVar instanceof r42.b.c)) {
            return null;
        }
        return new EventTrackerRemoteStreamMessage(this.c, this.a, null, this.b, new EventTrackerRemoteStreamMessageKind(((r42.b.c) bVar).b(), null, 2, null), null, 36, null);
    }

    public final String a(r42.b bVar) {
        zq3.h(bVar, "milestone");
        EventTrackerRemoteStreamMessage b = b(bVar);
        if (b != null) {
            return this.e.toJson(b);
        }
        return null;
    }
}
