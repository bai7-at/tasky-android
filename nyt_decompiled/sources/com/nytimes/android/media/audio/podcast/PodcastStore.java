package com.nytimes.android.media.audio.podcast;

import com.nytimes.android.external.store3.base.impl.BarCode;
import com.nytimes.android.external.store3.base.impl.StalePolicy;
import com.nytimes.android.media.audio.podcast.Podcast;
import com.nytimes.android.media.audio.podcast.PodcastFetcher;
import com.nytimes.android.media.audio.podcast.PodcastStore;
import defpackage.bp5;
import defpackage.pr6;
import defpackage.sp4;
import defpackage.ss2;
import defpackage.wd2;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlinx.coroutines.rx2.RxSingleKt;

/* loaded from: classes4.dex */
public final class PodcastStore extends pr6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PodcastStore(final PodcastFetcher podcastFetcher, PodcastPersister podcastPersister, sp4 sp4Var, StalePolicy stalePolicy) {
        super(new wd2() { // from class: dx5
            @Override // defpackage.wd2
            public final Single fetch(Object obj) {
                Single e;
                e = PodcastStore.e(PodcastFetcher.this, (BarCode) obj);
                return e;
            }
        }, podcastPersister, new bp5() { // from class: ex5
            @Override // defpackage.bp5, io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List f;
                f = PodcastStore.f((List) obj);
                return f;
            }
        }, sp4Var, stalePolicy);
        zq3.h(podcastFetcher, "podcastFetcher");
        zq3.h(podcastPersister, "podcastPersister");
        zq3.h(sp4Var, "memoryPolicy");
        zq3.h(stalePolicy, "stalePolicy");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Single e(PodcastFetcher podcastFetcher, BarCode barCode) {
        zq3.h(podcastFetcher, "$podcastFetcher");
        zq3.h(barCode, "it");
        return RxSingleKt.rxSingle$default(null, new PodcastStore$1$1(podcastFetcher, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(List list) {
        zq3.h(list, "it");
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Podcast i(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (Podcast) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource k(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (ObservableSource) ss2Var.invoke(obj);
    }

    public final Single g() {
        Single<Object> single = get(BarCode.a());
        zq3.g(single, "get(...)");
        return single;
    }

    public final Single h(final String str) {
        zq3.h(str, "id");
        Single g = g();
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.media.audio.podcast.PodcastStore$getById$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Podcast invoke(List list) {
                zq3.h(list, "list");
                String str2 = str;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Podcast podcast = (Podcast) it2.next();
                    if (zq3.c(podcast.getId(), str2)) {
                        return podcast;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        };
        Single map = g.map(new Function() { // from class: fx5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Podcast i;
                i = PodcastStore.i(ss2.this, obj);
                return i;
            }
        });
        zq3.g(map, "map(...)");
        return map;
    }

    public final Observable j() {
        Single g = g();
        final PodcastStore$getOnePodcastAtTheTime$1 podcastStore$getOnePodcastAtTheTime$1 = new ss2() { // from class: com.nytimes.android.media.audio.podcast.PodcastStore$getOnePodcastAtTheTime$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ObservableSource invoke(List list) {
                zq3.h(list, "list");
                return Observable.fromIterable(list);
            }
        };
        Observable flatMapObservable = g.flatMapObservable(new Function() { // from class: gx5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource k;
                k = PodcastStore.k(ss2.this, obj);
                return k;
            }
        });
        zq3.g(flatMapObservable, "flatMapObservable(...)");
        return flatMapObservable;
    }
}
