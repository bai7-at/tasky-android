package defpackage;

import com.nytimes.android.api.cms.Asset;

/* loaded from: classes4.dex */
public abstract class d87 {
    public static final s87 a(Asset asset) {
        zq3.h(asset, "<this>");
        return new t87(asset.getSafeUri(), asset.getUrlOrEmpty());
    }
}
