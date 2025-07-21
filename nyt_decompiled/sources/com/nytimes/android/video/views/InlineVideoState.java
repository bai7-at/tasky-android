package com.nytimes.android.video.views;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class InlineVideoState {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ InlineVideoState[] $VALUES;
    public static final InlineVideoState START = new InlineVideoState("START", 0);
    public static final InlineVideoState LOADING = new InlineVideoState("LOADING", 1);
    public static final InlineVideoState PLAYING = new InlineVideoState("PLAYING", 2);
    public static final InlineVideoState BUFFERING = new InlineVideoState("BUFFERING", 3);
    public static final InlineVideoState RESUME = new InlineVideoState("RESUME", 4);
    public static final InlineVideoState END = new InlineVideoState("END", 5);

    private static final /* synthetic */ InlineVideoState[] $values() {
        return new InlineVideoState[]{START, LOADING, PLAYING, BUFFERING, RESUME, END};
    }

    static {
        InlineVideoState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private InlineVideoState(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static InlineVideoState valueOf(String str) {
        return (InlineVideoState) Enum.valueOf(InlineVideoState.class, str);
    }

    public static InlineVideoState[] values() {
        return (InlineVideoState[]) $VALUES.clone();
    }
}
