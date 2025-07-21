package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.chartbeat.androidsdk.QueryKeys;
import com.comscore.streaming.ContentMediaFormat;
import com.google.android.gms.internal.ads.zzhl;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes3.dex */
public final class b5f extends qve {
    private RandomAccessFile e;
    private Uri f;
    private long g;
    private boolean h;

    public b5f() {
        super(false);
    }

    @Override // defpackage.xyf
    public final int b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            int i3 = khe.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.g -= read;
                zzg(read);
            }
            return read;
        } catch (IOException e) {
            throw new zzhl(e, 2000);
        }
    }

    @Override // defpackage.kye
    public final long e(u1f u1fVar) {
        boolean b;
        Uri uri = u1fVar.a;
        this.f = uri;
        l(u1fVar);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, QueryKeys.EXTERNAL_REFERRER);
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(u1fVar.f);
                long j = u1fVar.g;
                if (j == -1) {
                    j = this.e.length() - u1fVar.f;
                }
                this.g = j;
                if (j < 0) {
                    throw new zzhl(null, null, 2008);
                }
                this.h = true;
                m(u1fVar);
                return this.g;
            } catch (IOException e) {
                throw new zzhl(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new zzhl(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, ContentMediaFormat.PARTIAL_CONTENT_GENERIC);
            }
            int i = khe.a;
            b = w4f.b(e2.getCause());
            throw new zzhl(e2, true != b ? 2005 : 2006);
        } catch (SecurityException e3) {
            throw new zzhl(e3, 2006);
        } catch (RuntimeException e4) {
            throw new zzhl(e4, 2000);
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
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.e = null;
                if (this.h) {
                    this.h = false;
                    k();
                }
            } catch (IOException e) {
                throw new zzhl(e, 2000);
            }
        } catch (Throwable th) {
            this.e = null;
            if (this.h) {
                this.h = false;
                k();
            }
            throw th;
        }
    }
}
