package com.nytimes.android.assetretriever;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.assetretriever.e;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;
import org.threeten.bp.Instant;

/* loaded from: classes.dex */
public abstract class a {
    public static /* synthetic */ void d(a aVar, Asset asset, Instant instant, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertOrUpdateAsset");
        }
        if ((i & 2) != 0) {
            instant = Instant.now();
            zq3.g(instant, "now(...)");
        }
        aVar.c(asset, instant);
    }

    public abstract void a();

    protected abstract long b(d dVar);

    public void c(Asset asset, Instant instant) {
        d b;
        zq3.h(asset, "asset");
        zq3.h(instant, "now");
        String uri = asset.getUri();
        zq3.e(uri);
        d i = i(uri);
        if (i == null) {
            b = b.b(asset, instant);
            b(b);
            return;
        }
        String assetType = asset.getAssetType();
        Instant ofEpochSecond = Instant.ofEpochSecond(asset.getLastModified());
        String url = asset.getUrl();
        e.c cVar = url != null ? new e.c(url) : null;
        zq3.e(ofEpochSecond);
        j(d.b(i, null, assetType, ofEpochSecond, cVar, instant, asset, 1, null));
    }

    public abstract Instant e();

    public final Asset f(e eVar) {
        zq3.h(eVar, "assetIdentifier");
        if (eVar instanceof e.b) {
            return g((e.b) eVar);
        }
        if (eVar instanceof e.c) {
            return h((e.c) eVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    protected abstract Asset g(e.b bVar);

    protected abstract Asset h(e.c cVar);

    public abstract d i(String str);

    protected abstract int j(d dVar);
}
