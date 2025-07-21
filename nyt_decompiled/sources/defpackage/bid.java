package defpackage;

import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class bid implements s9c {
    private final AtomicReference a = new AtomicReference();

    @Override // defpackage.s9c
    public final void a(final zzs zzsVar) {
        rxd.a(this.a, new qxd() { // from class: aid
            @Override // defpackage.qxd
            public final void zza(Object obj) {
                ((zcc) obj).n5(zzs.this);
            }
        });
    }

    public final void b(zcc zccVar) {
        this.a.set(zccVar);
    }
}
