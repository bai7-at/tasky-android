package defpackage;

import androidx.compose.runtime.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class fi implements x08 {
    private final hu8 a;
    private final sy4 b;
    private mi c;
    private long d;
    private long e;
    private boolean f;

    public fi(hu8 hu8Var, Object obj, mi miVar, long j, long j2, boolean z) {
        mi e;
        this.a = hu8Var;
        this.b = b0.e(obj, null, 2, null);
        this.c = (miVar == null || (e = ni.e(miVar)) == null) ? gi.i(hu8Var, obj) : e;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    public final mi A() {
        return this.c;
    }

    public final boolean B() {
        return this.f;
    }

    public final void C(long j) {
        this.e = j;
    }

    public final void D(long j) {
        this.d = j;
    }

    public final void E(boolean z) {
        this.f = z;
    }

    public void F(Object obj) {
        this.b.setValue(obj);
    }

    public final void G(mi miVar) {
        this.c = miVar;
    }

    @Override // defpackage.x08
    public Object getValue() {
        return this.b.getValue();
    }

    public final long j() {
        return this.e;
    }

    public final long n() {
        return this.d;
    }

    public final hu8 o() {
        return this.a;
    }

    public final Object t() {
        return this.a.b().invoke(this.c);
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + t() + ", isRunning=" + this.f + ", lastFrameTimeNanos=" + this.d + ", finishedTimeNanos=" + this.e + ')';
    }

    public /* synthetic */ fi(hu8 hu8Var, Object obj, mi miVar, long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hu8Var, obj, (i & 4) != 0 ? null : miVar, (i & 8) != 0 ? Long.MIN_VALUE : j, (i & 16) != 0 ? Long.MIN_VALUE : j2, (i & 32) != 0 ? false : z);
    }
}
