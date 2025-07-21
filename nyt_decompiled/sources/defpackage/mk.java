package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import defpackage.f4;
import defpackage.pm;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class mk {
    static pm.a a = new pm.a(new pm.b());
    private static int b = -100;
    private static m74 c = null;
    private static m74 d = null;
    private static Boolean e = null;
    private static boolean f = false;
    private static final vo g = new vo();
    private static final Object h = new Object();
    private static final Object i = new Object();

    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    mk() {
    }

    static void H(mk mkVar) {
        synchronized (h) {
            I(mkVar);
        }
    }

    private static void I(mk mkVar) {
        synchronized (h) {
            try {
                Iterator it2 = g.iterator();
                while (it2.hasNext()) {
                    mk mkVar2 = (mk) ((WeakReference) it2.next()).get();
                    if (mkVar2 == mkVar || mkVar2 == null) {
                        it2.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void N(int i2) {
        if (i2 != -1 && i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (b != i2) {
            b = i2;
            g();
        }
    }

    static void T(final Context context) {
        if (x(context)) {
            if (wd0.c()) {
                if (f) {
                    return;
                }
                a.execute(new Runnable() { // from class: lk
                    @Override // java.lang.Runnable
                    public final void run() {
                        mk.y(context);
                    }
                });
                return;
            }
            synchronized (i) {
                try {
                    m74 m74Var = c;
                    if (m74Var == null) {
                        if (d == null) {
                            d = m74.b(pm.b(context));
                        }
                        if (d.e()) {
                        } else {
                            c = d;
                        }
                    } else if (!m74Var.equals(d)) {
                        m74 m74Var2 = c;
                        d = m74Var2;
                        pm.a(context, m74Var2.g());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static void d(mk mkVar) {
        synchronized (h) {
            I(mkVar);
            g.add(new WeakReference(mkVar));
        }
    }

    private static void g() {
        synchronized (h) {
            try {
                Iterator it2 = g.iterator();
                while (it2.hasNext()) {
                    mk mkVar = (mk) ((WeakReference) it2.next()).get();
                    if (mkVar != null) {
                        mkVar.f();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static mk j(Activity activity, kk kkVar) {
        return new nk(activity, kkVar);
    }

    public static mk k(Dialog dialog, kk kkVar) {
        return new nk(dialog, kkVar);
    }

    public static m74 m() {
        if (wd0.c()) {
            Object r = r();
            if (r != null) {
                return m74.i(b.a(r));
            }
        } else {
            m74 m74Var = c;
            if (m74Var != null) {
                return m74Var;
            }
        }
        return m74.d();
    }

    public static int o() {
        return b;
    }

    static Object r() {
        Context n;
        Iterator it2 = g.iterator();
        while (it2.hasNext()) {
            mk mkVar = (mk) ((WeakReference) it2.next()).get();
            if (mkVar != null && (n = mkVar.n()) != null) {
                return n.getSystemService("locale");
            }
        }
        return null;
    }

    static m74 t() {
        return c;
    }

    static boolean x(Context context) {
        if (e == null) {
            try {
                Bundle bundle = nm.a(context).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(Context context) {
        pm.c(context);
        f = true;
    }

    public abstract void A(Bundle bundle);

    public abstract void B();

    public abstract void C(Bundle bundle);

    public abstract void D();

    public abstract void E(Bundle bundle);

    public abstract void F();

    public abstract void G();

    public abstract boolean J(int i2);

    public abstract void K(int i2);

    public abstract void L(View view);

    public abstract void M(View view, ViewGroup.LayoutParams layoutParams);

    public void O(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void P(Toolbar toolbar);

    public abstract void Q(int i2);

    public abstract void R(CharSequence charSequence);

    public abstract f4 S(f4.a aVar);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean f();

    public void h(Context context) {
    }

    public Context i(Context context) {
        h(context);
        return context;
    }

    public abstract View l(int i2);

    public abstract Context n();

    public abstract y3 p();

    public abstract int q();

    public abstract MenuInflater s();

    public abstract x3 u();

    public abstract void v();

    public abstract void w();

    public abstract void z(Configuration configuration);
}
