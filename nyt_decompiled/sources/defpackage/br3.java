package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class br3 {
    private final ss2 a;
    private final qs2 b;
    private final ReentrantLock c;
    private final List d;
    private boolean e;

    public br3(ss2 ss2Var, qs2 qs2Var) {
        zq3.h(ss2Var, "callbackInvoker");
        this.a = ss2Var;
        this.b = qs2Var;
        this.c = new ReentrantLock();
        this.d = new ArrayList();
    }

    public final int a() {
        return this.d.size();
    }

    public final boolean b() {
        return this.e;
    }

    public final boolean c() {
        if (this.e) {
            return false;
        }
        ReentrantLock reentrantLock = this.c;
        try {
            reentrantLock.lock();
            if (this.e) {
                return false;
            }
            this.e = true;
            List X0 = i.X0(this.d);
            this.d.clear();
            reentrantLock.unlock();
            ss2 ss2Var = this.a;
            Iterator it2 = X0.iterator();
            while (it2.hasNext()) {
                ss2Var.invoke(it2.next());
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(Object obj) {
        qs2 qs2Var = this.b;
        boolean z = true;
        if (qs2Var != null && ((Boolean) qs2Var.mo865invoke()).booleanValue()) {
            c();
        }
        if (this.e) {
            this.a.invoke(obj);
            return;
        }
        ReentrantLock reentrantLock = this.c;
        try {
            reentrantLock.lock();
            if (!this.e) {
                this.d.add(obj);
                z = false;
            }
            if (z) {
                this.a.invoke(obj);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(Object obj) {
        ReentrantLock reentrantLock = this.c;
        try {
            reentrantLock.lock();
            this.d.remove(obj);
        } finally {
            reentrantLock.unlock();
        }
    }

    public /* synthetic */ br3(ss2 ss2Var, qs2 qs2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ss2Var, (i & 2) != 0 ? null : qs2Var);
    }
}
