package com.nytimes.android.resourcedownloader.model;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class VersionedResourceSource extends ResourceSource {
    private final String id;
    private final long version;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VersionedResourceSource(String str, long j) {
        super(null);
        zq3.h(str, "id");
        this.id = str;
        this.version = j;
    }

    public static /* synthetic */ VersionedResourceSource copy$default(VersionedResourceSource versionedResourceSource, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = versionedResourceSource.id;
        }
        if ((i & 2) != 0) {
            j = versionedResourceSource.version;
        }
        return versionedResourceSource.copy(str, j);
    }

    public final String component1() {
        return this.id;
    }

    public final long component2() {
        return this.version;
    }

    public final VersionedResourceSource copy(String str, long j) {
        zq3.h(str, "id");
        return new VersionedResourceSource(str, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VersionedResourceSource)) {
            return false;
        }
        VersionedResourceSource versionedResourceSource = (VersionedResourceSource) obj;
        return zq3.c(this.id, versionedResourceSource.id) && this.version == versionedResourceSource.version;
    }

    public final String getId() {
        return this.id;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + Long.hashCode(this.version);
    }

    public String toString() {
        return "VersionedResourceSource(id=" + this.id + ", version=" + this.version + ")";
    }
}
