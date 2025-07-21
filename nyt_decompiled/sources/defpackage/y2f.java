package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class y2f implements oca {
    private static final j3f j = j3f.b(y2f.class);
    protected final String a;
    private pca b;
    private ByteBuffer e;
    long f;
    d3f h;
    long g = -1;
    private ByteBuffer i = null;
    boolean d = true;
    boolean c = true;

    protected y2f(String str) {
        this.a = str;
    }

    private final synchronized void a() {
        try {
            if (this.d) {
                return;
            }
            try {
                j3f j3fVar = j;
                String str = this.a;
                j3fVar.a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.e = this.h.k(this.f, this.g);
                this.d = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.oca
    public final void b(pca pcaVar) {
        this.b = pcaVar;
    }

    protected abstract void c(ByteBuffer byteBuffer);

    @Override // defpackage.oca
    public final void d(d3f d3fVar, ByteBuffer byteBuffer, long j2, lca lcaVar) {
        this.f = d3fVar.zzb();
        byteBuffer.remaining();
        this.g = j2;
        this.h = d3fVar;
        d3fVar.f(d3fVar.zzb() + j2);
        this.d = false;
        this.c = false;
        e();
    }

    public final synchronized void e() {
        try {
            a();
            j3f j3fVar = j;
            String str = this.a;
            j3fVar.a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.e;
            if (byteBuffer != null) {
                this.c = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    this.i = byteBuffer.slice();
                }
                this.e = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.oca
    public final String zza() {
        return this.a;
    }
}
