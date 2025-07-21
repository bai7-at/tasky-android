package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class NativeCrashDataError {
    private final Integer context;
    private final Integer number;

    public NativeCrashDataError(@bt3(name = "n") Integer num, @bt3(name = "c") Integer num2) {
        this.number = num;
        this.context = num2;
    }

    public final Integer getContext() {
        return this.context;
    }

    public final Integer getNumber() {
        return this.number;
    }
}
