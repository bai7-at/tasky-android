package defpackage;

import androidx.compose.runtime.t;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class si5 {
    public static final a i = new a(null);
    public static final int j = 8;
    private int b;
    private int d;
    private int f;
    private int g;
    private int h;
    private gi5[] a = new gi5[16];
    private int[] c = new int[16];
    private Object[] e = new Object[16];

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final class b implements ji5 {
        private int a;
        private int b;
        private int c;

        public b() {
        }

        @Override // defpackage.ji5
        public Object a(int i) {
            return si5.this.e[this.c + i];
        }

        @Override // defpackage.ji5
        public int b(int i) {
            return si5.this.c[this.b + i];
        }

        public final gi5 c() {
            gi5 gi5Var = si5.this.a[this.a];
            zq3.e(gi5Var);
            return gi5Var;
        }

        public final boolean d() {
            if (this.a >= si5.this.b) {
                return false;
            }
            gi5 c = c();
            this.b += c.b();
            this.c += c.d();
            int i = this.a + 1;
            this.a = i;
            return i < si5.this.b;
        }
    }

    public static final class c {
        public static si5 a(si5 si5Var) {
            return si5Var;
        }

        public static final gi5 b(si5 si5Var) {
            return si5Var.v();
        }

        public static final void c(si5 si5Var, int i, int i2) {
            int i3 = 1 << i;
            if ((si5Var.g & i3) == 0) {
                si5Var.g = i3 | si5Var.g;
                si5Var.c[si5Var.z(i)] = i2;
            } else {
                throw new IllegalStateException(("Already pushed argument " + b(si5Var).e(i)).toString());
            }
        }

        public static final void d(si5 si5Var, int i, Object obj) {
            int i2 = 1 << i;
            if ((si5Var.h & i2) == 0) {
                si5Var.h = i2 | si5Var.h;
                si5Var.e[si5Var.A(i)] = obj;
            } else {
                throw new IllegalStateException(("Already pushed argument " + b(si5Var).f(i)).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A(int i2) {
        return (this.f - v().d()) + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int n(int i2) {
        if (i2 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i2);
    }

    private final int o(int i2, int i3) {
        return uo6.d(i2 + uo6.i(i2, 1024), i3);
    }

    private final void p(int i2) {
        int[] iArr = this.c;
        int length = iArr.length;
        if (i2 > length) {
            int[] copyOf = Arrays.copyOf(iArr, o(length, i2));
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.c = copyOf;
        }
    }

    private final void q(int i2) {
        Object[] objArr = this.e;
        int length = objArr.length;
        if (i2 > length) {
            Object[] copyOf = Arrays.copyOf(objArr, o(length, i2));
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.e = copyOf;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gi5 v() {
        gi5 gi5Var = this.a[this.b - 1];
        zq3.e(gi5Var);
        return gi5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int z(int i2) {
        return (this.d - v().b()) + i2;
    }

    public final void m() {
        this.b = 0;
        this.d = 0;
        d.t(this.e, null, 0, this.f);
        this.f = 0;
    }

    public final void r(ln lnVar, t tVar, nv6 nv6Var) {
        if (u()) {
            b bVar = new b();
            do {
                bVar.c().a(bVar, lnVar, tVar, nv6Var);
            } while (bVar.d());
        }
        m();
    }

    public final int s() {
        return this.b;
    }

    public final boolean t() {
        return s() == 0;
    }

    public String toString() {
        return super.toString();
    }

    public final boolean u() {
        return s() != 0;
    }

    public final void w(si5 si5Var) {
        if (t()) {
            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
        }
        gi5[] gi5VarArr = this.a;
        int i2 = this.b - 1;
        this.b = i2;
        gi5 gi5Var = gi5VarArr[i2];
        zq3.e(gi5Var);
        this.a[this.b] = null;
        si5Var.y(gi5Var);
        int i3 = this.f;
        int i4 = si5Var.f;
        int d = gi5Var.d();
        for (int i5 = 0; i5 < d; i5++) {
            i4--;
            i3--;
            Object[] objArr = si5Var.e;
            Object[] objArr2 = this.e;
            objArr[i4] = objArr2[i3];
            objArr2[i3] = null;
        }
        int i6 = this.d;
        int i7 = si5Var.d;
        int b2 = gi5Var.b();
        for (int i8 = 0; i8 < b2; i8++) {
            i7--;
            i6--;
            int[] iArr = si5Var.c;
            int[] iArr2 = this.c;
            iArr[i7] = iArr2[i6];
            iArr2[i6] = 0;
        }
        this.f -= gi5Var.d();
        this.d -= gi5Var.b();
    }

    public final void x(gi5 gi5Var) {
        if (gi5Var.b() == 0 && gi5Var.d() == 0) {
            y(gi5Var);
            return;
        }
        throw new IllegalArgumentException(("Cannot push " + gi5Var + " without arguments because it expects " + gi5Var.b() + " ints and " + gi5Var.d() + " objects.").toString());
    }

    public final void y(gi5 gi5Var) {
        this.g = 0;
        this.h = 0;
        int i2 = this.b;
        if (i2 == this.a.length) {
            Object[] copyOf = Arrays.copyOf(this.a, this.b + uo6.i(i2, 1024));
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.a = (gi5[]) copyOf;
        }
        p(this.d + gi5Var.b());
        q(this.f + gi5Var.d());
        gi5[] gi5VarArr = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        gi5VarArr[i3] = gi5Var;
        this.d += gi5Var.b();
        this.f += gi5Var.d();
    }
}
