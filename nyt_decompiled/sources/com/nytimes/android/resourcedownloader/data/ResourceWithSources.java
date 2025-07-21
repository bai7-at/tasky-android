package com.nytimes.android.resourcedownloader.data;

import defpackage.zq3;
import java.util.List;

/* loaded from: classes4.dex */
public final class ResourceWithSources {
    private final ResourceEntity resource;
    private final List<ResourceSourceEntity> sources;

    public ResourceWithSources(ResourceEntity resourceEntity, List<ResourceSourceEntity> list) {
        zq3.h(resourceEntity, "resource");
        zq3.h(list, "sources");
        this.resource = resourceEntity;
        this.sources = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResourceWithSources copy$default(ResourceWithSources resourceWithSources, ResourceEntity resourceEntity, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            resourceEntity = resourceWithSources.resource;
        }
        if ((i & 2) != 0) {
            list = resourceWithSources.sources;
        }
        return resourceWithSources.copy(resourceEntity, list);
    }

    public final ResourceEntity component1() {
        return this.resource;
    }

    public final List<ResourceSourceEntity> component2() {
        return this.sources;
    }

    public final ResourceWithSources copy(ResourceEntity resourceEntity, List<ResourceSourceEntity> list) {
        zq3.h(resourceEntity, "resource");
        zq3.h(list, "sources");
        return new ResourceWithSources(resourceEntity, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceWithSources)) {
            return false;
        }
        ResourceWithSources resourceWithSources = (ResourceWithSources) obj;
        return zq3.c(this.resource, resourceWithSources.resource) && zq3.c(this.sources, resourceWithSources.sources);
    }

    public final ResourceEntity getResource() {
        return this.resource;
    }

    public final List<ResourceSourceEntity> getSources() {
        return this.sources;
    }

    public int hashCode() {
        return (this.resource.hashCode() * 31) + this.sources.hashCode();
    }

    public String toString() {
        return "ResourceWithSources(resource=" + this.resource + ", sources=" + this.sources + ")";
    }
}
