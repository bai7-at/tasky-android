package defpackage;

import android.os.Handler;
import com.facebook.GraphRequest;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class u46 extends OutputStream implements qy6 {
    private final Handler a;
    private final Map b = new HashMap();
    private GraphRequest c;
    private ry6 d;
    private int e;

    public u46(Handler handler) {
        this.a = handler;
    }

    @Override // defpackage.qy6
    public void a(GraphRequest graphRequest) {
        this.c = graphRequest;
        this.d = graphRequest != null ? (ry6) this.b.get(graphRequest) : null;
    }

    public final void b(long j) {
        GraphRequest graphRequest = this.c;
        if (graphRequest == null) {
            return;
        }
        if (this.d == null) {
            ry6 ry6Var = new ry6(this.a, graphRequest);
            this.d = ry6Var;
            this.b.put(graphRequest, ry6Var);
        }
        ry6 ry6Var2 = this.d;
        if (ry6Var2 != null) {
            ry6Var2.b(j);
        }
        this.e += (int) j;
    }

    public final int d() {
        return this.e;
    }

    public final Map h() {
        return this.b;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        zq3.h(bArr, "buffer");
        b(bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        zq3.h(bArr, "buffer");
        b(i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        b(1L);
    }
}
