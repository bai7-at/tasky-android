package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.Nullable;

/* loaded from: classes2.dex */
public abstract class AFd1dSDK extends AFa1qSDK {
    private final boolean AFLogger$LogLevel;
    private final boolean getLevel;
    public boolean init;

    AFd1dSDK() {
        this(null, null, null, null, null, null);
    }

    public final boolean AFLogger$LogLevel() {
        return this.AFLogger$LogLevel;
    }

    public final boolean afRDLog() {
        return this.init;
    }

    public final boolean afWarnLog() {
        return this.getLevel;
    }

    public AFd1dSDK(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Context context) {
        super(str, str2, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false), context);
        this.AFLogger$LogLevel = bool != null ? bool.booleanValue() : true;
        this.getLevel = bool2 != null ? bool2.booleanValue() : true;
    }
}
