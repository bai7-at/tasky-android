package com.nytimes.android.ribbon.destinations.more;

import android.content.res.Resources;
import com.nytimes.android.latestfeed.feed.FeedStore;
import defpackage.at3;
import defpackage.gj6;
import defpackage.l48;
import defpackage.nh7;
import defpackage.qo;
import defpackage.ru3;
import defpackage.tp0;
import defpackage.zq3;
import java.io.InputStream;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public final class SectionsRepository {
    private final FeedStore a;
    private final int b;
    private final InputStream c;
    private final List d;

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return tp0.d(((nh7) obj).a(), ((nh7) obj2).a());
        }
    }

    public SectionsRepository(FeedStore feedStore, at3 at3Var, Resources resources) {
        zq3.h(feedStore, "feedStore");
        zq3.h(at3Var, "json");
        zq3.h(resources, "resources");
        this.a = feedStore;
        int i = gj6.more_destination_config;
        this.b = i;
        InputStream openRawResource = resources.openRawResource(i);
        zq3.g(openRawResource, "openRawResource(...)");
        this.c = openRawResource;
        at3Var.a();
        this.d = (List) ru3.a(at3Var, new qo(l48.a), openRawResource);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074 A[LOOP:0: B:14:0x006e->B:16:0x0074, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8 A[LOOP:1: B:22:0x00c2->B:24:0x00c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.by0 r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.more.SectionsRepository.a(by0):java.lang.Object");
    }
}
