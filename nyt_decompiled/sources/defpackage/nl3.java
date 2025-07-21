package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.login.CustomTabLoginMethodHandler;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class nl3 extends z41 {
    public static final a c = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uri a(String str, Bundle bundle) {
            zq3.h(str, "action");
            if (zq3.c(str, CustomTabLoginMethodHandler.OAUTH_DIALOG)) {
                g29 g29Var = g29.a;
                return g29.g(yk7.j(), "oauth/authorize", bundle);
            }
            g29 g29Var2 = g29.a;
            return g29.g(yk7.j(), w92.v() + "/dialog/" + str, bundle);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl3(String str, Bundle bundle) {
        super(str, bundle);
        zq3.h(str, "action");
        b(c.a(str, bundle == null ? new Bundle() : bundle));
    }
}
