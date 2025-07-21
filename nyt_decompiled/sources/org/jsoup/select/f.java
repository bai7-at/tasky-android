package org.jsoup.select;

import java.util.Iterator;
import org.jsoup.nodes.Element;

/* loaded from: classes5.dex */
abstract class f extends org.jsoup.select.c {
    org.jsoup.select.c a;

    static class a extends f {
        public a(org.jsoup.select.c cVar) {
            this.a = cVar;
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            Iterator<Element> it2 = element2.k0().iterator();
            while (it2.hasNext()) {
                Element next = it2.next();
                if (next != element2 && this.a.a(element2, next)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format(":has(%s)", this.a);
        }
    }

    static class b extends f {
        public b(org.jsoup.select.c cVar) {
            this.a = cVar;
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            Element D;
            return (element == element2 || (D = element2.D()) == null || !this.a.a(element, D)) ? false : true;
        }

        public String toString() {
            return String.format(":ImmediateParent%s", this.a);
        }
    }

    static class c extends f {
        public c(org.jsoup.select.c cVar) {
            this.a = cVar;
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            Element A0;
            return (element == element2 || (A0 = element2.A0()) == null || !this.a.a(element, A0)) ? false : true;
        }

        public String toString() {
            return String.format(":prev%s", this.a);
        }
    }

    static class d extends f {
        public d(org.jsoup.select.c cVar) {
            this.a = cVar;
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return !this.a.a(element, element2);
        }

        public String toString() {
            return String.format(":not%s", this.a);
        }
    }

    static class e extends f {
        public e(org.jsoup.select.c cVar) {
            this.a = cVar;
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            if (element == element2) {
                return false;
            }
            for (Element D = element2.D(); !this.a.a(element, D); D = D.D()) {
                if (D == element) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return String.format(":parent%s", this.a);
        }
    }

    /* renamed from: org.jsoup.select.f$f, reason: collision with other inner class name */
    static class C0512f extends f {
        public C0512f(org.jsoup.select.c cVar) {
            this.a = cVar;
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            if (element == element2) {
                return false;
            }
            for (Element A0 = element2.A0(); A0 != null; A0 = A0.A0()) {
                if (this.a.a(element, A0)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format(":prev*%s", this.a);
        }
    }

    static class g extends org.jsoup.select.c {
        g() {
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            return element == element2;
        }
    }

    f() {
    }
}
