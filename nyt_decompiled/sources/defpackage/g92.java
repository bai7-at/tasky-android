package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.util.Log;
import androidx.activity.result.ActivityResultRegistry;
import com.facebook.FacebookException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class g92 {
    public static final a e = new a(null);
    public static final Object f = new Object();
    private final Activity a;
    private List b;
    private int c;
    private zg0 d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract class b {
        private Object a;
        final /* synthetic */ g92 b;

        public b(g92 g92Var) {
            zq3.h(g92Var, "this$0");
            this.b = g92Var;
            this.a = g92.f;
        }

        public abstract boolean a(Object obj, boolean z);

        public abstract ik b(Object obj);

        public abstract Object c();
    }

    protected g92(Activity activity, int i) {
        zq3.h(activity, "activity");
        this.a = activity;
        this.c = i;
        this.d = null;
    }

    private final List a() {
        if (this.b == null) {
            this.b = e();
        }
        List list = this.b;
        if (list != null) {
            return list;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase.ModeHandler<CONTENT of com.facebook.internal.FacebookDialogBase, RESULT of com.facebook.internal.FacebookDialogBase>>");
    }

    private final ik b(Object obj, Object obj2) {
        ik ikVar;
        boolean z = obj2 == f;
        Iterator it2 = a().iterator();
        while (true) {
            if (!it2.hasNext()) {
                ikVar = null;
                break;
            }
            b bVar = (b) it2.next();
            if (!z) {
                g29 g29Var = g29.a;
                if (!g29.e(bVar.c(), obj2)) {
                    continue;
                }
            }
            if (bVar.a(obj, true)) {
                try {
                    ikVar = bVar.b(obj);
                    break;
                } catch (FacebookException e2) {
                    ik c = c();
                    dq1 dq1Var = dq1.a;
                    dq1.j(c, e2);
                    ikVar = c;
                }
            }
        }
        if (ikVar != null) {
            return ikVar;
        }
        ik c2 = c();
        dq1.g(c2);
        return c2;
    }

    protected abstract ik c();

    /* JADX INFO: Access modifiers changed from: protected */
    public final Activity d() {
        Activity activity = this.a;
        if (activity == null) {
            return null;
        }
        return activity;
    }

    protected abstract List e();

    public final int f() {
        return this.c;
    }

    public void g(Object obj) {
        h(obj, f);
    }

    protected void h(Object obj, Object obj2) {
        zq3.h(obj2, "mode");
        ik b2 = b(obj, obj2);
        if (b2 == null) {
            Log.e("FacebookDialog", "No code path should ever result in a null appCall");
            if (w92.C()) {
                throw new IllegalStateException("No code path should ever result in a null appCall");
            }
        } else {
            if (!(d() instanceof l5)) {
                Activity activity = this.a;
                if (activity != null) {
                    dq1.e(b2, activity);
                    return;
                }
                return;
            }
            ComponentCallbacks2 d = d();
            if (d == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
            }
            dq1 dq1Var = dq1.a;
            ActivityResultRegistry activityResultRegistry = ((l5) d).getActivityResultRegistry();
            zq3.g(activityResultRegistry, "registryOwner.activityResultRegistry");
            dq1.f(b2, activityResultRegistry, this.d);
            b2.f();
        }
    }
}
