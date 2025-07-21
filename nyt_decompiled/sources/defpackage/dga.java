package defpackage;

import android.view.View;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.internal.ads.n1;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class dga implements cce {
    private final vae a;
    private final obe b;
    private final qga c;
    private final cga d;
    private final jfa e;
    private final sga f;
    private final kga g;
    private final bga h;

    dga(vae vaeVar, obe obeVar, qga qgaVar, cga cgaVar, jfa jfaVar, sga sgaVar, kga kgaVar, bga bgaVar) {
        this.a = vaeVar;
        this.b = obeVar;
        this.c = qgaVar;
        this.d = cgaVar;
        this.e = jfaVar;
        this.f = sgaVar;
        this.g = kgaVar;
        this.h = bgaVar;
    }

    private final Map b() {
        HashMap hashMap = new HashMap();
        vae vaeVar = this.a;
        n1 b = this.b.b();
        hashMap.put(QueryKeys.INTERNAL_REFERRER, vaeVar.b());
        hashMap.put("gms", Boolean.valueOf(this.a.c()));
        hashMap.put("int", b.L0());
        hashMap.put("up", Boolean.valueOf(this.d.a()));
        hashMap.put(QueryKeys.TOKEN, new Throwable());
        kga kgaVar = this.g;
        if (kgaVar != null) {
            hashMap.put("tcq", Long.valueOf(kgaVar.c()));
            hashMap.put("tpq", Long.valueOf(this.g.g()));
            hashMap.put("tcv", Long.valueOf(this.g.d()));
            hashMap.put("tpv", Long.valueOf(this.g.h()));
            hashMap.put("tchv", Long.valueOf(this.g.b()));
            hashMap.put("tphv", Long.valueOf(this.g.f()));
            hashMap.put("tcc", Long.valueOf(this.g.a()));
            hashMap.put("tpc", Long.valueOf(this.g.e()));
        }
        return hashMap;
    }

    final void a(View view) {
        this.c.f(view);
    }

    @Override // defpackage.cce
    public final Map zza() {
        qga qgaVar = this.c;
        Map b = b();
        b.put("lts", Long.valueOf(qgaVar.c()));
        return b;
    }

    @Override // defpackage.cce
    public final Map zzb() {
        Map b = b();
        n1 a = this.b.a();
        b.put("gai", Boolean.valueOf(this.a.d()));
        b.put("did", a.K0());
        b.put("dst", Integer.valueOf(a.x0() - 1));
        b.put("doo", Boolean.valueOf(a.u0()));
        jfa jfaVar = this.e;
        if (jfaVar != null) {
            b.put("nt", Long.valueOf(jfaVar.a()));
        }
        sga sgaVar = this.f;
        if (sgaVar != null) {
            b.put("vs", Long.valueOf(sgaVar.c()));
            b.put("vf", Long.valueOf(this.f.b()));
        }
        return b;
    }

    @Override // defpackage.cce
    public final Map zzc() {
        bga bgaVar = this.h;
        Map b = b();
        if (bgaVar != null) {
            b.put("vst", bgaVar.a());
        }
        return b;
    }
}
