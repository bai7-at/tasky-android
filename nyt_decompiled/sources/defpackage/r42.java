package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.nytimes.android.eventtracker.model.Event;
import com.nytimes.android.eventtracker.model.Session;
import com.nytimes.android.eventtracker.model.Timestamp;
import com.nytimes.android.eventtracker.validator.Validator;
import defpackage.k42;
import io.reactivex.subjects.ReplaySubject;
import io.reactivex.subjects.Subject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class r42 implements k42.a {
    public static final a Companion = new a(null);
    private final Handler a = new Handler(Looper.getMainLooper());
    private final ArrayList b = new ArrayList();
    private final Subject c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static abstract class b {
        private final Timestamp a;

        public static final class a extends b {
            private final md0 b;
            private final boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Timestamp timestamp, md0 md0Var, boolean z) {
                super(timestamp, null);
                zq3.h(timestamp, "timestamp");
                zq3.h(md0Var, "event");
                this.b = md0Var;
                this.c = z;
            }

            public final md0 b() {
                return this.b;
            }
        }

        /* renamed from: r42$b$b, reason: collision with other inner class name */
        public static final class C0519b extends b {
            private final int b;

            public /* synthetic */ C0519b(Timestamp timestamp, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(timestamp, (i2 & 2) != 0 ? 0 : i);
            }

            public final int b() {
                return this.b;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0519b(Timestamp timestamp, int i) {
                super(timestamp, null);
                zq3.h(timestamp, "timestamp");
                this.b = i;
            }
        }

        public static final class c extends b {
            private final Event b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Timestamp timestamp, Event event) {
                super(timestamp, null);
                zq3.h(timestamp, "timestamp");
                zq3.h(event, "event");
                this.b = event;
            }

            public final Event b() {
                return this.b;
            }
        }

        public static final class d extends b {
            private final Session b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Timestamp timestamp, Session session) {
                super(timestamp, null);
                zq3.h(timestamp, "timestamp");
                zq3.h(session, "session");
                this.b = session;
            }
        }

        public static final class e extends b {
            private final List b;
            private final boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Timestamp timestamp, List list, boolean z) {
                super(timestamp, null);
                zq3.h(timestamp, "timestamp");
                zq3.h(list, "uploaded");
                this.b = list;
                this.c = z;
            }

            public final boolean b() {
                return this.c;
            }

            public final List c() {
                return this.b;
            }
        }

        public static final class f extends b {
            private final Event b;
            private final Validator.Result c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Timestamp timestamp, Event event, Validator.Result result) {
                super(timestamp, null);
                zq3.h(timestamp, "timestamp");
                zq3.h(event, "event");
                zq3.h(result, "result");
                this.b = event;
                this.c = result;
            }

            public final Event b() {
                return this.b;
            }

            public final Validator.Result c() {
                return this.c;
            }
        }

        public /* synthetic */ b(Timestamp timestamp, DefaultConstructorMarker defaultConstructorMarker) {
            this(timestamp);
        }

        public final Timestamp a() {
            return this.a;
        }

        private b(Timestamp timestamp) {
            this.a = timestamp;
        }
    }

    public interface c {
        void a(b bVar);
    }

    public r42() {
        Subject<T> serialized = ReplaySubject.createWithSize(250).toSerialized();
        zq3.g(serialized, "toSerialized(...)");
        this.c = serialized;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(r42 r42Var, b.a aVar) {
        zq3.h(r42Var, "this$0");
        zq3.h(aVar, "$this_with");
        Iterator it2 = r42Var.b.iterator();
        while (it2.hasNext()) {
            ((c) it2.next()).a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(r42 r42Var, b.f fVar) {
        zq3.h(r42Var, "this$0");
        zq3.h(fVar, "$this_with");
        Iterator it2 = r42Var.b.iterator();
        while (it2.hasNext()) {
            ((c) it2.next()).a(fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(r42 r42Var, b.e eVar) {
        zq3.h(r42Var, "this$0");
        zq3.h(eVar, "$this_with");
        Iterator it2 = r42Var.b.iterator();
        while (it2.hasNext()) {
            ((c) it2.next()).a(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(r42 r42Var, b.C0519b c0519b) {
        zq3.h(r42Var, "this$0");
        zq3.h(c0519b, "$this_with");
        Iterator it2 = r42Var.b.iterator();
        while (it2.hasNext()) {
            ((c) it2.next()).a(c0519b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(r42 r42Var, b.c cVar) {
        zq3.h(r42Var, "this$0");
        zq3.h(cVar, "$this_with");
        Iterator it2 = r42Var.b.iterator();
        while (it2.hasNext()) {
            ((c) it2.next()).a(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(r42 r42Var, b.d dVar) {
        zq3.h(r42Var, "this$0");
        zq3.h(dVar, "$this_with");
        Iterator it2 = r42Var.b.iterator();
        while (it2.hasNext()) {
            ((c) it2.next()).a(dVar);
        }
    }

    @Override // k42.a
    public void a(Timestamp timestamp, md0 md0Var, boolean z) {
        zq3.h(timestamp, "timestamp");
        zq3.h(md0Var, "event");
        final b.a aVar = new b.a(timestamp, md0Var, z);
        this.c.onNext(aVar);
        this.a.post(new Runnable() { // from class: o42
            @Override // java.lang.Runnable
            public final void run() {
                r42.n(r42.this, aVar);
            }
        });
    }

    @Override // k42.a
    public void b(Timestamp timestamp, Event event) {
        zq3.h(timestamp, "timestamp");
        zq3.h(event, "event");
        final b.c cVar = new b.c(timestamp, event);
        this.c.onNext(cVar);
        this.a.post(new Runnable() { // from class: n42
            @Override // java.lang.Runnable
            public final void run() {
                r42.r(r42.this, cVar);
            }
        });
    }

    @Override // k42.a
    public void c(Timestamp timestamp, Event event, Validator.Result result) {
        zq3.h(timestamp, "timestamp");
        zq3.h(event, "event");
        zq3.h(result, "result");
        final b.f fVar = new b.f(timestamp, event, result);
        this.c.onNext(fVar);
        this.a.post(new Runnable() { // from class: m42
            @Override // java.lang.Runnable
            public final void run() {
                r42.o(r42.this, fVar);
            }
        });
    }

    @Override // k42.a
    public void d(Timestamp timestamp, int i) {
        zq3.h(timestamp, "timestamp");
        ul8.a.z("ET2").u("EventMilestone.onFlushEvents(Timestamp, Int) no longer supported.", new Object[0]);
    }

    @Override // k42.a
    public void e(Timestamp timestamp, List list, boolean z) {
        zq3.h(timestamp, "timestamp");
        zq3.h(list, "uploaded");
        final b.e eVar = new b.e(timestamp, list, z);
        this.c.onNext(eVar);
        this.a.post(new Runnable() { // from class: q42
            @Override // java.lang.Runnable
            public final void run() {
                r42.p(r42.this, eVar);
            }
        });
    }

    @Override // k42.a
    public void f(Timestamp timestamp) {
        zq3.h(timestamp, "timestamp");
        final b.C0519b c0519b = new b.C0519b(timestamp, 0, 2, null);
        this.c.onNext(c0519b);
        this.a.post(new Runnable() { // from class: l42
            @Override // java.lang.Runnable
            public final void run() {
                r42.q(r42.this, c0519b);
            }
        });
    }

    @Override // k42.a
    public void g(Timestamp timestamp, Session session) {
        zq3.h(timestamp, "timestamp");
        zq3.h(session, "session");
        final b.d dVar = new b.d(timestamp, session);
        this.c.onNext(dVar);
        this.a.post(new Runnable() { // from class: p42
            @Override // java.lang.Runnable
            public final void run() {
                r42.s(r42.this, dVar);
            }
        });
    }

    public final void t(c cVar) {
        zq3.h(cVar, "callback");
        this.b.add(cVar);
    }
}
