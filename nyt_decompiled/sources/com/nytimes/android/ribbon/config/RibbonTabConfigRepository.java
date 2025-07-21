package com.nytimes.android.ribbon.config;

import android.content.res.Resources;
import com.nytimes.android.api.config.model.RibbonConfigDTO;
import com.nytimes.android.latestfeed.feed.FeedStore;
import defpackage.at3;
import defpackage.gj6;
import defpackage.qo;
import defpackage.ru3;
import defpackage.zq3;
import java.io.InputStream;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class RibbonTabConfigRepository {
    private final FeedStore a;
    private final at3 b;
    private final Resources c;
    private final boolean d;
    private final List e;

    public RibbonTabConfigRepository(FeedStore feedStore, at3 at3Var, Resources resources) {
        zq3.h(feedStore, "feedStore");
        zq3.h(at3Var, "decoder");
        zq3.h(resources, "resources");
        this.a = feedStore;
        this.b = at3Var;
        this.c = resources;
        this.e = i.e(RibbonConfigDTO.Companion.getTODAY_TAB());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.by0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.nytimes.android.ribbon.config.RibbonTabConfigRepository$getRibbonConfig$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.ribbon.config.RibbonTabConfigRepository$getRibbonConfig$1 r0 = (com.nytimes.android.ribbon.config.RibbonTabConfigRepository$getRibbonConfig$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.config.RibbonTabConfigRepository$getRibbonConfig$1 r0 = new com.nytimes.android.ribbon.config.RibbonTabConfigRepository$getRibbonConfig$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.ribbon.config.RibbonTabConfigRepository r5 = (com.nytimes.android.ribbon.config.RibbonTabConfigRepository) r5
            kotlin.f.b(r6)
            goto L5a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r6)
            boolean r6 = r5.d
            if (r6 == 0) goto L4b
            java.util.List r6 = r5.b()
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L4a
            java.util.List r6 = r5.e
        L4a:
            return r6
        L4b:
            com.nytimes.android.latestfeed.feed.FeedStore r6 = r5.a
            r0.L$0 = r5
            r0.label = r3
            r2 = 0
            r4 = 0
            java.lang.Object r6 = com.nytimes.android.latestfeed.feed.FeedStore.d(r6, r2, r0, r3, r4)
            if (r6 != r1) goto L5a
            return r1
        L5a:
            com.nytimes.android.api.cms.LatestFeed r6 = (com.nytimes.android.api.cms.LatestFeed) r6
            java.util.List r6 = r6.getXpnConfig()
            if (r6 == 0) goto L93
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.i.w(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L73:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L87
            java.lang.Object r1 = r6.next()
            com.nytimes.android.api.config.model.RibbonConfigGsonDTO r1 = (com.nytimes.android.api.config.model.RibbonConfigGsonDTO) r1
            com.nytimes.android.api.config.model.RibbonConfigDTO r1 = r1.toRibbonConfigDTO()
            r0.add(r1)
            goto L73
        L87:
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L8f
            java.util.List r0 = r5.e
        L8f:
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L95
        L93:
            java.util.List r0 = r5.e
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.config.RibbonTabConfigRepository.a(by0):java.lang.Object");
    }

    public final List b() {
        at3 at3Var = this.b;
        InputStream openRawResource = this.c.openRawResource(gj6.android_ribbon_tab_config);
        zq3.g(openRawResource, "openRawResource(...)");
        at3Var.a();
        return (List) ru3.a(at3Var, new qo(RibbonConfigDTO.Companion.serializer()), openRawResource);
    }
}
