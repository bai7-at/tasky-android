package io.embrace.android.embracesdk.internal.utils;

import android.os.Build;

/* loaded from: classes5.dex */
public final class BuildVersionChecker implements VersionChecker {
    public static final BuildVersionChecker INSTANCE = new BuildVersionChecker();

    private BuildVersionChecker() {
    }

    @Override // io.embrace.android.embracesdk.internal.utils.VersionChecker
    public boolean isAtLeast(int i) {
        return Build.VERSION.SDK_INT >= i;
    }
}
