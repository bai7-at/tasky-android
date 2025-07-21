package com.nytimes.android.subauth.core.api.listeners;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class NYTUserUpdateSource {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ NYTUserUpdateSource[] $VALUES;
    public static final NYTUserUpdateSource USER_DETAILS = new NYTUserUpdateSource("USER_DETAILS", 0);
    public static final NYTUserUpdateSource GOOGLE_PLAY = new NYTUserUpdateSource("GOOGLE_PLAY", 1);
    public static final NYTUserUpdateSource DB_INITIAL_LOAD = new NYTUserUpdateSource("DB_INITIAL_LOAD", 2);
    public static final NYTUserUpdateSource PROVISIONAL_ENT_EXPIRED = new NYTUserUpdateSource("PROVISIONAL_ENT_EXPIRED", 3);

    private static final /* synthetic */ NYTUserUpdateSource[] $values() {
        return new NYTUserUpdateSource[]{USER_DETAILS, GOOGLE_PLAY, DB_INITIAL_LOAD, PROVISIONAL_ENT_EXPIRED};
    }

    static {
        NYTUserUpdateSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private NYTUserUpdateSource(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static NYTUserUpdateSource valueOf(String str) {
        return (NYTUserUpdateSource) Enum.valueOf(NYTUserUpdateSource.class, str);
    }

    public static NYTUserUpdateSource[] values() {
        return (NYTUserUpdateSource[]) $VALUES.clone();
    }
}
