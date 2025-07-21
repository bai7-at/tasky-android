package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class rfd implements htd {
    private final u6c a;
    private final r7c b;
    private final dgc c;
    private final vfc d;
    private final gxb e;
    final AtomicBoolean f = new AtomicBoolean(false);

    rfd(u6c u6cVar, r7c r7cVar, dgc dgcVar, vfc vfcVar, gxb gxbVar) {
        this.a = u6cVar;
        this.b = r7cVar;
        this.c = dgcVar;
        this.d = vfcVar;
        this.e = gxbVar;
    }

    @Override // defpackage.htd
    public final synchronized void zza(View view) {
        if (this.f.compareAndSet(false, true)) {
            this.e.zzq();
            this.d.M0(view);
        }
    }

    @Override // defpackage.htd
    public final void zzb() {
        if (this.f.get()) {
            this.a.v();
        }
    }

    @Override // defpackage.htd
    public final void zzc() {
        if (this.f.get()) {
            this.b.zza();
            this.c.zza();
        }
    }
}
