package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.Handler;
import defpackage.fn2;
import defpackage.m07;
import defpackage.um2;

/* loaded from: classes.dex */
public abstract class ou8 {
    private static final qu8 a = new pu8();
    private static final hd4 b = new hd4(16);

    public static class a extends fn2.c {
        private m07.e a;

        public a(m07.e eVar) {
            this.a = eVar;
        }

        @Override // fn2.c
        public void a(int i) {
            m07.e eVar = this.a;
            if (eVar != null) {
                eVar.f(i);
            }
        }

        @Override // fn2.c
        public void b(Typeface typeface) {
            m07.e eVar = this.a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, fn2.b[] bVarArr, int i) {
        return a.b(context, cancellationSignal, bVarArr, i);
    }

    public static Typeface c(Context context, um2.b bVar, Resources resources, int i, String str, int i2, int i3, m07.e eVar, Handler handler, boolean z) {
        Typeface a2;
        if (bVar instanceof um2.e) {
            um2.e eVar2 = (um2.e) bVar;
            Typeface g = g(eVar2.c());
            if (g != null) {
                if (eVar != null) {
                    eVar.d(g, handler);
                }
                return g;
            }
            a2 = fn2.c(context, eVar2.b(), i3, !z ? eVar != null : eVar2.a() != 0, z ? eVar2.d() : -1, m07.e.e(handler), new a(eVar));
        } else {
            a2 = a.a(context, (um2.c) bVar, resources, i3);
            if (eVar != null) {
                if (a2 != null) {
                    eVar.d(a2, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (a2 != null) {
            b.f(e(resources, i, str, i2, i3), a2);
        }
        return a2;
    }

    public static Typeface d(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface c = a.c(context, resources, i, str, i3);
        if (c != null) {
            b.f(e(resources, i, str, i2, i3), c);
        }
        return c;
    }

    private static String e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface f(Resources resources, int i, String str, int i2, int i3) {
        return (Typeface) b.d(e(resources, i, str, i2, i3));
    }

    private static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
