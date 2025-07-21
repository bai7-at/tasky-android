package org.jsoup.nodes;

import defpackage.c85;
import defpackage.o48;
import defpackage.u29;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.jsoup.helper.ChangeNotifyingArrayList;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.select.Selector;
import org.jsoup.select.c;

/* loaded from: classes5.dex */
public class Element extends i {
    private static final List g = Collections.emptyList();
    private static final Pattern h = Pattern.compile("\\s+");
    private static final String i = b.D("baseUri");
    private org.jsoup.parser.f c;
    private WeakReference d;
    List e;
    private b f;

    private static final class NodeList extends ChangeNotifyingArrayList<i> {
        private final Element owner;

        NodeList(Element element, int i) {
            super(i);
            this.owner = element;
        }

        @Override // org.jsoup.helper.ChangeNotifyingArrayList
        public void a() {
            this.owner.w();
        }
    }

    class a implements c85 {
        final /* synthetic */ StringBuilder a;

        a(StringBuilder sb) {
            this.a = sb;
        }

        @Override // defpackage.c85
        public void a(i iVar, int i) {
            if ((iVar instanceof Element) && ((Element) iVar).r0() && (iVar.u() instanceof l) && !l.Z(this.a)) {
                this.a.append(' ');
            }
        }

        @Override // defpackage.c85
        public void b(i iVar, int i) {
            if (iVar instanceof l) {
                Element.W(this.a, (l) iVar);
            } else if (iVar instanceof Element) {
                Element element = (Element) iVar;
                if (this.a.length() > 0) {
                    if ((element.r0() || element.c.c().equals("br")) && !l.Z(this.a)) {
                        this.a.append(' ');
                    }
                }
            }
        }
    }

    public Element(org.jsoup.parser.f fVar, String str, b bVar) {
        u29.i(fVar);
        this.e = g;
        this.f = bVar;
        this.c = fVar;
        if (str != null) {
            O(str);
        }
    }

    private static String C0(Element element, String str) {
        while (element != null) {
            if (element.r() && element.f.w(str)) {
                return element.f.u(str);
            }
            element = element.D();
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void W(StringBuilder sb, l lVar) {
        String X = lVar.X();
        if (z0(lVar.a) || (lVar instanceof c)) {
            sb.append(X);
        } else {
            o48.a(sb, X, l.Z(sb));
        }
    }

    private static void X(Element element, StringBuilder sb) {
        if (!element.c.c().equals("br") || l.Z(sb)) {
            return;
        }
        sb.append(" ");
    }

    private List b0() {
        List list;
        WeakReference weakReference = this.d;
        if (weakReference != null && (list = (List) weakReference.get()) != null) {
            return list;
        }
        int size = this.e.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = (i) this.e.get(i2);
            if (iVar instanceof Element) {
                arrayList.add((Element) iVar);
            }
        }
        this.d = new WeakReference(arrayList);
        return arrayList;
    }

    private static int q0(Element element, List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2) == element) {
                return i2;
            }
        }
        return 0;
    }

    private boolean s0(Document.OutputSettings outputSettings) {
        return this.c.b() || (D() != null && D().F0().b()) || outputSettings.g();
    }

    private boolean u0(Document.OutputSettings outputSettings) {
        return (!F0().g() || F0().e() || !D().r0() || F() == null || outputSettings.g()) ? false : true;
    }

    private void x0(StringBuilder sb) {
        for (i iVar : this.e) {
            if (iVar instanceof l) {
                W(sb, (l) iVar);
            } else if (iVar instanceof Element) {
                X((Element) iVar, sb);
            }
        }
    }

    static boolean z0(i iVar) {
        if (iVar instanceof Element) {
            Element element = (Element) iVar;
            int i2 = 0;
            while (!element.c.l()) {
                element = element.D();
                i2++;
                if (i2 < 6 && element != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // org.jsoup.nodes.i
    void A(Appendable appendable, int i2, Document.OutputSettings outputSettings) {
        if (this.e.isEmpty() && this.c.i()) {
            return;
        }
        if (outputSettings.i() && !this.e.isEmpty() && (this.c.b() || (outputSettings.g() && (this.e.size() > 1 || (this.e.size() == 1 && !(this.e.get(0) instanceof l)))))) {
            t(appendable, i2, outputSettings);
        }
        appendable.append("</").append(I0()).append('>');
    }

    public Element A0() {
        List b0;
        int q0;
        if (this.a != null && (q0 = q0(this, (b0 = D().b0()))) > 0) {
            return (Element) b0.get(q0 - 1);
        }
        return null;
    }

    @Override // org.jsoup.nodes.i
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public Element N() {
        return (Element) super.N();
    }

    public Element D0(String str) {
        return Selector.a(str, this);
    }

    public Elements E0() {
        if (this.a == null) {
            return new Elements(0);
        }
        List<Element> b0 = D().b0();
        Elements elements = new Elements(b0.size() - 1);
        for (Element element : b0) {
            if (element != this) {
                elements.add(element);
            }
        }
        return elements;
    }

    public org.jsoup.parser.f F0() {
        return this.c;
    }

    public String I0() {
        return this.c.c();
    }

    public String J0() {
        StringBuilder b = o48.b();
        org.jsoup.select.d.b(new a(b), this);
        return o48.m(b).trim();
    }

    public List L0() {
        ArrayList arrayList = new ArrayList();
        for (i iVar : this.e) {
            if (iVar instanceof l) {
                arrayList.add((l) iVar);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Element V(i iVar) {
        u29.i(iVar);
        J(iVar);
        p();
        this.e.add(iVar);
        iVar.Q(this.e.size() - 1);
        return this;
    }

    public Element Y(String str, String str2) {
        super.d(str, str2);
        return this;
    }

    public Element Z(i iVar) {
        return (Element) super.g(iVar);
    }

    public Element a0(int i2) {
        return (Element) b0().get(i2);
    }

    public Elements c0() {
        return new Elements(b0());
    }

    @Override // org.jsoup.nodes.i
    public Element d0() {
        return (Element) super.d0();
    }

    @Override // org.jsoup.nodes.i
    public b e() {
        if (!r()) {
            this.f = new b();
        }
        return this.f;
    }

    @Override // org.jsoup.nodes.i
    public String f() {
        return C0(this, i);
    }

    public String g0() {
        StringBuilder b = o48.b();
        for (i iVar : this.e) {
            if (iVar instanceof e) {
                b.append(((e) iVar).X());
            } else if (iVar instanceof d) {
                b.append(((d) iVar).X());
            } else if (iVar instanceof Element) {
                b.append(((Element) iVar).g0());
            } else if (iVar instanceof c) {
                b.append(((c) iVar).X());
            }
        }
        return o48.m(b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.jsoup.nodes.i
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public Element m(i iVar) {
        Element element = (Element) super.m(iVar);
        b bVar = this.f;
        element.f = bVar != null ? bVar.clone() : null;
        NodeList nodeList = new NodeList(element, this.e.size());
        element.e = nodeList;
        nodeList.addAll(this.e);
        element.O(f());
        return element;
    }

    @Override // org.jsoup.nodes.i
    public int i() {
        return this.e.size();
    }

    public int i0() {
        if (D() == null) {
            return 0;
        }
        return q0(this, D().b0());
    }

    @Override // org.jsoup.nodes.i
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public Element o() {
        this.e.clear();
        return this;
    }

    public Elements k0() {
        return org.jsoup.select.a.a(new c.a(), this);
    }

    public boolean l0(String str) {
        if (!r()) {
            return false;
        }
        String v = this.f.v("class");
        int length = v.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(v);
            }
            boolean z = false;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (Character.isWhitespace(v.charAt(i3))) {
                    if (!z) {
                        continue;
                    } else {
                        if (i3 - i2 == length2 && v.regionMatches(true, i2, str, 0, length2)) {
                            return true;
                        }
                        z = false;
                    }
                } else if (!z) {
                    i2 = i3;
                    z = true;
                }
            }
            if (z && length - i2 == length2) {
                return v.regionMatches(true, i2, str, 0, length2);
            }
        }
        return false;
    }

    @Override // org.jsoup.nodes.i
    protected void n(String str) {
        e().H(i, str);
    }

    public Appendable n0(Appendable appendable) {
        int size = this.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((i) this.e.get(i2)).y(appendable);
        }
        return appendable;
    }

    public String o0() {
        StringBuilder b = o48.b();
        n0(b);
        String m = o48.m(b);
        return j.a(this).i() ? m.trim() : m;
    }

    @Override // org.jsoup.nodes.i
    protected List p() {
        if (this.e == g) {
            this.e = new NodeList(this, 4);
        }
        return this.e;
    }

    public String p0() {
        return r() ? this.f.v("id") : "";
    }

    @Override // org.jsoup.nodes.i
    protected boolean r() {
        return this.f != null;
    }

    public boolean r0() {
        return this.c.d();
    }

    @Override // org.jsoup.nodes.i
    public String v() {
        return this.c.c();
    }

    public String v0() {
        return this.c.k();
    }

    @Override // org.jsoup.nodes.i
    void w() {
        super.w();
        this.d = null;
    }

    public String w0() {
        StringBuilder b = o48.b();
        x0(b);
        return o48.m(b).trim();
    }

    @Override // org.jsoup.nodes.i
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public final Element D() {
        return (Element) this.a;
    }

    @Override // org.jsoup.nodes.i
    void z(Appendable appendable, int i2, Document.OutputSettings outputSettings) {
        if (outputSettings.i() && s0(outputSettings) && !u0(outputSettings)) {
            if (!(appendable instanceof StringBuilder)) {
                t(appendable, i2, outputSettings);
            } else if (((StringBuilder) appendable).length() > 0) {
                t(appendable, i2, outputSettings);
            }
        }
        appendable.append('<').append(I0());
        b bVar = this.f;
        if (bVar != null) {
            bVar.z(appendable, outputSettings);
        }
        if (!this.e.isEmpty() || !this.c.i()) {
            appendable.append('>');
        } else if (outputSettings.k() == Document.OutputSettings.Syntax.html && this.c.e()) {
            appendable.append('>');
        } else {
            appendable.append(" />");
        }
    }

    public Element(org.jsoup.parser.f fVar, String str) {
        this(fVar, str, null);
    }
}
