package defpackage;

import com.comscore.util.crashreport.CrashReportManager;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.z1;

/* loaded from: classes2.dex */
public class fi1 implements u64 {
    private final td1 a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final int f;
    private final boolean g;
    private final long h;
    private final boolean i;
    private int j;
    private boolean k;

    public fi1() {
        this(new td1(true, 65536), 50000, 50000, 2500, CrashReportManager.TIME_WINDOW, -1, false, 0, false);
    }

    private static void a(int i, int i2, String str, String str2) {
        ur.b(i >= i2, str + " cannot be less than " + str2);
    }

    private static int c(int i) {
        switch (i) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    private void d(boolean z) {
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        this.j = i;
        this.k = false;
        if (z) {
            this.a.g();
        }
    }

    protected int b(z1[] z1VarArr, q72[] q72VarArr) {
        int i = 0;
        for (int i2 = 0; i2 < z1VarArr.length; i2++) {
            if (q72VarArr[i2] != null) {
                i += c(z1VarArr[i2].f());
            }
        }
        return Math.max(13107200, i);
    }

    @Override // defpackage.u64
    public void e() {
        d(false);
    }

    @Override // defpackage.u64
    public void f() {
        d(true);
    }

    @Override // defpackage.u64
    public boolean g() {
        return this.i;
    }

    @Override // defpackage.u64
    public void h(g2 g2Var, bl4 bl4Var, z1[] z1VarArr, wp8 wp8Var, q72[] q72VarArr) {
        int i = this.f;
        if (i == -1) {
            i = b(z1VarArr, q72VarArr);
        }
        this.j = i;
        this.a.h(i);
    }

    @Override // defpackage.u64
    public long i() {
        return this.h;
    }

    @Override // defpackage.u64
    public ob j() {
        return this.a;
    }

    @Override // defpackage.u64
    public boolean k(g2 g2Var, bl4 bl4Var, long j, float f, boolean z, long j2) {
        long h0 = z19.h0(j, f);
        long j3 = z ? this.e : this.d;
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || h0 >= j3 || (!this.g && this.a.f() >= this.j);
    }

    @Override // defpackage.u64
    public void l() {
        d(true);
    }

    @Override // defpackage.u64
    public boolean m(long j, long j2, float f) {
        boolean z = true;
        boolean z2 = this.a.f() >= this.j;
        long j3 = this.b;
        if (f > 1.0f) {
            j3 = Math.min(z19.c0(j3, f), this.c);
        }
        if (j2 < Math.max(j3, 500000L)) {
            if (!this.g && z2) {
                z = false;
            }
            this.k = z;
            if (!z && j2 < 500000) {
                a84.j("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.c || z2) {
            this.k = false;
        }
        return this.k;
    }

    protected fi1(td1 td1Var, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        a(i3, 0, "bufferForPlaybackMs", "0");
        a(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i, i3, "minBufferMs", "bufferForPlaybackMs");
        a(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i2, i, "maxBufferMs", "minBufferMs");
        a(i6, 0, "backBufferDurationMs", "0");
        this.a = td1Var;
        this.b = z19.D0(i);
        this.c = z19.D0(i2);
        this.d = z19.D0(i3);
        this.e = z19.D0(i4);
        this.f = i5;
        this.j = i5 == -1 ? 13107200 : i5;
        this.g = z;
        this.h = z19.D0(i6);
        this.i = z2;
    }
}
