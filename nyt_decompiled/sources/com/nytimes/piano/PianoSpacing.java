package com.nytimes.piano;

/* loaded from: classes4.dex */
public enum PianoSpacing {
    spacing_0_5(4),
    spacing_1(8),
    spacing_1_5(12),
    spacing_2(16),
    spacing_2_5(20),
    spacing_3(24),
    spacing_4(32),
    spacing_5(40),
    spacing_6(48),
    spacing_7(56),
    spacing_8(64),
    spacing_9(72),
    spacing_10(80);

    private final int inDp;

    PianoSpacing(int i) {
        this.inDp = i;
    }

    public final int getInDp() {
        return this.inDp;
    }
}
