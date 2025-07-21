package com.nytimes.android.media.audio.views;

import com.nytimes.android.media.audio.presenter.AudioIndicatorPresenter;
import defpackage.op4;

/* loaded from: classes4.dex */
public abstract class d implements op4 {
    public static void a(AudioIndicator audioIndicator, AudioIndicatorPresenter audioIndicatorPresenter) {
        audioIndicator.presenter = audioIndicatorPresenter;
    }
}
