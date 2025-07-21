package com.airbnb.lottie.model.content;

import defpackage.fh;
import defpackage.lh;

/* loaded from: classes.dex */
public class Mask {
    private final MaskMode a;
    private final lh b;
    private final fh c;
    private final boolean d;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, lh lhVar, fh fhVar, boolean z) {
        this.a = maskMode;
        this.b = lhVar;
        this.c = fhVar;
        this.d = z;
    }

    public MaskMode a() {
        return this.a;
    }

    public lh b() {
        return this.b;
    }

    public fh c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }
}
