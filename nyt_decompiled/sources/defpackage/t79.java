package defpackage;

import com.nytimes.android.analytics.event.video.VideoType;
import com.nytimes.android.entitlements.a;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.util.CaptionPrefManager;
import com.nytimes.android.utils.DeviceUtils;
import com.nytimes.android.utils.NetworkStatus;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class t79 implements w89 {
    private final wc a;
    private final a b;
    private final jc c;
    private final NetworkStatus d;
    private final b04 e;
    private final tm f;
    private final String g;
    private final String h;
    private final String i;
    private final CaptionPrefManager j;
    private final b05 k;

    public t79(wc wcVar, a aVar, jc jcVar, NetworkStatus networkStatus, b04 b04Var, tm tmVar, String str, String str2, String str3, CaptionPrefManager captionPrefManager, b05 b05Var) {
        zq3.h(wcVar, "eventManager");
        zq3.h(aVar, "ecommClient");
        zq3.h(jcVar, "analyticsClient");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(b04Var, "agentIdWrapper");
        zq3.h(tmVar, "appPreferencesManager");
        zq3.h(str, "appVersion");
        zq3.h(str2, "buildNumber");
        zq3.h(str3, "etSourceAppName");
        zq3.h(captionPrefManager, "captionPrefManager");
        zq3.h(b05Var, "clock");
        this.a = wcVar;
        this.b = aVar;
        this.c = jcVar;
        this.d = networkStatus;
        this.e = b04Var;
        this.f = tmVar;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = captionPrefManager;
        this.k = b05Var;
    }

    private final int h(boolean z) {
        return z ? 1 : 0;
    }

    private final String u(Long l) {
        if (l == null || l.longValue() == 0) {
            return null;
        }
        return l.toString();
    }

    @Override // defpackage.w89
    public void a(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
    }

    @Override // defpackage.w89
    public void b(NYTMediaItem nYTMediaItem, String str) {
        zq3.h(nYTMediaItem, "videoItem");
        zq3.h(str, "styleValue");
    }

    @Override // defpackage.w89
    public void c(NYTMediaItem nYTMediaItem, String str) {
        zq3.h(nYTMediaItem, "videoItem");
        zq3.h(str, "styleValue");
    }

    @Override // defpackage.w89
    public void d(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
    }

    @Override // defpackage.w89
    public void e(NYTMediaItem nYTMediaItem, String str) {
        zq3.h(nYTMediaItem, "videoItem");
        zq3.h(str, "styleValue");
        wc wcVar = this.a;
        String p = nYTMediaItem.p();
        String u = this.b.u();
        String a = nYTMediaItem.a();
        Long V = nYTMediaItem.V();
        String W = nYTMediaItem.W();
        String e0 = nYTMediaItem.e0();
        String u2 = u(nYTMediaItem.a0());
        String b0 = nYTMediaItem.b0();
        String Y = nYTMediaItem.Y();
        VideoType videoType = VideoType.CONTENT;
        String a2 = ((ya) this.e.get()).a();
        String g = DeviceUtils.g();
        String b = this.f.b();
        zq3.g(b, "autoPlaySettingsReporting(...)");
        wcVar.b(new s09(p, u, a, V, W, e0, u2, b0, Y, videoType, a2, g, b, this.k.c(), nYTMediaItem.d0(), nYTMediaItem.e(), Integer.valueOf(h(nYTMediaItem.j())), Integer.valueOf(h(this.j.areCaptionsEnabled())), this.c.d(), this.c.g(), this.h, this.g, this.d.e(), this.c.i(), this.i, TimeUnit.MILLISECONDS.toSeconds(this.k.c())));
    }

    @Override // defpackage.w89
    public void f(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
    }

    @Override // defpackage.w89
    public void g(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
    }

    @Override // defpackage.w89
    public void i(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
    }

    @Override // defpackage.w89
    public void j(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
    }

    @Override // defpackage.w89
    public void k(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
    }

    @Override // defpackage.w89
    public void l(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
    }

    @Override // defpackage.w89
    public void m(NYTMediaItem nYTMediaItem, String str) {
        zq3.h(nYTMediaItem, "videoItem");
        zq3.h(str, "styleValue");
    }

    @Override // defpackage.w89
    public void n(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
    }

    @Override // defpackage.w89
    public void o(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
    }

    @Override // defpackage.w89
    public void p(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "metadata");
    }

    @Override // defpackage.w89
    public void q(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
    }

    @Override // defpackage.w89
    public void r(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
    }

    @Override // defpackage.w89
    public void s(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "metadata");
    }

    @Override // defpackage.w89
    public void t(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
    }
}
