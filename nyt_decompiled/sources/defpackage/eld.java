package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;

/* loaded from: classes3.dex */
public final class eld implements fqd {
    private final Integer a;

    private eld(Integer num) {
        this.a = num;
    }

    static /* bridge */ /* synthetic */ eld b() {
        int extensionVersion;
        if (!((Boolean) pla.c().a(mpa.L9)).booleanValue()) {
            return new eld(null);
        }
        dyf.r();
        int i = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion > 3) {
                i = SdkExtensions.getExtensionVersion(1000000);
            }
        }
        return new eld(Integer.valueOf(i));
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Integer num = this.a;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
