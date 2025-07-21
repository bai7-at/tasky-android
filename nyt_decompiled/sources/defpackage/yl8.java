package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class yl8 {
    private final i47 a;
    private final jj9 b;
    private final long c;
    private final Object d;
    private final Map e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yl8(i47 i47Var, jj9 jj9Var) {
        this(i47Var, jj9Var, 0L, 4, null);
        zq3.h(i47Var, "runnableScheduler");
        zq3.h(jj9Var, "launcher");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(yl8 yl8Var, q08 q08Var) {
        yl8Var.b.d(q08Var, 3);
    }

    public final void b(q08 q08Var) {
        Runnable runnable;
        zq3.h(q08Var, "token");
        synchronized (this.d) {
            runnable = (Runnable) this.e.remove(q08Var);
        }
        if (runnable != null) {
            this.a.a(runnable);
        }
    }

    public final void c(final q08 q08Var) {
        zq3.h(q08Var, "token");
        Runnable runnable = new Runnable() { // from class: xl8
            @Override // java.lang.Runnable
            public final void run() {
                yl8.d(yl8.this, q08Var);
            }
        };
        synchronized (this.d) {
        }
        this.a.b(this.c, runnable);
    }

    public yl8(i47 i47Var, jj9 jj9Var, long j) {
        zq3.h(i47Var, "runnableScheduler");
        zq3.h(jj9Var, "launcher");
        this.a = i47Var;
        this.b = jj9Var;
        this.c = j;
        this.d = new Object();
        this.e = new LinkedHashMap();
    }

    public /* synthetic */ yl8(i47 i47Var, jj9 jj9Var, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i47Var, jj9Var, (i & 4) != 0 ? TimeUnit.MINUTES.toMillis(90L) : j);
    }
}
