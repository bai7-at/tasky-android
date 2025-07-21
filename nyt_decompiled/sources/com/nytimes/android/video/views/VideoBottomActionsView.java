package com.nytimes.android.video.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.h69;
import defpackage.oi6;
import defpackage.te6;
import defpackage.yb0;
import defpackage.zg6;

/* loaded from: classes4.dex */
public class VideoBottomActionsView extends f implements h69 {
    private a c;
    private View d;
    private View e;
    private View f;
    private View g;
    private AppCompatImageView h;
    private AppCompatImageView i;
    yb0 presenter;

    public interface a {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface b {
        void a();
    }

    public VideoBottomActionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        this.presenter.A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        this.presenter.y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(b bVar, View view) {
        bVar.a();
        d0(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O() {
        this.presenter.m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        this.presenter.l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U() {
        this.presenter.z0();
    }

    private void W(View view, final b bVar) {
        view.setOnClickListener(new View.OnClickListener() { // from class: com.nytimes.android.video.views.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VideoBottomActionsView.this.N(bVar, view2);
            }
        });
    }

    private void d0(View view) {
        if (this.c != null) {
            if (view.getId() == zg6.volumeContainer) {
                this.c.a();
            }
            this.c.b();
        }
    }

    public void A(String str) {
        this.presenter.x0(str);
    }

    @Override // defpackage.h69
    public void G() {
        this.f.setVisibility(8);
    }

    @Override // defpackage.h69
    public void J() {
        this.f.setVisibility(0);
    }

    @Override // defpackage.h69
    public void M0() {
        this.h.setImageResource(te6.ic_volume_mute);
    }

    @Override // defpackage.h69
    public void Q() {
        this.d.setVisibility(0);
        W(this.d, new b() { // from class: com.nytimes.android.video.views.m
            @Override // com.nytimes.android.video.views.VideoBottomActionsView.b
            public final void a() {
                VideoBottomActionsView.this.U();
            }
        });
    }

    public void X() {
        this.i.setImageResource(te6.vr_minimize_fullscreen);
        W(this.g, new b() { // from class: com.nytimes.android.video.views.l
            @Override // com.nytimes.android.video.views.VideoBottomActionsView.b
            public final void a() {
                VideoBottomActionsView.this.O();
            }
        });
    }

    public void Z() {
        this.i.setImageResource(te6.ic_vr_fullscreen);
        W(this.g, new b() { // from class: com.nytimes.android.video.views.i
            @Override // com.nytimes.android.video.views.VideoBottomActionsView.b
            public final void a() {
                VideoBottomActionsView.this.R();
            }
        });
    }

    @Override // defpackage.h69
    public void b0() {
        this.e.setAlpha(0.5f);
    }

    @Override // defpackage.h69
    public void c0(boolean z) {
        if (z) {
            G();
            this.g.setVisibility(4);
        } else {
            J();
            this.g.setVisibility(0);
        }
    }

    @Override // defpackage.h69
    public void f0() {
        this.e.setAlpha(1.0f);
    }

    @Override // defpackage.h69
    public void h0() {
        this.h.setImageResource(te6.ic_volume);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.d0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.L();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.h = (AppCompatImageView) findViewById(zg6.volume);
        W(findViewById(zg6.volumeContainer), new b() { // from class: com.nytimes.android.video.views.j
            @Override // com.nytimes.android.video.views.VideoBottomActionsView.b
            public final void a() {
                VideoBottomActionsView.this.C();
            }
        });
        View findViewById = findViewById(zg6.share);
        this.f = findViewById;
        W(findViewById, new b() { // from class: com.nytimes.android.video.views.k
            @Override // com.nytimes.android.video.views.VideoBottomActionsView.b
            public final void a() {
                VideoBottomActionsView.this.F();
            }
        });
        this.d = findViewById(zg6.caption_control_container);
        this.e = findViewById(zg6.caption_control_button);
        this.g = findViewById(zg6.video_fullscreen_toggle_container);
        this.i = (AppCompatImageView) findViewById(zg6.video_fullscreen_toggle_button);
    }

    void setCallback(a aVar) {
        this.c = aVar;
    }

    @Override // defpackage.h69
    public void x0() {
        this.d.setVisibility(8);
        this.d.setOnClickListener(null);
    }

    public VideoBottomActionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), oi6.video_bottom_actions_layout_content, this);
    }
}
