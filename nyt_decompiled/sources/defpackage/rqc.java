package defpackage;

import com.google.android.gms.internal.ads.zzcag;

/* loaded from: classes3.dex */
public final class rqc implements kya {
    private final k8c a;
    private final zzcag b;
    private final String c;
    private final String d;

    public rqc(k8c k8cVar, v0e v0eVar) {
        this.a = k8cVar;
        this.b = v0eVar.m;
        this.c = v0eVar.k;
        this.d = v0eVar.l;
    }

    @Override // defpackage.kya
    public final void j0(zzcag zzcagVar) {
        int i;
        String str;
        zzcag zzcagVar2 = this.b;
        if (zzcagVar2 != null) {
            zzcagVar = zzcagVar2;
        }
        if (zzcagVar != null) {
            str = zzcagVar.zza;
            i = zzcagVar.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.a.M0(new fab(str, i), this.c, this.d);
    }

    @Override // defpackage.kya
    public final void zzb() {
        this.a.zze();
    }

    @Override // defpackage.kya
    public final void zzc() {
        this.a.zzf();
    }
}
