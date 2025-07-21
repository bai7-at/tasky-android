package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbbb;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class vjb implements kye {
    private final Context a;
    private final kye b;
    private final String c;
    private final int d;
    private InputStream f;
    private boolean g;
    private Uri h;
    private volatile zzbbb i;
    private u1f m;
    private boolean j = false;
    private boolean k = false;
    private final AtomicLong l = new AtomicLong(-1);
    private final boolean e = ((Boolean) pla.c().a(mpa.Q1)).booleanValue();

    public vjb(Context context, kye kyeVar, String str, int i, f6f f6fVar, ujb ujbVar) {
        this.a = context;
        this.b = kyeVar;
        this.c = str;
        this.d = i;
    }

    private final boolean k() {
        if (!this.e) {
            return false;
        }
        if (!((Boolean) pla.c().a(mpa.m4)).booleanValue() || this.j) {
            return ((Boolean) pla.c().a(mpa.n4)).booleanValue() && !this.k;
        }
        return true;
    }

    @Override // defpackage.xyf
    public final int b(byte[] bArr, int i, int i2) {
        if (!this.g) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f;
        return inputStream != null ? inputStream.read(bArr, i, i2) : this.b.b(bArr, i, i2);
    }

    @Override // defpackage.kye
    public final long e(u1f u1fVar) {
        Long l;
        if (this.g) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.g = true;
        Uri uri = u1fVar.a;
        this.h = uri;
        this.m = u1fVar;
        this.i = zzbbb.t0(uri);
        zzbay zzbayVar = null;
        if (!((Boolean) pla.c().a(mpa.j4)).booleanValue()) {
            if (this.i != null) {
                this.i.zzh = u1fVar.f;
                this.i.zzi = ehe.c(this.c);
                this.i.zzj = this.d;
                zzbayVar = dyf.e().b(this.i);
            }
            if (zzbayVar != null && zzbayVar.X0()) {
                this.j = zzbayVar.v1();
                this.k = zzbayVar.u1();
                if (!k()) {
                    this.f = zzbayVar.H0();
                    return -1L;
                }
            }
        } else if (this.i != null) {
            this.i.zzh = u1fVar.f;
            this.i.zzi = ehe.c(this.c);
            this.i.zzj = this.d;
            if (this.i.zzg) {
                l = (Long) pla.c().a(mpa.l4);
            } else {
                l = (Long) pla.c().a(mpa.k4);
            }
            long longValue = l.longValue();
            dyf.b().elapsedRealtime();
            dyf.f();
            Future a = fna.a(this.a, this.i);
            try {
                try {
                    gna gnaVar = (gna) a.get(longValue, TimeUnit.MILLISECONDS);
                    gnaVar.d();
                    this.j = gnaVar.f();
                    this.k = gnaVar.e();
                    gnaVar.a();
                    if (!k()) {
                        this.f = gnaVar.c();
                    }
                } catch (InterruptedException unused) {
                    a.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    a.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            dyf.b().elapsedRealtime();
            throw null;
        }
        if (this.i != null) {
            this.m = new u1f(Uri.parse(this.i.zza), null, u1fVar.e, u1fVar.f, u1fVar.g, null, u1fVar.i);
        }
        return this.b.e(this.m);
    }

    @Override // defpackage.kye
    public final void h(f6f f6fVar) {
    }

    @Override // defpackage.kye
    public final Uri zzc() {
        return this.h;
    }

    @Override // defpackage.kye
    public final void zzd() {
        if (!this.g) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.g = false;
        this.h = null;
        InputStream inputStream = this.f;
        if (inputStream == null) {
            this.b.zzd();
        } else {
            IOUtils.closeQuietly(inputStream);
            this.f = null;
        }
    }

    @Override // defpackage.kye
    public final /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }
}
