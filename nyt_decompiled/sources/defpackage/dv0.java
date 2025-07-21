package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class dv0 {
    private final rg8 a;
    private final Context b;
    private final Object c;
    private final LinkedHashSet d;
    private Object e;

    protected dv0(Context context, rg8 rg8Var) {
        zq3.h(context, "context");
        zq3.h(rg8Var, "taskExecutor");
        this.a = rg8Var;
        Context applicationContext = context.getApplicationContext();
        zq3.g(applicationContext, "context.applicationContext");
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(List list, dv0 dv0Var) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((av0) it2.next()).a(dv0Var.e);
        }
    }

    public final void c(av0 av0Var) {
        String str;
        zq3.h(av0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.c) {
            try {
                if (this.d.add(av0Var)) {
                    if (this.d.size() == 1) {
                        this.e = e();
                        h94 e = h94.e();
                        str = ev0.a;
                        e.a(str, getClass().getSimpleName() + ": initial state = " + this.e);
                        h();
                    }
                    av0Var.a(this.e);
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final Context d() {
        return this.b;
    }

    public abstract Object e();

    public final void f(av0 av0Var) {
        zq3.h(av0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.c) {
            try {
                if (this.d.remove(av0Var) && this.d.isEmpty()) {
                    i();
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 == null || !zq3.c(obj2, obj)) {
                this.e = obj;
                final List X0 = i.X0(this.d);
                this.a.a().execute(new Runnable() { // from class: cv0
                    @Override // java.lang.Runnable
                    public final void run() {
                        dv0.b(X0, this);
                    }
                });
                ww8 ww8Var = ww8.a;
            }
        }
    }

    public abstract void h();

    public abstract void i();
}
