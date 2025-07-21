package defpackage;

import android.os.Build;

/* loaded from: classes3.dex */
abstract class zo9 {
    static boolean a() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }
}
