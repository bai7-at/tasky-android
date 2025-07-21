package androidx.compose.foundation.gestures;

import defpackage.by0;
import defpackage.oc1;
import defpackage.qc7;
import defpackage.qk2;
import defpackage.zv4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes.dex */
public final class DefaultFlingBehavior implements qk2 {
    private oc1 a;
    private final zv4 b;
    private int c;

    public DefaultFlingBehavior(oc1 oc1Var, zv4 zv4Var) {
        this.a = oc1Var;
        this.b = zv4Var;
    }

    @Override // defpackage.qk2
    public Object a(qc7 qc7Var, float f, by0 by0Var) {
        this.c = 0;
        return BuildersKt.withContext(this.b, new DefaultFlingBehavior$performFling$2(f, this, qc7Var, null), by0Var);
    }

    public final oc1 b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public final void d(oc1 oc1Var) {
        this.a = oc1Var;
    }

    public final void e(int i) {
        this.c = i;
    }

    public /* synthetic */ DefaultFlingBehavior(oc1 oc1Var, zv4 zv4Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(oc1Var, (i & 2) != 0 ? ScrollableKt.g() : zv4Var);
    }
}
