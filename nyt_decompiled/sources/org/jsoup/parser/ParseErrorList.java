package org.jsoup.parser;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public class ParseErrorList extends ArrayList<c> {
    private final int maxSize;

    ParseErrorList(int i, int i2) {
        super(i);
        this.maxSize = i2;
    }

    public static ParseErrorList c() {
        return new ParseErrorList(0, 0);
    }

    boolean a() {
        return size() < this.maxSize;
    }
}
