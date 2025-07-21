package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.EncodeStrategy;

/* loaded from: classes2.dex */
public class r80 implements wz6 {
    public static final mk5 b = mk5.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final mk5 c = mk5.e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    private final to a;

    public r80(to toVar) {
        this.a = toVar;
    }

    private Bitmap.CompressFormat d(Bitmap bitmap, sk5 sk5Var) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) sk5Var.c(c);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // defpackage.wz6
    public EncodeStrategy a(sk5 sk5Var) {
        return EncodeStrategy.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #4 {all -> 0x0056, blocks: (B:3:0x0021, B:14:0x0052, B:17:0x0070, B:19:0x0076, B:45:0x00c2, B:43:0x00c5, B:37:0x006b), top: B:2:0x0021 }] */
    @Override // defpackage.b12
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(defpackage.cz6 r8, java.io.File r9, defpackage.sk5 r10) {
        /*
            r7 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r8 = r8.get()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.Bitmap$CompressFormat r1 = r7.d(r8, r10)
            int r2 = r8.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r8.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            defpackage.y03.c(r4, r2, r3, r1)
            long r2 = defpackage.b94.b()     // Catch: java.lang.Throwable -> L56
            mk5 r4 = defpackage.r80.b     // Catch: java.lang.Throwable -> L56
            java.lang.Object r4 = r10.c(r4)     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L56
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L56
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            to r9 = r7.a     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L48
            if (r9 == 0) goto L4b
            pd0 r9 = new pd0     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L48
            to r7 = r7.a     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L48
            r9.<init>(r6, r7)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L48
            r5 = r9
            goto L4c
        L44:
            r7 = move-exception
            r5 = r6
            goto Lc0
        L48:
            r7 = move-exception
            r5 = r6
            goto L5d
        L4b:
            r5 = r6
        L4c:
            r8.compress(r1, r4, r5)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r5.close()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r5.close()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            goto L58
        L56:
            r7 = move-exception
            goto Lc6
        L58:
            r7 = 1
            goto L6f
        L5a:
            r7 = move-exception
            goto Lc0
        L5c:
            r7 = move-exception
        L5d:
            r9 = 3
            boolean r9 = android.util.Log.isLoggable(r0, r9)     // Catch: java.lang.Throwable -> L5a
            if (r9 == 0) goto L69
            java.lang.String r9 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r9, r7)     // Catch: java.lang.Throwable -> L5a
        L69:
            if (r5 == 0) goto L6e
            r5.close()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L6e
        L6e:
            r7 = 0
        L6f:
            r9 = 2
            boolean r9 = android.util.Log.isLoggable(r0, r9)     // Catch: java.lang.Throwable -> L56
            if (r9 == 0) goto Lbc
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r9.<init>()     // Catch: java.lang.Throwable -> L56
            java.lang.String r4 = "Compressed with type: "
            r9.append(r4)     // Catch: java.lang.Throwable -> L56
            r9.append(r1)     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = " of size "
            r9.append(r1)     // Catch: java.lang.Throwable -> L56
            int r1 = defpackage.x19.g(r8)     // Catch: java.lang.Throwable -> L56
            r9.append(r1)     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = " in "
            r9.append(r1)     // Catch: java.lang.Throwable -> L56
            double r1 = defpackage.b94.a(r2)     // Catch: java.lang.Throwable -> L56
            r9.append(r1)     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = ", options format: "
            r9.append(r1)     // Catch: java.lang.Throwable -> L56
            mk5 r1 = defpackage.r80.c     // Catch: java.lang.Throwable -> L56
            java.lang.Object r10 = r10.c(r1)     // Catch: java.lang.Throwable -> L56
            r9.append(r10)     // Catch: java.lang.Throwable -> L56
            java.lang.String r10 = ", hasAlpha: "
            r9.append(r10)     // Catch: java.lang.Throwable -> L56
            boolean r8 = r8.hasAlpha()     // Catch: java.lang.Throwable -> L56
            r9.append(r8)     // Catch: java.lang.Throwable -> L56
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Throwable -> L56
            android.util.Log.v(r0, r8)     // Catch: java.lang.Throwable -> L56
        Lbc:
            defpackage.y03.d()
            return r7
        Lc0:
            if (r5 == 0) goto Lc5
            r5.close()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> Lc5
        Lc5:
            throw r7     // Catch: java.lang.Throwable -> L56
        Lc6:
            defpackage.y03.d()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r80.b(cz6, java.io.File, sk5):boolean");
    }
}
