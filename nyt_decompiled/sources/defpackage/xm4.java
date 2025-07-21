package defpackage;

import android.os.Messenger;

/* loaded from: classes.dex */
abstract class xm4 {
    public static boolean a(Messenger messenger) {
        if (messenger == null) {
            return false;
        }
        try {
            return messenger.getBinder() != null;
        } catch (NullPointerException unused) {
            return false;
        }
    }
}
