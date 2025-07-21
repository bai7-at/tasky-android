package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.c44;
import defpackage.d44;
import defpackage.l77;
import defpackage.ma2;
import defpackage.vn;
import defpackage.zq3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public class h extends Lifecycle {
    public static final a j = new a(null);
    private final boolean b;
    private ma2 c;
    private Lifecycle.State d;
    private final WeakReference e;
    private int f;
    private boolean g;
    private boolean h;
    private ArrayList i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Lifecycle.State a(Lifecycle.State state, Lifecycle.State state2) {
            zq3.h(state, "state1");
            return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
        }

        private a() {
        }
    }

    public static final class b {
        private Lifecycle.State a;
        private g b;

        public b(c44 c44Var, Lifecycle.State state) {
            zq3.h(state, "initialState");
            zq3.e(c44Var);
            this.b = i.f(c44Var);
            this.a = state;
        }

        public final void a(d44 d44Var, Lifecycle.Event event) {
            zq3.h(event, "event");
            Lifecycle.State targetState = event.getTargetState();
            this.a = h.j.a(this.a, targetState);
            g gVar = this.b;
            zq3.e(d44Var);
            gVar.h(d44Var, event);
            this.a = targetState;
        }

        public final Lifecycle.State b() {
            return this.a;
        }
    }

    private h(d44 d44Var, boolean z) {
        this.b = z;
        this.c = new ma2();
        this.d = Lifecycle.State.INITIALIZED;
        this.i = new ArrayList();
        this.e = new WeakReference(d44Var);
    }

    private final void e(d44 d44Var) {
        Iterator descendingIterator = this.c.descendingIterator();
        zq3.g(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.h) {
            Map.Entry entry = (Map.Entry) descendingIterator.next();
            zq3.g(entry, "next()");
            c44 c44Var = (c44) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.d) > 0 && !this.h && this.c.contains(c44Var)) {
                Lifecycle.Event a2 = Lifecycle.Event.Companion.a(bVar.b());
                if (a2 == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                m(a2.getTargetState());
                bVar.a(d44Var, a2);
                l();
            }
        }
    }

    private final Lifecycle.State f(c44 c44Var) {
        b bVar;
        Map.Entry n = this.c.n(c44Var);
        Lifecycle.State state = null;
        Lifecycle.State b2 = (n == null || (bVar = (b) n.getValue()) == null) ? null : bVar.b();
        if (!this.i.isEmpty()) {
            state = (Lifecycle.State) this.i.get(r0.size() - 1);
        }
        a aVar = j;
        return aVar.a(aVar.a(this.d, b2), state);
    }

    private final void g(String str) {
        if (!this.b || vn.g().b()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void h(d44 d44Var) {
        l77.d e = this.c.e();
        zq3.g(e, "observerMap.iteratorWithAdditions()");
        while (e.hasNext() && !this.h) {
            Map.Entry entry = (Map.Entry) e.next();
            c44 c44Var = (c44) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.d) < 0 && !this.h && this.c.contains(c44Var)) {
                m(bVar.b());
                Lifecycle.Event c = Lifecycle.Event.Companion.c(bVar.b());
                if (c == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(d44Var, c);
                l();
            }
        }
    }

    private final boolean j() {
        if (this.c.size() == 0) {
            return true;
        }
        Map.Entry a2 = this.c.a();
        zq3.e(a2);
        Lifecycle.State b2 = ((b) a2.getValue()).b();
        Map.Entry f = this.c.f();
        zq3.e(f);
        Lifecycle.State b3 = ((b) f.getValue()).b();
        return b2 == b3 && this.d == b3;
    }

    private final void k(Lifecycle.State state) {
        Lifecycle.State state2 = this.d;
        if (state2 == state) {
            return;
        }
        if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.d + " in component " + this.e.get()).toString());
        }
        this.d = state;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        o();
        this.g = false;
        if (this.d == Lifecycle.State.DESTROYED) {
            this.c = new ma2();
        }
    }

    private final void l() {
        this.i.remove(r1.size() - 1);
    }

    private final void m(Lifecycle.State state) {
        this.i.add(state);
    }

    private final void o() {
        d44 d44Var = (d44) this.e.get();
        if (d44Var == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!j()) {
            this.h = false;
            Lifecycle.State state = this.d;
            Map.Entry a2 = this.c.a();
            zq3.e(a2);
            if (state.compareTo(((b) a2.getValue()).b()) < 0) {
                e(d44Var);
            }
            Map.Entry f = this.c.f();
            if (!this.h && f != null && this.d.compareTo(((b) f.getValue()).b()) > 0) {
                h(d44Var);
            }
        }
        this.h = false;
    }

    @Override // androidx.lifecycle.Lifecycle
    public void a(c44 c44Var) {
        d44 d44Var;
        zq3.h(c44Var, "observer");
        g("addObserver");
        Lifecycle.State state = this.d;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        b bVar = new b(c44Var, state2);
        if (((b) this.c.j(c44Var, bVar)) == null && (d44Var = (d44) this.e.get()) != null) {
            boolean z = this.f != 0 || this.g;
            Lifecycle.State f = f(c44Var);
            this.f++;
            while (bVar.b().compareTo(f) < 0 && this.c.contains(c44Var)) {
                m(bVar.b());
                Lifecycle.Event c = Lifecycle.Event.Companion.c(bVar.b());
                if (c == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(d44Var, c);
                l();
                f = f(c44Var);
            }
            if (!z) {
                o();
            }
            this.f--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    public Lifecycle.State b() {
        return this.d;
    }

    @Override // androidx.lifecycle.Lifecycle
    public void d(c44 c44Var) {
        zq3.h(c44Var, "observer");
        g("removeObserver");
        this.c.k(c44Var);
    }

    public void i(Lifecycle.Event event) {
        zq3.h(event, "event");
        g("handleLifecycleEvent");
        k(event.getTargetState());
    }

    public void n(Lifecycle.State state) {
        zq3.h(state, TransferTable.COLUMN_STATE);
        g("setCurrentState");
        k(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(d44 d44Var) {
        this(d44Var, true);
        zq3.h(d44Var, "provider");
    }
}
