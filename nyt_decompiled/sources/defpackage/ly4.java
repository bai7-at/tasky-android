package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.b0;
import com.google.accompanist.permissions.PermissionsUtilKt;
import defpackage.gr5;

/* loaded from: classes2.dex */
public final class ly4 implements fr5 {
    private final String a;
    private final Context b;
    private final Activity c;
    private final sy4 d;
    private j5 e;

    public ly4(String str, Context context, Activity activity) {
        zq3.h(str, "permission");
        zq3.h(context, "context");
        zq3.h(activity, "activity");
        this.a = str;
        this.b = context;
        this.c = activity;
        this.d = b0.e(b(), null, 2, null);
    }

    private final gr5 b() {
        return PermissionsUtilKt.b(this.b, a()) ? gr5.b.a : new gr5.a(PermissionsUtilKt.e(this.c, a()));
    }

    public String a() {
        return this.a;
    }

    public final void c() {
        e(b());
    }

    public final void d(j5 j5Var) {
        this.e = j5Var;
    }

    public void e(gr5 gr5Var) {
        zq3.h(gr5Var, "<set-?>");
        this.d.setValue(gr5Var);
    }

    @Override // defpackage.fr5
    public gr5 getStatus() {
        return (gr5) this.d.getValue();
    }
}
