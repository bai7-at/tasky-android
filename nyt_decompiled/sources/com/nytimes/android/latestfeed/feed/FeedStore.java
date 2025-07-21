package com.nytimes.android.latestfeed.feed;

import com.nytimes.android.api.cms.LatestFeed;
import com.nytimes.android.external.store3.base.impl.StalePolicy;
import com.nytimes.android.io.Id;
import com.nytimes.android.latestfeed.feed.rx.FeedParseFunc;
import defpackage.by0;
import defpackage.pr6;
import defpackage.sp4;
import defpackage.ve2;
import defpackage.zq3;
import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxConvertKt;

/* loaded from: classes4.dex */
public final class FeedStore extends pr6 {
    public static final a Companion = new a(null);
    private static final Id a;
    private static final Id b;
    private static final long c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Id a() {
            return FeedStore.b;
        }

        public final Id b() {
            return FeedStore.a;
        }

        private a() {
        }
    }

    static {
        Id of = Id.of(LatestFeed.class, "latestfeed");
        zq3.g(of, "of(...)");
        a = of;
        Id of2 = Id.of(LatestFeed.class, "latestfeed.good");
        zq3.g(of2, "of(...)");
        b = of2;
        c = TimeUnit.MINUTES.toMillis(30L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedStore(FeedFetcher feedFetcher, ve2 ve2Var, FeedParseFunc feedParseFunc) {
        super(feedFetcher, new FeedStorePersister(ve2Var, null, 12L, TimeUnit.HOURS, feedParseFunc, 2, null), feedParseFunc, sp4.a().d(10L).c(c).b(TimeUnit.MILLISECONDS).a(), StalePolicy.REFRESH_ON_STALE);
        zq3.h(feedFetcher, "fetcher");
        zq3.h(ve2Var, "fileSystem");
        zq3.h(feedParseFunc, "parser");
    }

    public static /* synthetic */ Object d(FeedStore feedStore, boolean z, by0 by0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return feedStore.c(z, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.latestfeed.feed.FeedStore$await$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.latestfeed.feed.FeedStore$await$1 r0 = (com.nytimes.android.latestfeed.feed.FeedStore$await$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.latestfeed.feed.FeedStore$await$1 r0 = new com.nytimes.android.latestfeed.feed.FeedStore$await$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L4f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r6)
            if (r5 == 0) goto L3d
            com.nytimes.android.io.Id r5 = com.nytimes.android.latestfeed.feed.FeedStore.a
            io.reactivex.Single r4 = r4.fetch(r5)
            goto L43
        L3d:
            com.nytimes.android.io.Id r5 = com.nytimes.android.latestfeed.feed.FeedStore.a
            io.reactivex.Single r4 = r4.get(r5)
        L43:
            defpackage.zq3.e(r4)
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.rx2.RxAwaitKt.await(r4, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            java.lang.String r4 = "await(...)"
            defpackage.zq3.g(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.latestfeed.feed.FeedStore.c(boolean, by0):java.lang.Object");
    }

    @Override // defpackage.pr6, defpackage.l28
    public void clear() {
        clear(a);
        clear(b);
    }

    public final Flow e() {
        Observable<Object> stream = stream(a);
        zq3.g(stream, "stream(...)");
        return RxConvertKt.asFlow(stream);
    }

    public final Observable f() {
        Observable<Object> observable = get(a).toObservable();
        zq3.g(observable, "toObservable(...)");
        return observable;
    }

    @Override // defpackage.pr6, defpackage.l28
    public Observable stream() {
        Observable<Object> stream = stream(a);
        zq3.g(stream, "stream(...)");
        return stream;
    }
}
