package org.jsoup.select;

import com.amazonaws.services.s3.model.InstructionFileId;
import defpackage.a95;
import defpackage.ln8;
import defpackage.o48;
import defpackage.u29;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.select.Selector;
import org.jsoup.select.b;
import org.jsoup.select.c;
import org.jsoup.select.f;

/* loaded from: classes5.dex */
public class e {
    private static final String[] d = {",", ">", "+", "~", " "};
    private static final String[] e = {"=", "!=", "^=", "$=", "*=", "~="};
    private static final Pattern f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    private static final Pattern g = Pattern.compile("([+-])?(\\d+)");
    private ln8 a;
    private String b;
    private List c = new ArrayList();

    private e(String str) {
        u29.g(str);
        String trim = str.trim();
        this.b = trim;
        this.a = new ln8(trim);
    }

    private void a() {
        this.c.add(new c.a());
    }

    private void b() {
        ln8 ln8Var = new ln8(this.a.a('[', ']'));
        String h = ln8Var.h(e);
        u29.g(h);
        ln8Var.i();
        if (ln8Var.j()) {
            if (h.startsWith("^")) {
                this.c.add(new c.d(h.substring(1)));
                return;
            } else {
                this.c.add(new c.b(h));
                return;
            }
        }
        if (ln8Var.k("=")) {
            this.c.add(new c.e(h, ln8Var.q()));
            return;
        }
        if (ln8Var.k("!=")) {
            this.c.add(new c.i(h, ln8Var.q()));
            return;
        }
        if (ln8Var.k("^=")) {
            this.c.add(new c.j(h, ln8Var.q()));
            return;
        }
        if (ln8Var.k("$=")) {
            this.c.add(new c.g(h, ln8Var.q()));
        } else if (ln8Var.k("*=")) {
            this.c.add(new c.f(h, ln8Var.q()));
        } else {
            if (!ln8Var.k("~=")) {
                throw new Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", this.b, ln8Var.q());
            }
            this.c.add(new c.h(h, Pattern.compile(ln8Var.q())));
        }
    }

    private void c() {
        String e2 = this.a.e();
        u29.g(e2);
        this.c.add(new c.k(e2.trim()));
    }

    private void d() {
        String e2 = this.a.e();
        u29.g(e2);
        this.c.add(new c.p(e2));
    }

    private void e() {
        String b = a95.b(this.a.f());
        u29.g(b);
        if (b.startsWith("*|")) {
            this.c.add(new b.C0510b(new c.j0(b), new c.k0(b.replace("*|", ":"))));
            return;
        }
        if (b.contains("|")) {
            b = b.replace("|", ":");
        }
        this.c.add(new c.j0(b));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f(char r11) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.e.f(char):void");
    }

    private int g() {
        String trim = this.a.b(")").trim();
        u29.d(o48.h(trim), "Index must be numeric");
        return Integer.parseInt(trim);
    }

    private String h() {
        StringBuilder b = o48.b();
        while (!this.a.j()) {
            if (this.a.l("(")) {
                b.append("(");
                b.append(this.a.a('(', ')'));
                b.append(")");
            } else if (this.a.l("[")) {
                b.append("[");
                b.append(this.a.a('[', ']'));
                b.append("]");
            } else {
                if (this.a.n(d)) {
                    break;
                }
                b.append(this.a.c());
            }
        }
        return o48.m(b);
    }

    private void i(boolean z) {
        this.a.d(z ? ":containsOwn" : ":contains");
        String s = ln8.s(this.a.a('(', ')'));
        u29.h(s, ":contains(text) query must not be empty");
        if (z) {
            this.c.add(new c.m(s));
        } else {
            this.c.add(new c.n(s));
        }
    }

    private void j() {
        this.a.d(":containsData");
        String s = ln8.s(this.a.a('(', ')'));
        u29.h(s, ":containsData(text) query must not be empty");
        this.c.add(new c.l(s));
    }

    private void k(boolean z, boolean z2) {
        String b = a95.b(this.a.b(")"));
        Matcher matcher = f.matcher(b);
        Matcher matcher2 = g.matcher(b);
        int i = 2;
        int i2 = 1;
        if (!"odd".equals(b)) {
            if ("even".equals(b)) {
                i2 = 0;
            } else if (matcher.matches()) {
                int parseInt = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                i2 = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", "")) : 0;
                i = parseInt;
            } else {
                if (!matcher2.matches()) {
                    throw new Selector.SelectorParseException("Could not parse nth-index '%s': unexpected format", b);
                }
                i2 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i = 0;
            }
        }
        if (z2) {
            if (z) {
                this.c.add(new c.b0(i, i2));
                return;
            } else {
                this.c.add(new c.c0(i, i2));
                return;
            }
        }
        if (z) {
            this.c.add(new c.a0(i, i2));
        } else {
            this.c.add(new c.z(i, i2));
        }
    }

    private void l() {
        if (this.a.k("#")) {
            d();
            return;
        }
        if (this.a.k(InstructionFileId.DOT)) {
            c();
            return;
        }
        if (this.a.p() || this.a.l("*|")) {
            e();
            return;
        }
        if (this.a.l("[")) {
            b();
            return;
        }
        if (this.a.k("*")) {
            a();
            return;
        }
        if (this.a.k(":lt(")) {
            p();
            return;
        }
        if (this.a.k(":gt(")) {
            o();
            return;
        }
        if (this.a.k(":eq(")) {
            n();
            return;
        }
        if (this.a.l(":has(")) {
            m();
            return;
        }
        if (this.a.l(":contains(")) {
            i(false);
            return;
        }
        if (this.a.l(":containsOwn(")) {
            i(true);
            return;
        }
        if (this.a.l(":containsData(")) {
            j();
            return;
        }
        if (this.a.l(":matches(")) {
            q(false);
            return;
        }
        if (this.a.l(":matchesOwn(")) {
            q(true);
            return;
        }
        if (this.a.l(":not(")) {
            r();
            return;
        }
        if (this.a.k(":nth-child(")) {
            k(false, false);
            return;
        }
        if (this.a.k(":nth-last-child(")) {
            k(true, false);
            return;
        }
        if (this.a.k(":nth-of-type(")) {
            k(false, true);
            return;
        }
        if (this.a.k(":nth-last-of-type(")) {
            k(true, true);
            return;
        }
        if (this.a.k(":first-child")) {
            this.c.add(new c.v());
            return;
        }
        if (this.a.k(":last-child")) {
            this.c.add(new c.x());
            return;
        }
        if (this.a.k(":first-of-type")) {
            this.c.add(new c.w());
            return;
        }
        if (this.a.k(":last-of-type")) {
            this.c.add(new c.y());
            return;
        }
        if (this.a.k(":only-child")) {
            this.c.add(new c.d0());
            return;
        }
        if (this.a.k(":only-of-type")) {
            this.c.add(new c.e0());
            return;
        }
        if (this.a.k(":empty")) {
            this.c.add(new c.u());
        } else if (this.a.k(":root")) {
            this.c.add(new c.f0());
        } else {
            if (!this.a.k(":matchText")) {
                throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.b, this.a.q());
            }
            this.c.add(new c.g0());
        }
    }

    private void m() {
        this.a.d(":has");
        String a = this.a.a('(', ')');
        u29.h(a, ":has(el) subselect must not be empty");
        this.c.add(new f.a(t(a)));
    }

    private void n() {
        this.c.add(new c.q(g()));
    }

    private void o() {
        this.c.add(new c.s(g()));
    }

    private void p() {
        this.c.add(new c.t(g()));
    }

    private void q(boolean z) {
        this.a.d(z ? ":matchesOwn" : ":matches");
        String a = this.a.a('(', ')');
        u29.h(a, ":matches(regex) query must not be empty");
        if (z) {
            this.c.add(new c.i0(Pattern.compile(a)));
        } else {
            this.c.add(new c.h0(Pattern.compile(a)));
        }
    }

    private void r() {
        this.a.d(":not");
        String a = this.a.a('(', ')');
        u29.h(a, ":not(selector) subselect must not be empty");
        this.c.add(new f.d(t(a)));
    }

    public static c t(String str) {
        try {
            return new e(str).s();
        } catch (IllegalArgumentException e2) {
            throw new Selector.SelectorParseException(e2.getMessage(), new Object[0]);
        }
    }

    c s() {
        this.a.i();
        if (this.a.n(d)) {
            this.c.add(new f.g());
            f(this.a.c());
        } else {
            l();
        }
        while (!this.a.j()) {
            boolean i = this.a.i();
            if (this.a.n(d)) {
                f(this.a.c());
            } else if (i) {
                f(' ');
            } else {
                l();
            }
        }
        return this.c.size() == 1 ? (c) this.c.get(0) : new b.a(this.c);
    }
}
