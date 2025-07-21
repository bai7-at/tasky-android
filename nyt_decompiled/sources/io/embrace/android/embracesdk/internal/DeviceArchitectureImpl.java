package io.embrace.android.embracesdk.internal;

import android.os.Build;
import android.text.TextUtils;
import defpackage.zq3;
import kotlin.text.h;

/* loaded from: classes5.dex */
public class DeviceArchitectureImpl implements DeviceArchitecture {
    @Override // io.embrace.android.embracesdk.internal.DeviceArchitecture
    public String getArchitecture() {
        String str = Build.SUPPORTED_ABIS[0];
        zq3.g(str, "Build.SUPPORTED_ABIS[0]");
        return str;
    }

    @Override // io.embrace.android.embracesdk.internal.DeviceArchitecture
    public boolean is32BitDevice() {
        zq3.g(TextUtils.join(", ", Build.SUPPORTED_ABIS), "TextUtils.join(\n        ….SUPPORTED_ABIS\n        )");
        return !h.P(r4, "64", false, 2, null);
    }
}
