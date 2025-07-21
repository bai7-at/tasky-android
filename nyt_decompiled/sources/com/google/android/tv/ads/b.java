package com.google.android.tv.ads;

import com.google.android.tv.ads.IconClickFallbackImages;
import java.util.List;

/* loaded from: classes3.dex */
final class b extends IconClickFallbackImages.a {
    private List a;

    b() {
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImages.a
    public final IconClickFallbackImages a() {
        List list = this.a;
        if (list != null) {
            return new zzf(list);
        }
        throw new IllegalStateException("Missing required properties: iconClickFallbackImageList");
    }

    public final IconClickFallbackImages.a b(List list) {
        if (list == null) {
            throw new NullPointerException("Null iconClickFallbackImageList");
        }
        this.a = list;
        return this;
    }
}
