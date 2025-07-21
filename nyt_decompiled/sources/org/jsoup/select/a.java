package org.jsoup.select;

import defpackage.c85;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.i;
import org.jsoup.select.NodeFilter;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: org.jsoup.select.a$a, reason: collision with other inner class name */
    private static class C0509a implements c85 {
        private final Element a;
        private final Elements b;
        private final c c;

        C0509a(Element element, Elements elements, c cVar) {
            this.a = element;
            this.b = elements;
            this.c = cVar;
        }

        @Override // defpackage.c85
        public void a(i iVar, int i) {
        }

        @Override // defpackage.c85
        public void b(i iVar, int i) {
            if (iVar instanceof Element) {
                Element element = (Element) iVar;
                if (this.c.a(this.a, element)) {
                    this.b.add(element);
                }
            }
        }
    }

    private static class b implements NodeFilter {
        private final Element a;
        private Element b = null;
        private final c c;

        b(Element element, c cVar) {
            this.a = element;
            this.c = cVar;
        }

        @Override // org.jsoup.select.NodeFilter
        public NodeFilter.FilterResult a(i iVar, int i) {
            return NodeFilter.FilterResult.CONTINUE;
        }

        @Override // org.jsoup.select.NodeFilter
        public NodeFilter.FilterResult b(i iVar, int i) {
            if (iVar instanceof Element) {
                Element element = (Element) iVar;
                if (this.c.a(this.a, element)) {
                    this.b = element;
                    return NodeFilter.FilterResult.STOP;
                }
            }
            return NodeFilter.FilterResult.CONTINUE;
        }
    }

    public static Elements a(c cVar, Element element) {
        Elements elements = new Elements();
        d.b(new C0509a(element, elements, cVar), element);
        return elements;
    }

    public static Element b(c cVar, Element element) {
        b bVar = new b(element, cVar);
        d.a(bVar, element);
        return bVar.b;
    }
}
