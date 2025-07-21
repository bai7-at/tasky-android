package com.nytimes.android.growthui.common.models;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Subscription {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ Subscription[] $VALUES;
    public static final Subscription News = new Subscription("News", 0);
    public static final Subscription Games = new Subscription("Games", 1);
    public static final Subscription Cooking = new Subscription("Cooking", 2);
    public static final Subscription Athletic = new Subscription("Athletic", 3);

    private static final /* synthetic */ Subscription[] $values() {
        return new Subscription[]{News, Games, Cooking, Athletic};
    }

    static {
        Subscription[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private Subscription(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static Subscription valueOf(String str) {
        return (Subscription) Enum.valueOf(Subscription.class, str);
    }

    public static Subscription[] values() {
        return (Subscription[]) $VALUES.clone();
    }
}
