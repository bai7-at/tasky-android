package com.nytimes.android.interests;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class InterestOnboardingScreen {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ InterestOnboardingScreen[] $VALUES;
    public static final InterestOnboardingScreen Topics = new InterestOnboardingScreen("Topics", 0);
    public static final InterestOnboardingScreen Results = new InterestOnboardingScreen("Results", 1);

    private static final /* synthetic */ InterestOnboardingScreen[] $values() {
        return new InterestOnboardingScreen[]{Topics, Results};
    }

    static {
        InterestOnboardingScreen[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private InterestOnboardingScreen(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static InterestOnboardingScreen valueOf(String str) {
        return (InterestOnboardingScreen) Enum.valueOf(InterestOnboardingScreen.class, str);
    }

    public static InterestOnboardingScreen[] values() {
        return (InterestOnboardingScreen[]) $VALUES.clone();
    }
}
