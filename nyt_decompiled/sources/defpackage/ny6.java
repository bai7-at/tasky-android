package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.f;
import com.bumptech.glide.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ny6 implements Handler.Callback {
    private static final b i = new a();
    private volatile e a;
    private final Handler d;
    private final b e;
    final Map b = new HashMap();
    final Map c = new HashMap();
    private final so f = new so();
    private final so g = new so();
    private final Bundle h = new Bundle();

    class a implements b {
        a() {
        }

        @Override // ny6.b
        public e a(com.bumptech.glide.a aVar, w34 w34Var, oy6 oy6Var, Context context) {
            return new e(aVar, w34Var, oy6Var, context);
        }
    }

    public interface b {
        e a(com.bumptech.glide.a aVar, w34 w34Var, oy6 oy6Var, Context context);
    }

    public ny6(b bVar) {
        this.e = bVar == null ? i : bVar;
        this.d = new Handler(Looper.getMainLooper(), this);
    }

    private static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static Activity b(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private e c(Context context, FragmentManager fragmentManager, Fragment fragment, boolean z) {
        my6 j = j(fragmentManager, fragment, z);
        e e = j.e();
        if (e != null) {
            return e;
        }
        e a2 = this.e.a(com.bumptech.glide.a.c(context), j.c(), j.f(), context);
        j.k(a2);
        return a2;
    }

    private e h(Context context) {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        this.a = this.e.a(com.bumptech.glide.a.c(context.getApplicationContext()), new gn(), new o02(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    private my6 j(FragmentManager fragmentManager, Fragment fragment, boolean z) {
        my6 my6Var = (my6) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (my6Var == null && (my6Var = (my6) this.b.get(fragmentManager)) == null) {
            my6Var = new my6();
            my6Var.j(fragment);
            if (z) {
                my6Var.c().d();
            }
            this.b.put(fragmentManager, my6Var);
            fragmentManager.beginTransaction().add(my6Var, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return my6Var;
    }

    private mc8 l(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, boolean z) {
        mc8 mc8Var = (mc8) fragmentManager.k0("com.bumptech.glide.manager");
        if (mc8Var == null && (mc8Var = (mc8) this.c.get(fragmentManager)) == null) {
            mc8Var = new mc8();
            mc8Var.l1(fragment);
            if (z) {
                mc8Var.d1().d();
            }
            this.c.put(fragmentManager, mc8Var);
            fragmentManager.p().e(mc8Var, "com.bumptech.glide.manager").i();
            this.d.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return mc8Var;
    }

    private static boolean m(Context context) {
        Activity b2 = b(context);
        return b2 == null || !b2.isFinishing();
    }

    private e n(Context context, androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, boolean z) {
        mc8 l = l(fragmentManager, fragment, z);
        e f1 = l.f1();
        if (f1 != null) {
            return f1;
        }
        e a2 = this.e.a(com.bumptech.glide.a.c(context), l.d1(), l.g1(), context);
        l.m1(a2);
        return a2;
    }

    public e d(Activity activity) {
        if (x19.o()) {
            return e(activity.getApplicationContext());
        }
        a(activity);
        return c(activity, activity.getFragmentManager(), null, m(activity));
    }

    public e e(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (x19.p() && !(context instanceof Application)) {
            if (context instanceof f) {
                return g((f) context);
            }
            if (context instanceof Activity) {
                return d((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return e(contextWrapper.getBaseContext());
                }
            }
        }
        return h(context);
    }

    public e f(androidx.fragment.app.Fragment fragment) {
        z06.e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (x19.o()) {
            return e(fragment.getContext().getApplicationContext());
        }
        return n(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    public e g(f fVar) {
        if (x19.o()) {
            return e(fVar.getApplicationContext());
        }
        a(fVar);
        return n(fVar, fVar.getSupportFragmentManager(), null, m(fVar));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Object remove;
        int i2 = message.what;
        boolean z = true;
        if (i2 == 1) {
            obj = (FragmentManager) message.obj;
            remove = this.b.remove(obj);
        } else if (i2 != 2) {
            remove = null;
            z = false;
            obj = null;
        } else {
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            remove = this.c.remove(obj);
        }
        if (z && remove == null && Log.isLoggable("RMRetriever", 5)) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
        }
        return z;
    }

    my6 i(Activity activity) {
        return j(activity.getFragmentManager(), null, m(activity));
    }

    mc8 k(Context context, androidx.fragment.app.FragmentManager fragmentManager) {
        return l(fragmentManager, null, m(context));
    }
}
