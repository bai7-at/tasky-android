package defpackage;

import java.util.Set;

/* loaded from: classes3.dex */
public final class rvc implements v3f {
    private final nvc a;
    private final l4f b;
    private final l4f c;

    public rvc(nvc nvcVar, l4f l4fVar, l4f l4fVar2) {
        this.a = nvcVar;
        this.b = l4fVar;
        this.c = l4fVar2;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        bwc bwcVar = (bwc) this.b.zzb();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        Set d = nvc.d(bwcVar, kkeVar);
        d4f.b(d);
        return d;
    }
}
