package com.nytimes.android.media.player;

import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;

/* loaded from: classes4.dex */
public class VideoAdEvents {
    private final BehaviorSubject a = BehaviorSubject.create();

    public enum TappedEvent {
        TAPPED
    }

    void a() {
        this.a.onNext(TappedEvent.TAPPED);
    }

    public Observable b() {
        return this.a.hide();
    }
}
