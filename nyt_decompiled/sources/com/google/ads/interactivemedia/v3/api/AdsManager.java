package com.google.ads.interactivemedia.v3.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;

/* loaded from: classes2.dex */
public interface AdsManager extends BaseManager {
    @KeepForSdk
    void clicked();

    void discardAdBreak();

    List<Float> getAdCuePoints();

    void pause();

    @Deprecated
    void requestNextAdBreak();

    void resume();

    void skip();

    void start();
}
