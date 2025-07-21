package org.jsoup.nodes;

import defpackage.o48;
import org.jsoup.nodes.Document;

/* loaded from: classes5.dex */
public class l extends h {
    public l(String str) {
        this.c = str;
    }

    static boolean Z(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    @Override // org.jsoup.nodes.i
    void A(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    @Override // org.jsoup.nodes.i
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public l d0() {
        return (l) super.d0();
    }

    public String X() {
        return T();
    }

    public boolean Y() {
        return o48.f(T());
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
        return "#text";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (Y() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        t(r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (Y() == false) goto L18;
     */
    @Override // org.jsoup.nodes.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void z(java.lang.Appendable r10, int r11, org.jsoup.nodes.Document.OutputSettings r12) {
        /*
            r9 = this;
            boolean r0 = r12.i()
            if (r0 == 0) goto L3d
            int r1 = r9.R()
            if (r1 != 0) goto L24
            org.jsoup.nodes.i r1 = r9.a
            boolean r2 = r1 instanceof org.jsoup.nodes.Element
            if (r2 == 0) goto L24
            org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
            org.jsoup.parser.f r1 = r1.F0()
            boolean r1 = r1.b()
            if (r1 == 0) goto L24
            boolean r1 = r9.Y()
            if (r1 == 0) goto L3a
        L24:
            boolean r1 = r12.g()
            if (r1 == 0) goto L3d
            java.util.List r1 = r9.S()
            int r1 = r1.size()
            if (r1 <= 0) goto L3d
            boolean r1 = r9.Y()
            if (r1 != 0) goto L3d
        L3a:
            r9.t(r10, r11, r12)
        L3d:
            r11 = 0
            r1 = 1
            if (r0 == 0) goto L4b
            org.jsoup.nodes.i r2 = r9.a
            boolean r2 = org.jsoup.nodes.Element.z0(r2)
            if (r2 != 0) goto L4b
            r7 = r1
            goto L4c
        L4b:
            r7 = r11
        L4c:
            if (r0 == 0) goto L56
            org.jsoup.nodes.i r0 = r9.a
            boolean r0 = r0 instanceof org.jsoup.nodes.Document
            if (r0 == 0) goto L56
            r8 = r1
            goto L57
        L56:
            r8 = r11
        L57:
            java.lang.String r4 = r9.T()
            r6 = 0
            r3 = r10
            r5 = r12
            org.jsoup.nodes.Entities.e(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.l.z(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings):void");
    }
}
