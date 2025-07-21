package com.nytimes.android.api.cms;

import com.google.gson.annotations.SerializedName;
import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class DisplaySizeType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ DisplaySizeType[] $VALUES;
    private final String size;

    @SerializedName("SMALL")
    public static final DisplaySizeType SMALL = new DisplaySizeType("SMALL", 0, "SMALL");

    @SerializedName("LARGE")
    public static final DisplaySizeType LARGE = new DisplaySizeType("LARGE", 1, "LARGE");

    @SerializedName("JUMBO")
    public static final DisplaySizeType JUMBO = new DisplaySizeType("JUMBO", 2, "JUMBO");

    private static final /* synthetic */ DisplaySizeType[] $values() {
        return new DisplaySizeType[]{SMALL, LARGE, JUMBO};
    }

    static {
        DisplaySizeType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private DisplaySizeType(String str, int i, String str2) {
        this.size = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static DisplaySizeType valueOf(String str) {
        return (DisplaySizeType) Enum.valueOf(DisplaySizeType.class, str);
    }

    public static DisplaySizeType[] values() {
        return (DisplaySizeType[]) $VALUES.clone();
    }

    public final String getSize$api_lib_release() {
        return this.size;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.size;
    }

    public final String value() {
        return this.size.length() == 0 ? SMALL.value() : this.size;
    }
}
