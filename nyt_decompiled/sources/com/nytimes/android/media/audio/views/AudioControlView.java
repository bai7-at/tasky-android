package com.nytimes.android.media.audio.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.nytimes.android.media.audio.views.AudioControlView;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.common.seekbar.MediaSeekBar;
import com.nytimes.android.media.player.PlaybackCustomAction;
import defpackage.cw;
import defpackage.fg6;
import defpackage.fw;
import defpackage.hb5;
import defpackage.te6;
import defpackage.yh6;
import io.embrace.android.embracesdk.ViewSwazzledHooks;

/* loaded from: classes4.dex */
public class AudioControlView extends g implements cw {
    private AppCompatImageView c;
    hb5 mediaController;
    fw presenter;

    public AudioControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(View view) {
        NYTMediaItem d = this.mediaController.d();
        if (d != null && d.U()) {
            this.mediaController.z(PlaybackCustomAction.PLAY_AUDIO.name());
            return;
        }
        Integer g = this.mediaController.g();
        if (g != null) {
            if (g.intValue() == 3) {
                this.mediaController.z(PlaybackCustomAction.PAUSE_AUDIO.name());
            } else {
                this.mediaController.z(PlaybackCustomAction.PLAY_AUDIO.name());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(View view) {
        this.mediaController.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(View view) {
        this.mediaController.x();
    }

    @Override // defpackage.cw
    public void d() {
        this.c.setImageResource(te6.ic_audio_pause);
    }

    @Override // defpackage.cw
    public void f() {
        this.c.setImageResource(te6.ic_audio_play);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.V(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.L();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(fg6.audio_rewind_button);
        this.c = (AppCompatImageView) findViewById(fg6.audio_playpause_button);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) findViewById(fg6.audio_fast_forward_button);
        ((MediaSeekBar) findViewById(fg6.audio_seek_bar)).z((TextView) findViewById(fg6.current_audio_position), (TextView) findViewById(fg6.total_audio_duration));
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: gw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioControlView.this.z(view);
            }
        });
        this.c.setOnClickListener(new View.OnClickListener() { // from class: hw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioControlView.this.A(view);
            }
        });
        appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: iw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioControlView.this.C(view);
            }
        });
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public AudioControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setOnClickListener(new View.OnClickListener() { // from class: jw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewSwazzledHooks.OnClickListener._preOnClick(null, view);
            }
        });
        View.inflate(getContext(), yh6.audio_control_layout_content, this);
    }
}
