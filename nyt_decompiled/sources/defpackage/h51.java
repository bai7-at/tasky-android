package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import defpackage.a51;
import java.util.ArrayList;
import zendesk.core.Constants;

/* loaded from: classes.dex */
public final class h51 {
    public final Intent a;
    public final Bundle b;

    private static class a {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    h51(Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.a.setData(uri);
        mx0.m(context, this.a, this.b);
    }

    public static final class b {
        private ArrayList c;
        private Bundle d;
        private ArrayList e;
        private SparseArray f;
        private Bundle g;
        private final Intent a = new Intent("android.intent.action.VIEW");
        private final a51.a b = new a51.a();
        private int h = 0;
        private boolean i = true;

        public b() {
        }

        private void b() {
            String a = a.a();
            if (TextUtils.isEmpty(a)) {
                return;
            }
            Bundle bundleExtra = this.a.hasExtra("com.android.browser.headers") ? this.a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey(Constants.ACCEPT_LANGUAGE)) {
                return;
            }
            bundleExtra.putString(Constants.ACCEPT_LANGUAGE, a);
            this.a.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void e(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            je0.b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.a.putExtras(bundle);
        }

        public h51 a() {
            if (!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
                e(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.c;
            if (arrayList != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.e;
            if (arrayList2 != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.i);
            this.a.putExtras(this.b.a().a());
            Bundle bundle = this.g;
            if (bundle != null) {
                this.a.putExtras(bundle);
            }
            if (this.f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f);
                this.a.putExtras(bundle2);
            }
            this.a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.h);
            b();
            return new h51(this.a, this.d);
        }

        public b c(Context context, int i, int i2) {
            this.a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", c5.a(context, i, i2).c());
            return this;
        }

        public b d(j51 j51Var) {
            this.a.setPackage(j51Var.d().getPackageName());
            e(j51Var.c(), j51Var.e());
            return this;
        }

        public b f(int i) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.h = i;
            if (i == 1) {
                this.a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            } else if (i == 2) {
                this.a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            } else {
                this.a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
            return this;
        }

        public b g(boolean z) {
            this.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z ? 1 : 0);
            return this;
        }

        public b h(Context context, int i, int i2) {
            this.d = c5.a(context, i, i2).c();
            return this;
        }

        public b i(boolean z) {
            this.a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", z);
            return this;
        }

        public b(j51 j51Var) {
            if (j51Var != null) {
                d(j51Var);
            }
        }
    }
}
