package com.skydoves.balloon;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class BalloonHighlightAnimation {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ BalloonHighlightAnimation[] $VALUES;
    public static final BalloonHighlightAnimation NONE = new BalloonHighlightAnimation("NONE", 0);
    public static final BalloonHighlightAnimation HEARTBEAT = new BalloonHighlightAnimation("HEARTBEAT", 1);
    public static final BalloonHighlightAnimation SHAKE = new BalloonHighlightAnimation("SHAKE", 2);
    public static final BalloonHighlightAnimation BREATH = new BalloonHighlightAnimation("BREATH", 3);
    public static final BalloonHighlightAnimation ROTATE = new BalloonHighlightAnimation("ROTATE", 4);

    private static final /* synthetic */ BalloonHighlightAnimation[] $values() {
        return new BalloonHighlightAnimation[]{NONE, HEARTBEAT, SHAKE, BREATH, ROTATE};
    }

    static {
        BalloonHighlightAnimation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private BalloonHighlightAnimation(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static BalloonHighlightAnimation valueOf(String str) {
        return (BalloonHighlightAnimation) Enum.valueOf(BalloonHighlightAnimation.class, str);
    }

    public static BalloonHighlightAnimation[] values() {
        return (BalloonHighlightAnimation[]) $VALUES.clone();
    }
}
