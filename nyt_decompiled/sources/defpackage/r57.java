package defpackage;

import com.nytimes.android.api.cms.LatestFeed;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.api.cms.SectionMeta;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.section.sectionfront.a;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* loaded from: classes4.dex */
public class r57 {
    private final FeedStore a;
    private final eh7 b;

    public r57(eh7 eh7Var, FeedStore feedStore) {
        this.b = eh7Var;
        this.a = feedStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ MaybeSource g(String str, LatestFeed latestFeed) {
        SectionMeta section = latestFeed.getSection(str);
        return section == null ? Maybe.empty() : Maybe.just(section);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SingleSource h(SectionMeta sectionMeta) {
        return this.b.get(a.b(sectionMeta));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ MaybeSource i(String str, LatestFeed latestFeed) {
        SectionMeta section = latestFeed.getSection(str);
        return section == null ? Maybe.empty() : Maybe.just(section);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SingleSource j(SectionMeta sectionMeta) {
        return this.b.fetch(a.b(sectionMeta));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ MaybeSource k(SectionFront sectionFront) {
        String name = sectionFront.getName();
        return name == null ? Maybe.empty() : Maybe.just(name);
    }

    public Observable f(final String str) {
        return this.a.f().flatMapMaybe(new Function() { // from class: n57
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                MaybeSource g;
                g = r57.g(str, (LatestFeed) obj);
                return g;
            }
        }).flatMapSingle(new Function() { // from class: o57
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource h;
                h = r57.this.h((SectionMeta) obj);
                return h;
            }
        });
    }

    public Observable l(final String str) {
        return this.a.f().flatMapMaybe(new Function() { // from class: p57
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                MaybeSource i;
                i = r57.i(str, (LatestFeed) obj);
                return i;
            }
        }).flatMapSingle(new Function() { // from class: q57
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource j;
                j = r57.this.j((SectionMeta) obj);
                return j;
            }
        });
    }

    public Observable m() {
        return this.b.stream().flatMapMaybe(new Function() { // from class: m57
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                MaybeSource k;
                k = r57.k((SectionFront) obj);
                return k;
            }
        });
    }
}
