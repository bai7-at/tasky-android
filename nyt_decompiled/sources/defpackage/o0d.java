package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* loaded from: classes3.dex */
public final class o0d implements v3f {
    private final l4f a;

    public o0d(l4f l4fVar) {
        this.a = l4fVar;
    }

    @Override // defpackage.l4f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.a.zzb()).getApplicationInfo();
        d4f.b(applicationInfo);
        return applicationInfo;
    }
}
