package com.nytimes.android.internal.auth.key.data;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class KeystoreType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ KeystoreType[] $VALUES;

    /* renamed from: type, reason: collision with root package name */
    private final String f62type;
    public static final KeystoreType PKCS12 = new KeystoreType("PKCS12", 0, "PKCS12");
    public static final KeystoreType BKS = new KeystoreType("BKS", 1, "BKS");

    private static final /* synthetic */ KeystoreType[] $values() {
        return new KeystoreType[]{PKCS12, BKS};
    }

    static {
        KeystoreType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private KeystoreType(String str, int i, String str2) {
        this.f62type = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static KeystoreType valueOf(String str) {
        return (KeystoreType) Enum.valueOf(KeystoreType.class, str);
    }

    public static KeystoreType[] values() {
        return (KeystoreType[]) $VALUES.clone();
    }

    public final String type() {
        return this.f62type;
    }
}
