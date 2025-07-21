package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class i7a implements m7a {
    private static final byte[] v = {73, 68, 51};
    private final boolean a;
    private final g8e b = new g8e(new byte[7], 7);
    private final b9e c = new b9e(Arrays.copyOf(v, 10));
    private final String d;
    private String e;
    private tx9 f;
    private tx9 g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private tx9 t;
    private long u;

    public i7a(boolean z, String str) {
        g();
        this.m = -1;
        this.n = -1;
        this.q = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.a = z;
        this.d = str;
    }

    public static boolean e(int i) {
        return (i & 65526) == 65520;
    }

    private final void f() {
        this.l = false;
        g();
    }

    private final void g() {
        this.h = 0;
        this.i = 0;
        this.j = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
    }

    private final void h() {
        this.h = 3;
        this.i = 0;
    }

    private final void i(tx9 tx9Var, long j, int i, int i2) {
        this.h = 4;
        this.i = i;
        this.t = tx9Var;
        this.u = j;
        this.r = i2;
    }

    private final boolean j(b9e b9eVar, byte[] bArr, int i) {
        int min = Math.min(b9eVar.q(), i - this.i);
        b9eVar.g(bArr, this.i, min);
        int i2 = this.i + min;
        this.i = i2;
        return i2 == i;
    }

    private static final boolean k(byte b, byte b2) {
        return e((b2 & 255) | 65280);
    }

    private static final boolean l(b9e b9eVar, byte[] bArr, int i) {
        if (b9eVar.q() < i) {
            return false;
        }
        b9eVar.g(bArr, 0, i);
        return true;
    }

    @Override // defpackage.m7a
    public final void a(boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02d0 A[SYNTHETIC] */
    @Override // defpackage.m7a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.b9e r21) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i7a.b(b9e):void");
    }

    @Override // defpackage.m7a
    public final void c(sv9 sv9Var, m9a m9aVar) {
        m9aVar.c();
        this.e = m9aVar.b();
        tx9 zzw = sv9Var.zzw(m9aVar.a(), 1);
        this.f = zzw;
        this.t = zzw;
        if (!this.a) {
            this.g = new mv9();
            return;
        }
        m9aVar.c();
        tx9 zzw2 = sv9Var.zzw(m9aVar.a(), 5);
        this.g = zzw2;
        x3a x3aVar = new x3a();
        x3aVar.k(m9aVar.b());
        x3aVar.w("application/id3");
        zzw2.f(x3aVar.D());
    }

    @Override // defpackage.m7a
    public final void d(long j, int i) {
        this.s = j;
    }

    @Override // defpackage.m7a
    public final void zze() {
        this.s = -9223372036854775807L;
        f();
    }
}
