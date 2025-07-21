package org.jsoup.select;

import defpackage.u29;
import org.jsoup.nodes.Element;

/* loaded from: classes5.dex */
public abstract class Selector {

    public static class SelectorParseException extends IllegalStateException {
        public SelectorParseException(String str, Object... objArr) {
            super(String.format(str, objArr));
        }
    }

    public static Element a(String str, Element element) {
        u29.g(str);
        return a.b(e.t(str), element);
    }
}
