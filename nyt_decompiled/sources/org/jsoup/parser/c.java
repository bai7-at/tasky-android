package org.jsoup.parser;

/* loaded from: classes5.dex */
public class c {
    private int a;
    private String b;

    c(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public String toString() {
        return this.a + ": " + this.b;
    }

    c(int i, String str, Object... objArr) {
        this.b = String.format(str, objArr);
        this.a = i;
    }
}
