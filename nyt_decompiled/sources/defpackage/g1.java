package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.Constants;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes5.dex */
public abstract class g1 {
    protected int a;
    private String c;
    public final bu3 b = new bu3();
    private StringBuilder d = new StringBuilder();

    public static /* synthetic */ Void B(g1 g1Var, byte b, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return g1Var.A(b, z);
    }

    private final int D(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        z(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final String O() {
        String str = this.c;
        zq3.e(str);
        this.c = null;
        return str;
    }

    public static /* synthetic */ boolean R(g1 g1Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return g1Var.Q(z);
    }

    private final boolean T() {
        return F().charAt(this.a - 1) != '\"';
    }

    private final int b(int i) {
        int K = K(i);
        if (K == -1) {
            z(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i2 = K + 1;
        char charAt = F().charAt(K);
        if (charAt == 'u') {
            return d(F(), i2);
        }
        char b = h1.b(charAt);
        if (b != 0) {
            this.d.append(b);
            return i2;
        }
        z(this, "Invalid escaped char '" + charAt + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final int c(int i, int i2) {
        e(i, i2);
        return b(i2 + 1);
    }

    private final int d(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            this.d.append((char) ((D(charSequence, i) << 12) + (D(charSequence, i + 1) << 8) + (D(charSequence, i + 2) << 4) + D(charSequence, i + 3)));
            return i2;
        }
        this.a = i;
        w();
        if (this.a + 4 < charSequence.length()) {
            return d(charSequence, this.a);
        }
        z(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean h(int i) {
        int K = K(i);
        if (K >= F().length() || K == -1) {
            z(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i2 = K + 1;
        int charAt = F().charAt(K) | ' ';
        if (charAt == 102) {
            j("alse", i2);
            return false;
        }
        if (charAt == 116) {
            j("rue", i2);
            return true;
        }
        z(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final void j(String str, int i) {
        if (F().length() - i < str.length()) {
            z(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (F().charAt(i + i2) | ' ')) {
                z(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        this.a = i + str.length();
    }

    private static final double p(long j, boolean z) {
        if (!z) {
            return Math.pow(10.0d, -j);
        }
        if (z) {
            return Math.pow(10.0d, j);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String u(int i, int i2) {
        e(i, i2);
        String sb = this.d.toString();
        zq3.g(sb, "toString(...)");
        this.d.setLength(0);
        return sb;
    }

    public static /* synthetic */ Void z(g1 g1Var, String str, int i, String str2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i2 & 2) != 0) {
            i = g1Var.a;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        return g1Var.y(str, i, str2);
    }

    public final Void A(byte b, boolean z) {
        String c = h1.c(b);
        int i = z ? this.a - 1 : this.a;
        z(this, "Expected " + c + ", but had '" + ((this.a == F().length() || i < 0) ? "EOF" : String.valueOf(F().charAt(i))) + "' instead", i, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final void C(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        y("Encountered an unknown key '" + str + '\'', h.h0(N(0, this.a), str, 0, false, 6, null), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new KotlinNothingValueException();
    }

    protected final StringBuilder E() {
        return this.d;
    }

    protected abstract CharSequence F();

    protected final boolean G(char c) {
        return !(c == '}' || c == ']' || c == ':' || c == ',');
    }

    public abstract String H(String str, boolean z);

    public final byte I() {
        CharSequence F = F();
        int i = this.a;
        while (true) {
            int K = K(i);
            if (K == -1) {
                this.a = K;
                return (byte) 10;
            }
            char charAt = F.charAt(K);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.a = K;
                return h1.a(charAt);
            }
            i = K + 1;
        }
    }

    public final String J(boolean z) {
        String q;
        byte I = I();
        if (z) {
            if (I != 1 && I != 0) {
                return null;
            }
            q = s();
        } else {
            if (I != 1) {
                return null;
            }
            q = q();
        }
        this.c = q;
        return q;
    }

    public abstract int K(int i);

    public final void L(boolean z) {
        ArrayList arrayList = new ArrayList();
        byte I = I();
        if (I != 8 && I != 6) {
            s();
            return;
        }
        while (true) {
            byte I2 = I();
            if (I2 != 1) {
                if (I2 == 8 || I2 == 6) {
                    arrayList.add(Byte.valueOf(I2));
                } else if (I2 == 9) {
                    if (((Number) i.w0(arrayList)).byteValue() != 8) {
                        throw qt3.f(this.a, "found ] instead of } at path: " + this.b, F());
                    }
                    i.L(arrayList);
                } else if (I2 == 7) {
                    if (((Number) i.w0(arrayList)).byteValue() != 6) {
                        throw qt3.f(this.a, "found } instead of ] at path: " + this.b, F());
                    }
                    i.L(arrayList);
                } else if (I2 == 10) {
                    z(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                l();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z) {
                s();
            } else {
                k();
            }
        }
    }

    public int M() {
        int K;
        char charAt;
        int i = this.a;
        while (true) {
            K = K(i);
            if (K == -1 || !((charAt = F().charAt(K)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i = K + 1;
        }
        this.a = K;
        return K;
    }

    public String N(int i, int i2) {
        return F().subSequence(i, i2).toString();
    }

    public abstract boolean P();

    public final boolean Q(boolean z) {
        int K = K(M());
        int length = F().length() - K;
        if (length < 4 || K == -1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (Constants.NULL_VERSION_ID.charAt(i) != F().charAt(K + i)) {
                return false;
            }
        }
        if (length > 4 && h1.a(F().charAt(K + 4)) == 0) {
            return false;
        }
        if (!z) {
            return true;
        }
        this.a = K + 4;
        return true;
    }

    protected final void S(char c) {
        int i = this.a;
        if (i > 0 && c == '\"') {
            try {
                this.a = i - 1;
                String s = s();
                this.a = i;
                if (zq3.c(s, Constants.NULL_VERSION_ID)) {
                    y("Expected string literal but 'null' literal was found", this.a - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls to default values.");
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th) {
                this.a = i;
                throw th;
            }
        }
        B(this, h1.a(c), false, 2, null);
        throw new KotlinNothingValueException();
    }

    protected void e(int i, int i2) {
        this.d.append(F(), i, i2);
    }

    public abstract boolean f();

    public final boolean g() {
        return h(M());
    }

    public final boolean i() {
        boolean z;
        int M = M();
        if (M == F().length()) {
            z(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (F().charAt(M) == '\"') {
            M++;
            z = true;
        } else {
            z = false;
        }
        boolean h = h(M);
        if (z) {
            if (this.a == F().length()) {
                z(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (F().charAt(this.a) != '\"') {
                z(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            this.a++;
        }
        return h;
    }

    public abstract String k();

    public abstract byte l();

    public final byte m(byte b) {
        byte l = l();
        if (l == b) {
            return l;
        }
        B(this, b, false, 2, null);
        throw new KotlinNothingValueException();
    }

    public void n(char c) {
        w();
        CharSequence F = F();
        int i = this.a;
        while (true) {
            int K = K(i);
            if (K == -1) {
                this.a = K;
                S(c);
                return;
            }
            int i2 = K + 1;
            char charAt = F.charAt(K);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.a = i2;
                if (charAt == c) {
                    return;
                } else {
                    S(c);
                }
            }
            i = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0142, code lost:
    
        if (r8 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0144, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0147, code lost:
    
        if (r1 == r8) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0149, code lost:
    
        if (r10 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014d, code lost:
    
        if (r1 == (r8 - 1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014f, code lost:
    
        if (r2 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0151, code lost:
    
        if (r4 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015d, code lost:
    
        if (F().charAt(r8) != '\"') goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015f, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0162, code lost:
    
        z(r17, "Expected closing quotation mark", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0172, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0173, code lost:
    
        z(r17, "EOF", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0183, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0184, code lost:
    
        r17.a = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0186, code lost:
    
        if (r9 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0188, code lost:
    
        r1 = r11 * p(r13, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0192, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0198, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a0, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a2, code lost:
    
        r11 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a4, code lost:
    
        z(r17, "Can't convert " + r1 + " to Long", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c8, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c9, code lost:
    
        z(r17, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d9, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01da, code lost:
    
        if (r10 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e1, code lost:
    
        if (r11 == Long.MIN_VALUE) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01e4, code lost:
    
        return -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01e5, code lost:
    
        z(r17, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01f5, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f6, code lost:
    
        z(r17, "Expected numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0206, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0146, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long o() {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g1.o():long");
    }

    public final String q() {
        return this.c != null ? O() : k();
    }

    protected final String r(CharSequence charSequence, int i, int i2) {
        int K;
        zq3.h(charSequence, "source");
        char charAt = charSequence.charAt(i2);
        boolean z = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                K = K(c(i, i2));
                if (K == -1) {
                    z(this, "Unexpected EOF", K, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    e(i, i2);
                    K = K(i2);
                    if (K == -1) {
                        z(this, "Unexpected EOF", K, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    continue;
                    charAt = charSequence.charAt(i2);
                }
            }
            z = true;
            i = K;
            i2 = i;
            charAt = charSequence.charAt(i2);
        }
        String N = !z ? N(i, i2) : u(i, i2);
        this.a = i2 + 1;
        return N;
    }

    public final String s() {
        if (this.c != null) {
            return O();
        }
        int M = M();
        if (M >= F().length() || M == -1) {
            z(this, "EOF", M, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte a = h1.a(F().charAt(M));
        if (a == 1) {
            return q();
        }
        if (a != 0) {
            z(this, "Expected beginning of the string, but got " + F().charAt(M), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean z = false;
        while (h1.a(F().charAt(M)) == 0) {
            M++;
            if (M >= F().length()) {
                e(this.a, M);
                int K = K(M);
                if (K == -1) {
                    this.a = M;
                    return u(0, 0);
                }
                M = K;
                z = true;
            }
        }
        String N = !z ? N(this.a, M) : u(this.a, M);
        this.a = M;
        return N;
    }

    public final String t() {
        String s = s();
        if (!zq3.c(s, Constants.NULL_VERSION_ID) || !T()) {
            return s;
        }
        z(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) F()) + "', currentPosition=" + this.a + ')';
    }

    public final void v() {
        this.c = null;
    }

    public void w() {
    }

    public final void x() {
        if (l() == 10) {
            return;
        }
        z(this, "Expected EOF after parsing, but had " + F().charAt(this.a - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final Void y(String str, int i, String str2) {
        String str3;
        zq3.h(str, "message");
        zq3.h(str2, "hint");
        if (str2.length() == 0) {
            str3 = "";
        } else {
            str3 = '\n' + str2;
        }
        throw qt3.f(i, str + " at path: " + this.b.a() + str3, F());
    }
}
