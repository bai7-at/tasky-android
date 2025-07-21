package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import defpackage.c8;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface b {

    public interface a {
        default void v() {
        }

        void w(com.google.android.exoplayer2.source.ads.a aVar);

        default void x() {
        }

        void y(AdsMediaSource.AdLoadException adLoadException, com.google.android.exoplayer2.upstream.b bVar);
    }

    void a(AdsMediaSource adsMediaSource, int i, int i2);

    void b(AdsMediaSource adsMediaSource, com.google.android.exoplayer2.upstream.b bVar, Object obj, c8 c8Var, a aVar);

    void c(AdsMediaSource adsMediaSource, int i, int i2, IOException iOException);

    void d(AdsMediaSource adsMediaSource, a aVar);

    void e(int... iArr);
}
