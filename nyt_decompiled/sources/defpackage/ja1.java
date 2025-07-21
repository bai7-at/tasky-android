package defpackage;

import android.content.Context;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.datatransport.cct.a;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public class ja1 {
    private static final a21 c = new a21();
    private static final String d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    private static final String e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final br8 f = new br8() { // from class: ia1
        @Override // defpackage.br8
        public final Object apply(Object obj) {
            byte[] d2;
            d2 = ja1.d((s11) obj);
            return d2;
        }
    };
    private final zx6 a;
    private final br8 b;

    ja1(zx6 zx6Var, br8 br8Var) {
        this.a = zx6Var;
        this.b = br8Var;
    }

    public static ja1 b(Context context, pn7 pn7Var, qe5 qe5Var) {
        hs8.f(context);
        bs8 g = hs8.c().g(new a(d, e));
        f12 b = f12.b("json");
        br8 br8Var = f;
        return new ja1(new zx6(g.a("FIREBASE_CRASHLYTICS_REPORT", s11.class, b, br8Var), pn7Var.b(), qe5Var), br8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] d(s11 s11Var) {
        return c.E(s11Var).getBytes(Charset.forName(Constants.DEFAULT_ENCODING));
    }

    private static String e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public og8 c(g21 g21Var, boolean z) {
        return this.a.h(g21Var, z).a();
    }
}
