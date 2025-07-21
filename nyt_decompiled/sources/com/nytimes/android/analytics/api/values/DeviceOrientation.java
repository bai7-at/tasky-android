package com.nytimes.android.analytics.api.values;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class DeviceOrientation {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ DeviceOrientation[] $VALUES;
    private final String title = name();
    public static final DeviceOrientation portrait = new DeviceOrientation("portrait", 0);
    public static final DeviceOrientation landscape = new DeviceOrientation("landscape", 1);

    private static final /* synthetic */ DeviceOrientation[] $values() {
        return new DeviceOrientation[]{portrait, landscape};
    }

    static {
        DeviceOrientation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private DeviceOrientation(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static DeviceOrientation valueOf(String str) {
        return (DeviceOrientation) Enum.valueOf(DeviceOrientation.class, str);
    }

    public static DeviceOrientation[] values() {
        return (DeviceOrientation[]) $VALUES.clone();
    }

    public String getTitle() {
        return this.title;
    }
}
