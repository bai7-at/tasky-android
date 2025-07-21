package com.apollographql.apollo.api.http;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HttpMethod {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ HttpMethod[] $VALUES;
    public static final HttpMethod Get = new HttpMethod("Get", 0);
    public static final HttpMethod Post = new HttpMethod("Post", 1);

    private static final /* synthetic */ HttpMethod[] $values() {
        return new HttpMethod[]{Get, Post};
    }

    static {
        HttpMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private HttpMethod(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static HttpMethod valueOf(String str) {
        return (HttpMethod) Enum.valueOf(HttpMethod.class, str);
    }

    public static HttpMethod[] values() {
        return (HttpMethod[]) $VALUES.clone();
    }
}
