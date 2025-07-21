package com.nytimes.xwords.hybrid.rest;

import androidx.annotation.Keep;
import defpackage.zq3;

@Keep
/* loaded from: classes4.dex */
public final class Page {
    public static final int $stable = 0;
    private final String content;

    public Page(String str) {
        zq3.h(str, "content");
        this.content = str;
    }

    public static /* synthetic */ Page copy$default(Page page, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = page.content;
        }
        return page.copy(str);
    }

    public final String component1() {
        return this.content;
    }

    public final Page copy(String str) {
        zq3.h(str, "content");
        return new Page(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Page) && zq3.c(this.content, ((Page) obj).content);
    }

    public final String getContent() {
        return this.content;
    }

    public int hashCode() {
        return this.content.hashCode();
    }

    public String toString() {
        return "Page(content=" + this.content + ")";
    }
}
