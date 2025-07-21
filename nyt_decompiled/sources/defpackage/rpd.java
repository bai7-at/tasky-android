package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class rpd implements gqd {
    private final ceb a;
    private final kke b;
    private final Context c;

    public rpd(ceb cebVar, kke kkeVar, Context context) {
        this.a = cebVar;
        this.b = kkeVar;
        this.c = context;
    }

    final /* synthetic */ spd a() {
        if (!this.a.p(this.c)) {
            return new spd(null, null, null, null, null);
        }
        String d = this.a.d(this.c);
        String str = d == null ? "" : d;
        String b = this.a.b(this.c);
        String str2 = b == null ? "" : b;
        String a = this.a.a(this.c);
        String str3 = a == null ? "" : a;
        String str4 = true != this.a.p(this.c) ? null : "fa";
        return new spd(str, str2, str3, str4 == null ? "" : str4, "TIME_OUT".equals(str2) ? (Long) pla.c().a(mpa.f0) : null);
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 34;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.b.j(new Callable() { // from class: qpd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return rpd.this.a();
            }
        });
    }
}
