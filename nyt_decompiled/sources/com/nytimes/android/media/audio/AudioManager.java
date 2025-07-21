package com.nytimes.android.media.audio;

import android.support.v4.media.session.PlaybackStateCompat;
import com.nytimes.android.media.common.NYTMediaItem;
import defpackage.gj3;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;

/* loaded from: classes4.dex */
public class AudioManager {
    private final BehaviorSubject a = BehaviorSubject.createDefault(IndicatorViewState.IDLE);
    private final BehaviorSubject b = BehaviorSubject.createDefault(DrawerState.CLOSED);
    private final BehaviorSubject c = BehaviorSubject.createDefault(new gj3(null));
    private final BehaviorSubject d = BehaviorSubject.create();
    private long e = 0;
    private boolean f = false;

    public enum DrawerState {
        OPEN,
        CLOSED
    }

    public enum IndicatorViewState {
        HIDDEN,
        ANIMATING,
        VISIBLE,
        IDLE
    }

    private void q() {
        if (this.a.getValue() == IndicatorViewState.HIDDEN) {
            this.a.onNext(IndicatorViewState.ANIMATING);
            this.a.onNext(IndicatorViewState.VISIBLE);
        }
    }

    private void r(NYTMediaItem nYTMediaItem) {
        String N = nYTMediaItem.N();
        if (((gj3) this.c.getValue()).b() && ((gj3) this.c.getValue()).a().equals(N)) {
            return;
        }
        this.c.onNext(new gj3(N));
    }

    public IndicatorViewState a() {
        return (IndicatorViewState) this.a.getValue();
    }

    public Observable b() {
        return this.b.hide();
    }

    public DrawerState c() {
        return (DrawerState) this.b.getValue();
    }

    public long d() {
        return this.e;
    }

    public boolean e() {
        return this.f;
    }

    public Observable f() {
        return this.c.hide();
    }

    public void g() {
        q();
    }

    public void h() {
        this.b.onNext(DrawerState.CLOSED);
    }

    public void i() {
        this.b.onNext(DrawerState.OPEN);
    }

    public void j() {
        this.a.onNext(IndicatorViewState.IDLE);
    }

    public void k(long j) {
        this.e = j;
    }

    public void l() {
        this.a.onNext(IndicatorViewState.IDLE);
    }

    public void m() {
        if (this.a.getValue() == IndicatorViewState.IDLE) {
            this.a.onNext(IndicatorViewState.HIDDEN);
        }
    }

    public void n(NYTMediaItem nYTMediaItem) {
        if (nYTMediaItem.i() != null) {
            r(nYTMediaItem);
        }
    }

    public void o(PlaybackStateCompat playbackStateCompat) {
        this.d.onNext(playbackStateCompat);
    }

    public Observable p() {
        return this.d.hide();
    }

    public void s() {
        this.f = true;
    }

    public Observable t() {
        return this.a.hide();
    }
}
