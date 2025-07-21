package com.nytimes.android.resourcedownloader.model;

import com.nytimes.android.resourcedownloader.data.ResourceEntity;
import defpackage.zq3;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class Resource {
    private final String body;
    private final Instant date;
    private final String etag;
    private final Instant expires;
    private final Long maxAgeSeconds;
    private final String url;

    public Resource(String str, Instant instant, Instant instant2, Long l, String str2, String str3) {
        zq3.h(str, "url");
        zq3.h(str3, "body");
        this.url = str;
        this.date = instant;
        this.expires = instant2;
        this.maxAgeSeconds = l;
        this.etag = str2;
        this.body = str3;
    }

    public static /* synthetic */ Resource copy$default(Resource resource, String str, Instant instant, Instant instant2, Long l, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resource.url;
        }
        if ((i & 2) != 0) {
            instant = resource.date;
        }
        Instant instant3 = instant;
        if ((i & 4) != 0) {
            instant2 = resource.expires;
        }
        Instant instant4 = instant2;
        if ((i & 8) != 0) {
            l = resource.maxAgeSeconds;
        }
        Long l2 = l;
        if ((i & 16) != 0) {
            str2 = resource.etag;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            str3 = resource.body;
        }
        return resource.copy(str, instant3, instant4, l2, str4, str3);
    }

    public final String component1() {
        return this.url;
    }

    public final Instant component2() {
        return this.date;
    }

    public final Instant component3() {
        return this.expires;
    }

    public final Long component4() {
        return this.maxAgeSeconds;
    }

    public final String component5() {
        return this.etag;
    }

    public final String component6() {
        return this.body;
    }

    public final Resource copy(String str, Instant instant, Instant instant2, Long l, String str2, String str3) {
        zq3.h(str, "url");
        zq3.h(str3, "body");
        return new Resource(str, instant, instant2, l, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Resource)) {
            return false;
        }
        Resource resource = (Resource) obj;
        return zq3.c(this.url, resource.url) && zq3.c(this.date, resource.date) && zq3.c(this.expires, resource.expires) && zq3.c(this.maxAgeSeconds, resource.maxAgeSeconds) && zq3.c(this.etag, resource.etag) && zq3.c(this.body, resource.body);
    }

    public final String getBody() {
        return this.body;
    }

    public final Instant getDate() {
        return this.date;
    }

    public final String getEtag() {
        return this.etag;
    }

    public final Instant getExpires() {
        return this.expires;
    }

    public final Long getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        Instant instant = this.date;
        int hashCode2 = (hashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.expires;
        int hashCode3 = (hashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Long l = this.maxAgeSeconds;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.etag;
        return ((hashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.body.hashCode();
    }

    public final ResourceEntity toResourceEntity$resource_downloader_release(String str) {
        zq3.h(str, "fileName");
        return new ResourceEntity(this.url, this.date, this.expires, this.maxAgeSeconds, this.etag, str);
    }

    public String toString() {
        return "Resource(url=" + this.url + ", date=" + this.date + ", expires=" + this.expires + ", maxAgeSeconds=" + this.maxAgeSeconds + ", etag=" + this.etag + ", body=" + this.body + ")";
    }
}
