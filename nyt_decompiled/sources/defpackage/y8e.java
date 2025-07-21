package defpackage;

import android.view.View;
import com.google.android.gms.internal.ads.zzfok;

/* loaded from: classes3.dex */
public final class y8e {
    private final mae a;
    private final String b;
    private final zzfok c;
    private final String d = "Ad overlay";

    public y8e(View view, zzfok zzfokVar, String str) {
        this.a = new mae(view);
        this.b = view.getClass().getCanonicalName();
        this.c = zzfokVar;
    }

    public final zzfok a() {
        return this.c;
    }

    public final mae b() {
        return this.a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }
}
