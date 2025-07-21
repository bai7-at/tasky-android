package defpackage;

import android.app.Application;
import com.instacart.library.truetime.d;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class ft8 implements cm0 {
    private final et8 a;

    public ft8(Application application) {
        zq3.h(application, "context");
        this.a = new et8(application);
    }

    @Override // defpackage.cm0
    public Object a(List list, long j, by0 by0Var) {
        d m = d.c().m(false);
        am0 b = b();
        zq3.f(b, "null cannot be cast to non-null type com.instacart.library.truetime.CacheInterface");
        m.l((hg0) b).k((int) j).n((String) i.k0(list)).e();
        return ww8.a;
    }

    public am0 b() {
        return this.a;
    }

    @Override // defpackage.cm0
    public Long now() {
        try {
            if (d.g()) {
                return Long.valueOf(d.h().getTime());
            }
            return null;
        } catch (RuntimeException e) {
            ul8.a.z("ET2").f(e, "Truetime Init Failed", new Object[0]);
            return null;
        }
    }
}
