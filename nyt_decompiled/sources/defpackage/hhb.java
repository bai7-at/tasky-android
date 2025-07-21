package defpackage;

import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public abstract class hhb {
    private final ugb a;
    private final AtomicInteger b;

    public hhb() {
        ugb ugbVar = new ugb();
        this.a = ugbVar;
        this.b = new AtomicInteger(0);
        zb.r(ugbVar, new zgb(this), pgb.f);
    }

    public final int a() {
        return this.b.get();
    }

    public final void c() {
        this.a.d(new Exception());
    }

    public final void d(Object obj) {
        this.a.c(obj);
    }

    public final void e(ygb ygbVar, wgb wgbVar) {
        zb.r(this.a, new ghb(this, ygbVar, wgbVar), pgb.f);
    }
}
