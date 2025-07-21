package com.nytimes.android.comments.comments.mvi;

import com.nytimes.android.comments.R;
import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SortingOption {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ SortingOption[] $VALUES;
    public static final SortingOption Newest = new SortingOption("Newest", 0, R.string.comment_sort_option_newest, "newest");
    public static final SortingOption Oldest = new SortingOption("Oldest", 1, R.string.comment_sort_option_oldest, "oldest");
    private int title;
    private final String value;

    private static final /* synthetic */ SortingOption[] $values() {
        return new SortingOption[]{Newest, Oldest};
    }

    static {
        SortingOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SortingOption(String str, int i, int i2, String str2) {
        this.title = i2;
        this.value = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static SortingOption valueOf(String str) {
        return (SortingOption) Enum.valueOf(SortingOption.class, str);
    }

    public static SortingOption[] values() {
        return (SortingOption[]) $VALUES.clone();
    }

    public final int getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setTitle(int i) {
        this.title = i;
    }
}
