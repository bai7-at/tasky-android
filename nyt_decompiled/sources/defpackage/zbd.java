package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zbd implements v3f {
    private final l4f a;
    private final l4f b;

    public zbd(l4f l4fVar, l4f l4fVar2) {
        this.a = l4fVar;
        this.b = l4fVar2;
    }

    @Override // defpackage.l4f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ybd zzb() {
        return new ybd((Context) this.a.zzb(), (bic) this.b.zzb());
    }
}
