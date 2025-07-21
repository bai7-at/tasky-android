package com.nytimes.android.interests;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class OnboardingToolTipState {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ OnboardingToolTipState[] $VALUES;
    public static final OnboardingToolTipState NONE = new OnboardingToolTipState("NONE", 0);
    public static final OnboardingToolTipState ADD = new OnboardingToolTipState("ADD", 1);
    public static final OnboardingToolTipState COMPLETE = new OnboardingToolTipState("COMPLETE", 2);

    private static final /* synthetic */ OnboardingToolTipState[] $values() {
        return new OnboardingToolTipState[]{NONE, ADD, COMPLETE};
    }

    static {
        OnboardingToolTipState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private OnboardingToolTipState(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static OnboardingToolTipState valueOf(String str) {
        return (OnboardingToolTipState) Enum.valueOf(OnboardingToolTipState.class, str);
    }

    public static OnboardingToolTipState[] values() {
        return (OnboardingToolTipState[]) $VALUES.clone();
    }
}
