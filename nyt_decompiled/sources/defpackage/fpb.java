package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;

/* loaded from: classes3.dex */
public final class fpb implements v3f {
    private final l4f a;
    private final l4f b;

    public fpb(l4f l4fVar, l4f l4fVar2) {
        this.a = l4fVar;
        this.b = l4fVar2;
    }

    @Override // defpackage.l4f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dab zzb() {
        Context a = ((gob) this.a).a();
        v7e v7eVar = (v7e) this.b.zzb();
        e2b b = dyf.h().b(a, zzcei.t0(), v7eVar);
        y1b y1bVar = b2b.b;
        b.a("google.afma.request.getAdDictionary", y1bVar, y1bVar);
        return new cab(a, dyf.h().b(a, zzcei.t0(), v7eVar).a("google.afma.sdkConstants.getSdkConstants", y1bVar, y1bVar));
    }
}
