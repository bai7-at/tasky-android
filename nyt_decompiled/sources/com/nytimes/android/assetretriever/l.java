package com.nytimes.android.assetretriever;

import android.app.Application;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.assetretriever.e;
import com.nytimes.android.assetretriever.l;
import com.nytimes.android.section.asset.GraphQlAssetFetcher;
import defpackage.l28;
import defpackage.o28;
import defpackage.sp4;
import defpackage.tt;
import defpackage.vs;
import defpackage.wd2;
import defpackage.zq3;
import io.reactivex.Single;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class l {
    public static final l a = new l();

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Single g(GraphQlAssetFetcher graphQlAssetFetcher, e eVar) {
        String a2;
        zq3.h(graphQlAssetFetcher, "$fetcher");
        zq3.h(eVar, TransferTable.COLUMN_KEY);
        if (eVar instanceof e.b) {
            a2 = ((e.b) eVar).a();
        } else {
            if (!(eVar instanceof e.c)) {
                throw new NoWhenBranchMatchedException();
            }
            a2 = ((e.c) eVar).a();
        }
        return graphQlAssetFetcher.fetch(a2);
    }

    public final a b(AssetRetrieverDatabase assetRetrieverDatabase) {
        zq3.h(assetRetrieverDatabase, "database");
        return assetRetrieverDatabase.d();
    }

    public final i c(AssetRetrieverDatabase assetRetrieverDatabase) {
        zq3.h(assetRetrieverDatabase, "database");
        return assetRetrieverDatabase.e();
    }

    public final AssetRetrieverDatabase d(Application application) {
        zq3.h(application, "application");
        return AssetRetrieverDatabase.Companion.a(application);
    }

    public final tt e(AssetRetrieverDatabase assetRetrieverDatabase) {
        zq3.h(assetRetrieverDatabase, "database");
        return assetRetrieverDatabase.f();
    }

    public final l28 f(final GraphQlAssetFetcher graphQlAssetFetcher, h hVar) {
        zq3.h(graphQlAssetFetcher, "fetcher");
        zq3.h(hVar, "assetRepository");
        l28 d = o28.a().b(sp4.a().d(0L).c(24L).b(TimeUnit.HOURS).a()).a(new wd2() { // from class: ht
            @Override // defpackage.wd2
            public final Single fetch(Object obj) {
                Single g;
                g = l.g(GraphQlAssetFetcher.this, (e) obj);
                return g;
            }
        }).f(new vs(hVar)).d();
        zq3.g(d, "open(...)");
        return d;
    }

    public final com.nytimes.android.coroutinesutils.d h(l28 l28Var) {
        zq3.h(l28Var, "store");
        return com.nytimes.android.coroutinesutils.d.Companion.b(l28Var);
    }
}
