package com.comscore.util;

/* loaded from: classes2.dex */
public class ObfuscationChecker {
    private static final String a = "com.comscore.util";
    private static final String b = "ObfuscationChecker";

    public boolean isCodeObfuscated() {
        return (a.equals(getClass().getPackage().getName()) && b.equals(getClass().getSimpleName())) ? false : true;
    }
}
