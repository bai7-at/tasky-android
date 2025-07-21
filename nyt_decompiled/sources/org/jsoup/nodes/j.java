package org.jsoup.nodes;

import org.jsoup.nodes.Document;

/* loaded from: classes5.dex */
abstract class j {
    static Document.OutputSettings a(i iVar) {
        Document B = iVar.B();
        if (B == null) {
            B = new Document("");
        }
        return B.N0();
    }

    static org.jsoup.parser.e b(i iVar) {
        Document B = iVar.B();
        return (B == null || B.P0() == null) ? new org.jsoup.parser.e(new org.jsoup.parser.b()) : B.P0();
    }
}
