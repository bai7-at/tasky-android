package com.facebook.login;

import java.util.Arrays;

/* loaded from: classes2.dex */
public enum DefaultAudience {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");

    private final String nativeProtocolAudience;

    DefaultAudience(String str) {
        this.nativeProtocolAudience = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static DefaultAudience[] valuesCustom() {
        DefaultAudience[] valuesCustom = values();
        return (DefaultAudience[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String getNativeProtocolAudience() {
        return this.nativeProtocolAudience;
    }
}
