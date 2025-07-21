package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class qm {
    private final j4d a;

    public interface a extends x4f {
    }

    public qm(j4d j4dVar) {
        this.a = j4dVar;
    }

    public static qm k(Context context, String str, String str2, String str3, Bundle bundle) {
        return j4d.v(context, str, str2, str3, bundle).s();
    }

    public void a(String str) {
        this.a.H(str);
    }

    public void b(String str, String str2, Bundle bundle) {
        this.a.I(str, str2, bundle);
    }

    public void c(String str) {
        this.a.J(str);
    }

    public long d() {
        return this.a.q();
    }

    public String e() {
        return this.a.x();
    }

    public String f() {
        return this.a.y();
    }

    public List g(String str, String str2) {
        return this.a.C(str, str2);
    }

    public String h() {
        return this.a.z();
    }

    public String i() {
        return this.a.A();
    }

    public String j() {
        return this.a.B();
    }

    public int l(String str) {
        return this.a.p(str);
    }

    public Map m(String str, String str2, boolean z) {
        return this.a.D(str, str2, z);
    }

    public void n(String str, String str2, Bundle bundle) {
        this.a.L(str, str2, bundle);
    }

    public void o(Bundle bundle) {
        this.a.r(bundle, false);
    }

    public Bundle p(Bundle bundle) {
        return this.a.r(bundle, true);
    }

    public void q(a aVar) {
        this.a.b(aVar);
    }

    public void r(Bundle bundle) {
        this.a.c(bundle);
    }

    public void s(Bundle bundle) {
        this.a.d(bundle);
    }

    public void t(Activity activity, String str, String str2) {
        this.a.e(activity, str, str2);
    }

    public void u(String str, String str2, Object obj) {
        this.a.h(str, str2, obj, true);
    }
}
