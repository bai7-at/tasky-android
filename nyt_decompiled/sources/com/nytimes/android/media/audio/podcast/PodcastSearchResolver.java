package com.nytimes.android.media.audio.podcast;

import android.text.TextUtils;
import com.nytimes.android.media.audio.podcast.PodcastSearchResolver;
import com.nytimes.android.media.common.NYTMediaItem;
import defpackage.b05;
import defpackage.ss2;
import defpackage.vw5;
import defpackage.zq3;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.LocalDate;
import org.threeten.bp.format.DateTimeFormatter;

/* loaded from: classes4.dex */
public final class PodcastSearchResolver implements vw5 {
    public static final a Companion = new a(null);
    public static final int d = 8;
    private final PodcastSourceImpl a;
    private final DateTimeFormatter b;
    private final b05 c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public PodcastSearchResolver(PodcastSourceImpl podcastSourceImpl, DateTimeFormatter dateTimeFormatter, b05 b05Var) {
        zq3.h(podcastSourceImpl, "podcastSource");
        zq3.h(dateTimeFormatter, "dateTimeFormatter");
        zq3.h(b05Var, "clock");
        this.a = podcastSourceImpl;
        this.b = dateTimeFormatter;
        this.c = b05Var;
    }

    private final Episode e(String[] strArr, Podcast podcast) {
        if (podcast.d().isEmpty()) {
            return null;
        }
        for (String str : strArr) {
            if (h.w(str, "today", true)) {
                List d2 = podcast.d();
                LocalDate b = this.c.b();
                zq3.g(b, "now(...)");
                return g(d2, b);
            }
            if (h.w(str, "yesterday", true)) {
                List d3 = podcast.d();
                LocalDate d4 = this.c.d();
                zq3.g(d4, "yesterday(...)");
                return g(d3, d4);
            }
            Episode h = h(str, podcast.d());
            if (h != null) {
                return h;
            }
        }
        return (Episode) podcast.d().get(0);
    }

    private final Episode h(String str, List list) {
        DayOfWeek f = f(str);
        if (f == null) {
            return null;
        }
        LocalDate a2 = this.c.a(f);
        zq3.e(a2);
        return g(list, a2);
    }

    private final boolean i(Episode episode, LocalDate localDate) {
        String a2 = episode.a();
        zq3.e(a2);
        return localDate.isEqual(LocalDate.parse(a2, this.b));
    }

    private final boolean j(String[] strArr, Podcast podcast) {
        for (String str : (String[]) h.F0(podcast.getTitle(), new String[]{" "}, false, 0, 6, null).toArray(new String[0])) {
            for (String str2 : strArr) {
                if (h.w(str2, str, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NYTMediaItem k(String str, List list) {
        Episode e;
        String[] strArr = (String[]) h.F0(str, new String[]{" "}, false, 0, 6, null).toArray(new String[0]);
        String[] d2 = d((String[]) Arrays.copyOf(strArr, strArr.length));
        Iterator it2 = list.iterator();
        Podcast podcast = null;
        while (it2.hasNext()) {
            Podcast podcast2 = (Podcast) it2.next();
            if (j(d2, podcast2)) {
                Episode e2 = e(d2, podcast2);
                if (e2 != null) {
                    return this.a.s(e2, podcast2);
                }
            } else if (podcast2.getType() == PodcastTypeInfo.DAILY) {
                podcast = podcast2;
            }
        }
        if (podcast == null || (e = e(d2, podcast)) == null) {
            return null;
        }
        return this.a.s(e, podcast);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource l(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (SingleSource) ss2Var.invoke(obj);
    }

    @Override // defpackage.vw5
    public Single a(final String str) {
        zq3.h(str, "query");
        if (TextUtils.isEmpty(str)) {
            return this.a.v(PodcastTypeInfo.DAILY);
        }
        Single A = this.a.A();
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.media.audio.podcast.PodcastSearchResolver$searchPodcastsForEpisode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SingleSource invoke(List list) {
                NYTMediaItem k;
                zq3.h(list, "podcasts");
                k = PodcastSearchResolver.this.k(str, list);
                if (k != null) {
                    return Single.just(k);
                }
                return Single.error(new RuntimeException("Couldn't find episode for query: " + str));
            }
        };
        Single flatMap = A.flatMap(new Function() { // from class: uw5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource l;
                l = PodcastSearchResolver.l(ss2.this, obj);
                return l;
            }
        });
        zq3.e(flatMap);
        return flatMap;
    }

    public final String[] d(String... strArr) {
        zq3.h(strArr, "tokens");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(h.F(str, "'s", "", false, 4, null));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final DayOfWeek f(String str) {
        zq3.h(str, "token");
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if (h.w(dayOfWeek.name(), str, true)) {
                return dayOfWeek;
            }
        }
        return null;
    }

    public final Episode g(List list, LocalDate localDate) {
        Object obj;
        zq3.h(list, "episodes");
        zq3.h(localDate, "dateToCompare");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Episode) obj2).a() != null) {
                arrayList.add(obj2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (i((Episode) obj, localDate)) {
                break;
            }
        }
        Episode episode = (Episode) obj;
        return episode == null ? (Episode) i.m0(list) : episode;
    }
}
