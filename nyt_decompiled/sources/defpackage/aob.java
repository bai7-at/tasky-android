package defpackage;

import android.content.Context;
import com.google.android.gms.ads.nonagon.signalgeneration.b;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzcei;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public abstract class aob implements lub {
    private static aob a;

    private static synchronized aob e(Context context, h3b h3bVar, int i, boolean z, int i2, ipb ipbVar) {
        synchronized (aob.class) {
            try {
                aob aobVar = a;
                if (aobVar != null) {
                    return aobVar;
                }
                mpa.a(context);
                q2e d = q2e.d(context);
                zzcei c = d.c(240304000, false, i2);
                d.f(h3bVar);
                crb crbVar = new crb(null);
                bob bobVar = new bob();
                bobVar.d(c);
                bobVar.c(context);
                crbVar.b(new dob(bobVar, null));
                crbVar.c(new zsb(ipbVar));
                aob a2 = crbVar.a();
                dyf.q().u(context, c);
                dyf.e().i(context);
                dyf.r().N(context);
                dyf.r().M(context);
                q5c.a(context);
                dyf.d().d(context);
                dyf.x().b(context);
                a2.f().c();
                deb.d(context);
                if (((Boolean) pla.c().a(mpa.j6)).booleanValue()) {
                    if (!((Boolean) pla.c().a(mpa.v0)).booleanValue()) {
                        ina inaVar = new ina(new ona(context));
                        n6d n6dVar = new n6d(new j6d(context), a2.b());
                        dyf.r();
                        new l7d(context, c, inaVar, n6dVar, UUID.randomUUID().toString(), a2.C()).b(dyf.q().i().g());
                    }
                }
                a = a2;
                return a2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static aob g(Context context, h3b h3bVar, int i) {
        return e(context, h3bVar, 240304000, false, i, new ipb());
    }

    public abstract g2e A();

    public abstract t2e B();

    public abstract k6e C();

    public abstract v7e D();

    @Override // defpackage.lub
    public final grd a(zzbze zzbzeVar, int i) {
        return v(new iud(zzbzeVar, i));
    }

    public abstract kke b();

    public abstract Executor c();

    public abstract ScheduledExecutorService d();

    public abstract ahb f();

    public abstract jtb h();

    public abstract xxb i();

    public abstract mzb j();

    public abstract w9c k();

    public abstract aic l();

    public abstract wic m();

    public abstract yqc n();

    public abstract mwc o();

    public abstract eyc p();

    public abstract yyc q();

    public abstract l8d r();

    public abstract b s();

    public abstract iie t();

    public abstract qq9 u();

    protected abstract grd v(iud iudVar);

    public abstract gvd w();

    public abstract axd x();

    public abstract uyd y();

    public abstract o0e z();
}
