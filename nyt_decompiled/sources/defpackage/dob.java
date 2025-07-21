package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class dob {
    private final zzcei a;
    private final Context b;
    private final WeakReference c;

    /* synthetic */ dob(bob bobVar, cob cobVar) {
        zzcei zzceiVar;
        Context context;
        WeakReference weakReference;
        zzceiVar = bobVar.a;
        this.a = zzceiVar;
        context = bobVar.b;
        this.b = context;
        weakReference = bobVar.c;
        this.c = weakReference;
    }

    final Context a() {
        return this.b;
    }

    public final gfa b() {
        return new gfa(new p6f(this.b, this.a));
    }

    final psa c() {
        return new psa(this.b);
    }

    final zzcei d() {
        return this.a;
    }

    final String e() {
        return dyf.r().E(this.b, this.a.zza);
    }

    final WeakReference f() {
        return this.c;
    }
}
