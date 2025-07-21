package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.hg4;

/* loaded from: classes3.dex */
public final class h extends d {
    private static final int[] d = {1};
    private static final int[] e = {1, 0};
    private int c = 0;

    @Override // com.google.android.material.carousel.d
    f g(b bVar, View view) {
        float c = bVar.c();
        if (bVar.f()) {
            c = bVar.b();
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        float f = ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (bVar.f()) {
            f = ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f2 = f;
        float d2 = d() + f2;
        float max = Math.max(c() + f2, d2);
        float min = Math.min(measuredHeight + f2, c);
        float a = hg4.a((measuredHeight / 3.0f) + f2, d2 + f2, max + f2);
        float f3 = (min + a) / 2.0f;
        int[] iArr = d;
        if (c < 2.0f * d2) {
            iArr = new int[]{0};
        }
        int[] iArr2 = e;
        if (bVar.e() == 1) {
            iArr = d.a(iArr);
            iArr2 = d.a(iArr2);
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int max2 = (int) Math.max(1.0d, Math.floor(((c - (e.i(iArr4) * f3)) - (e.i(iArr3) * max)) / min));
        int ceil = (int) Math.ceil(c / min);
        int i = (ceil - max2) + 1;
        int[] iArr5 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr5[i2] = ceil - i2;
        }
        a c2 = a.c(c, a, d2, max, iArr3, f3, iArr4, min, iArr5);
        this.c = c2.e();
        if (i(c2, bVar.a())) {
            c2 = a.c(c, a, d2, max, new int[]{c2.c}, f3, new int[]{c2.d}, min, new int[]{c2.g});
        }
        return e.d(view.getContext(), f2, c, c2, bVar.e());
    }

    @Override // com.google.android.material.carousel.d
    boolean h(b bVar, int i) {
        return (i < this.c && bVar.a() >= this.c) || (i >= this.c && bVar.a() < this.c);
    }

    boolean i(a aVar, int i) {
        int e2 = aVar.e() - i;
        boolean z = e2 > 0 && (aVar.c > 0 || aVar.d > 1);
        while (e2 > 0) {
            int i2 = aVar.c;
            if (i2 > 0) {
                aVar.c = i2 - 1;
            } else {
                int i3 = aVar.d;
                if (i3 > 1) {
                    aVar.d = i3 - 1;
                }
            }
            e2--;
        }
        return z;
    }
}
