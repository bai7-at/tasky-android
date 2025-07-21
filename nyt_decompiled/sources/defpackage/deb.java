package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class deb {
    static deb a;

    public static synchronized deb d(Context context) {
        synchronized (deb.class) {
            try {
                deb debVar = a;
                if (debVar != null) {
                    return debVar;
                }
                Context applicationContext = context.getApplicationContext();
                mpa.a(applicationContext);
                hie i = dyf.q().i();
                i.r(applicationContext);
                vdb vdbVar = new vdb(null);
                vdbVar.b(applicationContext);
                vdbVar.c(dyf.b());
                vdbVar.a(i);
                vdbVar.d(dyf.p());
                deb e = vdbVar.e();
                a = e;
                e.a().a();
                heb c = a.c();
                if (((Boolean) pla.c().a(mpa.q0)).booleanValue()) {
                    dyf.r();
                    Map W = wxf.W((String) pla.c().a(mpa.s0));
                    Iterator it2 = W.keySet().iterator();
                    while (it2.hasNext()) {
                        c.c((String) it2.next());
                    }
                    c.d(new feb(c, W));
                }
                return a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    abstract ldb a();

    abstract pdb b();

    abstract heb c();
}
