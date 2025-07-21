package com.nytimes.android.analytics.event.video;

import android.net.Uri;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.player.m;
import com.nytimes.android.media.player.p;
import com.nytimes.android.media.util.CaptionPrefManager;
import defpackage.c44;
import defpackage.e52;
import defpackage.sx1;
import defpackage.w89;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class VideoET2Reporter implements w89, c44 {
    public static final a Companion = new a(null);
    private final ET2Scope a;
    private final CaptionPrefManager b;
    private final p c;
    private final m d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public VideoET2Reporter(ET2Scope eT2Scope, CaptionPrefManager captionPrefManager, p pVar, m mVar) {
        zq3.h(eT2Scope, "et2Scope");
        zq3.h(captionPrefManager, "captionPrefManager");
        zq3.h(pVar, "playback");
        zq3.h(mVar, "mediaSourceProvider");
        this.a = eT2Scope;
        this.b = captionPrefManager;
        this.c = pVar;
        this.d = mVar;
    }

    private final void u(NYTMediaItem nYTMediaItem, String str) {
        ET2Scope eT2Scope = this.a;
        e52.f fVar = new e52.f();
        boolean areCaptionsEnabled = this.b.areCaptionsEnabled();
        long m0 = this.c.m0();
        Uri b = this.d.b(nYTMediaItem);
        ET2PageScope.DefaultImpls.a(eT2Scope, fVar, null, sx1.c(nYTMediaItem, str, areCaptionsEnabled, m0, this.c.l0(), b != null ? b.toString() : null), null, 10, null);
    }

    @Override // defpackage.w89
    public void a(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
        u(nYTMediaItem, "percent-75-consumed");
    }

    @Override // defpackage.w89
    public void b(NYTMediaItem nYTMediaItem, String str) {
        zq3.h(nYTMediaItem, "videoItem");
        zq3.h(str, "styleValue");
        u(nYTMediaItem, "resume");
    }

    @Override // defpackage.w89
    public void c(NYTMediaItem nYTMediaItem, String str) {
        zq3.h(nYTMediaItem, "videoItem");
        zq3.h(str, "styleValue");
        m(nYTMediaItem, str);
    }

    @Override // defpackage.w89
    public void d(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
        u(nYTMediaItem, "percent-25-consumed");
    }

    @Override // defpackage.w89
    public void e(NYTMediaItem nYTMediaItem, String str) {
        zq3.h(nYTMediaItem, "videoItem");
        zq3.h(str, "styleValue");
        u(nYTMediaItem, "user-play");
    }

    @Override // defpackage.w89
    public void f(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
        u(nYTMediaItem, "pause");
    }

    @Override // defpackage.w89
    public void g(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
        u(nYTMediaItem, "30-seconds-viewed");
    }

    @Override // defpackage.w89
    public void i(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
        u(nYTMediaItem, "muted");
    }

    @Override // defpackage.w89
    public void j(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
        u(nYTMediaItem, "auto-play-start");
    }

    @Override // defpackage.w89
    public void k(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
        u(nYTMediaItem, "seek");
    }

    @Override // defpackage.w89
    public void l(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
        u(nYTMediaItem, "unmuted");
    }

    @Override // defpackage.w89
    public void m(NYTMediaItem nYTMediaItem, String str) {
        zq3.h(nYTMediaItem, "videoItem");
        zq3.h(str, "styleValue");
        u(nYTMediaItem, "media-complete");
    }

    @Override // defpackage.w89
    public void n(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
        u(nYTMediaItem, "exit-fullscreen");
    }

    @Override // defpackage.w89
    public void o(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
        u(nYTMediaItem, "enter-fullscreen");
    }

    @Override // defpackage.w89
    public void p(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "metadata");
        u(nYTMediaItem, "captions-off");
    }

    @Override // defpackage.w89
    public void q(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
        u(nYTMediaItem, "share-tools");
    }

    @Override // defpackage.w89
    public void r(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
        u(nYTMediaItem, "3-seconds-viewed");
    }

    @Override // defpackage.w89
    public void s(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "metadata");
        u(nYTMediaItem, "captions-on");
    }

    @Override // defpackage.w89
    public void t(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "videoItem");
        u(nYTMediaItem, "percent-50-consumed");
    }
}
