package defpackage;

import androidx.compose.animation.core.RepeatMode;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class p49 implements i49 {
    private final l49 a;
    private final RepeatMode b;
    private final long c;
    private final long d;

    public /* synthetic */ p49(l49 l49Var, RepeatMode repeatMode, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(l49Var, repeatMode, j);
    }

    private final long h(long j) {
        long j2 = this.d;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.c;
        long j5 = j3 / j4;
        return (this.b == RepeatMode.Restart || j5 % ((long) 2) == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    private final mi i(long j, mi miVar, mi miVar2, mi miVar3) {
        long j2 = this.d;
        long j3 = j + j2;
        long j4 = this.c;
        return j3 > j4 ? this.a.f(j4 - j2, miVar, miVar3, miVar2) : miVar2;
    }

    @Override // defpackage.i49
    public boolean a() {
        return true;
    }

    @Override // defpackage.i49
    public long b(mi miVar, mi miVar2, mi miVar3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.i49
    public mi f(long j, mi miVar, mi miVar2, mi miVar3) {
        return this.a.f(h(j), miVar, miVar2, i(j, miVar, miVar3, miVar2));
    }

    @Override // defpackage.i49
    public mi g(long j, mi miVar, mi miVar2, mi miVar3) {
        return this.a.g(h(j), miVar, miVar2, i(j, miVar, miVar3, miVar2));
    }

    private p49(l49 l49Var, RepeatMode repeatMode, long j) {
        this.a = l49Var;
        this.b = repeatMode;
        this.c = (l49Var.c() + l49Var.d()) * 1000000;
        this.d = j * 1000000;
    }
}
