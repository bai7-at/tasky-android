package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.gms.internal.ads.a2;
import com.google.android.gms.internal.ads.n1;
import com.google.android.gms.internal.ads.u0;
import com.google.android.gms.internal.ads.z1;
import com.google.android.gms.internal.ads.zzgyl;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
abstract class mda {
    static boolean a;
    private static MessageDigest b;
    private static final Object c = new Object();
    private static final Object d = new Object();
    static final CountDownLatch e = new CountDownLatch(1);

    static String a(byte[] bArr, String str) {
        byte[] g;
        Vector b2 = b(bArr, 255);
        if (b2 == null || b2.isEmpty()) {
            g = g(f(ProgressEvent.PART_FAILED_EVENT_CODE).i(), str, true);
        } else {
            z1 L = a2.L();
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                L.n(zzgyl.D(g((byte[]) b2.get(i), str, false), 0, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH));
            }
            byte[] e2 = e(bArr);
            zzgyl zzgylVar = zzgyl.a;
            L.o(zzgyl.D(e2, 0, e2.length));
            g = ((a2) L.i()).i();
        }
        return ida.a(g, true);
    }

    static Vector b(byte[] bArr, int i) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i2 = length + 254;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i2 / 255; i3++) {
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
                    new Thread(new lda(null)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        r1.reset();
        r1.update(r6);
        r6 = defpackage.mda.b.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] e(byte[] r6) {
        /*
            java.lang.Object r0 = defpackage.mda.c
            monitor-enter(r0)
            d()     // Catch: java.lang.Throwable -> L1b
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = defpackage.mda.e     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            r4 = 2
            boolean r2 = r2.await(r4, r3)     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            if (r2 != 0) goto L14
            goto L1d
        L14:
            java.security.MessageDigest r2 = defpackage.mda.b     // Catch: java.lang.Throwable -> L1b
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
            java.security.MessageDigest r6 = defpackage.mda.b     // Catch: java.lang.Throwable -> L1b
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mda.e(byte[]):byte[]");
    }

    static n1 f(int i) {
        u0 l0 = n1.l0();
        l0.q(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        return (n1) l0.i();
    }

    private static byte[] g(byte[] bArr, String str, boolean z) {
        byte[] array;
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        if (length > i) {
            bArr = f(ProgressEvent.PART_FAILED_EVENT_CODE).i();
        }
        int i2 = i + 1;
        int length2 = bArr.length;
        byte b2 = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i2).put(b2).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i2).put(b2).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH).put(e(array)).put(array).array();
        }
        byte[] bArr3 = new byte[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
        nda[] ndaVarArr = new pea().G2;
        int length3 = ndaVarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            ndaVarArr[i3].zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new gda(str.getBytes(Constants.DEFAULT_ENCODING)).a(bArr3);
        }
        return bArr3;
    }
}
