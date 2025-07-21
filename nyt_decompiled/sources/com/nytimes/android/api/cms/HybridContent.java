package com.nytimes.android.api.cms;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class HybridContent {
    private final String contents;

    /* JADX WARN: Multi-variable type inference failed */
    public HybridContent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ HybridContent copy$default(HybridContent hybridContent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hybridContent.contents;
        }
        return hybridContent.copy(str);
    }

    public final String component1() {
        return this.contents;
    }

    public final HybridContent copy(String str) {
        return new HybridContent(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HybridContent) && zq3.c(this.contents, ((HybridContent) obj).contents);
    }

    public final String getContents() {
        return this.contents;
    }

    public int hashCode() {
        String str = this.contents;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "HybridContent(contents=" + this.contents + ")";
    }

    public HybridContent(String str) {
        this.contents = str;
    }

    public /* synthetic */ HybridContent(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
