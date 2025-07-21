package org.jsoup.parser;

import java.io.StringReader;
import org.jsoup.nodes.Document;

/* loaded from: classes5.dex */
public class e {
    private h a;
    private ParseErrorList b = ParseErrorList.c();
    private d c;

    public e(h hVar) {
        this.a = hVar;
        this.c = hVar.b();
    }

    public static Document b(String str, String str2) {
        b bVar = new b();
        return bVar.e(new StringReader(str), str2, new e(bVar));
    }

    public ParseErrorList a() {
        return this.b;
    }

    public d c() {
        return this.c;
    }
}
