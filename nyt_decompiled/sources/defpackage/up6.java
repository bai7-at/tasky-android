package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class up6 extends g1 {
    private final jk7 e;
    private final char[] f;
    private int g;
    private final xn h;

    public /* synthetic */ up6(jk7 jk7Var, char[] cArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jk7Var, (i & 2) != 0 ? mj0.c.d() : cArr);
    }

    private final void W(int i) {
        char[] cArr;
        cArr = F().a;
        if (i != 0) {
            int i2 = this.a;
            d.g(cArr, cArr, 0, i2, i2 + i);
        }
        int length = F().length();
        while (true) {
            if (i == length) {
                break;
            }
            int a = this.e.a(cArr, i, length - i);
            if (a == -1) {
                F().f(i);
                this.g = -1;
                break;
            }
            i += a;
        }
        this.a = 0;
    }

    @Override // defpackage.g1
    public String H(String str, boolean z) {
        zq3.h(str, "keyToMatch");
        return null;
    }

    @Override // defpackage.g1
    public int K(int i) {
        if (i < F().length()) {
            return i;
        }
        this.a = i;
        w();
        return (this.a != 0 || F().length() == 0) ? -1 : 0;
    }

    @Override // defpackage.g1
    public String N(int i, int i2) {
        return F().e(i, i2);
    }

    @Override // defpackage.g1
    public boolean P() {
        int M = M();
        if (M >= F().length() || M == -1 || F().charAt(M) != ',') {
            return false;
        }
        this.a++;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.g1
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public xn F() {
        return this.h;
    }

    public int V(char c, int i) {
        xn F = F();
        int length = F.length();
        while (i < length) {
            if (F.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void X() {
        mj0.c.c(this.f);
    }

    @Override // defpackage.g1
    protected void e(int i, int i2) {
        char[] cArr;
        StringBuilder E = E();
        cArr = F().a;
        E.append(cArr, i, i2 - i);
        zq3.g(E, "this.append(value, start…x, endIndex - startIndex)");
    }

    @Override // defpackage.g1
    public boolean f() {
        w();
        int i = this.a;
        while (true) {
            int K = K(i);
            if (K == -1) {
                this.a = K;
                return false;
            }
            char charAt = F().charAt(K);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.a = K;
                return G(charAt);
            }
            i = K + 1;
        }
    }

    @Override // defpackage.g1
    public String k() {
        n('\"');
        int i = this.a;
        int V = V('\"', i);
        if (V == -1) {
            int K = K(i);
            if (K != -1) {
                return r(F(), this.a, K);
            }
            g1.B(this, (byte) 1, false, 2, null);
            throw new KotlinNothingValueException();
        }
        for (int i2 = i; i2 < V; i2++) {
            if (F().charAt(i2) == '\\') {
                return r(F(), this.a, i2);
            }
        }
        this.a = V + 1;
        return N(i, V);
    }

    @Override // defpackage.g1
    public byte l() {
        w();
        xn F = F();
        int i = this.a;
        while (true) {
            int K = K(i);
            if (K == -1) {
                this.a = K;
                return (byte) 10;
            }
            int i2 = K + 1;
            byte a = h1.a(F.charAt(K));
            if (a != 3) {
                this.a = i2;
                return a;
            }
            i = i2;
        }
    }

    @Override // defpackage.g1
    public void w() {
        int length = F().length() - this.a;
        if (length > this.g) {
            return;
        }
        W(length);
    }

    public up6(jk7 jk7Var, char[] cArr) {
        zq3.h(jk7Var, "reader");
        zq3.h(cArr, "buffer");
        this.e = jk7Var;
        this.f = cArr;
        this.g = 128;
        this.h = new xn(cArr);
        W(0);
    }
}
