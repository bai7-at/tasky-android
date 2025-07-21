package defpackage;

import android.os.Build;

/* loaded from: classes3.dex */
public abstract class j2b {
    public static final int a;

    static {
        a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
