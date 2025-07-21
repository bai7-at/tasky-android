package com.nytimes.android.api.config.model;

import defpackage.zq3;

/* loaded from: classes3.dex */
public final class TextChunk {
    private final String style;
    private final String text;

    public TextChunk(String str, String str2) {
        zq3.h(str, "text");
        zq3.h(str2, "style");
        this.text = str;
        this.style = str2;
    }

    public static /* synthetic */ TextChunk copy$default(TextChunk textChunk, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textChunk.text;
        }
        if ((i & 2) != 0) {
            str2 = textChunk.style;
        }
        return textChunk.copy(str, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.style;
    }

    public final TextChunk copy(String str, String str2) {
        zq3.h(str, "text");
        zq3.h(str2, "style");
        return new TextChunk(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextChunk)) {
            return false;
        }
        TextChunk textChunk = (TextChunk) obj;
        return zq3.c(this.text, textChunk.text) && zq3.c(this.style, textChunk.style);
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.style.hashCode();
    }

    public String toString() {
        return "TextChunk(text=" + this.text + ", style=" + this.style + ")";
    }
}
