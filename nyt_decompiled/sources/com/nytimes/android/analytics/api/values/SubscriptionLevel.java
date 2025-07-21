package com.nytimes.android.analytics.api.values;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class SubscriptionLevel {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ SubscriptionLevel[] $VALUES;
    public static final SubscriptionLevel Anonymous = new SubscriptionLevel("Anonymous", 0, "Anonymous");
    public static final SubscriptionLevel AnonymouslySubscribed = new SubscriptionLevel("AnonymouslySubscribed", 1, "Anonymously Subscribed");
    public static final SubscriptionLevel Registered = new SubscriptionLevel("Registered", 2, "Registered");
    public static final SubscriptionLevel Subscribed = new SubscriptionLevel("Subscribed", 3, "Subscribed");
    private final String title;

    private static final /* synthetic */ SubscriptionLevel[] $values() {
        return new SubscriptionLevel[]{Anonymous, AnonymouslySubscribed, Registered, Subscribed};
    }

    static {
        SubscriptionLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SubscriptionLevel(String str, int i, String str2) {
        this.title = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionLevel valueOf(String str) {
        return (SubscriptionLevel) Enum.valueOf(SubscriptionLevel.class, str);
    }

    public static SubscriptionLevel[] values() {
        return (SubscriptionLevel[]) $VALUES.clone();
    }

    public String getTitle() {
        return this.title;
    }
}
