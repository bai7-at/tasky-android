package defpackage;

import com.nytimes.android.eventtracker.model.Event;
import com.nytimes.android.eventtracker.model.Session;
import com.nytimes.android.eventtracker.model.Timestamp;
import com.nytimes.android.eventtracker.validator.Validator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class k42 {
    public static final k42 a = new k42();
    private static List b = new ArrayList();

    public interface a {
        void a(Timestamp timestamp, md0 md0Var, boolean z);

        void b(Timestamp timestamp, Event event);

        void c(Timestamp timestamp, Event event, Validator.Result result);

        void d(Timestamp timestamp, int i);

        void e(Timestamp timestamp, List list, boolean z);

        void f(Timestamp timestamp);

        void g(Timestamp timestamp, Session session);
    }

    private k42() {
    }

    public final void a(a... aVarArr) {
        zq3.h(aVarArr, "callback");
        b = i.F0(b, d.C0(aVarArr));
    }

    public final void b(Timestamp timestamp, md0 md0Var, boolean z) {
        zq3.h(timestamp, "timestamp");
        zq3.h(md0Var, "message");
        Iterator it2 = b.iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).a(timestamp, md0Var, z);
        }
    }

    public final void c(Timestamp timestamp, Event event, Validator.Result result) {
        zq3.h(timestamp, "timestamp");
        zq3.h(event, "message");
        zq3.h(result, "result");
        Iterator it2 = b.iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).c(timestamp, event, result);
        }
    }

    public final void d(Timestamp timestamp, List list, boolean z) {
        zq3.h(timestamp, "timestamp");
        zq3.h(list, "uploaded");
        Iterator it2 = b.iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).e(timestamp, list, z);
        }
    }

    public final void e(Timestamp timestamp) {
        zq3.h(timestamp, "timestamp");
        Iterator it2 = b.iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).f(timestamp);
        }
        f(timestamp, 0);
    }

    public final void f(Timestamp timestamp, int i) {
        zq3.h(timestamp, "timestamp");
        Iterator it2 = b.iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).d(timestamp, i);
        }
    }

    public final void g(Timestamp timestamp, Event event) {
        zq3.h(timestamp, "timestamp");
        zq3.h(event, "message");
        Iterator it2 = b.iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).b(timestamp, event);
        }
    }

    public final void h(Timestamp timestamp, Session session) {
        zq3.h(timestamp, "timestamp");
        zq3.h(session, "session");
        Iterator it2 = b.iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).g(timestamp, session);
        }
    }

    public final void i() {
        b = i.l();
    }

    public final void j(a aVar) {
        zq3.h(aVar, "callback");
        List list = b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!zq3.c((a) obj, aVar)) {
                arrayList.add(obj);
            }
        }
        b = arrayList;
    }
}
