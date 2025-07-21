package com.nytimes.android.video;

import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;

/* loaded from: classes4.dex */
public class FullscreenToolsController {
    private final BehaviorSubject a = BehaviorSubject.createDefault(SyncAction.HIDE);

    public enum SyncAction {
        SHOW,
        HIDE
    }

    public void a(SyncAction syncAction) {
        this.a.onNext(syncAction);
    }

    public SyncAction b() {
        return this.a.hasValue() ? (SyncAction) this.a.getValue() : SyncAction.SHOW;
    }

    public Observable c() {
        return this.a.hide();
    }

    public void d() {
        SyncAction b = b();
        SyncAction syncAction = SyncAction.SHOW;
        if (b == syncAction) {
            a(SyncAction.HIDE);
        } else {
            a(syncAction);
        }
    }
}
