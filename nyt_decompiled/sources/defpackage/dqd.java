package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class dqd implements gqd {
    private final kke a;
    private final Context b;

    dqd(kke kkeVar, Context context) {
        this.a = kkeVar;
        this.b = context;
    }

    final /* synthetic */ fqd a() {
        final Bundle b = wv9.b(this.b, (String) pla.c().a(mpa.f6));
        if (b.isEmpty()) {
            return null;
        }
        return new fqd() { // from class: cqd
            @Override // defpackage.fqd
            public final void a(Object obj) {
                ((Bundle) obj).putBundle("shared_pref", b);
            }
        };
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 37;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.a.j(new Callable() { // from class: bqd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dqd.this.a();
            }
        });
    }
}
