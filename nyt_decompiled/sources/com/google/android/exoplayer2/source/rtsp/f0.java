package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.b;
import defpackage.d47;

/* loaded from: classes2.dex */
final class f0 implements b.a {
    private final long a;

    public f0(long j) {
        this.a = j;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b.a
    public b a(int i) {
        e0 e0Var = new e0(this.a);
        e0Var.b(d47.a(i * 2));
        return e0Var;
    }
}
