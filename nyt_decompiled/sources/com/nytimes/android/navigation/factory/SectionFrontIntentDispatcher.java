package com.nytimes.android.navigation.factory;

import android.content.Context;
import android.content.Intent;
import com.nytimes.android.api.cms.LatestFeed;
import com.nytimes.android.api.cms.SectionMeta;
import defpackage.ne7;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public abstract class SectionFrontIntentDispatcher {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.nytimes.android.latestfeed.feed.FeedStore r5, android.content.Context r6, java.lang.String r7, java.lang.String r8, defpackage.by0 r9) {
        /*
            boolean r0 = r9 instanceof com.nytimes.android.navigation.factory.SectionFrontIntentDispatcher$dispatch$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.navigation.factory.SectionFrontIntentDispatcher$dispatch$1 r0 = (com.nytimes.android.navigation.factory.SectionFrontIntentDispatcher$dispatch$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.navigation.factory.SectionFrontIntentDispatcher$dispatch$1 r0 = new com.nytimes.android.navigation.factory.SectionFrontIntentDispatcher$dispatch$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r5 = r0.L$2
            r8 = r5
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r5 = r0.L$1
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r0.L$0
            r6 = r5
            android.content.Context r6 = (android.content.Context) r6
            kotlin.f.b(r9)
            goto L94
        L38:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L40:
            kotlin.f.b(r9)
            com.nytimes.android.api.cms.SectionMeta r9 = defpackage.cf7.b
            com.nytimes.android.api.cms.SectionMeta r2 = defpackage.cf7.c
            com.nytimes.android.api.cms.SectionMeta[] r9 = new com.nytimes.android.api.cms.SectionMeta[]{r9, r2}
            java.util.List r9 = kotlin.collections.i.o(r9)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L55:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r9.next()
            r4 = r2
            com.nytimes.android.api.cms.SectionMeta r4 = (com.nytimes.android.api.cms.SectionMeta) r4
            java.lang.String r4 = r4.getName()
            boolean r4 = defpackage.zq3.c(r4, r7)
            if (r4 == 0) goto L55
            goto L6e
        L6d:
            r2 = 0
        L6e:
            com.nytimes.android.api.cms.SectionMeta r2 = (com.nytimes.android.api.cms.SectionMeta) r2
            if (r2 == 0) goto L81
            ne7 r5 = defpackage.ne7.a
            java.lang.String r7 = r2.getName()
            java.lang.String r9 = r2.getTitle()
            android.content.Intent r5 = r5.b(r6, r7, r9, r8)
            goto L9f
        L81:
            io.reactivex.Observable r5 = r5.f()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r9 = kotlinx.coroutines.rx2.RxAwaitKt.awaitFirst(r5, r0)
            if (r9 != r1) goto L94
            return r1
        L94:
            java.lang.String r5 = "awaitFirst(...)"
            defpackage.zq3.g(r9, r5)
            com.nytimes.android.api.cms.LatestFeed r9 = (com.nytimes.android.api.cms.LatestFeed) r9
            android.content.Intent r5 = b(r9, r6, r7, r8)
        L9f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.navigation.factory.SectionFrontIntentDispatcher.a(com.nytimes.android.latestfeed.feed.FeedStore, android.content.Context, java.lang.String, java.lang.String, by0):java.lang.Object");
    }

    private static final Intent b(LatestFeed latestFeed, Context context, String str, String str2) {
        Object obj;
        List<SectionMeta> sections = latestFeed.getSections();
        if (sections == null) {
            sections = i.l();
        }
        Iterator<T> it2 = sections.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (zq3.c(((SectionMeta) obj).getName(), str)) {
                break;
            }
        }
        SectionMeta sectionMeta = (SectionMeta) obj;
        if (sectionMeta != null) {
            return ne7.a.b(context, sectionMeta.getName(), sectionMeta.getTitle(), str2);
        }
        return null;
    }
}
