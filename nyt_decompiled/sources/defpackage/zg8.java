package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zg8 implements a {
    private final a a;
    private final w91 b;
    private boolean c;
    private long d;

    public zg8(a aVar, w91 w91Var) {
        this.a = (a) ur.e(aVar);
        this.b = (w91) ur.e(w91Var);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(b bVar) {
        long b = this.a.b(bVar);
        this.d = b;
        if (b == 0) {
            return 0L;
        }
        if (bVar.h == -1 && b != -1) {
            bVar = bVar.f(0L, b);
        }
        this.c = true;
        this.b.b(bVar);
        return this.d;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        try {
            this.a.close();
        } finally {
            if (this.c) {
                this.c = false;
                this.b.close();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map f() {
        return this.a.f();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri getUri() {
        return this.a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void i(sq8 sq8Var) {
        ur.e(sq8Var);
        this.a.i(sq8Var);
    }

    @Override // defpackage.s91
    public int read(byte[] bArr, int i, int i2) {
        if (this.d == 0) {
            return -1;
        }
        int read = this.a.read(bArr, i, i2);
        if (read > 0) {
            this.b.p(bArr, i, read);
            long j = this.d;
            if (j != -1) {
                this.d = j - read;
            }
        }
        return read;
    }
}
