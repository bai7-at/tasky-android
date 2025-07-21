package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbze;

/* loaded from: classes3.dex */
public final class guc implements cac, r8c, c7c {
    private final uuc a;
    private final evc b;

    public guc(uuc uucVar, evc evcVar) {
        this.a = uucVar;
        this.b = evcVar;
    }

    @Override // defpackage.cac
    public final void F(zzbze zzbzeVar) {
        this.a.c(zzbzeVar.zza);
    }

    @Override // defpackage.c7c
    public final void n(zze zzeVar) {
        this.a.a().put("action", "ftl");
        this.a.a().put("ftl", String.valueOf(zzeVar.zza));
        this.a.a().put("ed", zzeVar.zzc);
        this.b.f(this.a.a());
    }

    @Override // defpackage.cac
    public final void y0(g1e g1eVar) {
        this.a.b(g1eVar);
    }

    @Override // defpackage.r8c
    public final void zzr() {
        this.a.a().put("action", "loaded");
        this.b.f(this.a.a());
    }
}
