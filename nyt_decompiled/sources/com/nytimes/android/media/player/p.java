package com.nytimes.android.media.player;

import android.view.ViewGroup;
import com.nytimes.android.media.common.NYTMediaItem;
import defpackage.qo4;
import defpackage.sb5;

/* loaded from: classes4.dex */
public interface p {

    public interface a {
        void a(boolean z);

        void b();

        void c(String str);

        void onCompleted();
    }

    void L();

    void M(a aVar);

    long O();

    void P(boolean z);

    void T(NYTMediaItem nYTMediaItem, qo4 qo4Var, ViewGroup viewGroup);

    int V();

    void a0(NYTMediaItem nYTMediaItem, sb5 sb5Var, qo4 qo4Var, boolean z);

    PlaybackVolume b0();

    boolean c();

    long c0();

    void d0();

    void e0(long j);

    boolean l0();

    long m0();

    void n0(sb5 sb5Var);

    void pause();

    void q();

    void stop();
}
