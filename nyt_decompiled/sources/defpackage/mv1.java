package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public abstract class mv1 {
    public static final /* synthetic */ int a(Drawable drawable) {
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return 0;
    }

    public static final /* synthetic */ int b(Drawable[] drawableArr) {
        zq3.h(drawableArr, "<this>");
        return uo6.d(a(drawableArr[0]), a(drawableArr[2]));
    }

    public static final /* synthetic */ int c(Drawable[] drawableArr) {
        zq3.h(drawableArr, "<this>");
        return d(drawableArr[0]) + d(drawableArr[2]);
    }

    public static final /* synthetic */ int d(Drawable drawable) {
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return 0;
    }

    public static final /* synthetic */ boolean e(Drawable[] drawableArr) {
        zq3.h(drawableArr, "<this>");
        return (drawableArr[0] == null && drawableArr[2] == null) ? false : true;
    }

    public static final /* synthetic */ Drawable f(Drawable drawable, Context context, Integer num, Integer num2) {
        zq3.h(drawable, "<this>");
        zq3.h(context, "context");
        if (num == null || num2 == null) {
            return drawable;
        }
        Bitmap createBitmap = Bitmap.createBitmap(num.intValue(), num2.intValue(), Bitmap.Config.ARGB_8888);
        zq3.g(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, num.intValue(), num2.intValue());
        drawable.draw(canvas);
        return new BitmapDrawable(context.getResources(), createBitmap);
    }

    public static final /* synthetic */ Drawable g(Drawable drawable, Integer num) {
        zq3.h(drawable, "<this>");
        if (num != null) {
            kv1.o(kv1.r(drawable), ColorStateList.valueOf(num.intValue()));
        }
        return drawable;
    }
}
