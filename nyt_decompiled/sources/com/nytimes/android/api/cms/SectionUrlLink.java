package com.nytimes.android.api.cms;

import com.facebook.AuthenticationTokenClaims;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class SectionUrlLink {
    public static final Companion Companion = new Companion(null);
    public static final String NAME_RECENTLY_VIEWED = "recentlyviewed";
    private final String name;
    private final Integer rank;
    private final String title;
    private final String url;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SectionUrlLink(String str, String str2, String str3, Integer num) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, "title");
        zq3.h(str3, "url");
        this.name = str;
        this.title = str2;
        this.url = str3;
        this.rank = num;
    }

    public static /* synthetic */ SectionUrlLink copy$default(SectionUrlLink sectionUrlLink, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sectionUrlLink.name;
        }
        if ((i & 2) != 0) {
            str2 = sectionUrlLink.title;
        }
        if ((i & 4) != 0) {
            str3 = sectionUrlLink.url;
        }
        if ((i & 8) != 0) {
            num = sectionUrlLink.rank;
        }
        return sectionUrlLink.copy(str, str2, str3, num);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.url;
    }

    public final Integer component4() {
        return this.rank;
    }

    public final SectionUrlLink copy(String str, String str2, String str3, Integer num) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, "title");
        zq3.h(str3, "url");
        return new SectionUrlLink(str, str2, str3, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionUrlLink)) {
            return false;
        }
        SectionUrlLink sectionUrlLink = (SectionUrlLink) obj;
        return zq3.c(this.name, sectionUrlLink.name) && zq3.c(this.title, sectionUrlLink.title) && zq3.c(this.url, sectionUrlLink.url) && zq3.c(this.rank, sectionUrlLink.rank);
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getRank() {
        return this.rank;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = ((((this.name.hashCode() * 31) + this.title.hashCode()) * 31) + this.url.hashCode()) * 31;
        Integer num = this.rank;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "SectionUrlLink(name=" + this.name + ", title=" + this.title + ", url=" + this.url + ", rank=" + this.rank + ")";
    }
}
