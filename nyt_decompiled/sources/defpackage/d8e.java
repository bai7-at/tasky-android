package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class d8e {
    private final Context a;
    private final Executor b;
    private final jgb c;
    private final v7e d;

    d8e(Context context, Executor executor, jgb jgbVar, v7e v7eVar) {
        this.a = context;
        this.b = executor;
        this.c = jgbVar;
        this.d = v7eVar;
    }

    final /* synthetic */ void a(String str) {
        this.c.a(str);
    }

    final /* synthetic */ void b(String str, q7e q7eVar) {
        f7e a = e7e.a(this.a, 14);
        a.zzh();
        a.S(this.c.a(str));
        if (q7eVar == null) {
            this.d.b(a.zzl());
        } else {
            q7eVar.a(a);
            q7eVar.g();
        }
    }

    public final void c(final String str, final q7e q7eVar) {
        if (v7e.a() && ((Boolean) jra.d.e()).booleanValue()) {
            this.b.execute(new Runnable() { // from class: c8e
                @Override // java.lang.Runnable
                public final void run() {
                    d8e.this.b(str, q7eVar);
                }
            });
        } else {
            this.b.execute(new Runnable() { // from class: b8e
                @Override // java.lang.Runnable
                public final void run() {
                    d8e.this.a(str);
                }
            });
        }
    }

    public final void d(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            c((String) it2.next(), null);
        }
    }
}
