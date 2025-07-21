package com.google.android.gms.internal.ads;

import defpackage.n7f;
import defpackage.wad;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class ep extends n7f {
    private long i;
    private int j;
    private int k;

    public ep() {
        super(2, 0);
        this.k = 32;
    }

    @Override // defpackage.n7f, defpackage.c7f
    public final void b() {
        super.b();
        this.j = 0;
    }

    public final int m() {
        return this.j;
    }

    public final long n() {
        return this.i;
    }

    public final void o(int i) {
        this.k = i;
    }

    public final boolean p(n7f n7fVar) {
        ByteBuffer byteBuffer;
        wad.d(!n7fVar.d(1073741824));
        wad.d(!n7fVar.d(268435456));
        wad.d(!n7fVar.d(4));
        if (q()) {
            if (this.j >= this.k) {
                return false;
            }
            ByteBuffer byteBuffer2 = n7fVar.d;
            if (byteBuffer2 != null && (byteBuffer = this.d) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i = this.j;
        this.j = i + 1;
        if (i == 0) {
            this.f = n7fVar.f;
            if (n7fVar.d(1)) {
                c(1);
            }
        }
        ByteBuffer byteBuffer3 = n7fVar.d;
        if (byteBuffer3 != null) {
            i(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.i = n7fVar.f;
        return true;
    }

    public final boolean q() {
        return this.j > 0;
    }
}
