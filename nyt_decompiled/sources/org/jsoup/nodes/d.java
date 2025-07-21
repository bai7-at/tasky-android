package org.jsoup.nodes;

import org.jsoup.nodes.Document;

/* loaded from: classes5.dex */
public class d extends h {
    public d(String str) {
        this.c = str;
    }

    @Override // org.jsoup.nodes.i
    void A(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    @Override // org.jsoup.nodes.i
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public d d0() {
        return (d) super.d0();
    }

    public String X() {
        return T();
    }

    @Override // org.jsoup.nodes.h, org.jsoup.nodes.i
    public /* bridge */ /* synthetic */ String a(String str) {
        return super.a(str);
    }

    @Override // org.jsoup.nodes.h, org.jsoup.nodes.i
    public /* bridge */ /* synthetic */ String c(String str) {
        return super.c(str);
    }

    @Override // org.jsoup.nodes.h, org.jsoup.nodes.i
    public /* bridge */ /* synthetic */ String f() {
        return super.f();
    }

    @Override // org.jsoup.nodes.h, org.jsoup.nodes.i
    public /* bridge */ /* synthetic */ int i() {
        return super.i();
    }

    @Override // org.jsoup.nodes.h, org.jsoup.nodes.i
    public /* bridge */ /* synthetic */ i o() {
        return super.o();
    }

    @Override // org.jsoup.nodes.h, org.jsoup.nodes.i
    public /* bridge */ /* synthetic */ boolean q(String str) {
        return super.q(str);
    }

    @Override // org.jsoup.nodes.i
    public String toString() {
        return x();
    }

    @Override // org.jsoup.nodes.i
    public String v() {
        return "#comment";
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r5.g() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (((org.jsoup.nodes.Element) r0).F0().b() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        t(r3, r4, r5);
     */
    @Override // org.jsoup.nodes.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void z(java.lang.Appendable r3, int r4, org.jsoup.nodes.Document.OutputSettings r5) {
        /*
            r2 = this;
            boolean r0 = r5.i()
            if (r0 == 0) goto L27
            int r0 = r2.R()
            if (r0 != 0) goto L1e
            org.jsoup.nodes.i r0 = r2.a
            boolean r1 = r0 instanceof org.jsoup.nodes.Element
            if (r1 == 0) goto L1e
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            org.jsoup.parser.f r0 = r0.F0()
            boolean r0 = r0.b()
            if (r0 != 0) goto L24
        L1e:
            boolean r0 = r5.g()
            if (r0 == 0) goto L27
        L24:
            r2.t(r3, r4, r5)
        L27:
            java.lang.String r4 = "<!--"
            java.lang.Appendable r3 = r3.append(r4)
            java.lang.String r2 = r2.X()
            java.lang.Appendable r2 = r3.append(r2)
            java.lang.String r3 = "-->"
            r2.append(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.d.z(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings):void");
    }
}
