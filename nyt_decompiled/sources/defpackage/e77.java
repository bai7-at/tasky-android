package defpackage;

import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f;
import androidx.fragment.app.r;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;

/* loaded from: classes4.dex */
public interface e77 {

    public static final class a {
        public static com.nytimes.android.subauth.credentialmanager.a a(e77 e77Var, f fVar, e77 e77Var2, ss2 ss2Var) {
            zq3.h(fVar, "activity");
            zq3.h(e77Var2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            zq3.h(ss2Var, "ssoFragmentBuilder");
            com.nytimes.android.subauth.credentialmanager.a aVar = (com.nytimes.android.subauth.credentialmanager.a) ss2Var.invoke(e77Var2);
            try {
                r p = fVar.getSupportFragmentManager().p();
                zq3.g(p, "beginTransaction(...)");
                p.e(aVar, "SSOFragment").j();
            } catch (IllegalStateException e) {
                ul8.a.z("SUBAUTH").v(e, "Exception while trying to attach SSOFragment", new Object[0]);
            }
            return aVar;
        }

        public static void b(e77 e77Var, com.nytimes.android.subauth.credentialmanager.a aVar) {
            FragmentManager supportFragmentManager;
            r p;
            r p2;
            zq3.h(aVar, "fragment");
            try {
                f activity = aVar.getActivity();
                if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (p = supportFragmentManager.p()) == null || (p2 = p.p(aVar)) == null) {
                    return;
                }
                p2.j();
            } catch (IllegalStateException e) {
                ul8.a.z("SUBAUTH").t("Ignored exception trying to remove SSO Fragment: " + e.getMessage(), new Object[0]);
            }
        }
    }

    void e(com.nytimes.android.subauth.credentialmanager.a aVar, int i, int i2, Intent intent);
}
