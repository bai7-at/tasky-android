package org.jsoup.nodes;

import defpackage.u29;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
abstract class h extends i {
    private static final List d = Collections.emptyList();
    Object c;

    h() {
    }

    private void V() {
        if (r()) {
            return;
        }
        Object obj = this.c;
        b bVar = new b();
        this.c = bVar;
        if (obj != null) {
            bVar.H(v(), (String) obj);
        }
    }

    String T() {
        return c(v());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.jsoup.nodes.i
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public h m(i iVar) {
        h hVar = (h) super.m(iVar);
        if (r()) {
            hVar.c = ((b) this.c).clone();
        }
        return hVar;
    }

    @Override // org.jsoup.nodes.i
    public String a(String str) {
        V();
        return super.a(str);
    }

    @Override // org.jsoup.nodes.i
    public String c(String str) {
        u29.i(str);
        return !r() ? str.equals(v()) ? (String) this.c : "" : super.c(str);
    }

    @Override // org.jsoup.nodes.i
    public i d(String str, String str2) {
        if (r() || !str.equals(v())) {
            V();
            super.d(str, str2);
        } else {
            this.c = str2;
        }
        return this;
    }

    @Override // org.jsoup.nodes.i
    public final b e() {
        V();
        return (b) this.c;
    }

    @Override // org.jsoup.nodes.i
    public String f() {
        return s() ? D().f() : "";
    }

    @Override // org.jsoup.nodes.i
    public int i() {
        return 0;
    }

    @Override // org.jsoup.nodes.i
    protected void n(String str) {
    }

    @Override // org.jsoup.nodes.i
    public i o() {
        return this;
    }

    @Override // org.jsoup.nodes.i
    protected List p() {
        return d;
    }

    @Override // org.jsoup.nodes.i
    public boolean q(String str) {
        V();
        return super.q(str);
    }

    @Override // org.jsoup.nodes.i
    protected final boolean r() {
        return this.c instanceof b;
    }
}
