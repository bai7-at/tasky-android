package com.nytimes.android.media.audio.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.nytimes.android.media.audio.views.SfAudioControl;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.util.MediaDurationFormatter;
import com.nytimes.android.utils.TimeDuration;
import defpackage.ao7;
import defpackage.bo4;
import defpackage.co7;
import defpackage.el4;
import defpackage.fg6;
import defpackage.hb5;
import defpackage.if6;
import defpackage.mx0;
import defpackage.nd6;
import defpackage.nl6;
import defpackage.on6;
import defpackage.oz4;
import defpackage.ro4;
import defpackage.te6;
import defpackage.yh6;
import io.reactivex.disposables.CompositeDisposable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class SfAudioControl extends m implements co7 {
    private TextView c;
    private TextView d;
    private TextView e;
    private LottieAnimationView f;
    private ImageView g;
    private final Runnable h;
    private final CompositeDisposable i;
    private final int j;
    private final int k;
    private final boolean l;
    hb5 mediaControl;
    MediaDurationFormatter mediaDurationFormatter;
    ao7 presenter;
    bo4 serviceConnection;

    public SfAudioControl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(View view) {
        this.presenter.v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        ro4 e = this.serviceConnection.e();
        if (e == null || !this.presenter.q0(e.a())) {
            z();
        } else {
            O(e.b());
        }
    }

    private void F() {
        if (this.l) {
            this.d.setVisibility(8);
        } else {
            y0("");
            this.d.setVisibility(0);
        }
    }

    private void O(PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat != null) {
            if (playbackStateCompat.h() == 3 || playbackStateCompat.h() == 2 || playbackStateCompat.h() == 6) {
                if (playbackStateCompat.h() != 3) {
                    N(playbackStateCompat.g());
                    removeCallbacks(this.h);
                    return;
                }
                long a = el4.a(playbackStateCompat);
                if (a != -111) {
                    N(a);
                }
                removeCallbacks(this.h);
                postDelayed(this.h, 700L);
            }
        }
    }

    private void s() {
        this.f.u();
        this.f.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        NYTMediaItem d = this.mediaControl.d();
        if (d != null && d.U()) {
            this.serviceConnection.d(new oz4() { // from class: sn7
                @Override // defpackage.oz4
                public final void call() {
                    SfAudioControl.this.C();
                }
            });
        } else if (this.presenter.q0(d)) {
            O(this.mediaControl.f());
        } else {
            z();
        }
    }

    @Override // defpackage.co7
    public void B0() {
        this.c.setText(nl6.audio_play_episode);
        this.c.setTextColor(this.k);
        this.g.setImageResource(if6.audio_btn_play);
        s();
        z();
    }

    @Override // defpackage.co7
    public void H0() {
        this.c.setText(nl6.audio_play_episode);
        this.c.setTextColor(this.k);
        this.g.setImageResource(if6.audio_btn_play);
        s();
        removeCallbacks(this.h);
        t();
    }

    public void N(long j) {
        this.e.setVisibility(0);
        String stringForTime = this.mediaDurationFormatter.stringForTime(new TimeDuration(j, TimeUnit.MILLISECONDS));
        this.e.setText(stringForTime + "/");
    }

    @Override // defpackage.co7
    public void h() {
        this.c.setText(nl6.audio_play_episode);
        this.c.setTextColor(this.k);
        this.g.setImageResource(te6.card_outline_bars);
        s();
        removeCallbacks(this.h);
        t();
    }

    @Override // defpackage.co7
    public void i() {
        this.c.setText(nl6.audio_now_playing);
        this.c.setTextColor(this.j);
        this.g.setImageResource(if6.audio_btn_pause);
        s();
        t();
    }

    @Override // defpackage.co7
    public void k0() {
        this.g.setImageResource(if6.audio_btn_buffering);
        this.f.w();
        this.f.setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.presenter.e0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.L();
        this.i.clear();
        removeCallbacks(this.h);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView) findViewById(fg6.playback_status);
        this.d = (TextView) findViewById(fg6.duration);
        this.g = (ImageView) findViewById(fg6.play_button);
        this.e = (TextView) findViewById(fg6.current_audio_position);
        this.f = (LottieAnimationView) findViewById(fg6.buffering_animation);
        z();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            return;
        }
        this.presenter.w0();
    }

    public void r(NYTMediaItem nYTMediaItem, ViewGroup viewGroup) {
        this.presenter.l0(nYTMediaItem);
        if (nYTMediaItem.V() == null || nYTMediaItem.V().longValue() <= 0) {
            F();
        } else {
            y0(this.mediaDurationFormatter.stringForTime(new TimeDuration(nYTMediaItem.V().longValue(), TimeUnit.SECONDS)));
        }
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: rn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SfAudioControl.this.A(view);
            }
        });
    }

    @Override // defpackage.co7
    public void u() {
        this.c.setText(nl6.audio_now_playing);
        this.c.setTextColor(this.j);
        this.g.setImageResource(te6.card_outline_bars);
        s();
        t();
    }

    @Override // defpackage.co7
    public void y0(String str) {
        this.d.setText(str);
        if (this.d.getVisibility() != 0) {
            this.d.setVisibility(0);
        }
    }

    public void z() {
        removeCallbacks(this.h);
        this.e.setVisibility(8);
    }

    public SfAudioControl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new Runnable() { // from class: qn7
            @Override // java.lang.Runnable
            public final void run() {
                SfAudioControl.this.t();
            }
        };
        this.i = new CompositeDisposable();
        View.inflate(getContext(), yh6.sf_audio_view, this);
        this.j = mx0.c(getContext(), nd6.sf_audio_playback_status);
        this.k = mx0.c(getContext(), nd6.sf_audio_playback_status_inactive);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, on6.SfAudioControl, 0, 0);
        try {
            this.l = obtainStyledAttributes.getBoolean(on6.SfAudioControl_hideDefaultDurationWhenEmpty, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
