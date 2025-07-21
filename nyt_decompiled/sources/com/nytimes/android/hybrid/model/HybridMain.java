package com.nytimes.android.hybrid.model;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class HybridMain {
    private final String contents;

    public HybridMain(String str) {
        zq3.h(str, "contents");
        this.contents = str;
    }

    public static /* synthetic */ HybridMain copy$default(HybridMain hybridMain, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hybridMain.contents;
        }
        return hybridMain.copy(str);
    }

    public final String component1() {
        return this.contents;
    }

    public final HybridMain copy(String str) {
        zq3.h(str, "contents");
        return new HybridMain(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HybridMain) && zq3.c(this.contents, ((HybridMain) obj).contents);
    }

    public final String getContents() {
        return this.contents;
    }

    public int hashCode() {
        return this.contents.hashCode();
    }

    public String toString() {
        return "HybridMain(contents=" + this.contents + ")";
    }
}
