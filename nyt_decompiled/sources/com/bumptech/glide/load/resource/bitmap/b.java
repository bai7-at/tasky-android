package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.File;

/* loaded from: classes2.dex */
public final class b {
    private static final File f = new File("/proc/self/fd");
    private static volatile b g;
    private int d;
    private boolean e = true;
    private final boolean a = d();
    private final int b = 20000;
    private final int c = 0;

    b() {
    }

    public static b a() {
        if (g == null) {
            synchronized (b.class) {
                try {
                    if (g == null) {
                        g = new b();
                    }
                } finally {
                }
            }
        }
        return g;
    }

    private synchronized boolean b() {
        try {
            boolean z = true;
            int i = this.d + 1;
            this.d = i;
            if (i >= 50) {
                this.d = 0;
                int length = f.list().length;
                if (length >= this.b) {
                    z = false;
                }
                this.e = z;
                if (!z && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + this.b);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r1.equals("SM-A520") == false) goto L9;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x006b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean d() {
        /*
            r0 = 0
            java.lang.String r1 = android.os.Build.MODEL
            r2 = 1
            if (r1 == 0) goto L6e
            int r3 = r1.length()
            r4 = 7
            if (r3 >= r4) goto Lf
            goto L6e
        Lf:
            java.lang.String r1 = r1.substring(r0, r4)
            r1.hashCode()
            r3 = -1
            int r4 = r1.hashCode()
            switch(r4) {
                case -1398613787: goto L62;
                case -1398431166: goto L57;
                case -1398431161: goto L4c;
                case -1398431073: goto L41;
                case -1398431068: goto L36;
                case -1398343746: goto L2b;
                case -1398222624: goto L20;
                default: goto L1e;
            }
        L1e:
            r0 = r3
            goto L6b
        L20:
            java.lang.String r0 = "SM-N935"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L29
            goto L1e
        L29:
            r0 = 6
            goto L6b
        L2b:
            java.lang.String r0 = "SM-J720"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L34
            goto L1e
        L34:
            r0 = 5
            goto L6b
        L36:
            java.lang.String r0 = "SM-G965"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3f
            goto L1e
        L3f:
            r0 = 4
            goto L6b
        L41:
            java.lang.String r0 = "SM-G960"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4a
            goto L1e
        L4a:
            r0 = 3
            goto L6b
        L4c:
            java.lang.String r0 = "SM-G935"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L55
            goto L1e
        L55:
            r0 = 2
            goto L6b
        L57:
            java.lang.String r0 = "SM-G930"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L60
            goto L1e
        L60:
            r0 = r2
            goto L6b
        L62:
            java.lang.String r4 = "SM-A520"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L6b
            goto L1e
        L6b:
            switch(r0) {
                case 0: goto L6e;
                case 1: goto L6e;
                case 2: goto L6e;
                case 3: goto L6e;
                case 4: goto L6e;
                case 5: goto L6e;
                case 6: goto L6e;
                default: goto L6e;
            }
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.b.d():boolean");
    }

    public boolean c(int i, int i2, boolean z, boolean z2) {
        int i3;
        return z && this.a && !z2 && i >= (i3 = this.c) && i2 >= i3 && b();
    }

    boolean e(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean c = c(i, i2, z, z2);
        if (c) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return c;
    }
}
