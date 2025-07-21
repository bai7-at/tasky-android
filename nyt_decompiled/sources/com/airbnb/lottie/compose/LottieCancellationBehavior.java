package com.airbnb.lottie.compose;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class LottieCancellationBehavior {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ LottieCancellationBehavior[] $VALUES;
    public static final LottieCancellationBehavior Immediately = new LottieCancellationBehavior("Immediately", 0);
    public static final LottieCancellationBehavior OnIterationFinish = new LottieCancellationBehavior("OnIterationFinish", 1);

    private static final /* synthetic */ LottieCancellationBehavior[] $values() {
        return new LottieCancellationBehavior[]{Immediately, OnIterationFinish};
    }

    static {
        LottieCancellationBehavior[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private LottieCancellationBehavior(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static LottieCancellationBehavior valueOf(String str) {
        return (LottieCancellationBehavior) Enum.valueOf(LottieCancellationBehavior.class, str);
    }

    public static LottieCancellationBehavior[] values() {
        return (LottieCancellationBehavior[]) $VALUES.clone();
    }
}
