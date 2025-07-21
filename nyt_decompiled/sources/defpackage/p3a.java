package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class p3a extends h4a {
    private pw9 n;
    private o3a o;

    p3a() {
    }

    private static boolean j(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // defpackage.h4a
    protected final long a(b9e b9eVar) {
        if (!j(b9eVar.m())) {
            return -1L;
        }
        int i = (b9eVar.m()[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int a = jw9.a(b9eVar, i);
            b9eVar.k(0);
            return a;
        }
        b9eVar.l(4);
        b9eVar.L();
        int a2 = jw9.a(b9eVar, i);
        b9eVar.k(0);
        return a2;
    }

    @Override // defpackage.h4a
    protected final void b(boolean z) {
        super.b(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }

    @Override // defpackage.h4a
    protected final boolean c(b9e b9eVar, long j, e4a e4aVar) {
        byte[] m = b9eVar.m();
        pw9 pw9Var = this.n;
        if (pw9Var == null) {
            pw9 pw9Var2 = new pw9(m, 17);
            this.n = pw9Var2;
            e4aVar.a = pw9Var2.c(Arrays.copyOfRange(m, 9, b9eVar.t()), null);
            return true;
        }
        if ((m[0] & Byte.MAX_VALUE) == 3) {
            ow9 b = lw9.b(b9eVar);
            pw9 f = pw9Var.f(b);
            this.n = f;
            this.o = new o3a(f, b);
            return true;
        }
        if (!j(m)) {
            return true;
        }
        o3a o3aVar = this.o;
        if (o3aVar != null) {
            o3aVar.c(j);
            e4aVar.b = this.o;
        }
        e4aVar.a.getClass();
        return false;
    }
}
