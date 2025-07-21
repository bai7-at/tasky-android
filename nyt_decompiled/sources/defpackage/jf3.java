package defpackage;

import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
abstract class jf3 {

    public static final class a {
        public final long a;
        public final int b;
        public final int c;
        public final boolean d;
        public final boolean e;
        public final int f;
        public final Boolean g;
        public final List h;
        public final Set i;
        public final Collection j;
        public final AdErrorEvent.AdErrorListener k;
        public final AdEvent.AdEventListener l;
        public final VideoAdPlayer.VideoAdPlayerCallback m;
        public final ImaSdkSettings n;
        public final boolean o;

        public a(long j, int i, int i2, boolean z, boolean z2, int i3, Boolean bool, List list, Set set, Collection collection, AdErrorEvent.AdErrorListener adErrorListener, AdEvent.AdEventListener adEventListener, VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback, ImaSdkSettings imaSdkSettings, boolean z3) {
            this.a = j;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = z2;
            this.f = i3;
            this.g = bool;
            this.h = list;
            this.i = set;
            this.j = collection;
            this.k = adErrorListener;
            this.l = adEventListener;
            this.m = videoAdPlayerCallback;
            this.n = imaSdkSettings;
            this.o = z3;
        }
    }

    public interface b {
        AdsLoader a(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer);

        AdDisplayContainer b(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer);

        ImaSdkSettings c();

        AdsRenderingSettings d();

        AdsRequest e();

        AdDisplayContainer f(Context context, VideoAdPlayer videoAdPlayer);
    }

    public static long[] a(List list) {
        if (list.isEmpty()) {
            return new long[]{0};
        }
        int size = list.size();
        long[] jArr = new long[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            double floatValue = ((Float) list.get(i2)).floatValue();
            if (floatValue == -1.0d) {
                jArr[size - 1] = Long.MIN_VALUE;
            } else {
                jArr[i] = Math.round(floatValue * 1000000.0d);
                i++;
            }
        }
        Arrays.sort(jArr, 0, i);
        return jArr;
    }

    public static AdsRequest b(b bVar, com.google.android.exoplayer2.upstream.b bVar2) {
        AdsRequest e = bVar.e();
        if ("data".equals(bVar2.a.getScheme())) {
            v91 v91Var = new v91();
            try {
                v91Var.b(bVar2);
                e.setAdsResponse(z19.E(aa1.b(v91Var)));
            } finally {
                v91Var.close();
            }
        } else {
            e.setAdTagUrl(bVar2.a.toString());
        }
        return e;
    }

    public static Looper c() {
        return Looper.getMainLooper();
    }

    public static String d(VideoProgressUpdate videoProgressUpdate) {
        return VideoProgressUpdate.VIDEO_TIME_NOT_READY.equals(videoProgressUpdate) ? "not ready" : z19.D("%d ms of %d ms", Long.valueOf(videoProgressUpdate.getCurrentTimeMs()), Long.valueOf(videoProgressUpdate.getDurationMs()));
    }

    public static boolean e(AdError adError) {
        return adError.getErrorCode() == AdError.AdErrorCode.VAST_LINEAR_ASSET_MISMATCH || adError.getErrorCode() == AdError.AdErrorCode.UNKNOWN_ERROR;
    }
}
