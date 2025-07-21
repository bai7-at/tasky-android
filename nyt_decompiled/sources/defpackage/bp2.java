package defpackage;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.b;
import org.jsoup.nodes.i;
import org.jsoup.parser.f;
import org.jsoup.select.Elements;

/* loaded from: classes5.dex */
public class bp2 extends Element {
    private final Elements j;

    public bp2(f fVar, String str, b bVar) {
        super(fVar, str, bVar);
        this.j = new Elements();
    }

    @Override // org.jsoup.nodes.i
    protected void I(i iVar) {
        super.I(iVar);
        this.j.remove(iVar);
    }

    public bp2 M0(Element element) {
        this.j.add(element);
        return this;
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.i
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public bp2 d0() {
        return (bp2) super.d0();
    }
}
