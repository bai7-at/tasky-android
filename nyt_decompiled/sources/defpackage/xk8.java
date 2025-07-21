package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public class xk8 {
    final Bundle a;

    public static class a {
        final Bundle a = new Bundle();

        public xk8 a() {
            return new xk8(this.a);
        }

        public a b(String str, xk8 xk8Var) {
            Preconditions.checkNotNull(str);
            if (xk8Var != null) {
                this.a.putParcelable(str, xk8Var.a);
            }
            return this;
        }

        public a c(String str, String str2) {
            Preconditions.checkNotNull(str);
            if (str2 != null) {
                this.a.putString(str, str2);
            }
            return this;
        }

        public a d(String str) {
            Preconditions.checkNotNull(str);
            c(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            return this;
        }

        public a e(Uri uri) {
            Preconditions.checkNotNull(uri);
            c("url", uri.toString());
            return this;
        }
    }

    xk8(Bundle bundle) {
        this.a = bundle;
    }

    public final Bundle a() {
        return this.a;
    }
}
