package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.UncheckedIOException;
import org.jsoup.nodes.Document;

/* loaded from: classes5.dex */
public class c extends l {
    public c(String str) {
        super(str);
    }

    @Override // org.jsoup.nodes.l, org.jsoup.nodes.i
    void A(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override // org.jsoup.nodes.l, org.jsoup.nodes.i
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public c d0() {
        return (c) super.d0();
    }

    @Override // org.jsoup.nodes.l, org.jsoup.nodes.i
    public String v() {
        return "#cdata";
    }

    @Override // org.jsoup.nodes.l, org.jsoup.nodes.i
    void z(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        appendable.append("<![CDATA[").append(X());
    }
}
