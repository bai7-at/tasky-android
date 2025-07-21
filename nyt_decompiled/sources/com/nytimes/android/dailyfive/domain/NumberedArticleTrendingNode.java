package com.nytimes.android.dailyfive.domain;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.threeten.bp.Instant;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class NumberedArticleTrendingNode extends d {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final Image e;
    private final Instant f;
    private final boolean g;

    public /* synthetic */ NumberedArticleTrendingNode(String str, String str2, String str3, String str4, Image image, Instant instant, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, image, instant, (i & 64) != 0 ? false : z);
    }

    @Override // com.nytimes.android.dailyfive.domain.b
    public String a() {
        return this.c;
    }

    @Override // com.nytimes.android.dailyfive.domain.b
    public Image b() {
        return this.e;
    }

    @Override // com.nytimes.android.dailyfive.domain.b
    public String c() {
        return this.d;
    }

    @Override // com.nytimes.android.dailyfive.domain.b
    public String d() {
        return this.a;
    }

    @Override // com.nytimes.android.dailyfive.domain.b
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NumberedArticleTrendingNode)) {
            return false;
        }
        NumberedArticleTrendingNode numberedArticleTrendingNode = (NumberedArticleTrendingNode) obj;
        return zq3.c(this.a, numberedArticleTrendingNode.a) && zq3.c(this.b, numberedArticleTrendingNode.b) && zq3.c(this.c, numberedArticleTrendingNode.c) && zq3.c(this.d, numberedArticleTrendingNode.d) && zq3.c(this.e, numberedArticleTrendingNode.e) && zq3.c(this.f, numberedArticleTrendingNode.f) && this.g == numberedArticleTrendingNode.g;
    }

    @Override // com.nytimes.android.dailyfive.domain.b
    public boolean f() {
        return this.g;
    }

    public Instant g() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        Image image = this.e;
        return ((((hashCode + (image == null ? 0 : image.hashCode())) * 31) + this.f.hashCode()) * 31) + Boolean.hashCode(this.g);
    }

    public String toString() {
        return "NumberedArticleTrendingNode(uri=" + this.a + ", url=" + this.b + ", headline=" + this.c + ", summary=" + this.d + ", promoMedia=" + this.e + ", lastModified=" + this.f + ", isOpinion=" + this.g + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberedArticleTrendingNode(String str, String str2, String str3, String str4, Image image, Instant instant, boolean z) {
        super(null);
        zq3.h(str, "uri");
        zq3.h(str2, "url");
        zq3.h(str3, "headline");
        zq3.h(str4, "summary");
        zq3.h(instant, "lastModified");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = image;
        this.f = instant;
        this.g = z;
    }
}
