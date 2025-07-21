package com.nytimes.android.latestfeed.feed;

import android.app.Application;
import android.content.SharedPreferences;
import com.nytimes.android.io.Id;
import com.nytimes.android.latestfeed.feed.FeedFetcher;
import com.nytimes.android.logging.NYTLogger;
import defpackage.b04;
import defpackage.gl6;
import defpackage.rj6;
import defpackage.sd0;
import defpackage.ss2;
import defpackage.wd2;
import defpackage.wd5;
import defpackage.ww8;
import defpackage.x77;
import defpackage.zq3;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.rx2.RxSingleKt;

/* loaded from: classes4.dex */
public final class FeedFetcher implements wd2 {
    public static final a Companion = new a(null);
    private final Application a;
    private final SharedPreferences b;
    private final b04 c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public FeedFetcher(Application application, SharedPreferences sharedPreferences, b04 b04Var) {
        zq3.h(application, "context");
        zq3.h(sharedPreferences, "appPreferences");
        zq3.h(b04Var, "samizdatCmsClient");
        this.a = application;
        this.b = sharedPreferences;
        this.c = b04Var;
    }

    private final Single g() {
        if (this.b.getBoolean(this.a.getString(gl6.beta_feed_local), false)) {
            Single create = Single.create(new SingleOnSubscribe() { // from class: qb2
                @Override // io.reactivex.SingleOnSubscribe
                public final void subscribe(SingleEmitter singleEmitter) {
                    FeedFetcher.h(FeedFetcher.this, singleEmitter);
                }
            });
            zq3.e(create);
            return create;
        }
        Single rxSingle$default = RxSingleKt.rxSingle$default(null, new FeedFetcher$fetchFeedJson$2(this, null), 1, null);
        final FeedFetcher$fetchFeedJson$3 feedFetcher$fetchFeedJson$3 = new ss2() { // from class: com.nytimes.android.latestfeed.feed.FeedFetcher$fetchFeedJson$3
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final sd0 invoke(x77 x77Var) {
                zq3.h(x77Var, "it");
                return (sd0) x77Var.a();
            }
        };
        Single map = rxSingle$default.map(new Function() { // from class: rb2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                sd0 i;
                i = FeedFetcher.i(ss2.this, obj);
                return i;
            }
        });
        final FeedFetcher$fetchFeedJson$4 feedFetcher$fetchFeedJson$4 = new ss2() { // from class: com.nytimes.android.latestfeed.feed.FeedFetcher$fetchFeedJson$4
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                zq3.e(th);
                NYTLogger.i(th, "failed to fetch latest feed: ", new Object[0]);
            }
        };
        Single doOnError = map.doOnError(new Consumer() { // from class: sb2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FeedFetcher.j(ss2.this, obj);
            }
        });
        final FeedFetcher$fetchFeedJson$5 feedFetcher$fetchFeedJson$5 = new ss2() { // from class: com.nytimes.android.latestfeed.feed.FeedFetcher$fetchFeedJson$5
            public final void b(sd0 sd0Var) {
                NYTLogger.l("fetched latestfeed", new Object[0]);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((sd0) obj);
                return ww8.a;
            }
        };
        Single doOnSuccess = doOnError.doOnSuccess(new Consumer() { // from class: tb2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FeedFetcher.k(ss2.this, obj);
            }
        });
        zq3.e(doOnSuccess);
        return doOnSuccess;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(FeedFetcher feedFetcher, SingleEmitter singleEmitter) {
        zq3.h(feedFetcher, "this$0");
        zq3.h(singleEmitter, "it");
        InputStream openRawResource = feedFetcher.a.getResources().openRawResource(rj6.latest_feed);
        zq3.g(openRawResource, "openRawResource(...)");
        singleEmitter.onSuccess(wd5.d(wd5.l(openRawResource)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sd0 i(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (sd0) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    @Override // defpackage.wd2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Single fetch(Id id) {
        zq3.h(id, "id");
        return g();
    }
}
