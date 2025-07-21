package com.nytimes.android.coroutinesutils;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ParallelDownloadStrategy {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ParallelDownloadStrategy[] $VALUES;
    public static final ParallelDownloadStrategy GET = new ParallelDownloadStrategy("GET", 0);
    public static final ParallelDownloadStrategy FETCH_ALWAYS = new ParallelDownloadStrategy("FETCH_ALWAYS", 1);
    public static final ParallelDownloadStrategy FETCH_IF_STALE = new ParallelDownloadStrategy("FETCH_IF_STALE", 2);

    private static final /* synthetic */ ParallelDownloadStrategy[] $values() {
        return new ParallelDownloadStrategy[]{GET, FETCH_ALWAYS, FETCH_IF_STALE};
    }

    static {
        ParallelDownloadStrategy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ParallelDownloadStrategy(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ParallelDownloadStrategy valueOf(String str) {
        return (ParallelDownloadStrategy) Enum.valueOf(ParallelDownloadStrategy.class, str);
    }

    public static ParallelDownloadStrategy[] values() {
        return (ParallelDownloadStrategy[]) $VALUES.clone();
    }
}
