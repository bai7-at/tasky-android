package org.jsoup.select;

import defpackage.a95;
import defpackage.u29;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/* loaded from: classes5.dex */
public abstract class c {

    public static final class a extends c {
        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return true;
        }

        public String toString() {
            return "*";
        }
    }

    public static final class a0 extends o {
        public a0(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jsoup.select.c.o
        protected int b(Element element, Element element2) {
            return element2.D().c0().size() - element2.i0();
        }

        @Override // org.jsoup.select.c.o
        protected String c() {
            return "nth-last-child";
        }
    }

    public static final class b extends c {
        private String a;

        public b(String str) {
            this.a = str;
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return element2.q(this.a);
        }

        public String toString() {
            return String.format("[%s]", this.a);
        }
    }

    public static class b0 extends o {
        public b0(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jsoup.select.c.o
        protected int b(Element element, Element element2) {
            Elements c0 = element2.D().c0();
            int i = 0;
            for (int i0 = element2.i0(); i0 < c0.size(); i0++) {
                if (c0.get(i0).F0().equals(element2.F0())) {
                    i++;
                }
            }
            return i;
        }

        @Override // org.jsoup.select.c.o
        protected String c() {
            return "nth-last-of-type";
        }
    }

    /* renamed from: org.jsoup.select.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0511c extends c {
        String a;
        String b;

        public AbstractC0511c(String str, String str2) {
            this(str, str2, true);
        }

        public AbstractC0511c(String str, String str2, boolean z) {
            u29.g(str);
            u29.g(str2);
            this.a = a95.b(str);
            boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
            str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
            this.b = z ? a95.b(str2) : a95.c(str2, z2);
        }
    }

    public static class c0 extends o {
        public c0(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jsoup.select.c.o
        protected int b(Element element, Element element2) {
            Iterator<Element> it2 = element2.D().c0().iterator();
            int i = 0;
            while (it2.hasNext()) {
                Element next = it2.next();
                if (next.F0().equals(element2.F0())) {
                    i++;
                }
                if (next == element2) {
                    break;
                }
            }
            return i;
        }

        @Override // org.jsoup.select.c.o
        protected String c() {
            return "nth-of-type";
        }
    }

    public static final class d extends c {
        private String a;

        public d(String str) {
            u29.g(str);
            this.a = a95.a(str);
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            Iterator it2 = element2.e().k().iterator();
            while (it2.hasNext()) {
                if (a95.a(((org.jsoup.nodes.a) it2.next()).getKey()).startsWith(this.a)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("[^%s]", this.a);
        }
    }

    public static final class d0 extends c {
        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            Element D = element2.D();
            return (D == null || (D instanceof Document) || !element2.E0().isEmpty()) ? false : true;
        }

        public String toString() {
            return ":only-child";
        }
    }

    public static final class e extends AbstractC0511c {
        public e(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return element2.q(this.a) && this.b.equalsIgnoreCase(element2.c(this.a).trim());
        }

        public String toString() {
            return String.format("[%s=%s]", this.a, this.b);
        }
    }

    public static final class e0 extends c {
        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            Element D = element2.D();
            if (D == null || (D instanceof Document)) {
                return false;
            }
            Iterator<Element> it2 = D.c0().iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (it2.next().F0().equals(element2.F0())) {
                    i++;
                }
            }
            return i == 1;
        }

        public String toString() {
            return ":only-of-type";
        }
    }

    public static final class f extends AbstractC0511c {
        public f(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return element2.q(this.a) && a95.a(element2.c(this.a)).contains(this.b);
        }

        public String toString() {
            return String.format("[%s*=%s]", this.a, this.b);
        }
    }

    public static final class f0 extends c {
        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            if (element instanceof Document) {
                element = element.a0(0);
            }
            return element2 == element;
        }

        public String toString() {
            return ":root";
        }
    }

    public static final class g extends AbstractC0511c {
        public g(String str, String str2) {
            super(str, str2, false);
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return element2.q(this.a) && a95.a(element2.c(this.a)).endsWith(this.b);
        }

        public String toString() {
            return String.format("[%s$=%s]", this.a, this.b);
        }
    }

    public static final class g0 extends c {
        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            if (element2 instanceof org.jsoup.nodes.k) {
                return true;
            }
            for (org.jsoup.nodes.i iVar : element2.L0()) {
                org.jsoup.nodes.k kVar = new org.jsoup.nodes.k(org.jsoup.parser.f.o(element2.I0()), element2.f(), element2.e());
                iVar.M(kVar);
                kVar.V(iVar);
            }
            return false;
        }

        public String toString() {
            return ":matchText";
        }
    }

    public static final class h extends c {
        String a;
        Pattern b;

        public h(String str, Pattern pattern) {
            this.a = a95.b(str);
            this.b = pattern;
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return element2.q(this.a) && this.b.matcher(element2.c(this.a)).find();
        }

        public String toString() {
            return String.format("[%s~=%s]", this.a, this.b.toString());
        }
    }

    public static final class h0 extends c {
        private Pattern a;

        public h0(Pattern pattern) {
            this.a = pattern;
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return this.a.matcher(element2.J0()).find();
        }

        public String toString() {
            return String.format(":matches(%s)", this.a);
        }
    }

    public static final class i extends AbstractC0511c {
        public i(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return !this.b.equalsIgnoreCase(element2.c(this.a));
        }

        public String toString() {
            return String.format("[%s!=%s]", this.a, this.b);
        }
    }

    public static final class i0 extends c {
        private Pattern a;

        public i0(Pattern pattern) {
            this.a = pattern;
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return this.a.matcher(element2.w0()).find();
        }

        public String toString() {
            return String.format(":matchesOwn(%s)", this.a);
        }
    }

    public static final class j extends AbstractC0511c {
        public j(String str, String str2) {
            super(str, str2, false);
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return element2.q(this.a) && a95.a(element2.c(this.a)).startsWith(this.b);
        }

        public String toString() {
            return String.format("[%s^=%s]", this.a, this.b);
        }
    }

    public static final class j0 extends c {
        private String a;

        public j0(String str) {
            this.a = str;
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return element2.v0().equals(this.a);
        }

        public String toString() {
            return String.format("%s", this.a);
        }
    }

    public static final class k extends c {
        private String a;

        public k(String str) {
            this.a = str;
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return element2.l0(this.a);
        }

        public String toString() {
            return String.format(".%s", this.a);
        }
    }

    public static final class k0 extends c {
        private String a;

        public k0(String str) {
            this.a = str;
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return element2.v0().endsWith(this.a);
        }

        public String toString() {
            return String.format("%s", this.a);
        }
    }

    public static final class l extends c {
        private String a;

        public l(String str) {
            this.a = a95.a(str);
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return a95.a(element2.g0()).contains(this.a);
        }

        public String toString() {
            return String.format(":containsData(%s)", this.a);
        }
    }

    public static final class m extends c {
        private String a;

        public m(String str) {
            this.a = a95.a(str);
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return a95.a(element2.w0()).contains(this.a);
        }

        public String toString() {
            return String.format(":containsOwn(%s)", this.a);
        }
    }

    public static final class n extends c {
        private String a;

        public n(String str) {
            this.a = a95.a(str);
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return a95.a(element2.J0()).contains(this.a);
        }

        public String toString() {
            return String.format(":contains(%s)", this.a);
        }
    }

    public static abstract class o extends c {
        protected final int a;
        protected final int b;

        public o(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            Element D = element2.D();
            if (D == null || (D instanceof Document)) {
                return false;
            }
            int b = b(element, element2);
            int i = this.a;
            if (i == 0) {
                return b == this.b;
            }
            int i2 = this.b;
            return (b - i2) * i >= 0 && (b - i2) % i == 0;
        }

        protected abstract int b(Element element, Element element2);

        protected abstract String c();

        public String toString() {
            return this.a == 0 ? String.format(":%s(%d)", c(), Integer.valueOf(this.b)) : this.b == 0 ? String.format(":%s(%dn)", c(), Integer.valueOf(this.a)) : String.format(":%s(%dn%+d)", c(), Integer.valueOf(this.a), Integer.valueOf(this.b));
        }
    }

    public static final class p extends c {
        private String a;

        public p(String str) {
            this.a = str;
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return this.a.equals(element2.p0());
        }

        public String toString() {
            return String.format("#%s", this.a);
        }
    }

    public static final class q extends r {
        public q(int i) {
            super(i);
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return element2.i0() == this.a;
        }

        public String toString() {
            return String.format(":eq(%d)", Integer.valueOf(this.a));
        }
    }

    public static abstract class r extends c {
        int a;

        public r(int i) {
            this.a = i;
        }
    }

    public static final class s extends r {
        public s(int i) {
            super(i);
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return element2.i0() > this.a;
        }

        public String toString() {
            return String.format(":gt(%d)", Integer.valueOf(this.a));
        }
    }

    public static final class t extends r {
        public t(int i) {
            super(i);
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return element != element2 && element2.i0() < this.a;
        }

        public String toString() {
            return String.format(":lt(%d)", Integer.valueOf(this.a));
        }
    }

    public static final class u extends c {
        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            for (org.jsoup.nodes.i iVar : element2.k()) {
                if (!(iVar instanceof org.jsoup.nodes.d) && !(iVar instanceof org.jsoup.nodes.f)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return ":empty";
        }
    }

    public static final class v extends c {
        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            Element D = element2.D();
            return (D == null || (D instanceof Document) || element2.i0() != 0) ? false : true;
        }

        public String toString() {
            return ":first-child";
        }
    }

    public static final class w extends c0 {
        public w() {
            super(0, 1);
        }

        @Override // org.jsoup.select.c.o
        public String toString() {
            return ":first-of-type";
        }
    }

    public static final class x extends c {
        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            Element D = element2.D();
            return (D == null || (D instanceof Document) || element2.i0() != D.c0().size() - 1) ? false : true;
        }

        public String toString() {
            return ":last-child";
        }
    }

    public static final class y extends b0 {
        public y() {
            super(0, 1);
        }

        @Override // org.jsoup.select.c.o
        public String toString() {
            return ":last-of-type";
        }
    }

    public static final class z extends o {
        public z(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jsoup.select.c.o
        protected int b(Element element, Element element2) {
            return element2.i0() + 1;
        }

        @Override // org.jsoup.select.c.o
        protected String c() {
            return "nth-child";
        }
    }

    protected c() {
    }

    public abstract boolean a(Element element, Element element2);
}
