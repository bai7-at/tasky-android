package com.nytimes.android.subauth.core.devsettings;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class MockQueryUserDetailsGraphQLResults {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ MockQueryUserDetailsGraphQLResults[] $VALUES;
    public static final MockQueryUserDetailsGraphQLResults NO_OVERRIDE = new MockQueryUserDetailsGraphQLResults("NO_OVERRIDE", 0);
    public static final MockQueryUserDetailsGraphQLResults SUCCESS_ENTITLED = new MockQueryUserDetailsGraphQLResults("SUCCESS_ENTITLED", 1);
    public static final MockQueryUserDetailsGraphQLResults SUCCESS_NON_SUBSCRIBER = new MockQueryUserDetailsGraphQLResults("SUCCESS_NON_SUBSCRIBER", 2);
    public static final MockQueryUserDetailsGraphQLResults SOFT_CANCELLED_OWNER_UNKNOWN = new MockQueryUserDetailsGraphQLResults("SOFT_CANCELLED_OWNER_UNKNOWN", 3);
    public static final MockQueryUserDetailsGraphQLResults INVALID_DATES = new MockQueryUserDetailsGraphQLResults("INVALID_DATES", 4);
    public static final MockQueryUserDetailsGraphQLResults FAILURE = new MockQueryUserDetailsGraphQLResults("FAILURE", 5);
    public static final MockQueryUserDetailsGraphQLResults FAILURE_SOCKET_EXCEPTION = new MockQueryUserDetailsGraphQLResults("FAILURE_SOCKET_EXCEPTION", 6);
    public static final MockQueryUserDetailsGraphQLResults FAILURE_INVALID_APOLLO_RESPONSE = new MockQueryUserDetailsGraphQLResults("FAILURE_INVALID_APOLLO_RESPONSE", 7);
    public static final MockQueryUserDetailsGraphQLResults FAIL_OPEN_USER_EMPTY = new MockQueryUserDetailsGraphQLResults("FAIL_OPEN_USER_EMPTY", 8);
    public static final MockQueryUserDetailsGraphQLResults FAIL_OPEN_SUBSCRIPTIONS_EMPTY = new MockQueryUserDetailsGraphQLResults("FAIL_OPEN_SUBSCRIPTIONS_EMPTY", 9);

    private static final /* synthetic */ MockQueryUserDetailsGraphQLResults[] $values() {
        return new MockQueryUserDetailsGraphQLResults[]{NO_OVERRIDE, SUCCESS_ENTITLED, SUCCESS_NON_SUBSCRIBER, SOFT_CANCELLED_OWNER_UNKNOWN, INVALID_DATES, FAILURE, FAILURE_SOCKET_EXCEPTION, FAILURE_INVALID_APOLLO_RESPONSE, FAIL_OPEN_USER_EMPTY, FAIL_OPEN_SUBSCRIPTIONS_EMPTY};
    }

    static {
        MockQueryUserDetailsGraphQLResults[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private MockQueryUserDetailsGraphQLResults(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static MockQueryUserDetailsGraphQLResults valueOf(String str) {
        return (MockQueryUserDetailsGraphQLResults) Enum.valueOf(MockQueryUserDetailsGraphQLResults.class, str);
    }

    public static MockQueryUserDetailsGraphQLResults[] values() {
        return (MockQueryUserDetailsGraphQLResults[]) $VALUES.clone();
    }
}
