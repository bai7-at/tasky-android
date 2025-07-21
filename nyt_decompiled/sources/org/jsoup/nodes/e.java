package org.jsoup.nodes;

import org.jsoup.nodes.Document;

/* loaded from: classes5.dex */
public class e extends h {
    public e(String str) {
        this.c = str;
    }

    @Override // org.jsoup.nodes.i
    void A(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    @Override // org.jsoup.nodes.i
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public e d0() {
        return (e) super.d0();
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
        return "#data";
    }

    @Override // org.jsoup.nodes.i
    void z(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        appendable.append(X());
    }
}
