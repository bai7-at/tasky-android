package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.xk8;

/* loaded from: classes2.dex */
public final class u3 extends xk8 {

    public static final class a extends xk8.a {
        public a(String str) {
            Preconditions.checkNotNull(str);
            super.c(TransferTable.COLUMN_TYPE, str);
        }

        @Override // xk8.a
        public final /* bridge */ /* synthetic */ xk8.a c(String str, String str2) {
            g(str, str2);
            return this;
        }

        @Override // xk8.a
        public final /* bridge */ /* synthetic */ xk8.a d(String str) {
            i(str);
            return this;
        }

        @Override // xk8.a
        public final /* bridge */ /* synthetic */ xk8.a e(Uri uri) {
            k(uri);
            return this;
        }

        @Override // xk8.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public u3 a() {
            Preconditions.checkNotNull(this.a.get("object"), "setObject is required before calling build().");
            Preconditions.checkNotNull(this.a.get(TransferTable.COLUMN_TYPE), "setType is required before calling build().");
            Bundle bundle = (Bundle) this.a.getParcelable("object");
            if (bundle != null) {
                Preconditions.checkNotNull(bundle.get(AuthenticationTokenClaims.JSON_KEY_NAME), "Must call setObject() with a valid name. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
                Preconditions.checkNotNull(bundle.get("url"), "Must call setObject() with a valid app URI. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
            }
            return new u3(this.a, null);
        }

        public a g(String str, String str2) {
            super.c(str, str2);
            return this;
        }

        public a h(String str) {
            Preconditions.checkNotNull(str);
            super.c("actionStatus", str);
            return this;
        }

        public a i(String str) {
            super.c(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            return this;
        }

        public a j(xk8 xk8Var) {
            Preconditions.checkNotNull(xk8Var);
            super.b("object", xk8Var);
            return this;
        }

        public a k(Uri uri) {
            if (uri != null) {
                super.c("url", uri.toString());
            }
            return this;
        }
    }

    /* synthetic */ u3(Bundle bundle, lp9 lp9Var) {
        super(bundle);
    }
}
