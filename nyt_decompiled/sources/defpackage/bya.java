package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
final class bya implements gke {
    final /* synthetic */ jq9 a;
    final /* synthetic */ Map b;
    final /* synthetic */ String c;
    final /* synthetic */ fya d;

    bya(fya fyaVar, jq9 jq9Var, Map map, String str) {
        this.a = jq9Var;
        this.b = map;
        this.c = str;
        this.d = fyaVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        dyf.q().w(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        jq9 jq9Var = this.a;
        Map map = this.b;
        String str = this.c;
        this.d.h((String) obj, jq9Var, map, str);
    }
}
