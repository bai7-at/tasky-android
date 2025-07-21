package defpackage;

import android.view.View;

/* loaded from: classes3.dex */
public final class cgd implements htd {
    private htd a;

    public final synchronized void a(htd htdVar) {
        this.a = htdVar;
    }

    @Override // defpackage.htd
    public final synchronized void zza(View view) {
        htd htdVar = this.a;
        if (htdVar != null) {
            htdVar.zza(view);
        }
    }

    @Override // defpackage.htd
    public final synchronized void zzb() {
        htd htdVar = this.a;
        if (htdVar != null) {
            htdVar.zzb();
        }
    }

    @Override // defpackage.htd
    public final synchronized void zzc() {
        htd htdVar = this.a;
        if (htdVar != null) {
            htdVar.zzc();
        }
    }
}
