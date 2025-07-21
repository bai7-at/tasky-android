package com.nytimes.android.subauth.core.devsettings.purr;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class MockQueryPurrDirectivesGraphQLResults {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ MockQueryPurrDirectivesGraphQLResults[] $VALUES;
    public static final MockQueryPurrDirectivesGraphQLResults NO_OVERRIDE = new MockQueryPurrDirectivesGraphQLResults("NO_OVERRIDE", 0);
    public static final MockQueryPurrDirectivesGraphQLResults NO_TCF_HIDE_TCF = new MockQueryPurrDirectivesGraphQLResults("NO_TCF_HIDE_TCF", 1);
    public static final MockQueryPurrDirectivesGraphQLResults NO_TCF_SHOW_TCF = new MockQueryPurrDirectivesGraphQLResults("NO_TCF_SHOW_TCF", 2);
    public static final MockQueryPurrDirectivesGraphQLResults TCF_HASHES_SAME = new MockQueryPurrDirectivesGraphQLResults("TCF_HASHES_SAME", 3);
    public static final MockQueryPurrDirectivesGraphQLResults TCF_HASHES_DIFF = new MockQueryPurrDirectivesGraphQLResults("TCF_HASHES_DIFF", 4);
    public static final MockQueryPurrDirectivesGraphQLResults FAILURE = new MockQueryPurrDirectivesGraphQLResults("FAILURE", 5);

    private static final /* synthetic */ MockQueryPurrDirectivesGraphQLResults[] $values() {
        return new MockQueryPurrDirectivesGraphQLResults[]{NO_OVERRIDE, NO_TCF_HIDE_TCF, NO_TCF_SHOW_TCF, TCF_HASHES_SAME, TCF_HASHES_DIFF, FAILURE};
    }

    static {
        MockQueryPurrDirectivesGraphQLResults[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private MockQueryPurrDirectivesGraphQLResults(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static MockQueryPurrDirectivesGraphQLResults valueOf(String str) {
        return (MockQueryPurrDirectivesGraphQLResults) Enum.valueOf(MockQueryPurrDirectivesGraphQLResults.class, str);
    }

    public static MockQueryPurrDirectivesGraphQLResults[] values() {
        return (MockQueryPurrDirectivesGraphQLResults[]) $VALUES.clone();
    }
}
