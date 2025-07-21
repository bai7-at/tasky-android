package com.airbnb.lottie.compose;

import defpackage.ov4;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class LottieAnimationSizeElement extends ov4 {
    private final int b;
    private final int c;

    public LottieAnimationSizeElement(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieAnimationSizeElement)) {
            return false;
        }
        LottieAnimationSizeElement lottieAnimationSizeElement = (LottieAnimationSizeElement) obj;
        return this.b == lottieAnimationSizeElement.b && this.c == lottieAnimationSizeElement.c;
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return (Integer.hashCode(this.b) * 31) + Integer.hashCode(this.c);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public LottieAnimationSizeNode l() {
        return new LottieAnimationSizeNode(this.b, this.c);
    }

    public String toString() {
        return "LottieAnimationSizeElement(width=" + this.b + ", height=" + this.c + ")";
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(LottieAnimationSizeNode lottieAnimationSizeNode) {
        zq3.h(lottieAnimationSizeNode, "node");
        lottieAnimationSizeNode.f2(this.b);
        lottieAnimationSizeNode.e2(this.c);
    }
}
