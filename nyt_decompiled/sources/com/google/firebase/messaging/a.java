package com.google.firebase.messaging;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import defpackage.l95;
import defpackage.mx0;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public abstract class a {
    private static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    public static class C0220a {
        public final l95.e a;
        public final String b;
        public final int c;

        C0220a(l95.e eVar, String str, int i) {
            this.a = eVar;
            this.b = str;
            this.c = i;
        }
    }

    private static PendingIntent a(Context context, p pVar, String str, PackageManager packageManager) {
        Intent g = g(str, pVar, packageManager);
        if (g == null) {
            return null;
        }
        g.addFlags(67108864);
        g.putExtras(pVar.y());
        if (r(pVar)) {
            g.putExtra("gcm.n.analytics_data", pVar.x());
        }
        return PendingIntent.getActivity(context, h(), g, m(1073741824));
    }

    private static PendingIntent b(Context context, Context context2, p pVar) {
        if (r(pVar)) {
            return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(pVar.x()));
        }
        return null;
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, h(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), m(1073741824));
    }

    public static C0220a d(Context context, Context context2, p pVar, String str, Bundle bundle) {
        return e(context, context2, pVar, str, bundle, context2.getPackageName(), context2.getResources(), context2.getPackageManager());
    }

    public static C0220a e(Context context, Context context2, p pVar, String str, Bundle bundle, String str2, Resources resources, PackageManager packageManager) {
        l95.e eVar = new l95.e(context2, str);
        String n = pVar.n(resources, str2, "gcm.n.title");
        if (!TextUtils.isEmpty(n)) {
            eVar.m(n);
        }
        String n2 = pVar.n(resources, str2, "gcm.n.body");
        if (!TextUtils.isEmpty(n2)) {
            eVar.l(n2);
            eVar.A(new l95.c().i(n2));
        }
        eVar.y(n(packageManager, resources, str2, pVar.p("gcm.n.icon"), bundle));
        Uri o = o(str2, pVar, resources);
        if (o != null) {
            eVar.z(o);
        }
        eVar.k(a(context, pVar, str2, packageManager));
        PendingIntent b = b(context, context2, pVar);
        if (b != null) {
            eVar.o(b);
        }
        Integer i = i(context2, pVar.p("gcm.n.color"), bundle);
        if (i != null) {
            eVar.i(i.intValue());
        }
        eVar.f(!pVar.a("gcm.n.sticky"));
        eVar.t(pVar.a("gcm.n.local_only"));
        String p = pVar.p("gcm.n.ticker");
        if (p != null) {
            eVar.B(p);
        }
        Integer m = pVar.m();
        if (m != null) {
            eVar.w(m.intValue());
        }
        Integer r = pVar.r();
        if (r != null) {
            eVar.D(r.intValue());
        }
        Integer l = pVar.l();
        if (l != null) {
            eVar.u(l.intValue());
        }
        Long j = pVar.j("gcm.n.event_time");
        if (j != null) {
            eVar.x(true);
            eVar.E(j.longValue());
        }
        long[] q = pVar.q();
        if (q != null) {
            eVar.C(q);
        }
        int[] e = pVar.e();
        if (e != null) {
            eVar.s(e[0], e[1], e[2]);
        }
        eVar.n(j(pVar));
        return new C0220a(eVar, p(pVar), 0);
    }

    static C0220a f(Context context, p pVar) {
        Bundle k = k(context.getPackageManager(), context.getPackageName());
        return d(context, context, pVar, l(context, pVar.k(), k), k);
    }

    private static Intent g(String str, p pVar, PackageManager packageManager) {
        String p = pVar.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p)) {
            Intent intent = new Intent(p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f = pVar.f();
        if (f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int h() {
        return a.incrementAndGet();
    }

    private static Integer i(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i == 0) {
            return null;
        }
        try {
            return Integer.valueOf(mx0.c(context, i));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int j(p pVar) {
        boolean a2 = pVar.a("gcm.n.default_sound");
        ?? r0 = a2;
        if (pVar.a("gcm.n.default_vibrate_timings")) {
            r0 = (a2 ? 1 : 0) | 2;
        }
        return pVar.a("gcm.n.default_light_settings") ? r0 | 4 : r0;
    }

    private static Bundle k(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        return Bundle.EMPTY;
    }

    public static String l(Context context, String str, Bundle bundle) {
        String string;
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                if (notificationManager.getNotificationChannel(string2) != null) {
                    return string2;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int m(int i) {
        return i | 67108864;
    }

    private static int n(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && q(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && q(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !q(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
            }
        }
        return (i == 0 || !q(resources, i)) ? R.drawable.sym_def_app_icon : i;
    }

    private static Uri o(String str, p pVar, Resources resources) {
        String o = pVar.o();
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        if ("default".equals(o) || resources.getIdentifier(o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + o);
    }

    private static String p(p pVar) {
        String p = pVar.p("gcm.n.tag");
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    private static boolean q(Resources resources, int i) {
        return true;
    }

    static boolean r(p pVar) {
        return pVar.a("google.c.a.e");
    }
}
