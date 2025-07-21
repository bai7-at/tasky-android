package org.jsoup.parser;

import defpackage.a95;

/* loaded from: classes5.dex */
public class d {
    public static final d c = new d(false, false);
    public static final d d = new d(true, true);
    private final boolean a;
    private final boolean b;

    public d(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public String a(String str) {
        String trim = str.trim();
        return !this.b ? a95.a(trim) : trim;
    }

    org.jsoup.nodes.b b(org.jsoup.nodes.b bVar) {
        if (bVar != null && !this.b) {
            bVar.F();
        }
        return bVar;
    }

    public String c(String str) {
        String trim = str.trim();
        return !this.a ? a95.a(trim) : trim;
    }

    public boolean d() {
        return this.b;
    }

    public boolean e() {
        return this.a;
    }
}
