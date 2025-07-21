package defpackage;

import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class kkd implements gqd {
    private final kke a;
    private final s1e b;
    private final zzcei c;
    private final nfb d;

    public kkd(kke kkeVar, s1e s1eVar, zzcei zzceiVar, nfb nfbVar) {
        this.a = kkeVar;
        this.b = s1eVar;
        this.c = zzceiVar;
        this.d = nfbVar;
    }

    final /* synthetic */ lkd a() {
        return new lkd(this.b.j, this.c, this.d.m());
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 9;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.a.j(new Callable() { // from class: jkd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return kkd.this.a();
            }
        });
    }
}
