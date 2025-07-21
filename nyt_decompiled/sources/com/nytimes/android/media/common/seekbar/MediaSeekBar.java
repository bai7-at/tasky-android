package com.nytimes.android.media.common.seekbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.AttributeSet;
import android.widget.SeekBar;
import android.widget.TextView;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.common.seekbar.MediaSeekBar;
import com.nytimes.android.media.common.seekbar.b;
import com.nytimes.android.media.util.MediaDurationFormatter;
import com.nytimes.android.utils.TimeDuration;
import defpackage.bo4;
import defpackage.el4;
import defpackage.hb5;
import defpackage.kl4;
import defpackage.nc6;
import defpackage.oz4;
import defpackage.rn6;
import defpackage.ro4;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class MediaSeekBar extends a implements b, SeekBar.OnSeekBarChangeListener {
    private final Runnable d;
    MediaDurationFormatter durationFormatter;
    private TextView e;
    private TextView f;
    private b.a g;
    private boolean h;
    private boolean i;
    hb5 mediaControl;
    bo4 mediaServiceConnection;
    kl4 presenter;

    public MediaSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nc6.seekBarStyle);
    }

    private void A(PlaybackStateCompat playbackStateCompat) {
        if (r(playbackStateCompat)) {
            setSeekBarProgress(new TimeDuration(0L, TimeUnit.MILLISECONDS));
            return;
        }
        if (!this.h && playbackStateCompat.h() == 3) {
            long a = el4.a(playbackStateCompat);
            if (a != -111) {
                setSeekBarProgress(new TimeDuration(a, TimeUnit.MILLISECONDS));
            }
        } else if (!this.h && (playbackStateCompat.h() == 6 || playbackStateCompat.h() == 2)) {
            setSeekBarProgress(new TimeDuration(playbackStateCompat.g(), TimeUnit.MILLISECONDS));
        }
        if (this.mediaServiceConnection.g() != -1) {
            setSecondaryProgress((int) playbackStateCompat.c());
        }
        removeCallbacks(this.d);
        if (playbackStateCompat.h() != 1 || playbackStateCompat.h() == 0) {
            postDelayed(this.d, p(playbackStateCompat));
        }
    }

    private void C(int i) {
        setVisibility(i);
        TextView textView = this.f;
        if (textView != null) {
            textView.setVisibility(i);
        }
        TextView textView2 = this.e;
        if (textView2 != null) {
            textView2.setVisibility(i);
        }
        postInvalidate();
    }

    private long p(PlaybackStateCompat playbackStateCompat) {
        return playbackStateCompat.h() == 3 ? 400L : 1000L;
    }

    private boolean r(PlaybackStateCompat playbackStateCompat) {
        return playbackStateCompat == null || playbackStateCompat.h() == 1 || playbackStateCompat.h() == 7 || playbackStateCompat.h() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        ro4 e = this.mediaServiceConnection.e();
        if (e != null) {
            A(e.b());
        }
    }

    private void setCustomAttrs(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        if (attributeSet == null || (obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, rn6.MediaSeekBar)) == null) {
            return;
        }
        this.i = obtainStyledAttributes.getBoolean(rn6.MediaSeekBar_audio, false);
        obtainStyledAttributes.recycle();
    }

    private void setProgressText(TimeDuration timeDuration) {
        TextView textView = this.e;
        if (textView != null) {
            textView.setText(this.durationFormatter.stringForTime(timeDuration));
        }
    }

    @Override // com.nytimes.android.media.common.seekbar.b
    public void a() {
        C(0);
    }

    @Override // com.nytimes.android.media.common.seekbar.b
    public void c() {
        C(4);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.e0(this.i);
        this.presenter.c0(this);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.L();
        removeCallbacks(this.d);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            setSeekBarProgress(new TimeDuration(i, TimeUnit.MILLISECONDS));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        this.h = true;
        b.a aVar = this.g;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        this.h = false;
        b.a aVar = this.g;
        if (aVar != null) {
            aVar.a();
        }
        this.mediaControl.y(seekBar.getProgress());
    }

    public boolean q() {
        return this.h;
    }

    public void setInteractionListener(b.a aVar) {
        this.g = aVar;
    }

    @Override // com.nytimes.android.media.common.seekbar.b
    public void setMaxSeekBarDuration(TimeDuration timeDuration) {
        TextView textView = this.f;
        if (textView != null) {
            textView.setText(this.durationFormatter.stringForTime(timeDuration));
        }
        setMax((int) timeDuration.d(TimeUnit.MILLISECONDS));
    }

    public void setSeekBarProgress(TimeDuration timeDuration) {
        setProgressText(timeDuration);
        setProgress((int) timeDuration.d(TimeUnit.MILLISECONDS));
    }

    @Override // com.nytimes.android.media.common.seekbar.b
    public void t() {
        if (this.presenter.O()) {
            NYTMediaItem d = this.mediaControl.d();
            if (this.i && d != null && d.i() == null) {
                this.mediaServiceConnection.d(new oz4() { // from class: vn4
                    @Override // defpackage.oz4
                    public final void call() {
                        MediaSeekBar.this.s();
                    }
                });
            } else {
                A(this.mediaControl.f());
            }
        }
    }

    public void z(TextView textView, TextView textView2) {
        this.e = textView;
        this.f = textView2;
    }

    public MediaSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new Runnable() { // from class: un4
            @Override // java.lang.Runnable
            public final void run() {
                MediaSeekBar.this.t();
            }
        };
        this.g = null;
        this.h = false;
        setCustomAttrs(attributeSet);
        setOnSeekBarChangeListener(this);
    }
}
