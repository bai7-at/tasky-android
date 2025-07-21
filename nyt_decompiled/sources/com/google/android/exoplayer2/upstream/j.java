package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.j;
import defpackage.sq8;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class j implements a {
    public static final j a = new j();
    public static final a.InterfaceC0194a b = new a.InterfaceC0194a() { // from class: wt5
        @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0194a
        public final a a() {
            return j.k();
        }
    };

    private j() {
    }

    public static /* synthetic */ j k() {
        return new j();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(b bVar) {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri getUri() {
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void i(sq8 sq8Var) {
    }

    @Override // defpackage.s91
    public int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
