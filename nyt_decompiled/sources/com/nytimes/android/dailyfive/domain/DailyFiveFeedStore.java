package com.nytimes.android.dailyfive.domain;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.AssetData;
import com.nytimes.android.api.cms.graphql.GraphQlPromoAsset;
import com.nytimes.android.assetretriever.AssetRetriever;
import com.nytimes.android.assetretriever.e;
import com.nytimes.android.coroutinesutils.ParallelDownloadStrategy;
import com.nytimes.android.coroutinesutils.ParallelStore;
import com.nytimes.android.utils.MoshiFileSystemPersister;
import defpackage.et;
import defpackage.j91;
import defpackage.l81;
import defpackage.sn2;
import defpackage.ss2;
import defpackage.w71;
import defpackage.zq3;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class DailyFiveFeedStore {
    private final w71 a;
    private final j91 b;
    private final AssetRetriever c;
    private final ParallelStore d;

    public DailyFiveFeedStore(MoshiFileSystemPersister moshiFileSystemPersister, com.nytimes.android.coroutinesutils.d dVar, w71 w71Var, com.nytimes.android.coroutinesutils.d dVar2, j91 j91Var, AssetRetriever assetRetriever) {
        zq3.h(moshiFileSystemPersister, "feedPersister");
        zq3.h(dVar, "feedStore");
        zq3.h(w71Var, "followStatusPersister");
        zq3.h(dVar2, "followStatusStore");
        zq3.h(j91Var, "expirationChecker");
        zq3.h(assetRetriever, "assetRetriever");
        this.a = w71Var;
        this.b = j91Var;
        this.c = assetRetriever;
        this.d = new ParallelStore(new ss2() { // from class: com.nytimes.android.dailyfive.domain.DailyFiveFeedStore$parallelStore$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(l81 l81Var) {
                j91 j91Var2;
                zq3.h(l81Var, "it");
                j91Var2 = DailyFiveFeedStore.this.b;
                return Boolean.valueOf(j91Var2.e());
            }
        }, new DailyFiveFeedStore$parallelStore$2(this, moshiFileSystemPersister, null), new DailyFiveFeedStore$parallelStore$3(this, dVar, moshiFileSystemPersister, dVar2, null), null, 0L, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sn2 e(List list, List list2, Instant instant) {
        return new sn2(list, list2, instant);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015b A[LOOP:1: B:34:0x0155->B:36:0x015b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0180 A[LOOP:2: B:39:0x017a->B:41:0x0180, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.List r21, org.threeten.bp.Instant r22, defpackage.by0 r23) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.dailyfive.domain.DailyFiveFeedStore.g(java.util.List, org.threeten.bp.Instant, by0):java.lang.Object");
    }

    private final GraphQlPromoAsset h(GamesNode gamesNode) {
        Long h = gamesNode.h();
        long longValue = h != null ? h.longValue() : -1L;
        String d = gamesNode.d();
        String e = gamesNode.e();
        String a = gamesNode.a();
        String c = gamesNode.c();
        Instant g = gamesNode.g();
        return new GraphQlPromoAsset(new AssetData(d, AssetConstants.DAILY_FIVE_GAME, a, null, null, null, null, null, false, g != null ? g.getEpochSecond() : 0L, 0L, 0L, null, null, null, null, null, null, false, false, false, false, false, null, c, e, null, null, null, null, null, null, null, null, longValue, -50332168, 3, null), gamesNode.e(), false, 4, null);
    }

    private final et i(DailyFiveAsset dailyFiveAsset) {
        b b = dailyFiveAsset.b();
        NumberedArticleTrendingNode numberedArticleTrendingNode = b instanceof NumberedArticleTrendingNode ? (NumberedArticleTrendingNode) b : null;
        if (numberedArticleTrendingNode != null) {
            return new et(new e.b(numberedArticleTrendingNode.d()), numberedArticleTrendingNode.g());
        }
        return null;
    }

    public final Flow f(ParallelDownloadStrategy parallelDownloadStrategy, sn2 sn2Var) {
        zq3.h(parallelDownloadStrategy, "strategy");
        return this.d.p(parallelDownloadStrategy, new DailyFiveFeedStore$load$1(null), sn2Var);
    }
}
