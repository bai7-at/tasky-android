package com.nytimes.android.designsystem.text;

import defpackage.jk6;

/* loaded from: classes4.dex */
public enum NytFontSize {
    SMALL(jk6.small_font_size, 0.8f),
    MEDIUM(jk6.medium_font_size, 1.0f),
    LARGE(jk6.large_font_size, 1.2f),
    EXTRA_LARGE(jk6.extra_large_font_size, 1.3f),
    JUMBO(jk6.jumbo_font_size, 1.45f);

    private final int nameResource;
    private final float sfScale;

    NytFontSize(int i, float f) {
        this.nameResource = i;
        this.sfScale = f;
    }

    public int getNameRes() {
        return this.nameResource;
    }

    public float getScale() {
        return this.sfScale;
    }
}
