package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.oc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class pc implements oc {
    private static volatile oc c;
    final qm a;
    final Map b;

    class a implements oc.a {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }
    }

    pc(qm qmVar) {
        Preconditions.checkNotNull(qmVar);
        this.a = qmVar;
        this.b = new ConcurrentHashMap();
    }

    public static oc h(uh2 uh2Var, Context context, xa8 xa8Var) {
        Preconditions.checkNotNull(uh2Var);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(xa8Var);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (c == null) {
            synchronized (pc.class) {
                try {
                    if (c == null) {
                        Bundle bundle = new Bundle(1);
                        if (uh2Var.t()) {
                            xa8Var.a(e91.class, new Executor() { // from class: gq9
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new a42() { // from class: bla
                                @Override // defpackage.a42
                                public final void a(c32 c32Var) {
                                    pc.i(c32Var);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", uh2Var.s());
                        }
                        c = new pc(j4d.v(context, null, null, null, bundle).s());
                    }
                } finally {
                }
            }
        }
        return c;
    }

    static /* synthetic */ void i(c32 c32Var) {
        throw null;
    }

    private final boolean j(String str) {
        return (str.isEmpty() || !this.b.containsKey(str) || this.b.get(str) == null) ? false : true;
    }

    @Override // defpackage.oc
    public void a(oc.c cVar) {
        if (cbb.f(cVar)) {
            this.a.r(cbb.a(cVar));
        }
    }

    @Override // defpackage.oc
    public void b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (cbb.i(str) && cbb.g(str2, bundle) && cbb.e(str, str2, bundle)) {
            cbb.d(str, str2, bundle);
            this.a.n(str, str2, bundle);
        }
    }

    @Override // defpackage.oc
    public void c(String str, String str2, Object obj) {
        if (cbb.i(str) && cbb.j(str, str2)) {
            this.a.u(str, str2, obj);
        }
    }

    @Override // defpackage.oc
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || cbb.g(str2, bundle)) {
            this.a.b(str, str2, bundle);
        }
    }

    @Override // defpackage.oc
    public Map d(boolean z) {
        return this.a.m(null, null, z);
    }

    @Override // defpackage.oc
    public oc.a e(String str, oc.b bVar) {
        Preconditions.checkNotNull(bVar);
        if (!cbb.i(str) || j(str)) {
            return null;
        }
        qm qmVar = this.a;
        Object nzcVar = "fiam".equals(str) ? new nzc(qmVar, bVar) : ("crash".equals(str) || "clx".equals(str)) ? new die(qmVar, bVar) : null;
        if (nzcVar == null) {
            return null;
        }
        this.b.put(str, nzcVar);
        return new a(str);
    }

    @Override // defpackage.oc
    public int f(String str) {
        return this.a.l(str);
    }

    @Override // defpackage.oc
    public List g(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = this.a.g(str, str2).iterator();
        while (it2.hasNext()) {
            arrayList.add(cbb.b((Bundle) it2.next()));
        }
        return arrayList;
    }
}
