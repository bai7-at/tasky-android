package com.nytimes.android.subauth.core.devsettings.models;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class DeleteAccountStatusOverride {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ DeleteAccountStatusOverride[] $VALUES;
    public static final DeleteAccountStatusOverride NoOverride = new DeleteAccountStatusOverride("NoOverride", 0);
    public static final DeleteAccountStatusOverride Success = new DeleteAccountStatusOverride("Success", 1);
    public static final DeleteAccountStatusOverride Error_Existing_P1_User = new DeleteAccountStatusOverride("Error_Existing_P1_User", 2);
    public static final DeleteAccountStatusOverride Error_Existing_P3_User = new DeleteAccountStatusOverride("Error_Existing_P3_User", 3);
    public static final DeleteAccountStatusOverride Error_Anon_User = new DeleteAccountStatusOverride("Error_Anon_User", 4);
    public static final DeleteAccountStatusOverride Error_Missing_Cookies = new DeleteAccountStatusOverride("Error_Missing_Cookies", 5);
    public static final DeleteAccountStatusOverride Error_Server = new DeleteAccountStatusOverride("Error_Server", 6);
    public static final DeleteAccountStatusOverride Error_Unknown = new DeleteAccountStatusOverride("Error_Unknown", 7);

    private static final /* synthetic */ DeleteAccountStatusOverride[] $values() {
        return new DeleteAccountStatusOverride[]{NoOverride, Success, Error_Existing_P1_User, Error_Existing_P3_User, Error_Anon_User, Error_Missing_Cookies, Error_Server, Error_Unknown};
    }

    static {
        DeleteAccountStatusOverride[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private DeleteAccountStatusOverride(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static DeleteAccountStatusOverride valueOf(String str) {
        return (DeleteAccountStatusOverride) Enum.valueOf(DeleteAccountStatusOverride.class, str);
    }

    public static DeleteAccountStatusOverride[] values() {
        return (DeleteAccountStatusOverride[]) $VALUES.clone();
    }
}
