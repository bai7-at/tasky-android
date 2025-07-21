package com.nytimes.android.resourcedownloader.data;

import com.nytimes.android.resourcedownloader.model.Resource;
import defpackage.zq3;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class ResourceEntity {
    private final Instant date;
    private final String etag;
    private final Instant expires;
    private final String fileName;
    private final Long maxAgeSeconds;
    private final String url;

    public ResourceEntity(String str, Instant instant, Instant instant2, Long l, String str2, String str3) {
        zq3.h(str, "url");
        zq3.h(str3, "fileName");
        this.url = str;
        this.date = instant;
        this.expires = instant2;
        this.maxAgeSeconds = l;
        this.etag = str2;
        this.fileName = str3;
    }

    public static /* synthetic */ ResourceEntity copy$default(ResourceEntity resourceEntity, String str, Instant instant, Instant instant2, Long l, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resourceEntity.url;
        }
        if ((i & 2) != 0) {
            instant = resourceEntity.date;
        }
        Instant instant3 = instant;
        if ((i & 4) != 0) {
            instant2 = resourceEntity.expires;
        }
        Instant instant4 = instant2;
        if ((i & 8) != 0) {
            l = resourceEntity.maxAgeSeconds;
        }
        Long l2 = l;
        if ((i & 16) != 0) {
            str2 = resourceEntity.etag;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            str3 = resourceEntity.fileName;
        }
        return resourceEntity.copy(str, instant3, instant4, l2, str4, str3);
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
        return this.fileName;
    }

    public final ResourceEntity copy(String str, Instant instant, Instant instant2, Long l, String str2, String str3) {
        zq3.h(str, "url");
        zq3.h(str3, "fileName");
        return new ResourceEntity(str, instant, instant2, l, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceEntity)) {
            return false;
        }
        ResourceEntity resourceEntity = (ResourceEntity) obj;
        return zq3.c(this.url, resourceEntity.url) && zq3.c(this.date, resourceEntity.date) && zq3.c(this.expires, resourceEntity.expires) && zq3.c(this.maxAgeSeconds, resourceEntity.maxAgeSeconds) && zq3.c(this.etag, resourceEntity.etag) && zq3.c(this.fileName, resourceEntity.fileName);
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

    public final String getFileName() {
        return this.fileName;
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
        return ((hashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.fileName.hashCode();
    }

    public final boolean isExpired() {
        Long l;
        Instant instant = this.date;
        Instant plusSeconds = (instant == null || (l = this.maxAgeSeconds) == null) ? this.expires : instant.plusSeconds(l.longValue());
        if (plusSeconds != null) {
            return Instant.now().isAfter(plusSeconds);
        }
        return true;
    }

    public final Resource toResource(String str) {
        zq3.h(str, "body");
        return new Resource(this.url, this.date, this.expires, this.maxAgeSeconds, this.etag, str);
    }

    public String toString() {
        return "ResourceEntity(url=" + this.url + ", date=" + this.date + ", expires=" + this.expires + ", maxAgeSeconds=" + this.maxAgeSeconds + ", etag=" + this.etag + ", fileName=" + this.fileName + ")";
    }
}
