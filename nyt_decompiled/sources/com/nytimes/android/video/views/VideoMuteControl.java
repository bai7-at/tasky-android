package com.nytimes.android.video.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nytimes.android.video.views.VideoMuteControl;
import defpackage.f89;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class VideoMuteControl extends ConstraintLayout {
    private final f89 a;
    private a b;

    public interface a {
        void c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoMuteControl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zq3.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(VideoMuteControl videoMuteControl) {
        zq3.h(videoMuteControl, "this$0");
        videoMuteControl.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(boolean z, VideoMuteControl videoMuteControl) {
        zq3.h(videoMuteControl, "this$0");
        if (z) {
            videoMuteControl.O();
        } else {
            videoMuteControl.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(VideoMuteControl videoMuteControl, View view) {
        zq3.h(videoMuteControl, "this$0");
        a aVar = videoMuteControl.b;
        if (aVar != null) {
            aVar.c();
        }
        videoMuteControl.X(true);
    }

    public final void O() {
        setVisibility(8);
    }

    public final boolean R() {
        return getVisibility() == 8;
    }

    public final void U(boolean z) {
        if (z || getVisibility() == 4) {
            animate().withStartAction(new Runnable() { // from class: d89
                @Override // java.lang.Runnable
                public final void run() {
                    VideoMuteControl.W(VideoMuteControl.this);
                }
            }).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).start();
        }
    }

    public final void X(final boolean z) {
        animate().withEndAction(new Runnable() { // from class: e89
            @Override // java.lang.Runnable
            public final void run() {
                VideoMuteControl.Z(z, this);
            }
        }).scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setDuration(250L).start();
    }

    public final void c() {
        setVisibility(4);
    }

    public final void g0() {
        this.a.b.setAlpha(0.0f);
        this.a.b.setScaleX(0.8f);
        this.a.b.setScaleY(0.8f);
        this.a.c.setScaleX(1.0f);
        this.a.c.setScaleY(1.0f);
        setScaleX(1.0f);
        setScaleY(1.0f);
        setVisibility(8);
    }

    public final void i0() {
        this.a.b.animate().setStartDelay(2000L).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(160L).start();
        this.a.c.animate().setStartDelay(2000L).scaleX(0.8f).scaleY(0.8f).setDuration(160L).start();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new View.OnClickListener() { // from class: c89
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoMuteControl.d0(VideoMuteControl.this, view);
            }
        });
    }

    public final void setListener(a aVar) {
        this.b = aVar;
    }

    public /* synthetic */ VideoMuteControl(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoMuteControl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zq3.h(context, "context");
        f89 b = f89.b(LayoutInflater.from(context), this);
        zq3.g(b, "inflate(...)");
        this.a = b;
    }
}
