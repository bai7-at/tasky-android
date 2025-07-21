package com.nytimes.android.media.audio.podcast;

import android.net.Uri;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import com.nytimes.android.media.audio.podcast.Podcast;
import com.nytimes.android.media.audio.podcast.PodcastSource;
import com.nytimes.android.media.audio.podcast.PodcastSourceImpl;
import com.nytimes.android.media.common.AudioPosition;
import com.nytimes.android.media.common.AudioType;
import com.nytimes.android.media.common.NYTMediaItem;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class PodcastSourceImpl implements PodcastSource {
    public static final a Companion = new a(null);
    private final PodcastStore a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public PodcastSourceImpl(PodcastStore podcastStore) {
        zq3.h(podcastStore, "podcastStore");
        this.a = podcastStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource o(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (ObservableSource) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaBrowserCompat.MediaItem p(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (MediaBrowserCompat.MediaItem) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List t(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (List) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource u(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (SingleSource) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Podcast w(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (Podcast) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource x(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (SingleSource) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NYTMediaItem y(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (NYTMediaItem) ss2Var.invoke(obj);
    }

    public final Single A() {
        return this.a.g();
    }

    @Override // com.nytimes.android.media.audio.podcast.PodcastSource
    public Single a(String str) {
        return PodcastSource.DefaultImpls.a(this, str);
    }

    @Override // com.nytimes.android.media.audio.podcast.PodcastSource
    public Single b() {
        Observable j = this.a.j();
        final PodcastSourceImpl$podcastMediaItemList$1 podcastSourceImpl$podcastMediaItemList$1 = new ss2() { // from class: com.nytimes.android.media.audio.podcast.PodcastSourceImpl$podcastMediaItemList$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ObservableSource invoke(Throwable th) {
                zq3.h(th, "<anonymous parameter 0>");
                return Observable.empty();
            }
        };
        Observable onErrorResumeNext = j.onErrorResumeNext(new Function() { // from class: xw5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource o;
                o = PodcastSourceImpl.o(ss2.this, obj);
                return o;
            }
        });
        final PodcastSourceImpl$podcastMediaItemList$2 podcastSourceImpl$podcastMediaItemList$2 = new ss2() { // from class: com.nytimes.android.media.audio.podcast.PodcastSourceImpl$podcastMediaItemList$2
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final MediaBrowserCompat.MediaItem invoke(Podcast podcast) {
                zq3.h(podcast, "podcast");
                return new MediaBrowserCompat.MediaItem(new MediaDescriptionCompat.d().i(podcast.getTitle()).f("Podcast|" + podcast.getTitle() + "|" + podcast.getId()).b(podcast.getDescription()).a(), 1);
            }
        };
        Single list = onErrorResumeNext.map(new Function() { // from class: yw5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                MediaBrowserCompat.MediaItem p;
                p = PodcastSourceImpl.p(ss2.this, obj);
                return p;
            }
        }).toList();
        zq3.g(list, "toList(...)");
        return list;
    }

    @Override // com.nytimes.android.media.audio.podcast.PodcastSource
    public Single c(final String str) {
        List l;
        zq3.h(str, "episodeId");
        List g = new Regex("///").g(str, 0);
        if (!g.isEmpty()) {
            ListIterator listIterator = g.listIterator(g.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    l = i.P0(g, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        l = i.l();
        String[] strArr = (String[]) l.toArray(new String[0]);
        if (strArr.length != 2) {
            Single error = Single.error(new IllegalArgumentException("Invalid episode id: " + str));
            zq3.g(error, "error(...)");
            return error;
        }
        String str2 = strArr[0];
        final String str3 = strArr[1];
        Single h = this.a.h(str2);
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.media.audio.podcast.PodcastSourceImpl$getItemForEpisodeID$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SingleSource invoke(Podcast podcast) {
                zq3.h(podcast, "podcast");
                for (Episode episode : podcast.d()) {
                    if (zq3.c(str3, episode.h())) {
                        return Single.just(this.s(episode, podcast));
                    }
                }
                return Single.error(new RuntimeException("No podcast episode exists for: " + str));
            }
        };
        Single flatMap = h.flatMap(new Function() { // from class: zw5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource u;
                u = PodcastSourceImpl.u(ss2.this, obj);
                return u;
            }
        });
        zq3.g(flatMap, "flatMap(...)");
        return flatMap;
    }

    @Override // com.nytimes.android.media.audio.podcast.PodcastSource
    public Single d(String str) {
        zq3.h(str, "query");
        Single z = z(str);
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.media.audio.podcast.PodcastSourceImpl$getEpisodesAsMediaItems$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final List invoke(Podcast podcast) {
                zq3.h(podcast, "podcast");
                List<Episode> d = podcast.d();
                PodcastSourceImpl podcastSourceImpl = PodcastSourceImpl.this;
                ArrayList arrayList = new ArrayList(i.w(d, 10));
                for (Episode episode : d) {
                    arrayList.add(new MediaDescriptionCompat.d().f(podcastSourceImpl.q(podcast, episode)).i(episode.g()).h(episode.a()).b(episode.b()).g(Uri.parse(episode.h())).a());
                }
                ArrayList arrayList2 = new ArrayList(i.w(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new MediaBrowserCompat.MediaItem((MediaDescriptionCompat) it2.next(), 2));
                }
                return i.X0(arrayList2);
            }
        };
        Single map = z.map(new Function() { // from class: ww5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List t;
                t = PodcastSourceImpl.t(ss2.this, obj);
                return t;
            }
        });
        zq3.g(map, "map(...)");
        return map;
    }

    @Override // com.nytimes.android.media.audio.podcast.PodcastSource
    public boolean e(String str) {
        return PodcastSource.DefaultImpls.c(this, str);
    }

    @Override // com.nytimes.android.media.audio.podcast.PodcastSource
    public Single f(String str) {
        return PodcastSource.DefaultImpls.b(this, str);
    }

    @Override // com.nytimes.android.media.audio.podcast.PodcastSource
    public Single g(String str, final gt2 gt2Var) {
        List l;
        zq3.h(str, "currentMediaId");
        zq3.h(gt2Var, "indexTransformer");
        List g = new Regex("///").g(str, 0);
        if (!g.isEmpty()) {
            ListIterator listIterator = g.listIterator(g.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    l = i.P0(g, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        l = i.l();
        String[] strArr = (String[]) l.toArray(new String[0]);
        if (strArr.length != 2) {
            Single error = Single.error(new IllegalArgumentException("Invalid media id: " + str));
            zq3.g(error, "error(...)");
            return error;
        }
        String str2 = strArr[0];
        final String str3 = strArr[1];
        Single h = this.a.h(str2);
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.media.audio.podcast.PodcastSourceImpl$getNewEpisode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final NYTMediaItem invoke(Podcast podcast) {
                Object obj;
                zq3.h(podcast, "podcast");
                List d = podcast.d();
                String str4 = str3;
                Iterator it2 = d.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (zq3.c(((Episode) obj).h(), str4)) {
                        break;
                    }
                }
                int p0 = i.p0(d, obj);
                Integer valueOf = p0 != -1 ? Integer.valueOf(p0) : null;
                return this.s((Episode) podcast.d().get(((Number) gt2.this.invoke(Integer.valueOf(valueOf != null ? valueOf.intValue() : -1), Integer.valueOf(podcast.d().size()))).intValue()), podcast);
            }
        };
        Single map = h.map(new Function() { // from class: ax5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                NYTMediaItem y;
                y = PodcastSourceImpl.y(ss2.this, obj);
                return y;
            }
        });
        zq3.g(map, "map(...)");
        return map;
    }

    public final String q(Podcast podcast, Episode episode) {
        zq3.h(podcast, "podcast");
        zq3.h(episode, "episode");
        return podcast.getId() + "///" + episode.h();
    }

    public final String r(Episode episode, Podcast podcast) {
        zq3.h(episode, "episode");
        zq3.h(podcast, "podcast");
        String g = episode.g();
        if (h.P(g, podcast.getTitle(), false, 2, null)) {
            return g;
        }
        return g + " | " + podcast.getTitle();
    }

    public final NYTMediaItem s(Episode episode, Podcast podcast) {
        zq3.h(episode, "episode");
        zq3.h(podcast, "podcast");
        String b = episode.b();
        String r = r(episode, podcast);
        String g = episode.g();
        String h = episode.h();
        String a2 = podcast.a();
        AudioPosition audioPosition = AudioPosition.AUTO;
        AudioType audioType = AudioType.AUTO;
        String b2 = podcast.b();
        String title = podcast.getTitle();
        return new NYTMediaItem(q(podcast, episode), h, r, b, 0L, false, false, null, g, episode.a(), a2, b2, Long.valueOf(episode.c().d(TimeUnit.SECONDS)), null, audioPosition, audioType, null, null, null, null, null, null, null, null, null, null, null, null, false, title, null, null, null, null, false, null, false, false, null, null, null, null, -536928016, 1023, null);
    }

    public final Single v(final PodcastTypeInfo podcastTypeInfo) {
        zq3.h(podcastTypeInfo, "podcastType");
        Single g = this.a.g();
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.media.audio.podcast.PodcastSourceImpl$getLatestEpisode$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Podcast invoke(List list) {
                zq3.h(list, "list");
                PodcastTypeInfo podcastTypeInfo2 = PodcastTypeInfo.this;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Podcast podcast = (Podcast) it2.next();
                    if (podcast.getType() == podcastTypeInfo2) {
                        return podcast;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        };
        Single map = g.map(new Function() { // from class: bx5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Podcast w;
                w = PodcastSourceImpl.w(ss2.this, obj);
                return w;
            }
        });
        final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.media.audio.podcast.PodcastSourceImpl$getLatestEpisode$2
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SingleSource invoke(Podcast podcast) {
                zq3.h(podcast, "podcast");
                return podcast.d().isEmpty() ? Single.error(new RuntimeException("Podcast didn't have any episodes")) : Single.just(PodcastSourceImpl.this.s((Episode) podcast.d().get(0), podcast));
            }
        };
        Single flatMap = map.flatMap(new Function() { // from class: cx5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource x;
                x = PodcastSourceImpl.x(ss2.this, obj);
                return x;
            }
        });
        zq3.g(flatMap, "flatMap(...)");
        return flatMap;
    }

    public final Single z(String str) {
        zq3.h(str, "query");
        return this.a.h((String) i.w0(h.F0(str, new String[]{"|"}, false, 0, 6, null)));
    }
}
