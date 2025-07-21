package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class d {
    private float a;
    private float b;

    static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            iArr2[i] = iArr[i] * 2;
        }
        return iArr2;
    }

    static float b(float f, float f2, float f3) {
        return 1.0f - ((f - f3) / (f2 - f3));
    }

    public float c() {
        return this.b;
    }

    public float d() {
        return this.a;
    }

    void e(Context context) {
        float f = this.a;
        if (f <= 0.0f) {
            f = e.h(context);
        }
        this.a = f;
        float f2 = this.b;
        if (f2 <= 0.0f) {
            f2 = e.g(context);
        }
        this.b = f2;
    }

    boolean f() {
        return true;
    }

    abstract f g(b bVar, View view);

    abstract boolean h(b bVar, int i);
}
