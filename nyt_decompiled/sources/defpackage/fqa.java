package defpackage;

import android.view.View;

/* loaded from: classes3.dex */
public final class fqa extends gqa {
    private final htd a;
    private final String b;
    private final String c;

    public fqa(htd htdVar, String str, String str2) {
        this.a = htdVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.hqa
    public final void X(ee3 ee3Var) {
        if (ee3Var == null) {
            return;
        }
        this.a.zza((View) fc5.Q1(ee3Var));
    }

    @Override // defpackage.hqa
    public final String zzb() {
        return this.b;
    }

    @Override // defpackage.hqa
    public final String zzc() {
        return this.c;
    }

    @Override // defpackage.hqa
    public final void zze() {
        this.a.zzb();
    }

    @Override // defpackage.hqa
    public final void zzf() {
        this.a.zzc();
    }
}
