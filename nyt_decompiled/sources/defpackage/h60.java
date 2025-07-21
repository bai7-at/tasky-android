package defpackage;

import android.os.SystemClock;
import com.google.android.exoplayer2.t0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class h60 implements q72 {
    protected final up8 a;
    protected final int b;
    protected final int[] c;
    private final int d;
    private final t0[] e;
    private final long[] f;
    private int g;

    public h60(up8 up8Var, int... iArr) {
        this(up8Var, iArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int w(t0 t0Var, t0 t0Var2) {
        return t0Var2.h - t0Var.h;
    }

    @Override // defpackage.q72
    public boolean a(int i, long j) {
        return this.f[i] > j;
    }

    @Override // defpackage.q72
    public void c() {
    }

    @Override // defpackage.q72
    public void d() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h60 h60Var = (h60) obj;
        return this.a == h60Var.a && Arrays.equals(this.c, h60Var.c);
    }

    @Override // defpackage.aq8
    public final t0 f(int i) {
        return this.e[i];
    }

    @Override // defpackage.aq8
    public final int g(int i) {
        return this.c[i];
    }

    @Override // defpackage.q72
    public boolean h(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a = a(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !a) {
            a = (i2 == i || a(i2, elapsedRealtime)) ? false : true;
            i2++;
        }
        if (!a) {
            return false;
        }
        long[] jArr = this.f;
        jArr[i] = Math.max(jArr[i], z19.b(elapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    public int hashCode() {
        if (this.g == 0) {
            this.g = (System.identityHashCode(this.a) * 31) + Arrays.hashCode(this.c);
        }
        return this.g;
    }

    @Override // defpackage.q72
    public void i(float f) {
    }

    @Override // defpackage.aq8
    public final int l(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.aq8
    public final int length() {
        return this.c.length;
    }

    @Override // defpackage.aq8
    public final up8 n() {
        return this.a;
    }

    @Override // defpackage.q72
    public int p(long j, List list) {
        return list.size();
    }

    @Override // defpackage.aq8
    public final int q(t0 t0Var) {
        for (int i = 0; i < this.b; i++) {
            if (this.e[i] == t0Var) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.q72
    public final int r() {
        return this.c[b()];
    }

    @Override // defpackage.q72
    public final t0 s() {
        return this.e[b()];
    }

    public h60(up8 up8Var, int[] iArr, int i) {
        int i2 = 0;
        ur.g(iArr.length > 0);
        this.d = i;
        this.a = (up8) ur.e(up8Var);
        int length = iArr.length;
        this.b = length;
        this.e = new t0[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.e[i3] = up8Var.d(iArr[i3]);
        }
        Arrays.sort(this.e, new Comparator() { // from class: g60
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int w;
                w = h60.w((t0) obj, (t0) obj2);
                return w;
            }
        });
        this.c = new int[this.b];
        while (true) {
            int i4 = this.b;
            if (i2 >= i4) {
                this.f = new long[i4];
                return;
            } else {
                this.c[i2] = up8Var.e(this.e[i2]);
                i2++;
            }
        }
    }
}
