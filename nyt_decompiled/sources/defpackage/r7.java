package defpackage;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* loaded from: classes.dex */
public final class r7 {
    public static final r7 a = new r7();

    private static final class a {
        public static final a a = new a();

        private a() {
        }

        public final int a() {
            int extensionVersion;
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            return extensionVersion;
        }
    }

    private r7() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return a.a.a();
        }
        return 0;
    }
}
