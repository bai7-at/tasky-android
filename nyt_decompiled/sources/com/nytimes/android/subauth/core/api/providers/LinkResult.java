package com.nytimes.android.subauth.core.api.providers;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LinkResult {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ LinkResult[] $VALUES;
    public static final LinkResult None = new LinkResult("None", 0);
    public static final LinkResult NoneNoPurchaseDependency = new LinkResult("NoneNoPurchaseDependency", 1);
    public static final LinkResult Success = new LinkResult("Success", 2);
    public static final LinkResult Failure = new LinkResult("Failure", 3);

    private static final /* synthetic */ LinkResult[] $values() {
        return new LinkResult[]{None, NoneNoPurchaseDependency, Success, Failure};
    }

    static {
        LinkResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private LinkResult(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static LinkResult valueOf(String str) {
        return (LinkResult) Enum.valueOf(LinkResult.class, str);
    }

    public static LinkResult[] values() {
        return (LinkResult[]) $VALUES.clone();
    }
}
