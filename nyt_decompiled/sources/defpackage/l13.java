package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import defpackage.i77;
import defpackage.qv7;

/* loaded from: classes4.dex */
public abstract class l13 {
    public static final qv7 a(Credential credential) {
        zq3.h(credential, "<this>");
        i77 i77Var = null;
        if (credential.t0() == null) {
            if (credential.u1() == null) {
                ul8.a.z("SUBAUTH").d("Smart Lock Result failure. Invalid Credentials Returned.", new Object[0]);
                return new qv7.a("Invalid credentials returned", null, 2, null);
            }
            ul8.a.z("SUBAUTH").a("Smart Lock Result Success Credentials w/ Password", new Object[0]);
            String K0 = credential.K0();
            zq3.g(K0, "getId(...)");
            String u1 = credential.u1();
            zq3.e(u1);
            return new qv7.d(K0, u1);
        }
        String t0 = credential.t0();
        if (t0 != null) {
            int hashCode = t0.hashCode();
            if (hashCode != -376862683) {
                if (hashCode == 1721158175 && t0.equals("https://www.facebook.com")) {
                    i77Var = i77.a.b;
                }
            } else if (t0.equals("https://accounts.google.com")) {
                i77Var = i77.b.b;
            }
        }
        ul8.a.z("SUBAUTH").a("Smart Lock Result Success Account Only: " + i77Var, new Object[0]);
        String K02 = credential.K0();
        zq3.g(K02, "getId(...)");
        return new qv7.c(K02, i77Var);
    }
}
