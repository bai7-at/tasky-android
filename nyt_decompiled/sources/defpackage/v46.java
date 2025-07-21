package defpackage;

import com.facebook.GraphRequest;
import defpackage.l23;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class v46 extends FilterOutputStream implements qy6 {
    private final l23 a;
    private final Map b;
    private final long c;
    private final long d;
    private long e;
    private long f;
    private ry6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v46(OutputStream outputStream, l23 l23Var, Map map, long j) {
        super(outputStream);
        zq3.h(outputStream, "out");
        zq3.h(l23Var, "requests");
        zq3.h(map, "progressMap");
        this.a = l23Var;
        this.b = map;
        this.c = j;
        this.d = w92.z();
    }

    private final void b(long j) {
        ry6 ry6Var = this.g;
        if (ry6Var != null) {
            ry6Var.a(j);
        }
        long j2 = this.e + j;
        this.e = j2;
        if (j2 >= this.f + this.d || j2 >= this.c) {
            d();
        }
    }

    private final void d() {
        if (this.e > this.f) {
            for (l23.a aVar : this.a.t()) {
            }
            this.f = this.e;
        }
    }

    @Override // defpackage.qy6
    public void a(GraphRequest graphRequest) {
        this.g = graphRequest != null ? (ry6) this.b.get(graphRequest) : null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        Iterator it2 = this.b.values().iterator();
        while (it2.hasNext()) {
            ((ry6) it2.next()).c();
        }
        d();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        zq3.h(bArr, "buffer");
        ((FilterOutputStream) this).out.write(bArr);
        b(bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        zq3.h(bArr, "buffer");
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        b(i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        ((FilterOutputStream) this).out.write(i);
        b(1L);
    }
}
