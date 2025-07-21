package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class t18 implements a {
    private final a a;
    private long b;
    private Uri c = Uri.EMPTY;
    private Map d = Collections.emptyMap();

    public t18(a aVar) {
        this.a = (a) ur.e(aVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(b bVar) {
        this.c = bVar.a;
        this.d = Collections.emptyMap();
        long b = this.a.b(bVar);
        this.c = (Uri) ur.e(getUri());
        this.d = f();
        return b;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        this.a.close();
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

    public long k() {
        return this.b;
    }

    @Override // defpackage.s91
    public int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }

    public Uri s() {
        return this.c;
    }

    public Map t() {
        return this.d;
    }

    public void u() {
        this.b = 0L;
    }
}
