package org.jsoup.parser;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.Tag;
import defpackage.bp2;
import defpackage.o48;
import defpackage.u29;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.i;
import org.jsoup.nodes.l;
import org.jsoup.parser.Token;

/* loaded from: classes5.dex */
public class b extends h {
    private HtmlTreeBuilderState k;
    private HtmlTreeBuilderState l;
    private boolean m;
    private Element n;
    private bp2 o;
    private Element p;
    private ArrayList q;
    private List r;
    private Token.g s;
    private boolean t;
    private boolean u;
    private boolean v;
    private String[] w = {null};
    static final String[] x = {"applet", "caption", AssetConstants.HTML, "marquee", "object", "table", "td", "th"};
    static final String[] y = {"ol", "ul"};
    static final String[] z = {"button"};
    static final String[] A = {AssetConstants.HTML, "table"};
    static final String[] B = {"optgroup", "option"};
    static final String[] C = {"dd", "dt", "li", "optgroup", "option", "p", "rp", "rt"};
    static final String[] D = {"address", "applet", "area", AssetConstants.ARTICLE_TYPE, "aside", "base", "basefont", "bgsound", Tag.BLOCK_QUOTE, "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", Tag.H4, "h5", "h6", "head", "header", "hgroup", "hr", AssetConstants.HTML, "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    private boolean J(String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = this.w;
        strArr3[0] = str;
        return K(strArr3, strArr, strArr2);
    }

    private boolean K(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.e.size();
        int i = size - 1;
        int i2 = i > 100 ? size - 101 : 0;
        while (i >= i2) {
            String v0 = ((Element) this.e.get(i)).v0();
            if (o48.d(v0, strArr)) {
                return true;
            }
            if (o48.d(v0, strArr2)) {
                return false;
            }
            if (strArr3 != null && o48.d(v0, strArr3)) {
                return false;
            }
            i--;
        }
        return false;
    }

    private void U(i iVar) {
        bp2 bp2Var;
        if (this.e.isEmpty()) {
            this.d.V(iVar);
        } else if (Y()) {
            S(iVar);
        } else {
            a().V(iVar);
        }
        if (iVar instanceof Element) {
            Element element = (Element) iVar;
            if (!element.F0().f() || (bp2Var = this.o) == null) {
                return;
            }
            bp2Var.M0(element);
        }
    }

    private boolean X(ArrayList arrayList, Element element) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((Element) arrayList.get(size)) == element) {
                return true;
            }
        }
        return false;
    }

    private boolean b0(Element element, Element element2) {
        return element.v0().equals(element2.v0()) && element.e().equals(element2.e());
    }

    private void m(String... strArr) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            Element element = (Element) this.e.get(size);
            if (o48.c(element.v0(), strArr) || element.v0().equals(AssetConstants.HTML)) {
                return;
            }
            this.e.remove(size);
        }
    }

    private void v0(ArrayList arrayList, Element element, Element element2) {
        int lastIndexOf = arrayList.lastIndexOf(element);
        u29.c(lastIndexOf != -1);
        arrayList.set(lastIndexOf, element2);
    }

    Element A() {
        return this.n;
    }

    void A0(Element element) {
        this.n = element;
    }

    List B() {
        return this.r;
    }

    HtmlTreeBuilderState B0() {
        return this.k;
    }

    ArrayList C() {
        return this.e;
    }

    void C0(HtmlTreeBuilderState htmlTreeBuilderState) {
        this.k = htmlTreeBuilderState;
    }

    boolean D(String str) {
        return G(str, z);
    }

    boolean E(String str) {
        return G(str, y);
    }

    boolean F(String str) {
        return G(str, null);
    }

    boolean G(String str, String[] strArr) {
        return J(str, x, strArr);
    }

    boolean H(String[] strArr) {
        return K(strArr, x, null);
    }

    boolean I(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            String v0 = ((Element) this.e.get(size)).v0();
            if (v0.equals(str)) {
                return true;
            }
            if (!o48.d(v0, B)) {
                return false;
            }
        }
        u29.a("Should not be reachable");
        return false;
    }

    boolean L(String str) {
        return J(str, A, null);
    }

    Element M(Token.h hVar) {
        org.jsoup.nodes.b bVar = hVar.j;
        if (bVar != null && !bVar.isEmpty() && hVar.j.t(this.h) > 0) {
            c("Duplicate attribute");
        }
        if (!hVar.z()) {
            Element element = new Element(f.p(hVar.A(), this.h), null, this.h.b(hVar.j));
            N(element);
            return element;
        }
        Element Q = Q(hVar);
        this.e.add(Q);
        this.c.v(TokeniserState.Data);
        this.c.l(this.s.m().B(Q.I0()));
        return Q;
    }

    void N(Element element) {
        U(element);
        this.e.add(element);
    }

    void O(Token.c cVar) {
        Element a = a();
        if (a == null) {
            a = this.d;
        }
        String v0 = a.v0();
        String q = cVar.q();
        a.V(cVar.f() ? new org.jsoup.nodes.c(q) : (v0.equals("script") || v0.equals("style")) ? new org.jsoup.nodes.e(q) : new l(q));
    }

    void P(Token.d dVar) {
        U(new org.jsoup.nodes.d(dVar.s()));
    }

    Element Q(Token.h hVar) {
        f p = f.p(hVar.A(), this.h);
        Element element = new Element(p, null, this.h.b(hVar.j));
        U(element);
        if (hVar.z()) {
            if (!p.h()) {
                p.n();
            } else if (!p.e()) {
                this.c.r("Tag cannot be self closing; not a void tag");
            }
        }
        return element;
    }

    bp2 R(Token.h hVar, boolean z2) {
        bp2 bp2Var = new bp2(f.p(hVar.A(), this.h), null, this.h.b(hVar.j));
        y0(bp2Var);
        U(bp2Var);
        if (z2) {
            this.e.add(bp2Var);
        }
        return bp2Var;
    }

    void S(i iVar) {
        Element element;
        Element z2 = z("table");
        boolean z3 = false;
        if (z2 == null) {
            element = (Element) this.e.get(0);
        } else if (z2.D() != null) {
            element = z2.D();
            z3 = true;
        } else {
            element = k(z2);
        }
        if (!z3) {
            element.V(iVar);
        } else {
            u29.i(z2);
            z2.Z(iVar);
        }
    }

    void T() {
        this.q.add(null);
    }

    void V(Element element, Element element2) {
        int lastIndexOf = this.e.lastIndexOf(element);
        u29.c(lastIndexOf != -1);
        this.e.add(lastIndexOf + 1, element2);
    }

    Element W(String str) {
        Element element = new Element(f.p(str, this.h), null);
        N(element);
        return element;
    }

    boolean Y() {
        return this.u;
    }

    boolean Z() {
        return this.v;
    }

    boolean a0(Element element) {
        return X(this.q, element);
    }

    @Override // org.jsoup.parser.h
    d b() {
        return d.c;
    }

    boolean c0(Element element) {
        return o48.d(element.v0(), D);
    }

    @Override // org.jsoup.parser.h
    protected void d(Reader reader, String str, e eVar) {
        super.d(reader, str, eVar);
        this.k = HtmlTreeBuilderState.Initial;
        this.l = null;
        this.m = false;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new Token.g();
        this.t = true;
        this.u = false;
        this.v = false;
    }

    Element d0() {
        if (this.q.size() <= 0) {
            return null;
        }
        return (Element) this.q.get(r1.size() - 1);
    }

    void e0() {
        this.l = this.k;
    }

    @Override // org.jsoup.parser.h
    protected boolean f(Token token) {
        this.g = token;
        return this.k.process(token, this);
    }

    void f0(Element element) {
        if (this.m) {
            return;
        }
        String a = element.a(Tag.HREF);
        if (a.length() != 0) {
            this.f = a;
            this.m = true;
            this.d.O(a);
        }
    }

    void g0() {
        this.r = new ArrayList();
    }

    boolean h0(Element element) {
        return X(this.e, element);
    }

    @Override // org.jsoup.parser.h
    public /* bridge */ /* synthetic */ boolean i(String str, org.jsoup.nodes.b bVar) {
        return super.i(str, bVar);
    }

    HtmlTreeBuilderState i0() {
        return this.l;
    }

    Element j0() {
        return (Element) this.e.remove(this.e.size() - 1);
    }

    Element k(Element element) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (((Element) this.e.get(size)) == element) {
                return (Element) this.e.get(size - 1);
            }
        }
        return null;
    }

    void k0(String str) {
        for (int size = this.e.size() - 1; size >= 0 && !((Element) this.e.get(size)).v0().equals(str); size--) {
            this.e.remove(size);
        }
    }

    void l() {
        while (!this.q.isEmpty() && t0() != null) {
        }
    }

    Element l0(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            Element element = (Element) this.e.get(size);
            this.e.remove(size);
            if (element.v0().equals(str)) {
                return element;
            }
        }
        return null;
    }

    void m0(String... strArr) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            Element element = (Element) this.e.get(size);
            this.e.remove(size);
            if (o48.d(element.v0(), strArr)) {
                return;
            }
        }
    }

    void n() {
        m("tbody", "tfoot", "thead", "template");
    }

    boolean n0(Token token, HtmlTreeBuilderState htmlTreeBuilderState) {
        this.g = token;
        return htmlTreeBuilderState.process(token, this);
    }

    void o() {
        m("table");
    }

    void o0(Element element) {
        this.e.add(element);
    }

    void p() {
        m("tr", "template");
    }

    void p0(Element element) {
        int size = this.q.size() - 1;
        int i = 0;
        while (true) {
            if (size >= 0) {
                Element element2 = (Element) this.q.get(size);
                if (element2 == null) {
                    break;
                }
                if (b0(element, element2)) {
                    i++;
                }
                if (i == 3) {
                    this.q.remove(size);
                    break;
                }
                size--;
            } else {
                break;
            }
        }
        this.q.add(element);
    }

    void q(HtmlTreeBuilderState htmlTreeBuilderState) {
        if (this.a.a().a()) {
            this.a.a().add(new c(this.b.H(), "Unexpected token [%s] when in state [%s]", this.g.o(), htmlTreeBuilderState));
        }
    }

    void q0() {
        Element d0 = d0();
        if (d0 == null || h0(d0)) {
            return;
        }
        boolean z2 = true;
        int size = this.q.size() - 1;
        int i = size;
        while (i != 0) {
            i--;
            d0 = (Element) this.q.get(i);
            if (d0 == null || h0(d0)) {
                z2 = false;
                break;
            }
        }
        while (true) {
            if (!z2) {
                i++;
                d0 = (Element) this.q.get(i);
            }
            u29.i(d0);
            Element W = W(d0.v0());
            W.e().g(d0.e());
            this.q.set(i, W);
            if (i == size) {
                return;
            } else {
                z2 = false;
            }
        }
    }

    void r(boolean z2) {
        this.t = z2;
    }

    void r0(Element element) {
        for (int size = this.q.size() - 1; size >= 0; size--) {
            if (((Element) this.q.get(size)) == element) {
                this.q.remove(size);
                return;
            }
        }
    }

    boolean s() {
        return this.t;
    }

    boolean s0(Element element) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (((Element) this.e.get(size)) == element) {
                this.e.remove(size);
                return true;
            }
        }
        return false;
    }

    void t() {
        u(null);
    }

    Element t0() {
        int size = this.q.size();
        if (size > 0) {
            return (Element) this.q.remove(size - 1);
        }
        return null;
    }

    public String toString() {
        return "TreeBuilder{currentToken=" + this.g + ", state=" + this.k + ", currentElement=" + a() + '}';
    }

    void u(String str) {
        while (str != null && !a().v0().equals(str) && o48.d(a().v0(), C)) {
            j0();
        }
    }

    void u0(Element element, Element element2) {
        v0(this.q, element, element2);
    }

    Element v(String str) {
        for (int size = this.q.size() - 1; size >= 0; size--) {
            Element element = (Element) this.q.get(size);
            if (element == null) {
                return null;
            }
            if (element.v0().equals(str)) {
                return element;
            }
        }
        return null;
    }

    String w() {
        return this.f;
    }

    void w0(Element element, Element element2) {
        v0(this.e, element, element2);
    }

    Document x() {
        return this.d;
    }

    void x0() {
        boolean z2 = false;
        for (int size = this.e.size() - 1; size >= 0; size--) {
            Element element = (Element) this.e.get(size);
            if (size == 0) {
                element = this.p;
                z2 = true;
            }
            String v0 = element.v0();
            if ("select".equals(v0)) {
                C0(HtmlTreeBuilderState.InSelect);
                return;
            }
            if ("td".equals(v0) || ("th".equals(v0) && !z2)) {
                C0(HtmlTreeBuilderState.InCell);
                return;
            }
            if ("tr".equals(v0)) {
                C0(HtmlTreeBuilderState.InRow);
                return;
            }
            if ("tbody".equals(v0) || "thead".equals(v0) || "tfoot".equals(v0)) {
                C0(HtmlTreeBuilderState.InTableBody);
                return;
            }
            if ("caption".equals(v0)) {
                C0(HtmlTreeBuilderState.InCaption);
                return;
            }
            if ("colgroup".equals(v0)) {
                C0(HtmlTreeBuilderState.InColumnGroup);
                return;
            }
            if ("table".equals(v0)) {
                C0(HtmlTreeBuilderState.InTable);
                return;
            }
            if ("head".equals(v0)) {
                C0(HtmlTreeBuilderState.InBody);
                return;
            }
            if ("body".equals(v0)) {
                C0(HtmlTreeBuilderState.InBody);
                return;
            }
            if ("frameset".equals(v0)) {
                C0(HtmlTreeBuilderState.InFrameset);
                return;
            } else if (AssetConstants.HTML.equals(v0)) {
                C0(HtmlTreeBuilderState.BeforeHead);
                return;
            } else {
                if (z2) {
                    C0(HtmlTreeBuilderState.InBody);
                    return;
                }
            }
        }
    }

    bp2 y() {
        return this.o;
    }

    void y0(bp2 bp2Var) {
        this.o = bp2Var;
    }

    Element z(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            Element element = (Element) this.e.get(size);
            if (element.v0().equals(str)) {
                return element;
            }
        }
        return null;
    }

    void z0(boolean z2) {
        this.u = z2;
    }
}
