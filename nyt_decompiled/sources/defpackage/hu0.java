package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class hu0 {

    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        static void b(Configuration configuration, m74 m74Var) {
            configuration.setLocales((LocaleList) m74Var.h());
        }
    }

    public static m74 a(Configuration configuration) {
        return m74.i(a.a(configuration));
    }
}
