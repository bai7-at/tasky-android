package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.s;

/* loaded from: classes2.dex */
interface b extends com.google.android.exoplayer2.upstream.a {

    public interface a {
        b a(int i);

        default a b() {
            return null;
        }
    }

    String c();

    int d();

    boolean j();

    s.b m();
}
