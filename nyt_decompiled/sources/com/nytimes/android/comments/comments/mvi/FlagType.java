package com.nytimes.android.comments.comments.mvi;

import com.nytimes.android.comments.R;
import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class FlagType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ FlagType[] $VALUES;
    private int title;
    private final String value;
    public static final FlagType Vulgar = new FlagType("Vulgar", 0, R.string.comment_flag_type_vulgar, "Vulgar");
    public static final FlagType Inflammatory = new FlagType("Inflammatory", 1, R.string.comment_flag_type_inflammatory, "Inflammatory");
    public static final FlagType PersonalAttack = new FlagType("PersonalAttack", 2, R.string.comment_flag_type_personal_attack, "Personal-attack");
    public static final FlagType Spam = new FlagType("Spam", 3, R.string.comment_flag_type_spam, "Spam");
    public static final FlagType OffTopic = new FlagType("OffTopic", 4, R.string.comment_flag_type_off_topic, "Off-topic");

    private static final /* synthetic */ FlagType[] $values() {
        return new FlagType[]{Vulgar, Inflammatory, PersonalAttack, Spam, OffTopic};
    }

    static {
        FlagType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private FlagType(String str, int i, int i2, String str2) {
        this.title = i2;
        this.value = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static FlagType valueOf(String str) {
        return (FlagType) Enum.valueOf(FlagType.class, str);
    }

    public static FlagType[] values() {
        return (FlagType[]) $VALUES.clone();
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
