package com.nytimes.android.analytics.event.values;

import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class EnabledOrDisabled {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ EnabledOrDisabled[] $VALUES;
    private final String title;
    public static final EnabledOrDisabled ENABLED = new EnabledOrDisabled("ENABLED", 0, "Enabled");
    public static final EnabledOrDisabled DISABLED = new EnabledOrDisabled("DISABLED", 1, BucketLifecycleConfiguration.DISABLED);

    private static final /* synthetic */ EnabledOrDisabled[] $values() {
        return new EnabledOrDisabled[]{ENABLED, DISABLED};
    }

    static {
        EnabledOrDisabled[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private EnabledOrDisabled(String str, int i, String str2) {
        this.title = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static EnabledOrDisabled valueOf(String str) {
        return (EnabledOrDisabled) Enum.valueOf(EnabledOrDisabled.class, str);
    }

    public static EnabledOrDisabled[] values() {
        return (EnabledOrDisabled[]) $VALUES.clone();
    }

    public String getTitle() {
        return this.title;
    }
}
