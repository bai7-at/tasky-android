package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* loaded from: classes.dex */
abstract class qb9 {
    private static final tb9 a = new xb9();
    static final Property b = new a(Float.class, "translationAlpha");
    static final Property c = new b(Rect.class, "clipBounds");

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(qb9.b(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            qb9.e(view, f.floatValue());
        }
    }

    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static void a(View view) {
        a.a(view);
    }

    static float b(View view) {
        return a.b(view);
    }

    static void c(View view) {
        a.c(view);
    }

    static void d(View view, int i, int i2, int i3, int i4) {
        a.d(view, i, i2, i3, i4);
    }

    static void e(View view, float f) {
        a.e(view, f);
    }

    static void f(View view, int i) {
        a.f(view, i);
    }

    static void g(View view, Matrix matrix) {
        a.g(view, matrix);
    }

    static void h(View view, Matrix matrix) {
        a.h(view, matrix);
    }
}
