package defpackage;

import com.nytimes.android.eventtracker.model.Event;
import com.nytimes.android.eventtracker.model.Session;
import com.nytimes.android.eventtracker.model.Timestamp;
import com.nytimes.android.eventtracker.validator.Validator;
import defpackage.k42;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ju4 implements k42.a {
    @Override // k42.a
    public void a(Timestamp timestamp, md0 md0Var, boolean z) {
        zq3.h(timestamp, "timestamp");
        zq3.h(md0Var, "message");
    }

    @Override // k42.a
    public void c(Timestamp timestamp, Event event, Validator.Result result) {
        zq3.h(timestamp, "timestamp");
        zq3.h(event, "message");
        zq3.h(result, "result");
    }

    @Override // k42.a
    public void d(Timestamp timestamp, int i) {
        zq3.h(timestamp, "timestamp");
    }

    @Override // k42.a
    public void e(Timestamp timestamp, List list, boolean z) {
        zq3.h(timestamp, "timestamp");
        zq3.h(list, "uploaded");
    }

    @Override // k42.a
    public void f(Timestamp timestamp) {
        zq3.h(timestamp, "timestamp");
    }

    @Override // k42.a
    public void g(Timestamp timestamp, Session session) {
        zq3.h(timestamp, "timestamp");
        zq3.h(session, "session");
    }
}
