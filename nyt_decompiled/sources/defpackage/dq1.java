package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import androidx.activity.result.ActivityResultRegistry;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.internal.CallbackManagerImpl;
import defpackage.c25;
import defpackage.rd2;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes2.dex */
public final class dq1 {
    public static final dq1 a = new dq1();

    public interface a {
        Bundle a();

        Bundle getParameters();
    }

    public static final class b extends e5 {
        b() {
        }

        @Override // defpackage.e5
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, Intent intent) {
            zq3.h(context, "context");
            zq3.h(intent, "input");
            return intent;
        }

        @Override // defpackage.e5
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Pair c(int i, Intent intent) {
            Pair create = Pair.create(Integer.valueOf(i), intent);
            zq3.g(create, "create(resultCode, intent)");
            return create;
        }
    }

    private dq1() {
    }

    public static final boolean b(zp1 zp1Var) {
        zq3.h(zp1Var, "feature");
        return c(zp1Var).d() != -1;
    }

    public static final c25.f c(zp1 zp1Var) {
        zq3.h(zp1Var, "feature");
        String m = w92.m();
        String action = zp1Var.getAction();
        return c25.u(action, a.d(m, action, zp1Var));
    }

    private final int[] d(String str, String str2, zp1 zp1Var) {
        rd2.b a2 = rd2.t.a(str, str2, zp1Var.name());
        int[] c = a2 == null ? null : a2.c();
        return c == null ? new int[]{zp1Var.getMinVersion()} : c;
    }

    public static final void e(ik ikVar, Activity activity) {
        zq3.h(ikVar, "appCall");
        zq3.h(activity, "activity");
        activity.startActivityForResult(ikVar.e(), ikVar.d());
        ikVar.f();
    }

    public static final void f(ik ikVar, ActivityResultRegistry activityResultRegistry, zg0 zg0Var) {
        zq3.h(ikVar, "appCall");
        zq3.h(activityResultRegistry, "registry");
        Intent e = ikVar.e();
        if (e == null) {
            return;
        }
        l(activityResultRegistry, zg0Var, e, ikVar.d());
        ikVar.f();
    }

    public static final void g(ik ikVar) {
        zq3.h(ikVar, "appCall");
        j(ikVar, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
    }

    public static final void h(ik ikVar, FacebookException facebookException) {
        zq3.h(ikVar, "appCall");
        if (facebookException == null) {
            return;
        }
        v29 v29Var = v29.a;
        v29.f(w92.l());
        Intent intent = new Intent();
        intent.setClass(w92.l(), FacebookActivity.class);
        intent.setAction("PassThrough");
        c25 c25Var = c25.a;
        c25.D(intent, ikVar.c().toString(), null, c25.x(), c25.i(facebookException));
        ikVar.g(intent);
    }

    public static final void i(ik ikVar, a aVar, zp1 zp1Var) {
        zq3.h(ikVar, "appCall");
        zq3.h(aVar, "parameterProvider");
        zq3.h(zp1Var, "feature");
        Context l = w92.l();
        String action = zp1Var.getAction();
        c25.f c = c(zp1Var);
        int d = c.d();
        if (d == -1) {
            throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
        }
        Bundle parameters = c25.C(d) ? aVar.getParameters() : aVar.a();
        if (parameters == null) {
            parameters = new Bundle();
        }
        Intent l2 = c25.l(l, ikVar.c().toString(), action, c, parameters);
        if (l2 == null) {
            throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        ikVar.g(l2);
    }

    public static final void j(ik ikVar, FacebookException facebookException) {
        zq3.h(ikVar, "appCall");
        h(ikVar, facebookException);
    }

    public static final void k(ik ikVar, String str, Bundle bundle) {
        zq3.h(ikVar, "appCall");
        v29 v29Var = v29.a;
        v29.f(w92.l());
        v29.h(w92.l());
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        c25 c25Var = c25.a;
        c25.D(intent, ikVar.c().toString(), str, c25.x(), bundle2);
        intent.setClass(w92.l(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        ikVar.g(intent);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, j5] */
    public static final void l(ActivityResultRegistry activityResultRegistry, final zg0 zg0Var, Intent intent, final int i) {
        zq3.h(activityResultRegistry, "registry");
        zq3.h(intent, "intent");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? i2 = activityResultRegistry.i(zq3.q("facebook-dialog-request-", Integer.valueOf(i)), new b(), new d5() { // from class: cq1
            @Override // defpackage.d5
            public final void a(Object obj) {
                dq1.m(zg0.this, i, ref$ObjectRef, (Pair) obj);
            }
        });
        ref$ObjectRef.element = i2;
        if (i2 == 0) {
            return;
        }
        i2.a(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(zg0 zg0Var, int i, Ref$ObjectRef ref$ObjectRef, Pair pair) {
        zq3.h(ref$ObjectRef, "$launcher");
        if (zg0Var == null) {
            zg0Var = new CallbackManagerImpl();
        }
        Object obj = pair.first;
        zq3.g(obj, "result.first");
        zg0Var.a(i, ((Number) obj).intValue(), (Intent) pair.second);
        j5 j5Var = (j5) ref$ObjectRef.element;
        if (j5Var == null) {
            return;
        }
        synchronized (j5Var) {
            j5Var.c();
            ref$ObjectRef.element = null;
            ww8 ww8Var = ww8.a;
        }
    }
}
