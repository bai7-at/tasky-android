package defpackage;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class odb implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;

    public odb(l4f l4fVar, l4f l4fVar2, l4f l4fVar3) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ndb((Clock) this.a.zzb(), (hie) this.b.zzb(), (ceb) this.c.zzb());
    }
}
