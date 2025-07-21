package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import defpackage.a22;
import defpackage.f16;
import defpackage.hx2;
import defpackage.xp2;

/* loaded from: classes4.dex */
public class a implements hx2 {
    private volatile Object a;
    private final Object b = new Object();
    private final Fragment c;

    /* renamed from: dagger.hilt.android.internal.managers.a$a, reason: collision with other inner class name */
    public interface InterfaceC0476a {
        xp2 y0();
    }

    public a(Fragment fragment) {
        this.c = fragment;
    }

    private Object a() {
        f16.c(this.c.getHost(), "Hilt Fragments must be attached before creating the component.");
        f16.d(this.c.getHost() instanceof hx2, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.c.getHost().getClass());
        e(this.c);
        return ((InterfaceC0476a) a22.a(this.c.getHost(), InterfaceC0476a.class)).y0().a(this.c).build();
    }

    public static ContextWrapper b(Context context, Fragment fragment) {
        return new ViewComponentManager.FragmentContextWrapper(context, fragment);
    }

    public static ContextWrapper c(LayoutInflater layoutInflater, Fragment fragment) {
        return new ViewComponentManager.FragmentContextWrapper(layoutInflater, fragment);
    }

    public static final Context d(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    protected void e(Fragment fragment) {
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
}
