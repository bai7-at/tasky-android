package com.google.android.material.carousel;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.f;
import defpackage.zd6;

/* loaded from: classes3.dex */
abstract class e {
    static float a(float f, float f2, int i) {
        return f + (Math.max(0, i - 1) * f2);
    }

    static float b(float f, float f2, int i) {
        return i > 0 ? f + (f2 / 2.0f) : f;
    }

    static f c(Context context, float f, float f2, a aVar) {
        float f3;
        float f4;
        float min = Math.min(f(context) + f, aVar.f);
        float f5 = min / 2.0f;
        float f6 = 0.0f - f5;
        float b = b(0.0f, aVar.b, aVar.c);
        float j = j(0.0f, a(b, aVar.b, (int) Math.floor(aVar.c / 2.0f)), aVar.b, aVar.c);
        float b2 = b(j, aVar.e, aVar.d);
        float j2 = j(j, a(b2, aVar.e, (int) Math.floor(aVar.d / 2.0f)), aVar.e, aVar.d);
        float b3 = b(j2, aVar.f, aVar.g);
        float j3 = j(j2, a(b3, aVar.f, aVar.g), aVar.f, aVar.g);
        float b4 = b(j3, aVar.e, aVar.d);
        float b5 = b(j(j3, a(b4, aVar.e, (int) Math.ceil(aVar.d / 2.0f)), aVar.e, aVar.d), aVar.b, aVar.c);
        float f7 = f5 + f2;
        float b6 = d.b(min, aVar.f, f);
        float b7 = d.b(aVar.b, aVar.f, f);
        float b8 = d.b(aVar.e, aVar.f, f);
        f.b a = new f.b(aVar.f, f2).a(f6, b6, min);
        if (aVar.c > 0) {
            f3 = f7;
            a.g(b, b7, aVar.b, (int) Math.floor(r7 / 2.0f));
        } else {
            f3 = f7;
        }
        if (aVar.d > 0) {
            a.g(b2, b8, aVar.e, (int) Math.floor(r4 / 2.0f));
        }
        a.h(b3, 0.0f, aVar.f, aVar.g, true);
        if (aVar.d > 0) {
            f4 = 2.0f;
            a.g(b4, b8, aVar.e, (int) Math.ceil(r4 / 2.0f));
        } else {
            f4 = 2.0f;
        }
        if (aVar.c > 0) {
            a.g(b5, b7, aVar.b, (int) Math.ceil(r0 / f4));
        }
        a.a(f3, b6, min);
        return a.i();
    }

    static f d(Context context, float f, float f2, a aVar, int i) {
        return i == 1 ? c(context, f, f2, aVar) : e(context, f, f2, aVar);
    }

    static f e(Context context, float f, float f2, a aVar) {
        float min = Math.min(f(context) + f, aVar.f);
        float f3 = min / 2.0f;
        float f4 = 0.0f - f3;
        float b = b(0.0f, aVar.f, aVar.g);
        float j = j(0.0f, a(b, aVar.f, aVar.g), aVar.f, aVar.g);
        float b2 = b(j, aVar.e, aVar.d);
        float b3 = b(j(j, b2, aVar.e, aVar.d), aVar.b, aVar.c);
        float f5 = f3 + f2;
        float b4 = d.b(min, aVar.f, f);
        float b5 = d.b(aVar.b, aVar.f, f);
        float b6 = d.b(aVar.e, aVar.f, f);
        f.b h = new f.b(aVar.f, f2).a(f4, b4, min).h(b, 0.0f, aVar.f, aVar.g, true);
        if (aVar.d > 0) {
            h.b(b2, b6, aVar.e);
        }
        int i = aVar.c;
        if (i > 0) {
            h.g(b3, b5, aVar.b, i);
        }
        h.a(f5, b4, min);
        return h.i();
    }

    static float f(Context context) {
        return context.getResources().getDimension(zd6.m3_carousel_gone_size);
    }

    static float g(Context context) {
        return context.getResources().getDimension(zd6.m3_carousel_small_item_size_max);
    }

    static float h(Context context) {
        return context.getResources().getDimension(zd6.m3_carousel_small_item_size_min);
    }

    static int i(int[] iArr) {
        int i = RecyclerView.UNDEFINED_DURATION;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    static float j(float f, float f2, float f3, int i) {
        return i > 0 ? f2 + (f3 / 2.0f) : f;
    }
}
