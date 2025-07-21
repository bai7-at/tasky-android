package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import defpackage.px7;

/* loaded from: classes4.dex */
public abstract class r {

    public static final class a {
        private final Picasso.LoadedFrom a;
        private final Bitmap b;
        private final px7 c;
        private final int d;

        public a(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            this((Bitmap) w.e(bitmap, "bitmap == null"), null, loadedFrom, 0);
        }

        public Bitmap a() {
            return this.b;
        }

        int b() {
            return this.d;
        }

        public Picasso.LoadedFrom c() {
            return this.a;
        }

        public px7 d() {
            return this.c;
        }

        public a(px7 px7Var, Picasso.LoadedFrom loadedFrom) {
            this(null, (px7) w.e(px7Var, "source == null"), loadedFrom, 0);
        }

        a(Bitmap bitmap, px7 px7Var, Picasso.LoadedFrom loadedFrom, int i) {
            if ((bitmap != null) != (px7Var != null)) {
                this.b = bitmap;
                this.c = px7Var;
                this.a = (Picasso.LoadedFrom) w.e(loadedFrom, "loadedFrom == null");
                this.d = i;
                return;
            }
            throw new AssertionError();
        }
    }

    static void a(int i, int i2, int i3, int i4, BitmapFactory.Options options, p pVar) {
        int max;
        double floor;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                floor = Math.floor(i3 / i);
            } else if (i == 0) {
                floor = Math.floor(i4 / i2);
            } else {
                int floor2 = (int) Math.floor(i4 / i2);
                int floor3 = (int) Math.floor(i3 / i);
                max = pVar.l ? Math.max(floor2, floor3) : Math.min(floor2, floor3);
            }
            max = (int) floor;
        } else {
            max = 1;
        }
        options.inSampleSize = max;
        options.inJustDecodeBounds = false;
    }

    static void b(int i, int i2, BitmapFactory.Options options, p pVar) {
        a(i, i2, options.outWidth, options.outHeight, options, pVar);
    }

    static BitmapFactory.Options d(p pVar) {
        boolean c = pVar.c();
        boolean z = pVar.s != null;
        if (!c && !z && !pVar.r) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = c;
        boolean z2 = pVar.r;
        options.inInputShareable = z2;
        options.inPurgeable = z2;
        if (z) {
            options.inPreferredConfig = pVar.s;
        }
        return options;
    }

    static boolean g(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean c(p pVar);

    int e() {
        return 0;
    }

    public abstract a f(p pVar, int i);

    boolean h(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    boolean i() {
        return false;
    }
}
