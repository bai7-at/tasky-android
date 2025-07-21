package com.nytimes.android.subauth.core.devsettings.purr;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class MockMutatePurrTCFGraphQLResults {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ MockMutatePurrTCFGraphQLResults[] $VALUES;
    public static final MockMutatePurrTCFGraphQLResults NO_OVERRIDE = new MockMutatePurrTCFGraphQLResults("NO_OVERRIDE", 0);
    public static final MockMutatePurrTCFGraphQLResults TCF_HASHES_SAME = new MockMutatePurrTCFGraphQLResults("TCF_HASHES_SAME", 1);
    public static final MockMutatePurrTCFGraphQLResults TCF_HASHES_DIFF = new MockMutatePurrTCFGraphQLResults("TCF_HASHES_DIFF", 2);

    private static final /* synthetic */ MockMutatePurrTCFGraphQLResults[] $values() {
        return new MockMutatePurrTCFGraphQLResults[]{NO_OVERRIDE, TCF_HASHES_SAME, TCF_HASHES_DIFF};
    }

    static {
        MockMutatePurrTCFGraphQLResults[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private MockMutatePurrTCFGraphQLResults(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static MockMutatePurrTCFGraphQLResults valueOf(String str) {
        return (MockMutatePurrTCFGraphQLResults) Enum.valueOf(MockMutatePurrTCFGraphQLResults.class, str);
    }

    public static MockMutatePurrTCFGraphQLResults[] values() {
        return (MockMutatePurrTCFGraphQLResults[]) $VALUES.clone();
    }
}
