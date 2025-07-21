package com.nytimes.android.fragment.article;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ArticleFragmentType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ArticleFragmentType[] $VALUES;
    public static final ArticleFragmentType HYBRID = new ArticleFragmentType("HYBRID", 0);
    public static final ArticleFragmentType WEB = new ArticleFragmentType("WEB", 1);
    public static final ArticleFragmentType BLANK = new ArticleFragmentType("BLANK", 2);

    private static final /* synthetic */ ArticleFragmentType[] $values() {
        return new ArticleFragmentType[]{HYBRID, WEB, BLANK};
    }

    static {
        ArticleFragmentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ArticleFragmentType(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ArticleFragmentType valueOf(String str) {
        return (ArticleFragmentType) Enum.valueOf(ArticleFragmentType.class, str);
    }

    public static ArticleFragmentType[] values() {
        return (ArticleFragmentType[]) $VALUES.clone();
    }
}
