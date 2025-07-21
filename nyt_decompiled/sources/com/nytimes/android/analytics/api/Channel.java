package com.nytimes.android.analytics.api;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class Channel {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ Channel[] $VALUES;
    public static final Channel AppsFlyer = new Channel("AppsFlyer", 0);
    public static final Channel Facebook = new Channel("Facebook", 1);
    public static final Channel Firebase = new Channel("Firebase", 2);

    private static final /* synthetic */ Channel[] $values() {
        return new Channel[]{AppsFlyer, Facebook, Firebase};
    }

    static {
        Channel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private Channel(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static Channel valueOf(String str) {
        return (Channel) Enum.valueOf(Channel.class, str);
    }

    public static Channel[] values() {
        return (Channel[]) $VALUES.clone();
    }
}
