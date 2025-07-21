package com.nytimes.android.latestfeed.feed;

import com.nytimes.android.io.Id;
import com.nytimes.android.latestfeed.feed.FeedStorePersister;
import com.nytimes.android.latestfeed.feed.rx.FeedParseFunc;
import defpackage.bq5;
import defpackage.ef2;
import defpackage.sd0;
import defpackage.ss2;
import defpackage.ub2;
import defpackage.ve2;
import defpackage.zq3;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class FeedStorePersister extends ef2 implements ub2 {
    public /* synthetic */ FeedStorePersister(ve2 ve2Var, bq5 bq5Var, long j, TimeUnit timeUnit, FeedParseFunc feedParseFunc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ve2Var, (i & 2) != 0 ? new bq5() { // from class: kc2
            @Override // defpackage.bq5
            public final String a(Object obj) {
                String j2;
                j2 = FeedStorePersister.j((Id) obj);
                return j2;
            }
        } : bq5Var, j, timeUnit, feedParseFunc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(Id id) {
        zq3.h(id, "it");
        return id.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource k(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (SingleSource) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource l(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (SingleSource) ss2Var.invoke(obj);
    }

    @Override // defpackage.ub2
    public Single a() {
        Maybe d = d(FeedStore.Companion.a());
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.latestfeed.feed.FeedStorePersister$onBadParse$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SingleSource invoke(sd0 sd0Var) {
                zq3.h(sd0Var, "it");
                return FeedStorePersister.this.b(FeedStore.Companion.b(), sd0Var);
            }
        };
        Single flatMapSingle = d.flatMapSingle(new Function() { // from class: jc2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource k;
                k = FeedStorePersister.k(ss2.this, obj);
                return k;
            }
        });
        zq3.g(flatMapSingle, "flatMapSingle(...)");
        return flatMapSingle;
    }

    @Override // defpackage.ub2
    public Single c() {
        Maybe d = d(FeedStore.Companion.b());
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.latestfeed.feed.FeedStorePersister$onGoodParse$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SingleSource invoke(sd0 sd0Var) {
                zq3.h(sd0Var, "it");
                return FeedStorePersister.this.b(FeedStore.Companion.a(), sd0Var);
            }
        };
        Single flatMapSingle = d.flatMapSingle(new Function() { // from class: ic2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource l;
                l = FeedStorePersister.l(ss2.this, obj);
                return l;
            }
        });
        zq3.g(flatMapSingle, "flatMapSingle(...)");
        return flatMapSingle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedStorePersister(ve2 ve2Var, bq5 bq5Var, long j, TimeUnit timeUnit, FeedParseFunc feedParseFunc) {
        super(ve2Var, bq5Var, j, timeUnit);
        zq3.h(ve2Var, "fileSystem");
        zq3.h(bq5Var, "pathResolver");
        zq3.h(timeUnit, "expirationUnit");
        zq3.h(feedParseFunc, "feedParseFunc");
        feedParseFunc.c(this);
    }
}
