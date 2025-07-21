package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import defpackage.a22;
import defpackage.d44;
import defpackage.f16;
import defpackage.hx2;
import defpackage.o99;
import defpackage.yx0;
import defpackage.zb9;

/* loaded from: classes4.dex */
public final class ViewComponentManager implements hx2 {
    private volatile Object a;
    private final Object b = new Object();
    private final boolean c;
    private final View d;

    public interface a {
        o99 O();
    }

    public interface b {
        zb9 i();
    }

    public ViewComponentManager(View view, boolean z) {
        this.d = view;
        this.c = z;
    }

    private Object a() {
        hx2 b2 = b(false);
        return this.c ? ((b) a22.a(b2, b.class)).i().view(this.d).build() : ((a) a22.a(b2, a.class)).O().view(this.d).build();
    }

    private hx2 b(boolean z) {
        if (this.c) {
            Context c = c(FragmentContextWrapper.class, z);
            if (c instanceof FragmentContextWrapper) {
                return (hx2) ((FragmentContextWrapper) c).d();
            }
            if (z) {
                return null;
            }
            f16.d(!(r5 instanceof hx2), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.d.getClass(), c(hx2.class, z).getClass().getName());
        } else {
            Object c2 = c(hx2.class, z);
            if (c2 instanceof hx2) {
                return (hx2) c2;
            }
            if (z) {
                return null;
            }
        }
        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", this.d.getClass()));
    }

    private Context c(Class cls, boolean z) {
        Context d = d(this.d.getContext(), cls);
        if (d != yx0.a(d.getApplicationContext())) {
            return d;
        }
        f16.d(z, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.d.getClass());
        return null;
    }

    private static Context d(Context context, Class cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // defpackage.hx2
    public Object generatedComponent() {
        if (this.a == null) {
            synchronized (this.b) {
                try {
                    if (this.a == null) {
                        this.a = a();
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    public static final class FragmentContextWrapper extends ContextWrapper {
        private Fragment a;
        private LayoutInflater b;
        private LayoutInflater c;
        private final g d;

        FragmentContextWrapper(Context context, Fragment fragment) {
            super((Context) f16.b(context));
            g gVar = new g() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.1
                @Override // androidx.lifecycle.g
                public void h(d44 d44Var, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        FragmentContextWrapper.this.a = null;
                        FragmentContextWrapper.this.b = null;
                        FragmentContextWrapper.this.c = null;
                    }
                }
            };
            this.d = gVar;
            this.b = null;
            Fragment fragment2 = (Fragment) f16.b(fragment);
            this.a = fragment2;
            fragment2.getLifecycle().a(gVar);
        }

        Fragment d() {
            f16.c(this.a, "The fragment has already been destroyed.");
            return this.a;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.c == null) {
                if (this.b == null) {
                    this.b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.c = this.b.cloneInContext(this);
            }
            return this.c;
        }

        FragmentContextWrapper(LayoutInflater layoutInflater, Fragment fragment) {
            super((Context) f16.b(((LayoutInflater) f16.b(layoutInflater)).getContext()));
            g gVar = new g() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.1
                @Override // androidx.lifecycle.g
                public void h(d44 d44Var, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        FragmentContextWrapper.this.a = null;
                        FragmentContextWrapper.this.b = null;
                        FragmentContextWrapper.this.c = null;
                    }
                }
            };
            this.d = gVar;
            this.b = layoutInflater;
            Fragment fragment2 = (Fragment) f16.b(fragment);
            this.a = fragment2;
            fragment2.getLifecycle().a(gVar);
        }
    }
}
