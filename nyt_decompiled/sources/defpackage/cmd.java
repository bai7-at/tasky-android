package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLU;
import com.google.android.gms.internal.ads.zzet;

/* loaded from: classes3.dex */
public abstract class cmd {
    public static void a() {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(glGetError)));
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z = true;
        }
        if (z) {
            throw new zzet(sb.toString());
        }
    }

    public static void b(boolean z, String str) {
        if (!z) {
            throw new zzet(str);
        }
    }

    public static boolean c(Context context) {
        int i = khe.a;
        if (i < 24) {
            return false;
        }
        if (i < 26 && ("samsung".equals(khe.c) || "XT1650".equals(khe.d))) {
            return false;
        }
        if (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return xjd.k("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean d() {
        int i = khe.a;
        return xjd.k("EGL_KHR_surfaceless_context");
    }
}
