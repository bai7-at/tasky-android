package com.google.android.tv.ads;

import java.util.List;

/* renamed from: com.google.android.tv.ads.$AutoValue_IconClickFallbackImages, reason: invalid class name */
/* loaded from: classes3.dex */
abstract class C$AutoValue_IconClickFallbackImages extends IconClickFallbackImages {
    private final List zza;

    C$AutoValue_IconClickFallbackImages(List list) {
        if (list == null) {
            throw new NullPointerException("Null iconClickFallbackImageList");
        }
        this.zza = list;
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImages
    public List b() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IconClickFallbackImages) {
            return this.zza.equals(((IconClickFallbackImages) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "IconClickFallbackImages{iconClickFallbackImageList=" + this.zza.toString() + "}";
    }
}
