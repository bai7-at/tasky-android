package com.nytimes.android.ribbon;

import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.airbnb.lottie.compose.c;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.designsystem.uicompose.utils.LottieAnimationDetail;
import com.nytimes.android.latestfeed.feed.FeedStore;
import defpackage.af6;
import defpackage.b04;
import defpackage.bm6;
import defpackage.by0;
import defpackage.cb2;
import defpackage.cc7;
import defpackage.de4;
import defpackage.fe4;
import defpackage.gj6;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hf8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.text.h;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes4.dex */
public final class RibbonTabFactory implements de4 {
    private final cb2 a;
    private final b04 b;
    private final FeedStore c;
    private final b04 d;
    private final hf8 e;
    private final String f;

    static final class a implements FlowCollector {
        public static final a a = new a();

        a() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(DownloadState downloadState, by0 by0Var) {
            return ww8.a;
        }
    }

    public RibbonTabFactory(cb2 cb2Var, b04 b04Var, FeedStore feedStore, b04 b04Var2) {
        zq3.h(cb2Var, "featureFlagUtil");
        zq3.h(b04Var, "homeUseCase");
        zq3.h(feedStore, "feedStore");
        zq3.h(b04Var2, "resourceRetriever");
        this.a = cb2Var;
        this.b = b04Var;
        this.c = feedStore;
        this.d = b04Var2;
        this.e = new hf8(Integer.valueOf(af6.ic_tab_top_stories), bm6.ribbon_tab_title, Integer.valueOf(bm6.ribbon_tab_testTag), "ribbon", new LottieAnimationDetail(new gt2() { // from class: com.nytimes.android.ribbon.RibbonTabFactory$tabData$1
            public final c b(Composer composer, int i) {
                composer.z(-1346270432);
                if (b.G()) {
                    b.S(-1346270432, i, -1, "com.nytimes.android.ribbon.RibbonTabFactory.tabData.<anonymous> (RibbonTabFactory.kt:32)");
                }
                int b = c.a.b(gj6.lottie_today_tab);
                if (b.G()) {
                    b.R();
                }
                composer.R();
                return c.a.a(b);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b((Composer) obj, ((Number) obj2).intValue());
            }
        }, new RibbonTabFactory$tabData$2(null)));
        this.f = "homepage";
    }

    @Override // defpackage.de4
    public void a(final fe4 fe4Var, Composer composer, final int i) {
        int i2;
        zq3.h(fe4Var, "mainTabState");
        Composer h = composer.h(1919724313);
        if ((i & 14) == 0) {
            i2 = (h.S(fe4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(1919724313, i2, -1, "com.nytimes.android.ribbon.RibbonTabFactory.Content (RibbonTabFactory.kt:51)");
            }
            DestinationContentKt.a(fe4Var, null, null, h, fe4.h | (i2 & 14), 6);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.ribbon.RibbonTabFactory$Content$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    RibbonTabFactory.this.a(fe4Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    @Override // defpackage.de4
    public Flow b() {
        return de4.a.b(this);
    }

    @Override // defpackage.de4
    public String c() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.de4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(defpackage.by0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.nytimes.android.ribbon.RibbonTabFactory$prefetch$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.ribbon.RibbonTabFactory$prefetch$1 r0 = (com.nytimes.android.ribbon.RibbonTabFactory$prefetch$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.RibbonTabFactory$prefetch$1 r0 = new com.nytimes.android.ribbon.RibbonTabFactory$prefetch$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.f.b(r7)
            goto L8e
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            java.lang.Object r6 = r0.L$0
            com.nytimes.android.ribbon.RibbonTabFactory r6 = (com.nytimes.android.ribbon.RibbonTabFactory) r6
            kotlin.f.b(r7)
            goto L72
        L3f:
            java.lang.Object r6 = r0.L$0
            com.nytimes.android.ribbon.RibbonTabFactory r6 = (com.nytimes.android.ribbon.RibbonTabFactory) r6
            kotlin.f.b(r7)
            goto L57
        L47:
            kotlin.f.b(r7)
            com.nytimes.android.latestfeed.feed.FeedStore r7 = r6.c
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r7.c(r5, r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            com.nytimes.android.api.cms.LatestFeed r7 = (com.nytimes.android.api.cms.LatestFeed) r7
            java.util.List r7 = r7.getHybridResources()
            if (r7 == 0) goto L72
            b04 r2 = r6.d
            java.lang.Object r2 = r2.get()
            h07 r2 = (defpackage.h07) r2
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r2.b(r7, r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            b04 r6 = r6.b
            java.lang.Object r6 = r6.get()
            com.nytimes.android.features.home.domain.HomeUseCase r6 = (com.nytimes.android.features.home.domain.HomeUseCase) r6
            com.nytimes.android.coroutinesutils.ParallelDownloadStrategy r7 = com.nytimes.android.coroutinesutils.ParallelDownloadStrategy.FETCH_ALWAYS
            r2 = 0
            kotlinx.coroutines.flow.Flow r6 = r6.g(r7, r2)
            com.nytimes.android.ribbon.RibbonTabFactory$a r7 = com.nytimes.android.ribbon.RibbonTabFactory.a.a
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.collect(r7, r0)
            if (r6 != r1) goto L8e
            return r1
        L8e:
            ww8 r6 = defpackage.ww8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.RibbonTabFactory.d(by0):java.lang.Object");
    }

    @Override // defpackage.de4
    public boolean e(Uri uri) {
        zq3.h(uri, "uri");
        return isEnabled() && h.K(g(uri), "nytimes://home", false, 2, null);
    }

    @Override // defpackage.de4
    public hf8 f() {
        return this.e;
    }

    public String g(Uri uri) {
        return de4.a.a(this, uri);
    }

    @Override // defpackage.de4
    public boolean isEnabled() {
        return this.a.F();
    }
}
