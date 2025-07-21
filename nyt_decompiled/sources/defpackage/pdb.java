package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class pdb {
    private final Clock a;
    private final ndb b;

    pdb(Clock clock, ndb ndbVar) {
        this.a = clock;
        this.b = ndbVar;
    }

    public static pdb a(Context context) {
        return deb.d(context).b();
    }

    public final void b(int i, long j) {
        this.b.a(i, j);
    }

    public final void c(zzff zzffVar) {
        this.b.a(-1, this.a.currentTimeMillis());
    }

    public final void d() {
        this.b.a(-1, this.a.currentTimeMillis());
    }
}
