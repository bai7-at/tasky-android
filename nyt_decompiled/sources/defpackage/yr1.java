package defpackage;

import android.util.Log;
import defpackage.rr1;
import defpackage.vr1;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public class yr1 implements rr1 {
    private final File b;
    private final long c;
    private vr1 e;
    private final ur1 d = new ur1();
    private final m77 a = new m77();

    protected yr1(File file, long j) {
        this.b = file;
        this.c = j;
    }

    public static rr1 c(File file, long j) {
        return new yr1(file, j);
    }

    private synchronized vr1 d() {
        try {
            if (this.e == null) {
                this.e = vr1.m0(this.b, 1, 1, this.c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.e;
    }

    @Override // defpackage.rr1
    public File a(ov3 ov3Var) {
        String b = this.a.b(ov3Var);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + b + " for for Key: " + ov3Var);
        }
        try {
            vr1.e e0 = d().e0(b);
            if (e0 != null) {
                return e0.a(0);
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // defpackage.rr1
    public void b(ov3 ov3Var, rr1.b bVar) {
        vr1 d;
        String b = this.a.b(ov3Var);
        this.d.a(b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + b + " for for Key: " + ov3Var);
            }
            try {
                d = d();
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            if (d.e0(b) != null) {
                return;
            }
            vr1.c P = d.P(b);
            if (P == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + b);
            }
            try {
                if (bVar.a(P.f(0))) {
                    P.e();
                }
                P.b();
            } catch (Throwable th) {
                P.b();
                throw th;
            }
        } finally {
            this.d.b(b);
        }
    }
}
