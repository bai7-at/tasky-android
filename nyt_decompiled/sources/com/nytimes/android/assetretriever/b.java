package com.nytimes.android.assetretriever;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.assetretriever.e;
import defpackage.zq3;
import org.threeten.bp.Instant;

/* loaded from: classes.dex */
public abstract class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final d b(Asset asset, Instant instant) {
        String uri = asset.getUri();
        zq3.e(uri);
        e.b bVar = new e.b(uri);
        String assetType = asset.getAssetType();
        Instant lastModifiedInstant = asset.getLastModifiedInstant();
        String url = asset.getUrl();
        return new d(bVar, assetType, lastModifiedInstant, url != null ? new e.c(url) : null, instant, asset);
    }
}
