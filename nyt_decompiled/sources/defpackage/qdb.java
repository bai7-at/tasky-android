package defpackage;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class qdb implements v3f {
    private final l4f a;
    private final l4f b;

    public qdb(l4f l4fVar, l4f l4fVar2) {
        this.a = l4fVar;
        this.b = l4fVar2;
    }

    @Override // defpackage.l4f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pdb zzb() {
        return new pdb((Clock) this.a.zzb(), (ndb) this.b.zzb());
    }
}
