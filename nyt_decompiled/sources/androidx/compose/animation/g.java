package androidx.compose.animation;

import defpackage.gt2;
import defpackage.hn3;
import defpackage.hu7;
import defpackage.ph2;

/* loaded from: classes.dex */
final class g implements hu7 {
    private final boolean a;
    private final gt2 b;

    public g(boolean z, gt2 gt2Var) {
        this.a = z;
        this.b = gt2Var;
    }

    @Override // defpackage.hu7
    public ph2 a(long j, long j2) {
        return (ph2) this.b.invoke(hn3.b(j), hn3.b(j2));
    }

    @Override // defpackage.hu7
    public boolean b() {
        return this.a;
    }
}
