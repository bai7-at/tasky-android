package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbze;

/* loaded from: classes3.dex */
public final class x5d implements cac, r8c, c7c {
    private final j6e a;
    private final k6e b;
    private final nfb c;

    public x5d(j6e j6eVar, k6e k6eVar, nfb nfbVar) {
        this.a = j6eVar;
        this.b = k6eVar;
        this.c = nfbVar;
    }

    @Override // defpackage.cac
    public final void F(zzbze zzbzeVar) {
        this.a.i(zzbzeVar.zza);
    }

    @Override // defpackage.c7c
    public final void n(zze zzeVar) {
        j6e j6eVar = this.a;
        j6eVar.a("action", "ftl");
        j6eVar.a("ftl", String.valueOf(zzeVar.zza));
        j6eVar.a("ed", zzeVar.zzc);
        this.b.a(this.a);
    }

    @Override // defpackage.cac
    public final void y0(g1e g1eVar) {
        this.a.h(g1eVar, this.c);
    }

    @Override // defpackage.r8c
    public final void zzr() {
        j6e j6eVar = this.a;
        j6eVar.a("action", "loaded");
        this.b.a(j6eVar);
    }
}
