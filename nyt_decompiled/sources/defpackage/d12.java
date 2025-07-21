package defpackage;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
final class d12 {
    private final String a;
    private SymbolShapeHint b;
    private final StringBuilder c;
    int d;
    private int e;
    private jd8 f;
    private int g;

    d12(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c);
        }
        this.a = sb.toString();
        this.b = SymbolShapeHint.FORCE_NONE;
        this.c = new StringBuilder(str.length());
        this.e = -1;
    }

    private int h() {
        return this.a.length() - this.g;
    }

    public int a() {
        return this.c.length();
    }

    public StringBuilder b() {
        return this.c;
    }

    public char c() {
        return this.a.charAt(this.d);
    }

    public String d() {
        return this.a;
    }

    public int e() {
        return this.e;
    }

    public int f() {
        return h() - this.d;
    }

    public jd8 g() {
        return this.f;
    }

    public boolean i() {
        return this.d < h();
    }

    public void j() {
        this.e = -1;
    }

    public void k() {
        this.f = null;
    }

    public void l(pq1 pq1Var, pq1 pq1Var2) {
    }

    public void m(int i) {
        this.g = i;
    }

    public void n(SymbolShapeHint symbolShapeHint) {
        this.b = symbolShapeHint;
    }

    public void o(int i) {
        this.e = i;
    }

    public void p() {
        q(a());
    }

    public void q(int i) {
        jd8 jd8Var = this.f;
        if (jd8Var == null || i > jd8Var.a()) {
            this.f = jd8.l(i, this.b, null, null, true);
        }
    }

    public void r(char c) {
        this.c.append(c);
    }

    public void s(String str) {
        this.c.append(str);
    }
}
