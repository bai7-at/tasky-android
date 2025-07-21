package defpackage;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes3.dex */
public final class hpc extends fua {
    private final String a;
    private final jkc b;
    private final rkc c;

    public hpc(String str, jkc jkcVar, rkc rkcVar) {
        this.a = str;
        this.b = jkcVar;
        this.c = rkcVar;
    }

    @Override // defpackage.gua
    public final boolean M(Bundle bundle) {
        return this.b.E(bundle);
    }

    @Override // defpackage.gua
    public final void j1(Bundle bundle) {
        this.b.m(bundle);
    }

    @Override // defpackage.gua
    public final void y(Bundle bundle) {
        this.b.r(bundle);
    }

    @Override // defpackage.gua
    public final Bundle zzb() {
        return this.c.Q();
    }

    @Override // defpackage.gua
    public final znc zzc() {
        return this.c.W();
    }

    @Override // defpackage.gua
    public final fta zzd() {
        return this.c.Y();
    }

    @Override // defpackage.gua
    public final mta zze() {
        return this.c.b0();
    }

    @Override // defpackage.gua
    public final ee3 zzf() {
        return this.c.i0();
    }

    @Override // defpackage.gua
    public final ee3 zzg() {
        return fc5.l3(this.b);
    }

    @Override // defpackage.gua
    public final String zzh() {
        return this.c.k0();
    }

    @Override // defpackage.gua
    public final String zzi() {
        return this.c.l0();
    }

    @Override // defpackage.gua
    public final String zzj() {
        return this.c.m0();
    }

    @Override // defpackage.gua
    public final String zzk() {
        return this.c.b();
    }

    @Override // defpackage.gua
    public final String zzl() {
        return this.a;
    }

    @Override // defpackage.gua
    public final List zzm() {
        return this.c.g();
    }

    @Override // defpackage.gua
    public final void zzn() {
        this.b.a();
    }
}
