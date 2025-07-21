package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzgo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class pue extends qve {
    private final AssetManager e;
    private Uri f;
    private InputStream g;
    private long h;
    private boolean i;

    public pue(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // defpackage.xyf
    public final int b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzgo(e, 2000);
            }
        }
        InputStream inputStream = this.g;
        int i3 = khe.a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.h;
        if (j2 != -1) {
            this.h = j2 - read;
        }
        zzg(read);
        return read;
    }

    @Override // defpackage.kye
    public final long e(u1f u1fVar) {
        try {
            Uri uri = u1fVar.a;
            this.f = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            l(u1fVar);
            InputStream open = this.e.open(path, 1);
            this.g = open;
            if (open.skip(u1fVar.f) < u1fVar.f) {
                throw new zzgo(null, 2008);
            }
            long j = u1fVar.g;
            if (j != -1) {
                this.h = j;
            } else {
                long available = this.g.available();
                this.h = available;
                if (available == 2147483647L) {
                    this.h = -1L;
                }
            }
            this.i = true;
            m(u1fVar);
            return this.h;
        } catch (zzgo e) {
            throw e;
        } catch (IOException e2) {
            throw new zzgo(e2, true != (e2 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // defpackage.kye
    public final Uri zzc() {
        return this.f;
    }

    @Override // defpackage.kye
    public final void zzd() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.g = null;
                if (this.i) {
                    this.i = false;
                    k();
                }
            } catch (IOException e) {
                throw new zzgo(e, 2000);
            }
        } catch (Throwable th) {
            this.g = null;
            if (this.i) {
                this.i = false;
                k();
            }
            throw th;
        }
    }
}
