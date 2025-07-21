package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class uqa extends f51 {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final List b = Arrays.asList(((String) pla.c().a(mpa.D9)).split(","));
    private final xqa c;
    private final f51 d;

    uqa(xqa xqaVar, f51 f51Var) {
        this.d = f51Var;
        this.c = xqaVar;
    }

    @Override // defpackage.f51
    public final void a(String str, Bundle bundle) {
        f51 f51Var = this.d;
        if (f51Var != null) {
            f51Var.a(str, bundle);
        }
    }

    @Override // defpackage.f51
    public final Bundle b(String str, Bundle bundle) {
        f51 f51Var = this.d;
        if (f51Var != null) {
            return f51Var.b(str, bundle);
        }
        return null;
    }

    @Override // defpackage.f51
    public final void c(int i, int i2, Bundle bundle) {
        f51 f51Var = this.d;
        if (f51Var != null) {
            f51Var.c(i, i2, bundle);
        }
    }

    @Override // defpackage.f51
    public final void d(Bundle bundle) {
        this.a.set(false);
        f51 f51Var = this.d;
        if (f51Var != null) {
            f51Var.d(bundle);
        }
    }

    @Override // defpackage.f51
    public final void e(int i, Bundle bundle) {
        List list;
        this.a.set(false);
        f51 f51Var = this.d;
        if (f51Var != null) {
            f51Var.e(i, bundle);
        }
        this.c.i(dyf.b().currentTimeMillis());
        if (this.c == null || (list = this.b) == null || !list.contains(String.valueOf(i))) {
            return;
        }
        this.c.f();
    }

    @Override // defpackage.f51
    public final void f(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.a.set(true);
                this.c.h(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e) {
            pzc.l("Message is not in JSON format: ", e);
        }
        f51 f51Var = this.d;
        if (f51Var != null) {
            f51Var.f(str, bundle);
        }
    }

    @Override // defpackage.f51
    public final void g(int i, Uri uri, boolean z, Bundle bundle) {
        f51 f51Var = this.d;
        if (f51Var != null) {
            f51Var.g(i, uri, z, bundle);
        }
    }

    public final Boolean h() {
        return Boolean.valueOf(this.a.get());
    }
}
