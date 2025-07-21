package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.gms.internal.pal.g1;
import com.google.android.gms.internal.pal.h3;
import com.google.android.gms.internal.pal.i2;
import com.google.android.gms.internal.pal.j2;
import com.google.android.gms.internal.pal.x1;
import com.google.android.gms.internal.pal.y1;
import com.google.android.gms.internal.pal.zzaby;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
abstract class mxa {
    static boolean a;
    private static MessageDigest b;
    private static final Object c = new Object();
    private static final Object d = new Object();
    static final CountDownLatch e = new CountDownLatch(1);

    static String a(g1 g1Var, String str) {
        byte[] h;
        byte[] D = g1Var.D();
        if (((Boolean) lee.c().b(fpe.w2)).booleanValue()) {
            Vector b2 = b(D, 255);
            if (b2 == null || b2.size() == 0) {
                h = h(g(ProgressEvent.PART_FAILED_EVENT_CODE).D(), str, true);
            } else {
                i2 s = j2.s();
                int size = b2.size();
                for (int i = 0; i < size; i++) {
                    s.k(zzaby.u(h((byte[]) b2.get(i), str, false)));
                }
                s.l(zzaby.u(f(D)));
                h = ((j2) s.g()).D();
            }
        } else {
            if (otc.a == null) {
                throw new GeneralSecurityException();
            }
            byte[] zza = otc.a.zza(D, str != null ? str.getBytes() : new byte[0]);
            i2 s2 = j2.s();
            s2.k(zzaby.u(zza));
            s2.m(3);
            h = ((j2) s2.g()).D();
        }
        return zsa.a(h, true);
    }

    static Vector b(byte[] bArr, int i) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i2 = (length + 254) / 255;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    static void d() {
        synchronized (d) {
            try {
                if (!a) {
                    a = true;
                    new Thread(new hwa(null)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static byte[] e(String str, String str2, boolean z) {
        x1 s = y1.s();
        try {
            s.l(zzaby.u(str.length() < 3 ? str.getBytes("ISO-8859-1") : zsa.b(str, true)));
            s.k(zzaby.u(str2.length() < 3 ? str2.getBytes("ISO-8859-1") : zsa.b(str2, true)));
            return ((y1) s.g()).D();
        } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        r1.reset();
        r1.update(r6);
        r6 = defpackage.mxa.b.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] f(byte[] r6) {
        /*
            java.lang.Object r0 = defpackage.mxa.c
            monitor-enter(r0)
            d()     // Catch: java.lang.Throwable -> L1b
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = defpackage.mxa.e     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            r4 = 2
            boolean r2 = r2.await(r4, r3)     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            if (r2 != 0) goto L14
            goto L1d
        L14:
            java.security.MessageDigest r2 = defpackage.mxa.b     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L19
            goto L1d
        L19:
            r1 = r2
            goto L1d
        L1b:
            r6 = move-exception
            goto L35
        L1d:
            if (r1 == 0) goto L2d
            r1.reset()     // Catch: java.lang.Throwable -> L1b
            r1.update(r6)     // Catch: java.lang.Throwable -> L1b
            java.security.MessageDigest r6 = defpackage.mxa.b     // Catch: java.lang.Throwable -> L1b
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r6
        L2d:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L1b
            throw r6     // Catch: java.lang.Throwable -> L1b
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mxa.f(byte[]):byte[]");
    }

    static g1 g(int i) {
        h3 X = g1.X();
        X.n(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        return (g1) X.g();
    }

    private static byte[] h(byte[] bArr, String str, boolean z) {
        byte[] array;
        int i = true != z ? 255 : 239;
        if (bArr.length > i) {
            bArr = g(ProgressEvent.PART_FAILED_EVENT_CODE).D();
        }
        int length = bArr.length;
        if (length < i) {
            byte[] bArr2 = new byte[i - length];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH).put(f(array)).put(array).array();
        }
        byte[] bArr3 = new byte[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
        rya[] ryaVarArr = new bqb().G2;
        int length2 = ryaVarArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            ryaVarArr[i2].zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new jt9(str.getBytes(Constants.DEFAULT_ENCODING)).a(bArr3);
        }
        return bArr3;
    }
}
