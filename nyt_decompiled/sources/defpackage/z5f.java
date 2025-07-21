package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzgx;
import com.google.android.gms.internal.ads.zzhv;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public final class z5f extends qve {
    private final Context e;
    private u1f f;
    private AssetFileDescriptor g;
    private InputStream h;
    private long i;
    private boolean j;

    public z5f(Context context) {
        super(false);
        this.e = context.getApplicationContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r0.matches("\\d+") != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.AssetFileDescriptor n(android.content.Context r7, defpackage.u1f r8) {
        /*
            android.net.Uri r8 = r8.a
            android.net.Uri r8 = r8.normalizeScheme()
            java.lang.String r0 = r8.getScheme()
            java.lang.String r1 = "rawresource"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            r1 = 1004(0x3ec, float:1.407E-42)
            r2 = 2005(0x7d5, float:2.81E-42)
            r3 = 0
            if (r0 != 0) goto Ld4
            java.lang.String r0 = r8.getScheme()
            java.lang.String r4 = "android.resource"
            boolean r0 = android.text.TextUtils.equals(r4, r0)
            r5 = 1
            if (r0 == 0) goto L3f
            java.util.List r0 = r8.getPathSegments()
            int r0 = r0.size()
            if (r0 != r5) goto L3f
            java.lang.String r0 = r8.getLastPathSegment()
            r0.getClass()
            java.lang.String r6 = "\\d+"
            boolean r0 = r0.matches(r6)
            if (r0 == 0) goto L3f
            goto Ld4
        L3f:
            java.lang.String r0 = r8.getScheme()
            boolean r0 = android.text.TextUtils.equals(r4, r0)
            if (r0 == 0) goto Lb4
            java.lang.String r0 = r8.getPath()
            r0.getClass()
            java.lang.String r1 = "/"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L5c
            java.lang.String r0 = r0.substring(r5)
        L5c:
            java.lang.String r1 = r8.getHost()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L6b
            java.lang.String r1 = r7.getPackageName()
            goto L6f
        L6b:
            java.lang.String r1 = r8.getHost()
        L6f:
            java.lang.String r4 = r7.getPackageName()
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L7e
            android.content.res.Resources r7 = r7.getResources()
            goto L86
        L7e:
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lab
            android.content.res.Resources r7 = r7.getResourcesForApplication(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lab
        L86:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = ":"
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = "raw"
            int r0 = r7.getIdentifier(r0, r1, r3)
            if (r0 == 0) goto La3
            goto Le2
        La3:
            com.google.android.gms.internal.ads.zzhv r7 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r8 = "Resource not found."
            r7.<init>(r8, r3, r2)
            throw r7
        Lab:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzhv r8 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r0 = "Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility."
            r8.<init>(r0, r7, r2)
            throw r8
        Lb4:
            com.google.android.gms.internal.ads.zzhv r7 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r8 = r8.getScheme()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unsupported URI scheme ("
            r0.append(r2)
            r0.append(r8)
            java.lang.String r8 = "). Only android.resource is supported."
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8, r3, r1)
            throw r7
        Ld4:
            android.content.res.Resources r7 = r7.getResources()
            java.lang.String r0 = r8.getLastPathSegment()     // Catch: java.lang.NumberFormatException -> L103
            if (r0 == 0) goto L102
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L103
        Le2:
            android.content.res.AssetFileDescriptor r7 = r7.openRawResourceFd(r0)     // Catch: android.content.res.Resources.NotFoundException -> Lfb
            if (r7 == 0) goto Le9
            return r7
        Le9:
            com.google.android.gms.internal.ads.zzhv r7 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "Resource is compressed: "
            java.lang.String r8 = r0.concat(r8)
            r0 = 2000(0x7d0, float:2.803E-42)
            r7.<init>(r8, r3, r0)
            throw r7
        Lfb:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzhv r8 = new com.google.android.gms.internal.ads.zzhv
            r8.<init>(r3, r7, r2)
            throw r8
        L102:
            throw r3     // Catch: java.lang.NumberFormatException -> L103
        L103:
            com.google.android.gms.internal.ads.zzhv r7 = new com.google.android.gms.internal.ads.zzhv
            java.lang.String r8 = "Resource identifier must be an integer."
            r7.<init>(r8, r3, r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z5f.n(android.content.Context, u1f):android.content.res.AssetFileDescriptor");
    }

    @Override // defpackage.xyf
    public final int b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzhv(null, e, 2000);
            }
        }
        InputStream inputStream = this.h;
        int i3 = khe.a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.i == -1) {
                return -1;
            }
            throw new zzhv("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - read;
        }
        zzg(read);
        return read;
    }

    @Override // defpackage.kye
    public final long e(u1f u1fVar) {
        long j;
        this.f = u1fVar;
        l(u1fVar);
        AssetFileDescriptor n = n(this.e, u1fVar);
        this.g = n;
        long length = n.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.g.getFileDescriptor());
        this.h = fileInputStream;
        if (length != -1) {
            try {
                if (u1fVar.f > length) {
                    throw new zzhv(null, null, 2008);
                }
            } catch (zzhv e) {
                throw e;
            } catch (IOException e2) {
                throw new zzhv(null, e2, 2000);
            }
        }
        long startOffset = this.g.getStartOffset();
        long skip = fileInputStream.skip(u1fVar.f + startOffset) - startOffset;
        if (skip != u1fVar.f) {
            throw new zzhv(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.i = -1L;
                j = -1;
            } else {
                j = channel.size() - channel.position();
                this.i = j;
                if (j < 0) {
                    throw new zzhv(null, null, 2008);
                }
            }
        } else {
            j = length - skip;
            this.i = j;
            if (j < 0) {
                throw new zzgx(2008);
            }
        }
        long j2 = u1fVar.g;
        if (j2 != -1) {
            if (j != -1) {
                j2 = Math.min(j, j2);
            }
            this.i = j2;
        }
        this.j = true;
        m(u1fVar);
        long j3 = u1fVar.g;
        return j3 != -1 ? j3 : this.i;
    }

    @Override // defpackage.kye
    public final Uri zzc() {
        u1f u1fVar = this.f;
        if (u1fVar != null) {
            return u1fVar.a;
        }
        return null;
    }

    @Override // defpackage.kye
    public final void zzd() {
        this.f = null;
        try {
            try {
                try {
                    InputStream inputStream = this.h;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            k();
                        }
                    } catch (IOException e) {
                        throw new zzhv(null, e, 2000);
                    }
                } catch (IOException e2) {
                    throw new zzhv(null, e2, 2000);
                }
            } catch (Throwable th) {
                this.h = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        k();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new zzhv(null, e3, 2000);
                }
            }
        } catch (Throwable th2) {
            this.g = null;
            if (this.j) {
                this.j = false;
                k();
            }
            throw th2;
        }
    }
}
