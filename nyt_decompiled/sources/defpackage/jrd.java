package defpackage;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class jrd implements gqd {
    private final Executor a;
    private final String b;
    private final PackageInfo c;
    private final bfb d;

    public jrd(bfb bfbVar, Executor executor, String str, PackageInfo packageInfo, int i) {
        this.d = bfbVar;
        this.a = executor;
        this.b = str;
        this.c = packageInfo;
    }

    final /* synthetic */ j64 a(Throwable th) {
        return zb.h(new krd(this.b));
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 41;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return zb.f(zb.m(zb.h(this.b), new gge() { // from class: hrd
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                return new krd((String) obj);
            }
        }, this.a), Throwable.class, new ake() { // from class: ird
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return jrd.this.a((Throwable) obj);
            }
        }, this.a);
    }
}
