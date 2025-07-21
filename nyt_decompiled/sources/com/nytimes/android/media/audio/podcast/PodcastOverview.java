package com.nytimes.android.media.audio.podcast;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.et3;
import defpackage.zq3;
import defpackage.zv5;
import java.util.List;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class PodcastOverview implements zv5 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final PodcastTypeInfo g;
    private final List h;

    public PodcastOverview(String str, String str2, String str3, String str4, String str5, String str6, PodcastTypeInfo podcastTypeInfo, List list) {
        zq3.h(str, "id");
        zq3.h(str2, "title");
        zq3.h(str3, "description");
        zq3.h(str4, "uri");
        zq3.h(str5, "imageUrl");
        zq3.h(str6, "heroImageUrl");
        zq3.h(podcastTypeInfo, TransferTable.COLUMN_TYPE);
        zq3.h(list, "subscriptions");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = podcastTypeInfo;
        this.h = list;
    }

    @Override // defpackage.zv5
    public String a() {
        return this.e;
    }

    @Override // defpackage.zv5
    public String b() {
        return this.f;
    }

    public List c() {
        return this.h;
    }

    public String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastOverview)) {
            return false;
        }
        PodcastOverview podcastOverview = (PodcastOverview) obj;
        return zq3.c(this.a, podcastOverview.a) && zq3.c(this.b, podcastOverview.b) && zq3.c(this.c, podcastOverview.c) && zq3.c(this.d, podcastOverview.d) && zq3.c(this.e, podcastOverview.e) && zq3.c(this.f, podcastOverview.f) && this.g == podcastOverview.g && zq3.c(this.h, podcastOverview.h);
    }

    @Override // defpackage.zv5
    public String getDescription() {
        return this.c;
    }

    @Override // defpackage.zv5
    public String getId() {
        return this.a;
    }

    @Override // defpackage.zv5
    public String getTitle() {
        return this.b;
    }

    @Override // defpackage.zv5
    public PodcastTypeInfo getType() {
        return this.g;
    }

    public int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public String toString() {
        return "PodcastOverview(id=" + this.a + ", title=" + this.b + ", description=" + this.c + ", uri=" + this.d + ", imageUrl=" + this.e + ", heroImageUrl=" + this.f + ", type=" + this.g + ", subscriptions=" + this.h + ")";
    }
}
