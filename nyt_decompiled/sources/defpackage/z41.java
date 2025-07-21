package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import defpackage.h51;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public class z41 {
    public static final a b = new a(null);
    private Uri a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Uri a(String str, Bundle bundle) {
            zq3.h(str, "action");
            g29 g29Var = g29.a;
            return g29.g(yk7.b(), w92.v() + "/dialog/" + str, bundle);
        }

        private a() {
        }
    }

    public z41(String str, Bundle bundle) {
        zq3.h(str, "action");
        this.a = b.a(str, bundle == null ? new Bundle() : bundle);
    }

    public final boolean a(Activity activity, String str) {
        if (c11.d(this)) {
            return false;
        }
        try {
            zq3.h(activity, "activity");
            h51 a2 = new h51.b(c51.b.a()).a();
            a2.a.setPackage(str);
            try {
                a2.a(activity, this.a);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }

    protected final void b(Uri uri) {
        if (c11.d(this)) {
            return;
        }
        try {
            zq3.h(uri, "<set-?>");
            this.a = uri;
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }
}
