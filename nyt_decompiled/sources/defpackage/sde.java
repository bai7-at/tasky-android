package defpackage;

import com.google.android.gms.internal.ads.eb;

/* loaded from: classes3.dex */
final class sde extends eb {
    Object h;

    sde(Object obj, Runnable runnable) {
        this.h = obj;
    }

    @Override // com.google.android.gms.internal.ads.eb
    public final String d() {
        Object obj = this.h;
        return obj == null ? "" : obj.toString();
    }

    @Override // com.google.android.gms.internal.ads.eb
    protected final void e() {
        this.h = null;
    }

    @Override // com.google.android.gms.internal.ads.eb
    public final boolean f(Object obj) {
        return super.f(obj);
    }

    @Override // com.google.android.gms.internal.ads.eb
    public final boolean g(Throwable th) {
        return super.g(th);
    }
}
