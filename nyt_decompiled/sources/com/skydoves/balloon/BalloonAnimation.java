package com.skydoves.balloon;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class BalloonAnimation {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ BalloonAnimation[] $VALUES;
    public static final BalloonAnimation NONE = new BalloonAnimation("NONE", 0);
    public static final BalloonAnimation ELASTIC = new BalloonAnimation("ELASTIC", 1);
    public static final BalloonAnimation FADE = new BalloonAnimation("FADE", 2);
    public static final BalloonAnimation CIRCULAR = new BalloonAnimation("CIRCULAR", 3);
    public static final BalloonAnimation OVERSHOOT = new BalloonAnimation("OVERSHOOT", 4);

    private static final /* synthetic */ BalloonAnimation[] $values() {
        return new BalloonAnimation[]{NONE, ELASTIC, FADE, CIRCULAR, OVERSHOOT};
    }

    static {
        BalloonAnimation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private BalloonAnimation(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static BalloonAnimation valueOf(String str) {
        return (BalloonAnimation) Enum.valueOf(BalloonAnimation.class, str);
    }

    public static BalloonAnimation[] values() {
        return (BalloonAnimation[]) $VALUES.clone();
    }
}
