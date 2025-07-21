package com.nytimes.android.performancetrackerclientphoenix.event.base;

import defpackage.b22;
import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3ApplicationInterceptor;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HybridType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ HybridType[] $VALUES;
    public static final HybridType Article = new HybridType("Article", 0);
    public static final HybridType Interactive = new HybridType("Interactive", 1);
    public static final HybridType Today = new HybridType("Today", 2);
    public static final HybridType Unknown = new HybridType(EmbraceOkHttp3ApplicationInterceptor.UNKNOWN_EXCEPTION, 3);

    private static final /* synthetic */ HybridType[] $values() {
        return new HybridType[]{Article, Interactive, Today, Unknown};
    }

    static {
        HybridType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private HybridType(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static HybridType valueOf(String str) {
        return (HybridType) Enum.valueOf(HybridType.class, str);
    }

    public static HybridType[] values() {
        return (HybridType[]) $VALUES.clone();
    }
}
