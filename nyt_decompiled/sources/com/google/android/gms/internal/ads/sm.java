package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes3.dex */
final class sm implements AudioManager.OnAudioFocusChangeListener {
    private final Handler a;
    final /* synthetic */ tm b;

    public sm(tm tmVar, Handler handler) {
        this.b = tmVar;
        this.a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.rm
            @Override // java.lang.Runnable
            public final void run() {
                tm.c(sm.this.b, i);
            }
        });
    }
}
