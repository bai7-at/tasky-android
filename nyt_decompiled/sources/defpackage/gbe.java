package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.ads.l7;
import com.google.android.gms.internal.ads.m7;
import com.google.android.gms.internal.ads.o7;
import com.google.android.gms.internal.ads.q7;

/* loaded from: classes3.dex */
public final class gbe {
    private final Context a;
    private final Looper b;

    public gbe(Context context, Looper looper) {
        this.a = context;
        this.b = looper;
    }

    public final void a(String str) {
        o7 L = q7.L();
        L.n(this.a.getPackageName());
        L.p(2);
        l7 L2 = m7.L();
        L2.n(str);
        L2.o(2);
        L.o(L2);
        new hbe(this.a, this.b, (q7) L.i()).a();
    }
}
