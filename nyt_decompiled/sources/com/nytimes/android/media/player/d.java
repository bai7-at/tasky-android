package com.nytimes.android.media.player;

import android.os.Binder;

/* loaded from: classes4.dex */
public class d extends Binder {
    private final MediaService a;

    d(MediaService mediaService) {
        this.a = mediaService;
    }

    public MediaService a() {
        return this.a;
    }
}
