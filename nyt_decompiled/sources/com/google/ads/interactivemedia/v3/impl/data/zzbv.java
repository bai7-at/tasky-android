package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes2.dex */
public abstract class zzbv {
    public abstract zzbw build();

    public abstract zzbv volume(float f);

    public zzbv volumePercentage(int i) {
        return volume(i / 100.0f);
    }
}
