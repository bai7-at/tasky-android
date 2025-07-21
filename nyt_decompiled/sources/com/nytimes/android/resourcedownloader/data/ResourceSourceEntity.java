package com.nytimes.android.resourcedownloader.data;

import com.nytimes.android.resourcedownloader.model.Resource;
import com.nytimes.android.resourcedownloader.model.ResourceSource;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ResourceSourceEntity {
    public static final Companion Companion = new Companion(null);
    private final long id;
    private final String resourceEntityUrl;
    private final ResourceSource resourceSource;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ResourceSourceEntity from(Resource resource, ResourceSource resourceSource) {
            zq3.h(resource, "resource");
            zq3.h(resourceSource, "resourceSource");
            return from(resource.getUrl(), resourceSource);
        }

        private Companion() {
        }

        public final ResourceSourceEntity from(String str, ResourceSource resourceSource) {
            zq3.h(str, "resourceEntityUrl");
            zq3.h(resourceSource, "resourceSource");
            return new ResourceSourceEntity(0L, str, resourceSource, 1, null);
        }
    }

    public ResourceSourceEntity(long j, String str, ResourceSource resourceSource) {
        zq3.h(str, "resourceEntityUrl");
        zq3.h(resourceSource, "resourceSource");
        this.id = j;
        this.resourceEntityUrl = str;
        this.resourceSource = resourceSource;
    }

    public static /* synthetic */ ResourceSourceEntity copy$default(ResourceSourceEntity resourceSourceEntity, long j, String str, ResourceSource resourceSource, int i, Object obj) {
        if ((i & 1) != 0) {
            j = resourceSourceEntity.id;
        }
        if ((i & 2) != 0) {
            str = resourceSourceEntity.resourceEntityUrl;
        }
        if ((i & 4) != 0) {
            resourceSource = resourceSourceEntity.resourceSource;
        }
        return resourceSourceEntity.copy(j, str, resourceSource);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.resourceEntityUrl;
    }

    public final ResourceSource component3() {
        return this.resourceSource;
    }

    public final ResourceSourceEntity copy(long j, String str, ResourceSource resourceSource) {
        zq3.h(str, "resourceEntityUrl");
        zq3.h(resourceSource, "resourceSource");
        return new ResourceSourceEntity(j, str, resourceSource);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceSourceEntity)) {
            return false;
        }
        ResourceSourceEntity resourceSourceEntity = (ResourceSourceEntity) obj;
        return this.id == resourceSourceEntity.id && zq3.c(this.resourceEntityUrl, resourceSourceEntity.resourceEntityUrl) && zq3.c(this.resourceSource, resourceSourceEntity.resourceSource);
    }

    public final long getId() {
        return this.id;
    }

    public final String getResourceEntityUrl() {
        return this.resourceEntityUrl;
    }

    public final ResourceSource getResourceSource() {
        return this.resourceSource;
    }

    public int hashCode() {
        return (((Long.hashCode(this.id) * 31) + this.resourceEntityUrl.hashCode()) * 31) + this.resourceSource.hashCode();
    }

    public String toString() {
        return "ResourceSourceEntity(id=" + this.id + ", resourceEntityUrl=" + this.resourceEntityUrl + ", resourceSource=" + this.resourceSource + ")";
    }

    public /* synthetic */ ResourceSourceEntity(long j, String str, ResourceSource resourceSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, resourceSource);
    }
}
