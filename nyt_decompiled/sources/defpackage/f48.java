package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class f48 extends g1 {
    private final String e;

    public f48(String str) {
        zq3.h(str, "source");
        this.e = str;
    }

    @Override // defpackage.g1
    public String H(String str, boolean z) {
        zq3.h(str, "keyToMatch");
        int i = this.a;
        try {
            if (l() == 6 && zq3.c(J(z), str)) {
                v();
                if (l() == 5) {
                    return J(z);
                }
            }
            return null;
        } finally {
            this.a = i;
            v();
        }
    }

    @Override // defpackage.g1
    public int K(int i) {
        if (i < F().length()) {
            return i;
        }
        return -1;
    }

    @Override // defpackage.g1
    public int M() {
        char charAt;
        int i = this.a;
        if (i == -1) {
            return i;
        }
        while (i < F().length() && ((charAt = F().charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i++;
        }
        this.a = i;
        return i;
    }

    @Override // defpackage.g1
    public boolean P() {
        int M = M();
        if (M == F().length() || M == -1 || F().charAt(M) != ',') {
            return false;
        }
        this.a++;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.g1
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public String F() {
        return this.e;
    }

    @Override // defpackage.g1
    public boolean f() {
        int i = this.a;
        if (i == -1) {
            return false;
        }
        while (i < F().length()) {
            char charAt = F().charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.a = i;
                return G(charAt);
            }
            i++;
        }
        this.a = i;
        return false;
    }

    @Override // defpackage.g1
    public String k() {
        n('\"');
        int i = this.a;
        int a0 = h.a0(F(), '\"', i, false, 4, null);
        if (a0 == -1) {
            s();
            A((byte) 1, false);
            throw new KotlinNothingValueException();
        }
        for (int i2 = i; i2 < a0; i2++) {
            if (F().charAt(i2) == '\\') {
                return r(F(), this.a, i2);
            }
        }
        this.a = a0 + 1;
        String substring = F().substring(i, a0);
        zq3.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @Override // defpackage.g1
    public byte l() {
        byte a;
        String F = F();
        do {
            int i = this.a;
            if (i == -1 || i >= F.length()) {
                return (byte) 10;
            }
            int i2 = this.a;
            this.a = i2 + 1;
            a = h1.a(F.charAt(i2));
        } while (a == 3);
        return a;
    }

    @Override // defpackage.g1
    public void n(char c) {
        if (this.a == -1) {
            S(c);
        }
        String F = F();
        while (this.a < F.length()) {
            int i = this.a;
            this.a = i + 1;
            char charAt = F.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == c) {
                    return;
                } else {
                    S(c);
                }
            }
        }
        this.a = -1;
        S(c);
    }
}
