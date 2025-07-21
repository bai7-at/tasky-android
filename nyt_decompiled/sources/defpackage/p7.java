package defpackage;

import com.nytimes.android.api.cms.AssetConstants;

/* loaded from: classes2.dex */
public final class p7 {
    public static final p7 a = new p7();

    private p7() {
    }

    public static final boolean a(String str) {
        return str != null && (zq3.c(str, AssetConstants.NO_ADS) || zq3.c(str, AssetConstants.TRAGEDY));
    }
}
