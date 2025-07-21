package defpackage;

import com.nytimes.android.media.audio.podcast.PodcastSubscriptionType;
import com.nytimes.android.media.audio.podcast.Subscription;
import defpackage.aw5;
import defpackage.lw5;
import kotlin.Pair;
import type.PodcastService;

/* loaded from: classes4.dex */
public abstract class mb8 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PodcastService.values().length];
            try {
                iArr[PodcastService.GOOGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PodcastService.APPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PodcastService.RADIO_PUBLIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final Subscription a(aw5.h hVar) {
        zq3.h(hVar, "<this>");
        return c(du8.a(hVar.a(), hVar.b()));
    }

    public static final Subscription b(lw5.h hVar) {
        zq3.h(hVar, "<this>");
        return c(du8.a(hVar.a(), hVar.b()));
    }

    private static final Subscription c(Pair pair) {
        int i = a.a[((PodcastService) pair.c()).ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? new Subscription(PodcastSubscriptionType.NOT_SET, (String) pair.d()) : new Subscription(PodcastSubscriptionType.RADIO_PUBLIC, (String) pair.d()) : new Subscription(PodcastSubscriptionType.APPLE, (String) pair.d()) : new Subscription(PodcastSubscriptionType.GOOGLE, (String) pair.d());
    }
}
