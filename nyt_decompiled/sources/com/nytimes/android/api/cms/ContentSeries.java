package com.nytimes.android.api.cms;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class ContentSeries {
    private final String displayName;
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public ContentSeries() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ContentSeries copy$default(ContentSeries contentSeries, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentSeries.name;
        }
        if ((i & 2) != 0) {
            str2 = contentSeries.displayName;
        }
        return contentSeries.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.displayName;
    }

    public final ContentSeries copy(String str, String str2) {
        return new ContentSeries(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentSeries)) {
            return false;
        }
        ContentSeries contentSeries = (ContentSeries) obj;
        return zq3.c(this.name, contentSeries.name) && zq3.c(this.displayName, contentSeries.displayName);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayName;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ContentSeries(name=" + this.name + ", displayName=" + this.displayName + ")";
    }

    public ContentSeries(String str, String str2) {
        this.name = str;
        this.displayName = str2;
    }

    public /* synthetic */ ContentSeries(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
