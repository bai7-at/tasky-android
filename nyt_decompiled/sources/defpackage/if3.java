package defpackage;

import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.source.ads.b;
import com.google.android.exoplayer2.v1;
import com.google.common.collect.ImmutableList;
import defpackage.jf3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class if3 implements com.google.android.exoplayer2.source.ads.b {
    private final jf3.a a;
    private final Context b;
    private final jf3.b c;
    private final d d;
    private final HashMap e;
    private final HashMap f;
    private final g2.b g;
    private final g2.d h;
    private boolean i;
    private v1 j;
    private List k;
    private v1 l;
    private v7 m;

    public static final class b {
        private final Context a;
        private ImaSdkSettings b;
        private AdErrorEvent.AdErrorListener c;
        private AdEvent.AdEventListener d;
        private VideoAdPlayer.VideoAdPlayerCallback e;
        private List f;
        private Set g;
        private Collection h;
        private Boolean i;
        private boolean p;
        private long j = 10000;
        private int k = -1;
        private int l = -1;
        private int m = -1;
        private boolean n = true;
        private boolean o = true;
        private jf3.b q = new c();

        public b(Context context) {
            this.a = ((Context) ur.e(context)).getApplicationContext();
        }

        public if3 a() {
            return new if3(this.a, new jf3.a(this.j, this.k, this.l, this.n, this.o, this.m, this.i, this.f, this.g, this.h, this.c, this.d, this.e, this.b, this.p), this.q);
        }

        public b b(AdEvent.AdEventListener adEventListener) {
            this.d = (AdEvent.AdEventListener) ur.e(adEventListener);
            return this;
        }

        public b c(boolean z) {
            this.p = z;
            return this;
        }

        public b d(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
            this.e = (VideoAdPlayer.VideoAdPlayerCallback) ur.e(videoAdPlayerCallback);
            return this;
        }
    }

    private static final class c implements jf3.b {
        private c() {
        }

        @Override // jf3.b
        public AdsLoader a(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer) {
            return ImaSdkFactory.getInstance().createAdsLoader(context, imaSdkSettings, adDisplayContainer);
        }

        @Override // jf3.b
        public AdDisplayContainer b(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer) {
            return ImaSdkFactory.createAdDisplayContainer(viewGroup, videoAdPlayer);
        }

        @Override // jf3.b
        public ImaSdkSettings c() {
            ImaSdkSettings createImaSdkSettings = ImaSdkFactory.getInstance().createImaSdkSettings();
            createImaSdkSettings.setLanguage(z19.j0()[0]);
            return createImaSdkSettings;
        }

        @Override // jf3.b
        public AdsRenderingSettings d() {
            return ImaSdkFactory.getInstance().createAdsRenderingSettings();
        }

        @Override // jf3.b
        public AdsRequest e() {
            return ImaSdkFactory.getInstance().createAdsRequest();
        }

        @Override // jf3.b
        public AdDisplayContainer f(Context context, VideoAdPlayer videoAdPlayer) {
            return ImaSdkFactory.createAudioAdDisplayContainer(context, videoAdPlayer);
        }
    }

    private final class d implements v1.d {
        private d() {
        }

        @Override // com.google.android.exoplayer2.v1.d
        public void A(v1.e eVar, v1.e eVar2, int i) {
            if3.this.k();
            if3.this.j();
        }

        @Override // com.google.android.exoplayer2.v1.d
        public void E(g2 g2Var, int i) {
            if (g2Var.v()) {
                return;
            }
            if3.this.k();
            if3.this.j();
        }

        @Override // com.google.android.exoplayer2.v1.d
        public void i0(int i) {
            if3.this.j();
        }
    }

    static {
        n72.a("goog.exo.ima");
    }

    private v7 i() {
        Object m;
        v7 v7Var;
        v1 v1Var = this.l;
        if (v1Var == null) {
            return null;
        }
        g2 m2 = v1Var.m();
        if (m2.v() || (m = m2.k(v1Var.q(), this.g).m()) == null || (v7Var = (v7) this.e.get(m)) == null || !this.f.containsValue(v7Var)) {
            return null;
        }
        return v7Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        int i;
        v7 v7Var;
        v1 v1Var = this.l;
        if (v1Var == null) {
            return;
        }
        g2 m = v1Var.m();
        if (m.v() || (i = m.i(v1Var.q(), this.g, this.h, v1Var.q0(), v1Var.y())) == -1) {
            return;
        }
        m.k(i, this.g);
        Object m2 = this.g.m();
        if (m2 == null || (v7Var = (v7) this.e.get(m2)) == null || v7Var == this.m) {
            return;
        }
        g2.d dVar = this.h;
        g2.b bVar = this.g;
        v7Var.g1(z19.h1(((Long) m.o(dVar, bVar, bVar.c, -9223372036854775807L).second).longValue()), z19.h1(this.g.d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        v7 v7Var = this.m;
        v7 i = i();
        if (z19.c(v7Var, i)) {
            return;
        }
        if (v7Var != null) {
            v7Var.E0();
        }
        this.m = i;
        if (i != null) {
            i.C0((v1) ur.e(this.l));
        }
    }

    @Override // com.google.android.exoplayer2.source.ads.b
    public void a(AdsMediaSource adsMediaSource, int i, int i2) {
        if (this.l == null) {
            return;
        }
        ((v7) ur.e((v7) this.f.get(adsMediaSource))).V0(i, i2);
    }

    @Override // com.google.android.exoplayer2.source.ads.b
    public void b(AdsMediaSource adsMediaSource, com.google.android.exoplayer2.upstream.b bVar, Object obj, c8 c8Var, b.a aVar) {
        ur.h(this.i, "Set player using adsLoader.setPlayer before preparing the player.");
        if (this.f.isEmpty()) {
            v1 v1Var = this.j;
            this.l = v1Var;
            if (v1Var == null) {
                return;
            } else {
                v1Var.u(this.d);
            }
        }
        v7 v7Var = (v7) this.e.get(obj);
        if (v7Var == null) {
            m(bVar, obj, c8Var.a());
            v7Var = (v7) this.e.get(obj);
        }
        this.f.put(adsMediaSource, (v7) ur.e(v7Var));
        v7Var.D0(aVar, c8Var);
        k();
    }

    @Override // com.google.android.exoplayer2.source.ads.b
    public void c(AdsMediaSource adsMediaSource, int i, int i2, IOException iOException) {
        if (this.l == null) {
            return;
        }
        ((v7) ur.e((v7) this.f.get(adsMediaSource))).W0(i, i2, iOException);
    }

    @Override // com.google.android.exoplayer2.source.ads.b
    public void d(AdsMediaSource adsMediaSource, b.a aVar) {
        v7 v7Var = (v7) this.f.remove(adsMediaSource);
        k();
        if (v7Var != null) {
            v7Var.k1(aVar);
        }
        if (this.l == null || !this.f.isEmpty()) {
            return;
        }
        this.l.e(this.d);
        this.l = null;
    }

    @Override // com.google.android.exoplayer2.source.ads.b
    public void e(int... iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i == 0) {
                arrayList.add("application/dash+xml");
            } else if (i == 2) {
                arrayList.add("application/x-mpegURL");
            } else if (i == 4) {
                arrayList.addAll(Arrays.asList("video/mp4", "video/webm", "video/3gpp", "audio/mp4", "audio/mpeg"));
            }
        }
        this.k = Collections.unmodifiableList(arrayList);
    }

    public AdDisplayContainer h() {
        v7 v7Var = this.m;
        if (v7Var != null) {
            return v7Var.H0();
        }
        return null;
    }

    public void l() {
        v1 v1Var = this.l;
        if (v1Var != null) {
            v1Var.e(this.d);
            this.l = null;
            k();
        }
        this.j = null;
        Iterator it2 = this.f.values().iterator();
        while (it2.hasNext()) {
            ((v7) it2.next()).release();
        }
        this.f.clear();
        Iterator it3 = this.e.values().iterator();
        while (it3.hasNext()) {
            ((v7) it3.next()).release();
        }
        this.e.clear();
    }

    public void m(com.google.android.exoplayer2.upstream.b bVar, Object obj, ViewGroup viewGroup) {
        if (this.e.containsKey(obj)) {
            return;
        }
        this.e.put(obj, new v7(this.b, this.a, this.c, this.k, bVar, obj, viewGroup));
    }

    public void n(v1 v1Var) {
        ur.g(Looper.myLooper() == jf3.c());
        ur.g(v1Var == null || v1Var.n() == jf3.c());
        this.j = v1Var;
        this.i = true;
    }

    private if3(Context context, jf3.a aVar, jf3.b bVar) {
        this.b = context.getApplicationContext();
        this.a = aVar;
        this.c = bVar;
        this.d = new d();
        this.k = ImmutableList.x();
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new g2.b();
        this.h = new g2.d();
    }
}
