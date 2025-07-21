package defpackage;

import com.google.android.exoplayer2.source.c0;

/* loaded from: classes2.dex */
public class ts0 implements c0 {
    protected final c0[] a;

    public ts0(c0[] c0VarArr) {
        this.a = c0VarArr;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public boolean b() {
        for (c0 c0Var : this.a) {
            if (c0Var.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public final long c() {
        long j = Long.MAX_VALUE;
        for (c0 c0Var : this.a) {
            long c = c0Var.c();
            if (c != Long.MIN_VALUE) {
                j = Math.min(j, c);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public boolean f(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long c = c();
            if (c == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (c0 c0Var : this.a) {
                long c2 = c0Var.c();
                boolean z3 = c2 != Long.MIN_VALUE && c2 <= j;
                if (c2 == c || z3) {
                    z |= c0Var.f(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public final long h() {
        long j = Long.MAX_VALUE;
        for (c0 c0Var : this.a) {
            long h = c0Var.h();
            if (h != Long.MIN_VALUE) {
                j = Math.min(j, h);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public final void i(long j) {
        for (c0 c0Var : this.a) {
            c0Var.i(j);
        }
    }
}
