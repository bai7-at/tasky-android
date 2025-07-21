package com.nytimes.android.meter;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class MeterResponseStatus {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ MeterResponseStatus[] $VALUES;
    public static final MeterResponseStatus Success = new MeterResponseStatus("Success", 0);
    public static final MeterResponseStatus InvalidEnvironment = new MeterResponseStatus("InvalidEnvironment", 1);
    public static final MeterResponseStatus UnregisteredUser = new MeterResponseStatus("UnregisteredUser", 2);
    public static final MeterResponseStatus NetworkError = new MeterResponseStatus("NetworkError", 3);
    public static final MeterResponseStatus DeviceOffline = new MeterResponseStatus("DeviceOffline", 4);
    public static final MeterResponseStatus UnknownError = new MeterResponseStatus("UnknownError", 5);

    private static final /* synthetic */ MeterResponseStatus[] $values() {
        return new MeterResponseStatus[]{Success, InvalidEnvironment, UnregisteredUser, NetworkError, DeviceOffline, UnknownError};
    }

    static {
        MeterResponseStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private MeterResponseStatus(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static MeterResponseStatus valueOf(String str) {
        return (MeterResponseStatus) Enum.valueOf(MeterResponseStatus.class, str);
    }

    public static MeterResponseStatus[] values() {
        return (MeterResponseStatus[]) $VALUES.clone();
    }
}
