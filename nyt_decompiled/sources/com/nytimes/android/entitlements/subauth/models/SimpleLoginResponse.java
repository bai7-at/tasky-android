package com.nytimes.android.entitlements.subauth.models;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SimpleLoginResponse {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ SimpleLoginResponse[] $VALUES;
    public static final SimpleLoginResponse NO_CONNECTION = new SimpleLoginResponse("NO_CONNECTION", 0);
    public static final SimpleLoginResponse SUCCESS = new SimpleLoginResponse("SUCCESS", 1);
    public static final SimpleLoginResponse FAIL = new SimpleLoginResponse("FAIL", 2);

    private static final /* synthetic */ SimpleLoginResponse[] $values() {
        return new SimpleLoginResponse[]{NO_CONNECTION, SUCCESS, FAIL};
    }

    static {
        SimpleLoginResponse[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SimpleLoginResponse(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static SimpleLoginResponse valueOf(String str) {
        return (SimpleLoginResponse) Enum.valueOf(SimpleLoginResponse.class, str);
    }

    public static SimpleLoginResponse[] values() {
        return (SimpleLoginResponse[]) $VALUES.clone();
    }
}
