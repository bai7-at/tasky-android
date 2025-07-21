package org.jsoup.parser;

import com.comscore.streaming.WindowState;
import defpackage.u29;
import java.util.Arrays;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.Token;

/* loaded from: classes5.dex */
final class g {
    private static final char[] r;
    static final int[] s = {8364, 129, 8218, WindowState.MINIMIZED, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    private final a a;
    private final ParseErrorList b;
    private Token d;
    Token.i i;
    private String o;
    private TokeniserState c = TokeniserState.Data;
    private boolean e = false;
    private String f = null;
    private StringBuilder g = new StringBuilder(1024);
    StringBuilder h = new StringBuilder(1024);
    Token.h j = new Token.h();
    Token.g k = new Token.g();
    Token.c l = new Token.c();
    Token.e m = new Token.e();
    Token.d n = new Token.d();
    private final int[] p = new int[1];
    private final int[] q = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        r = cArr;
        Arrays.sort(cArr);
    }

    g(a aVar, ParseErrorList parseErrorList) {
        this.a = aVar;
        this.b = parseErrorList;
    }

    private void c(String str) {
        if (this.b.a()) {
            this.b.add(new c(this.a.H(), "Invalid character reference: %s", str));
        }
    }

    void a(TokeniserState tokeniserState) {
        this.a.a();
        this.c = tokeniserState;
    }

    String b() {
        return this.o;
    }

    int[] d(Character ch, boolean z) {
        int i;
        if (this.a.t()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.a.s()) || this.a.B(r)) {
            return null;
        }
        int[] iArr = this.p;
        this.a.v();
        if (this.a.w("#")) {
            boolean x = this.a.x("X");
            a aVar = this.a;
            String h = x ? aVar.h() : aVar.g();
            if (h.length() == 0) {
                c("numeric reference with no numerals");
                this.a.J();
                return null;
            }
            this.a.L();
            if (!this.a.w(";")) {
                c("missing semicolon");
            }
            try {
                i = Integer.valueOf(h, x ? 16 : 10).intValue();
            } catch (NumberFormatException unused) {
                i = -1;
            }
            if (i == -1 || ((i >= 55296 && i <= 57343) || i > 1114111)) {
                c("character outside of valid range");
                iArr[0] = 65533;
                return iArr;
            }
            if (i >= 128) {
                int[] iArr2 = s;
                if (i < iArr2.length + 128) {
                    c("character is not a valid unicode code point");
                    i = iArr2[i - 128];
                }
            }
            iArr[0] = i;
            return iArr;
        }
        String j = this.a.j();
        boolean y = this.a.y(';');
        if (!Entities.f(j) && (!Entities.g(j) || !y)) {
            this.a.J();
            if (y) {
                c("invalid named reference");
            }
            return null;
        }
        if (z && (this.a.E() || this.a.C() || this.a.A('=', '-', '_'))) {
            this.a.J();
            return null;
        }
        this.a.L();
        if (!this.a.w(";")) {
            c("missing semicolon");
        }
        int d = Entities.d(j, this.q);
        if (d == 1) {
            iArr[0] = this.q[0];
            return iArr;
        }
        if (d == 2) {
            return this.q;
        }
        u29.a("Unexpected characters returned for " + j);
        return this.q;
    }

    void e() {
        this.n.m();
        this.n.d = true;
    }

    void f() {
        this.n.m();
    }

    void g() {
        this.m.m();
    }

    Token.i h(boolean z) {
        Token.i m = z ? this.j.m() : this.k.m();
        this.i = m;
        return m;
    }

    void i() {
        Token.n(this.h);
    }

    void j(char c) {
        k(String.valueOf(c));
    }

    void k(String str) {
        if (this.f == null) {
            this.f = str;
            return;
        }
        if (this.g.length() == 0) {
            this.g.append(this.f);
        }
        this.g.append(str);
    }

    void l(Token token) {
        u29.b(this.e);
        this.d = token;
        this.e = true;
        Token.TokenType tokenType = token.a;
        if (tokenType == Token.TokenType.StartTag) {
            this.o = ((Token.h) token).b;
        } else {
            if (tokenType != Token.TokenType.EndTag || ((Token.g) token).j == null) {
                return;
            }
            r("Attributes incorrectly present on end tag");
        }
    }

    void m(int[] iArr) {
        k(new String(iArr, 0, iArr.length));
    }

    void n() {
        l(this.n);
    }

    void o() {
        l(this.m);
    }

    void p() {
        this.i.x();
        l(this.i);
    }

    void q(TokeniserState tokeniserState) {
        if (this.b.a()) {
            this.b.add(new c(this.a.H(), "Unexpectedly reached end of file (EOF) in input state [%s]", tokeniserState));
        }
    }

    void r(String str) {
        if (this.b.a()) {
            this.b.add(new c(this.a.H(), str));
        }
    }

    void s(TokeniserState tokeniserState) {
        if (this.b.a()) {
            this.b.add(new c(this.a.H(), "Unexpected character '%s' in input state [%s]", Character.valueOf(this.a.s()), tokeniserState));
        }
    }

    boolean t() {
        return this.o != null && this.i.A().equalsIgnoreCase(this.o);
    }

    Token u() {
        while (!this.e) {
            this.c.read(this, this.a);
        }
        StringBuilder sb = this.g;
        if (sb.length() != 0) {
            String sb2 = sb.toString();
            sb.delete(0, sb.length());
            this.f = null;
            return this.l.p(sb2);
        }
        String str = this.f;
        if (str == null) {
            this.e = false;
            return this.d;
        }
        Token.c p = this.l.p(str);
        this.f = null;
        return p;
    }

    void v(TokeniserState tokeniserState) {
        this.c = tokeniserState;
    }
}
