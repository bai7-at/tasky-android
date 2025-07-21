package com.nytimes.android.subauth.core.api.client;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SubscriptionLevel {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ SubscriptionLevel[] $VALUES;
    public static final SubscriptionLevel ANONYMOUS = new SubscriptionLevel("ANONYMOUS", 0);
    public static final SubscriptionLevel ANONYMOUSLY_SUBSCRIBED = new SubscriptionLevel("ANONYMOUSLY_SUBSCRIBED", 1);
    public static final SubscriptionLevel REGISTERED = new SubscriptionLevel("REGISTERED", 2);
    public static final SubscriptionLevel REGISTERED_SUBSCRIBED_UNLINKED = new SubscriptionLevel("REGISTERED_SUBSCRIBED_UNLINKED", 3);
    public static final SubscriptionLevel REGISTERED_SUBSCRIBED_LINKED = new SubscriptionLevel("REGISTERED_SUBSCRIBED_LINKED", 4);

    private static final /* synthetic */ SubscriptionLevel[] $values() {
        return new SubscriptionLevel[]{ANONYMOUS, ANONYMOUSLY_SUBSCRIBED, REGISTERED, REGISTERED_SUBSCRIBED_UNLINKED, REGISTERED_SUBSCRIBED_LINKED};
    }

    static {
        SubscriptionLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SubscriptionLevel(String str, int i) {
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
}
