package com.nytimes.android.video.views;

import android.view.View;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.video.FullscreenToolsController;
import com.nytimes.android.video.presenter.InlineVideoPresenter;
import com.nytimes.android.video.sectionfront.ui.VideoCover;
import com.nytimes.android.video.views.VideoControlView;
import com.nytimes.android.video.views.h;
import defpackage.bo4;
import defpackage.cv;
import defpackage.hb5;
import defpackage.oz4;
import defpackage.qk3;
import defpackage.tv5;
import defpackage.z4;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class h {
    private final InlineVideoPresenter a;
    private final z4 b;
    private final hb5 c;
    private final bo4 d;
    private final FullscreenToolsController e;
    private final cv f;
    private final qk3 g;
    private VideoCover h;
    private ExoPlayerView i;

    public h(InlineVideoPresenter inlineVideoPresenter, z4 z4Var, hb5 hb5Var, bo4 bo4Var, FullscreenToolsController fullscreenToolsController, cv cvVar, qk3 qk3Var) {
        zq3.h(inlineVideoPresenter, "presenter");
        zq3.h(z4Var, "activityMediaManager");
        zq3.h(hb5Var, "mediaControl");
        zq3.h(bo4Var, "mediaServiceConnection");
        zq3.h(fullscreenToolsController, "toolsController");
        zq3.h(cvVar, "attachedInlineVideoViews");
        zq3.h(qk3Var, "stateManager");
        this.a = inlineVideoPresenter;
        this.b = z4Var;
        this.c = hb5Var;
        this.d = bo4Var;
        this.e = fullscreenToolsController;
        this.f = cvVar;
        this.g = qk3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(h hVar, View view) {
        zq3.h(hVar, "this$0");
        hVar.a.C0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(VideoControlView videoControlView) {
        zq3.h(videoControlView, "$videoControlView");
        videoControlView.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(h hVar, NYTMediaItem nYTMediaItem) {
        zq3.h(hVar, "this$0");
        if (hVar.c.h(nYTMediaItem)) {
            return;
        }
        hVar.t(InlineVideoState.START);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(h hVar) {
        zq3.h(hVar, "this$0");
        hVar.e.a(FullscreenToolsController.SyncAction.SHOW);
        hVar.t(InlineVideoState.PLAYING);
        hVar.d.b(hVar.m());
    }

    public final void g(final VideoControlView videoControlView) {
        zq3.h(videoControlView, "videoControlView");
        VideoCover videoCover = this.h;
        ExoPlayerView exoPlayerView = null;
        if (videoCover == null) {
            zq3.z("videoCover");
            videoCover = null;
        }
        videoCover.setCoverClickListener(new View.OnClickListener() { // from class: mk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.e(h.this, view);
            }
        });
        ExoPlayerView exoPlayerView2 = this.i;
        if (exoPlayerView2 == null) {
            zq3.z("exoPlayerView");
        } else {
            exoPlayerView = exoPlayerView2;
        }
        exoPlayerView.setOnControlClickAction(new oz4() { // from class: nk3
            @Override // defpackage.oz4
            public final void call() {
                h.f(VideoControlView.this);
            }
        });
    }

    public final void h(InlineVideoView inlineVideoView) {
        zq3.h(inlineVideoView, "view");
        this.a.e0(inlineVideoView);
        this.f.a(inlineVideoView);
    }

    public final void i(VideoCover videoCover, ExoPlayerView exoPlayerView, VideoControlView videoControlView) {
        zq3.h(videoCover, "videoCover");
        zq3.h(exoPlayerView, "exoPlayerView");
        zq3.h(videoControlView, "videoControlView");
        this.h = videoCover;
        this.i = exoPlayerView;
        this.g.a(videoCover, exoPlayerView, videoControlView);
    }

    public final void k(final NYTMediaItem nYTMediaItem) {
        if (nYTMediaItem != null) {
            this.a.t0(nYTMediaItem);
        }
        this.a.r0(nYTMediaItem);
        this.b.j(new oz4() { // from class: ok3
            @Override // defpackage.oz4
            public final void call() {
                h.j(h.this, nYTMediaItem);
            }
        });
        s();
    }

    public final void l(InlineVideoView inlineVideoView) {
        zq3.h(inlineVideoView, "view");
        this.a.L();
        this.f.b(inlineVideoView);
    }

    public final tv5 m() {
        ExoPlayerView exoPlayerView = this.i;
        if (exoPlayerView == null) {
            zq3.z("exoPlayerView");
            exoPlayerView = null;
        }
        tv5 presenter = exoPlayerView.getPresenter();
        zq3.g(presenter, "getPresenter(...)");
        return presenter;
    }

    public final void n() {
        VideoCover videoCover = this.h;
        if (videoCover == null) {
            zq3.z("videoCover");
            videoCover = null;
        }
        videoCover.setMuteControlListener(this.a);
    }

    public final boolean o() {
        NYTMediaItem s0 = this.a.s0();
        return s0 != null && s0.y();
    }

    public final NYTMediaItem p() {
        return this.a.s0();
    }

    public final void q(VideoControlView.ControlInteractionCallback.Interaction interaction) {
        zq3.h(interaction, "interaction");
        this.a.A0(interaction);
        VideoCover videoCover = this.h;
        if (videoCover == null) {
            zq3.z("videoCover");
            videoCover = null;
        }
        videoCover.W();
    }

    public final void s() {
        Long x0 = this.a.x0();
        if (x0 != null) {
            if (this.c.j(x0.longValue(), this.a.y0()) && this.c.p()) {
                this.d.d(new oz4() { // from class: pk3
                    @Override // defpackage.oz4
                    public final void call() {
                        h.r(h.this);
                    }
                });
                this.b.k();
            }
        }
    }

    public final void t(InlineVideoState inlineVideoState) {
        zq3.h(inlineVideoState, TransferTable.COLUMN_STATE);
        this.g.b(inlineVideoState, o());
    }

    public final void u() {
        this.a.C0(true);
    }
}
