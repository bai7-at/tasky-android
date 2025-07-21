package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class dad implements v3f {
    private final l4f a;
    private final l4f b;

    public dad(l4f l4fVar, l4f l4fVar2) {
        this.a = l4fVar;
        this.b = l4fVar2;
    }

    @Override // defpackage.l4f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cad zzb() {
        return new cad((Context) this.a.zzb(), (yxb) this.b.zzb());
    }
}
