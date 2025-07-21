package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class v29 {
    public static final v29 a = new v29();
    private static final String b;

    static {
        String name = v29.class.getName();
        zq3.g(name, "Validate::class.java.name");
        b = name;
    }

    private v29() {
    }

    public static final void a(Collection collection, String str) {
        zq3.h(collection, "container");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (it2.next() == null) {
                throw new NullPointerException("Container '" + str + "' cannot contain null values");
            }
        }
    }

    public static final String b() {
        String m = w92.m();
        if (m != null) {
            return m;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.");
    }

    public static final String c() {
        String r = w92.r();
        if (r != null) {
            return r;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml");
    }

    public static final void d(Context context) {
        zq3.h(context, "context");
        String b2 = b();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            String q = zq3.q("com.facebook.app.FacebookContentProvider", b2);
            if (packageManager.resolveContentProvider(q, 0) != null) {
                return;
            }
            z38 z38Var = z38.a;
            String format = String.format("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", Arrays.copyOf(new Object[]{q}, 1));
            zq3.g(format, "java.lang.String.format(format, *args)");
            throw new IllegalStateException(format.toString());
        }
    }

    public static final boolean e(Context context, String str) {
        List<ResolveInfo> list;
        zq3.h(context, "context");
        zq3.h(str, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        Iterator<ResolveInfo> it2 = list.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            ActivityInfo activityInfo = it2.next().activityInfo;
            if (!zq3.c(activityInfo.name, "com.facebook.CustomTabActivity") || !zq3.c(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    public static final void f(Context context) {
        zq3.h(context, "context");
        g(context, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(android.content.Context r3, boolean r4) {
        /*
            java.lang.String r0 = "context"
            defpackage.zq3.h(r3, r0)
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            if (r0 == 0) goto L18
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = "com.facebook.FacebookActivity"
            r1.<init>(r3, r2)
            r3 = 1
            android.content.pm.ActivityInfo r3 = r0.getActivityInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            goto L19
        L18:
            r3 = 0
        L19:
            if (r3 != 0) goto L2b
            java.lang.String r3 = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info."
            if (r4 != 0) goto L25
            java.lang.String r4 = defpackage.v29.b
            android.util.Log.w(r4, r3)
            goto L2b
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r3)
            throw r4
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v29.g(android.content.Context, boolean):void");
    }

    public static final void h(Context context) {
        zq3.h(context, "context");
        i(context, true);
    }

    public static final void i(Context context, boolean z) {
        zq3.h(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (z) {
                throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
            }
            Log.w(b, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    public static final void j(String str, String str2) {
        zq3.h(str, "arg");
        zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
        if (str.length() > 0) {
            return;
        }
        throw new IllegalArgumentException(("Argument '" + str2 + "' cannot be empty").toString());
    }

    public static final void k(Collection collection, String str) {
        zq3.h(collection, "container");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        if (collection.isEmpty()) {
            throw new IllegalArgumentException(("Container '" + str + "' cannot be empty").toString());
        }
    }

    public static final void l(Collection collection, String str) {
        zq3.h(collection, "container");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        a(collection, str);
        k(collection, str);
    }

    public static final void m(Object obj, String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Argument '" + str + "' cannot be null");
    }

    public static final String n(String str, String str2) {
        zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
        if (str != null && str.length() > 0) {
            return str;
        }
        throw new IllegalArgumentException(("Argument '" + str2 + "' cannot be null or empty").toString());
    }

    public static final void o() {
        if (!w92.E()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
