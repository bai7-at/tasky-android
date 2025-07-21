package com.skydoves.balloon.overlay;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class BalloonOverlayAnimation {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ BalloonOverlayAnimation[] $VALUES;
    public static final BalloonOverlayAnimation NONE = new BalloonOverlayAnimation("NONE", 0);
    public static final BalloonOverlayAnimation FADE = new BalloonOverlayAnimation("FADE", 1);

    private static final /* synthetic */ BalloonOverlayAnimation[] $values() {
        return new BalloonOverlayAnimation[]{NONE, FADE};
    }

    static {
        BalloonOverlayAnimation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private BalloonOverlayAnimation(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static BalloonOverlayAnimation valueOf(String str) {
        return (BalloonOverlayAnimation) Enum.valueOf(BalloonOverlayAnimation.class, str);
    }

    public static BalloonOverlayAnimation[] values() {
        return (BalloonOverlayAnimation[]) $VALUES.clone();
    }
}
