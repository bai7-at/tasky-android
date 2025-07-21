package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.internal.ads.s6;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzflg;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class a6c {
    private final s6 a;
    private final zzcei b;
    private final ApplicationInfo c;
    private final String d;
    private final List e;
    private final PackageInfo f;
    private final l3f g;
    private final String h;
    private final jqd i;
    private final hie j;
    private final s1e k;
    private final gdc l;

    public a6c(s6 s6Var, zzcei zzceiVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, l3f l3fVar, hie hieVar, String str2, jqd jqdVar, s1e s1eVar, gdc gdcVar) {
        this.a = s6Var;
        this.b = zzceiVar;
        this.c = applicationInfo;
        this.d = str;
        this.e = list;
        this.f = packageInfo;
        this.g = l3fVar;
        this.h = str2;
        this.i = jqdVar;
        this.j = hieVar;
        this.k = s1eVar;
        this.l = gdcVar;
    }

    final /* synthetic */ zzbze a(j64 j64Var) {
        Bundle bundle = (Bundle) j64Var.get();
        String str = (String) ((j64) this.g.zzb()).get();
        boolean z = ((Boolean) pla.c().a(mpa.h7)).booleanValue() && this.j.g();
        String str2 = this.h;
        PackageInfo packageInfo = this.f;
        List list = this.e;
        return new zzbze(bundle, this.b, this.c, this.d, list, packageInfo, str, str2, null, null, z, this.k.b());
    }

    public final j64 b() {
        this.l.zza();
        return m5e.c(this.i.a(new Bundle()), zzflg.SIGNALS, this.a).a();
    }

    public final j64 c() {
        final j64 b = b();
        return this.a.a(zzflg.REQUEST_PARCEL, b, (j64) this.g.zzb()).a(new Callable() { // from class: z5c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return a6c.this.a(b);
            }
        }).a();
    }
}
