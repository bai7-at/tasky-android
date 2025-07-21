package defpackage;

import android.os.Bundle;
import defpackage.gl1;
import defpackage.oc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class tc {
    private final gl1 a;
    private volatile vc b;
    private volatile hc0 c;
    private final List d;

    public tc(gl1 gl1Var) {
        this(gl1Var, new tq1(), new iw8());
    }

    private void f() {
        this.a.a(new gl1.a() { // from class: sc
            @Override // gl1.a
            public final void a(q76 q76Var) {
                tc.this.i(q76Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str, Bundle bundle) {
        this.b.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(gc0 gc0Var) {
        synchronized (this) {
            try {
                if (this.c instanceof tq1) {
                    this.d.add(gc0Var);
                }
                this.c.a(gc0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(q76 q76Var) {
        m94.f().b("AnalyticsConnector now available.");
        oc ocVar = (oc) q76Var.get();
        q11 q11Var = new q11(ocVar);
        d11 d11Var = new d11();
        if (j(ocVar, d11Var) == null) {
            m94.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        m94.f().b("Registered Firebase Analytics listener.");
        fc0 fc0Var = new fc0();
        k90 k90Var = new k90(q11Var, 500, TimeUnit.MILLISECONDS);
        synchronized (this) {
            try {
                Iterator it2 = this.d.iterator();
                while (it2.hasNext()) {
                    fc0Var.a((gc0) it2.next());
                }
                d11Var.d(fc0Var);
                d11Var.e(k90Var);
                this.c = fc0Var;
                this.b = k90Var;
            } finally {
            }
        }
    }

    private static oc.a j(oc ocVar, d11 d11Var) {
        oc.a e = ocVar.e("clx", d11Var);
        if (e == null) {
            m94.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            e = ocVar.e("crash", d11Var);
            if (e != null) {
                m94.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return e;
    }

    public vc d() {
        return new vc() { // from class: rc
            @Override // defpackage.vc
            public final void a(String str, Bundle bundle) {
                tc.this.g(str, bundle);
            }
        };
    }

    public hc0 e() {
        return new hc0() { // from class: qc
            @Override // defpackage.hc0
            public final void a(gc0 gc0Var) {
                tc.this.h(gc0Var);
            }
        };
    }

    public tc(gl1 gl1Var, hc0 hc0Var, vc vcVar) {
        this.a = gl1Var;
        this.c = hc0Var;
        this.d = new ArrayList();
        this.b = vcVar;
        f();
    }
}
