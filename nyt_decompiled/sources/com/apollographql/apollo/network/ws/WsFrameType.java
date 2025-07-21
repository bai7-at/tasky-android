package com.apollographql.apollo.network.ws;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class WsFrameType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ WsFrameType[] $VALUES;
    public static final WsFrameType Text = new WsFrameType("Text", 0);
    public static final WsFrameType Binary = new WsFrameType("Binary", 1);

    private static final /* synthetic */ WsFrameType[] $values() {
        return new WsFrameType[]{Text, Binary};
    }

    static {
        WsFrameType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private WsFrameType(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static WsFrameType valueOf(String str) {
        return (WsFrameType) Enum.valueOf(WsFrameType.class, str);
    }

    public static WsFrameType[] values() {
        return (WsFrameType[]) $VALUES.clone();
    }
}
