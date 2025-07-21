package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class pz5 {
    private static final int a = fh6.pooling_container_listener_holder_tag;
    private static final int b = fh6.is_pooling_container_tag;

    public static final void a(View view, qz5 qz5Var) {
        zq3.h(view, "<this>");
        zq3.h(qz5Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        d(view).a(qz5Var);
    }

    public static final void b(View view) {
        zq3.h(view, "<this>");
        Iterator it2 = ViewKt.a(view).iterator();
        while (it2.hasNext()) {
            d((View) it2.next()).b();
        }
    }

    public static final void c(ViewGroup viewGroup) {
        zq3.h(viewGroup, "<this>");
        Iterator it2 = ViewGroupKt.b(viewGroup).iterator();
        while (it2.hasNext()) {
            d((View) it2.next()).b();
        }
    }

    private static final rz5 d(View view) {
        int i = a;
        rz5 rz5Var = (rz5) view.getTag(i);
        if (rz5Var != null) {
            return rz5Var;
        }
        rz5 rz5Var2 = new rz5();
        view.setTag(i, rz5Var2);
        return rz5Var2;
    }

    public static final boolean e(View view) {
        zq3.h(view, "<this>");
        Object tag = view.getTag(b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean f(View view) {
        zq3.h(view, "<this>");
        for (Object obj : ViewKt.b(view)) {
            if ((obj instanceof View) && e((View) obj)) {
                return true;
            }
        }
        return false;
    }

    public static final void g(View view, qz5 qz5Var) {
        zq3.h(view, "<this>");
        zq3.h(qz5Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        d(view).c(qz5Var);
    }

    public static final void h(View view, boolean z) {
        zq3.h(view, "<this>");
        view.setTag(b, Boolean.valueOf(z));
    }
}
