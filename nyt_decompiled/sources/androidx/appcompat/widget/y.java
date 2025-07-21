package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import defpackage.a49;
import defpackage.hd4;
import defpackage.hs7;
import defpackage.kv1;
import defpackage.lb4;
import defpackage.mx0;
import defpackage.py7;
import defpackage.qe6;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class y {
    private static y i;
    private WeakHashMap a;
    private hs7 b;
    private py7 c;
    private final WeakHashMap d = new WeakHashMap(0);
    private TypedValue e;
    private boolean f;
    private c g;
    private static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    private static final a j = new a(6);

    private static class a extends hd4 {
        public a(int i) {
            super(i);
        }

        private static int m(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter n(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) d(Integer.valueOf(m(i, mode)));
        }

        PorterDuffColorFilter o(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) f(Integer.valueOf(m(i, mode)), porterDuffColorFilter);
        }
    }

    private interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
        Drawable a(y yVar, Context context, int i);

        ColorStateList b(Context context, int i);

        boolean c(Context context, int i, Drawable drawable);

        PorterDuff.Mode d(int i);

        boolean e(Context context, int i, Drawable drawable);
    }

    private synchronized boolean a(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            lb4 lb4Var = (lb4) this.d.get(context);
            if (lb4Var == null) {
                lb4Var = new lb4();
                this.d.put(context, lb4Var);
            }
            lb4Var.h(j2, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void b(Context context, int i2, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap();
        }
        py7 py7Var = (py7) this.a.get(context);
        if (py7Var == null) {
            py7Var = new py7();
            this.a.put(context, py7Var);
        }
        py7Var.a(i2, colorStateList);
    }

    private void c(Context context) {
        if (this.f) {
            return;
        }
        this.f = true;
        Drawable i2 = i(context, qe6.abc_vector_test);
        if (i2 == null || !p(i2)) {
            this.f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long d(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable e(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long d = d(typedValue);
        Drawable h2 = h(context, d);
        if (h2 != null) {
            return h2;
        }
        c cVar = this.g;
        Drawable a2 = cVar == null ? null : cVar.a(this, context, i2);
        if (a2 != null) {
            a2.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, d, a2);
        }
        return a2;
    }

    private static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized y g() {
        y yVar;
        synchronized (y.class) {
            try {
                if (i == null) {
                    y yVar2 = new y();
                    i = yVar2;
                    o(yVar2);
                }
                yVar = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return yVar;
    }

    private synchronized Drawable h(Context context, long j2) {
        lb4 lb4Var = (lb4) this.d.get(context);
        if (lb4Var == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) lb4Var.d(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            lb4Var.i(j2);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter k(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter n;
        synchronized (y.class) {
            a aVar = j;
            n = aVar.n(i2, mode);
            if (n == null) {
                n = new PorterDuffColorFilter(i2, mode);
                aVar.o(i2, mode, n);
            }
        }
        return n;
    }

    private ColorStateList m(Context context, int i2) {
        py7 py7Var;
        WeakHashMap weakHashMap = this.a;
        if (weakHashMap == null || (py7Var = (py7) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) py7Var.e(i2);
    }

    private static void o(y yVar) {
    }

    private static boolean p(Drawable drawable) {
        return (drawable instanceof a49) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable q(Context context, int i2) {
        int next;
        hs7 hs7Var = this.b;
        if (hs7Var == null || hs7Var.isEmpty()) {
            return null;
        }
        py7 py7Var = this.c;
        if (py7Var != null) {
            String str = (String) py7Var.e(i2);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.b.get(str) == null)) {
                return null;
            }
        } else {
            this.c = new py7();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long d = d(typedValue);
        Drawable h2 = h(context, d);
        if (h2 != null) {
            return h2;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.c.a(i2, name);
                b bVar = (b) this.b.get(name);
                if (bVar != null) {
                    h2 = bVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (h2 != null) {
                    h2.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, d, h2);
                }
            } catch (Exception e) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (h2 == null) {
            this.c.a(i2, "appcompat_skip_skip");
        }
        return h2;
    }

    private Drawable u(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList l = l(context, i2);
        if (l == null) {
            c cVar = this.g;
            if ((cVar == null || !cVar.e(context, i2, drawable)) && !w(context, i2, drawable) && z) {
                return null;
            }
            return drawable;
        }
        if (w.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable r = kv1.r(drawable);
        kv1.o(r, l);
        PorterDuff.Mode n = n(i2);
        if (n == null) {
            return r;
        }
        kv1.p(r, n);
        return r;
    }

    static void v(Drawable drawable, f0 f0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (w.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = f0Var.d;
        if (z || f0Var.c) {
            drawable.setColorFilter(f(z ? f0Var.a : null, f0Var.c ? f0Var.b : h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public synchronized Drawable i(Context context, int i2) {
        return j(context, i2, false);
    }

    synchronized Drawable j(Context context, int i2, boolean z) {
        Drawable q;
        try {
            c(context);
            q = q(context, i2);
            if (q == null) {
                q = e(context, i2);
            }
            if (q == null) {
                q = mx0.e(context, i2);
            }
            if (q != null) {
                q = u(context, i2, z, q);
            }
            if (q != null) {
                w.b(q);
            }
        } catch (Throwable th) {
            throw th;
        }
        return q;
    }

    synchronized ColorStateList l(Context context, int i2) {
        ColorStateList m;
        m = m(context, i2);
        if (m == null) {
            c cVar = this.g;
            m = cVar == null ? null : cVar.b(context, i2);
            if (m != null) {
                b(context, i2, m);
            }
        }
        return m;
    }

    PorterDuff.Mode n(int i2) {
        c cVar = this.g;
        if (cVar == null) {
            return null;
        }
        return cVar.d(i2);
    }

    public synchronized void r(Context context) {
        lb4 lb4Var = (lb4) this.d.get(context);
        if (lb4Var != null) {
            lb4Var.a();
        }
    }

    synchronized Drawable s(Context context, j0 j0Var, int i2) {
        try {
            Drawable q = q(context, i2);
            if (q == null) {
                q = j0Var.a(i2);
            }
            if (q == null) {
                return null;
            }
            return u(context, i2, false, q);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void t(c cVar) {
        this.g = cVar;
    }

    boolean w(Context context, int i2, Drawable drawable) {
        c cVar = this.g;
        return cVar != null && cVar.c(context, i2, drawable);
    }
}
