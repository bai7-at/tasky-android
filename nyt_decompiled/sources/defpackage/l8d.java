package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.ads.internal.overlay.h;
import com.google.android.gms.internal.ads.zzgad;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* loaded from: classes3.dex */
public final class l8d extends c7b {
    final Map a = new HashMap();
    private final Context b;
    private final zuc c;
    private final jgb d;
    private final a8d e;
    private final k6e f;
    private String g;
    private String h;

    public l8d(Context context, a8d a8dVar, jgb jgbVar, zuc zucVar, k6e k6eVar) {
        this.b = context;
        this.c = zucVar;
        this.d = jgbVar;
        this.e = a8dVar;
        this.f = k6eVar;
    }

    public static final PendingIntent F6(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
            return ude.a(context, 0, intent, 201326592);
        }
        intent.setClassName(context, "com.google.android.gms.ads.AdService");
        return ude.b(context, 0, intent, ude.a | 1073741824, 0);
    }

    private static String G6(int i, String str) {
        Resources e = dyf.q().e();
        return e == null ? str : e.getString(i);
    }

    private final void H6(String str, String str2, Map map) {
        x6(this.b, this.c, this.f, this.e, str, str2, map);
    }

    private final void I6(final Activity activity, final h hVar) {
        dyf.r();
        if (r95.d(activity).a()) {
            g();
            J6(activity, hVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                H6(this.g, "asnpdi", zzgad.f());
                return;
            }
            dyf.r();
            AlertDialog.Builder j = wxf.j(activity);
            j.setTitle(G6(tj6.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(G6(tj6.notifications_permission_confirm, JsonDocumentFields.EFFECT_VALUE_ALLOW), new DialogInterface.OnClickListener() { // from class: e8d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    l8d.this.y6(activity, hVar, dialogInterface, i);
                }
            }).setNegativeButton(G6(tj6.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: f8d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    l8d.this.z6(hVar, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: g8d
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    l8d.this.A6(hVar, dialogInterface);
                }
            });
            j.create().show();
            H6(this.g, "rtsdi", zzgad.f());
        }
    }

    private final void J6(Activity activity, final h hVar) {
        AlertDialog create;
        dyf.r();
        AlertDialog.Builder onCancelListener = wxf.j(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: d8d
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                h hVar2 = h.this;
                if (hVar2 != null) {
                    hVar2.zzb();
                }
            }
        });
        int i = wi6.offline_ads_dialog;
        Resources e = dyf.q().e();
        XmlResourceParser layout = e == null ? null : e.getLayout(i);
        if (layout == null) {
            onCancelListener.setMessage(G6(tj6.offline_dialog_text, "You'll get a notification with the link when you're back online"));
            create = onCancelListener.create();
        } else {
            View inflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
            onCancelListener.setView(inflate);
            q7d q7dVar = (q7d) this.a.get(this.g);
            String b = q7dVar == null ? "" : q7dVar.b();
            if (!b.isEmpty()) {
                TextView textView = (TextView) inflate.findViewById(ag6.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(b);
            }
            q7d q7dVar2 = (q7d) this.a.get(this.g);
            Drawable a = q7dVar2 != null ? q7dVar2.a() : null;
            if (a != null) {
                ((ImageView) inflate.findViewById(ag6.offline_dialog_image)).setImageDrawable(a);
            }
            create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        create.show();
        Timer timer = new Timer();
        timer.schedule(new k8d(this, create, timer, hVar), 3000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g() {
        /*
            r6 = this;
            defpackage.dyf.r()     // Catch: android.os.RemoteException -> L22
            android.content.Context r0 = r6.b     // Catch: android.os.RemoteException -> L22
            n3b r0 = defpackage.wxf.a0(r0)     // Catch: android.os.RemoteException -> L22
            android.content.Context r1 = r6.b     // Catch: android.os.RemoteException -> L22
            ee3 r1 = defpackage.fc5.l3(r1)     // Catch: android.os.RemoteException -> L22
            com.google.android.gms.ads.internal.offline.buffering.zza r2 = new com.google.android.gms.ads.internal.offline.buffering.zza     // Catch: android.os.RemoteException -> L22
            java.lang.String r3 = r6.h     // Catch: android.os.RemoteException -> L22
            java.lang.String r4 = r6.g     // Catch: android.os.RemoteException -> L22
            java.util.Map r5 = r6.a     // Catch: android.os.RemoteException -> L22
            java.lang.Object r5 = r5.get(r4)     // Catch: android.os.RemoteException -> L22
            q7d r5 = (defpackage.q7d) r5     // Catch: android.os.RemoteException -> L22
            if (r5 != 0) goto L24
            java.lang.String r5 = ""
            goto L28
        L22:
            r0 = move-exception
            goto L42
        L24:
            java.lang.String r5 = r5.c()     // Catch: android.os.RemoteException -> L22
        L28:
            r2.<init>(r3, r4, r5)     // Catch: android.os.RemoteException -> L22
            boolean r1 = r0.zzg(r1, r2)     // Catch: android.os.RemoteException -> L22
            if (r1 != 0) goto L48
            android.content.Context r2 = r6.b     // Catch: android.os.RemoteException -> L40
            ee3 r2 = defpackage.fc5.l3(r2)     // Catch: android.os.RemoteException -> L40
            java.lang.String r3 = r6.h     // Catch: android.os.RemoteException -> L40
            java.lang.String r4 = r6.g     // Catch: android.os.RemoteException -> L40
            boolean r1 = r0.zzf(r2, r3, r4)     // Catch: android.os.RemoteException -> L40
            goto L48
        L40:
            r0 = move-exception
            goto L43
        L42:
            r1 = 0
        L43:
            java.lang.String r2 = "Failed to schedule offline notification poster."
            defpackage.fgb.e(r2, r0)
        L48:
            if (r1 != 0) goto L5c
            a8d r0 = r6.e
            java.lang.String r1 = r6.g
            r0.d(r1)
            java.lang.String r0 = r6.g
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.zzgad r2 = com.google.android.gms.internal.ads.zzgad.f()
            r6.H6(r0, r1, r2)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l8d.g():void");
    }

    public static void x6(Context context, zuc zucVar, k6e k6eVar, a8d a8dVar, String str, String str2, Map map) {
        String b;
        String str3 = true != dyf.q().z(context) ? "offline" : "online";
        if (((Boolean) pla.c().a(mpa.z8)).booleanValue() || zucVar == null) {
            j6e b2 = j6e.b(str2);
            b2.a("gqi", str);
            b2.a("device_connectivity", str3);
            b2.a("event_timestamp", String.valueOf(dyf.b().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                b2.a((String) entry.getKey(), (String) entry.getValue());
            }
            b = k6eVar.b(b2);
        } else {
            yuc a = zucVar.a();
            a.b("gqi", str);
            a.b("action", str2);
            a.b("device_connectivity", str3);
            a.b("event_timestamp", String.valueOf(dyf.b().currentTimeMillis()));
            for (Map.Entry entry2 : map.entrySet()) {
                a.b((String) entry2.getKey(), (String) entry2.getValue());
            }
            b = a.f();
        }
        a8dVar.h(new c8d(dyf.b().currentTimeMillis(), str, b, 2));
    }

    final /* synthetic */ void A6(h hVar, DialogInterface dialogInterface) {
        this.e.d(this.g);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        H6(this.g, "rtsdc", hashMap);
        if (hVar != null) {
            hVar.zzb();
        }
    }

    final /* synthetic */ void B6(Activity activity, h hVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        H6(this.g, "dialog_click", hashMap);
        I6(activity, hVar);
    }

    final /* synthetic */ void C6(h hVar, DialogInterface dialogInterface, int i) {
        this.e.d(this.g);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        H6(this.g, "dialog_click", hashMap);
        if (hVar != null) {
            hVar.zzb();
        }
    }

    final /* synthetic */ void D6(h hVar, DialogInterface dialogInterface) {
        this.e.d(this.g);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        H6(this.g, "dialog_click", hashMap);
        if (hVar != null) {
            hVar.zzb();
        }
    }

    public final void E6(String str, rkc rkcVar) {
        String str2 = "";
        String k0 = !TextUtils.isEmpty(rkcVar.k0()) ? rkcVar.k0() : rkcVar.b() != null ? rkcVar.b() : "";
        mta Z = rkcVar.Z();
        if (Z != null) {
            try {
                str2 = Z.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        mta a0 = rkcVar.a0();
        Drawable drawable = null;
        if (a0 != null) {
            try {
                ee3 zzf = a0.zzf();
                if (zzf != null) {
                    drawable = (Drawable) fc5.Q1(zzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.a.put(str, new m7d(k0, str2, drawable));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(9:5|6|(2:18|19)|8|9|10|11|12|13)|24|(0)|8|9|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c6, code lost:
    
        r8.put("notification_not_shown_reason", r7.getMessage());
        r7 = "offline_notification_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.d7b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y2(defpackage.ee3 r7, com.google.android.gms.ads.internal.offline.buffering.zza r8) {
        /*
            r6 = this;
            java.lang.Object r7 = defpackage.fc5.Q1(r7)
            android.content.Context r7 = (android.content.Context) r7
            java.lang.String r0 = r8.zza
            java.lang.String r1 = r8.zzb
            java.lang.String r8 = r8.zzc
            ss9 r2 = defpackage.dyf.s()
            java.lang.String r3 = "offline_notification_channel"
            java.lang.String r4 = "AdMob Offline Notifications"
            r2.f(r7, r3, r4)
            java.lang.String r2 = "offline_notification_clicked"
            android.app.PendingIntent r2 = F6(r7, r2, r1, r0)
            java.lang.String r4 = "offline_notification_dismissed"
            android.app.PendingIntent r0 = F6(r7, r4, r1, r0)
            l95$e r4 = new l95$e
            r4.<init>(r7, r3)
            int r3 = defpackage.tj6.offline_notification_title
            java.lang.String r5 = "View the ad you saved when you were offline"
            java.lang.String r3 = G6(r3, r5)
            l95$e r3 = r4.m(r3)
            r4 = 1
            l95$e r3 = r3.f(r4)
            l95$e r0 = r3.o(r0)
            l95$e r0 = r0.k(r2)
            android.content.pm.ApplicationInfo r2 = r7.getApplicationInfo()
            int r2 = r2.icon
            l95$e r0 = r0.y(r2)
            zoa r2 = defpackage.mpa.q8
            kpa r3 = defpackage.pla.c()
            java.lang.Object r2 = r3.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            l95$e r0 = r0.w(r2)
            android.content.pm.ApplicationInfo r2 = r7.getApplicationInfo()
            int r2 = r2.icon
            l95$e r0 = r0.y(r2)
            zoa r2 = defpackage.mpa.s8
            kpa r3 = defpackage.pla.c()
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 0
            if (r2 == 0) goto L94
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L94
            java.net.URL r2 = new java.net.URL     // Catch: java.io.IOException -> L94
            r2.<init>(r8)     // Catch: java.io.IOException -> L94
            java.net.URLConnection r8 = r2.openConnection()     // Catch: java.io.IOException -> L94
            java.io.InputStream r8 = r8.getInputStream()     // Catch: java.io.IOException -> L94
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r8)     // Catch: java.io.IOException -> L94
            goto L95
        L94:
            r8 = r3
        L95:
            if (r8 == 0) goto Lab
            l95$e r2 = r0.r(r8)     // Catch: android.content.res.Resources.NotFoundException -> Lab
            l95$b r4 = new l95$b     // Catch: android.content.res.Resources.NotFoundException -> Lab
            r4.<init>()     // Catch: android.content.res.Resources.NotFoundException -> Lab
            l95$b r8 = r4.j(r8)     // Catch: android.content.res.Resources.NotFoundException -> Lab
            l95$b r8 = r8.i(r3)     // Catch: android.content.res.Resources.NotFoundException -> Lab
            r2.A(r8)     // Catch: android.content.res.Resources.NotFoundException -> Lab
        Lab:
            java.lang.String r8 = "notification"
            java.lang.Object r7 = r7.getSystemService(r8)
            android.app.NotificationManager r7 = (android.app.NotificationManager) r7
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            android.app.Notification r0 = r0.c()     // Catch: java.lang.IllegalArgumentException -> Lc5
            r2 = 54321(0xd431, float:7.612E-41)
            r7.notify(r1, r2, r0)     // Catch: java.lang.IllegalArgumentException -> Lc5
            java.lang.String r7 = "offline_notification_impression"
            goto Ld1
        Lc5:
            r7 = move-exception
            java.lang.String r0 = "notification_not_shown_reason"
            java.lang.String r7 = r7.getMessage()
            r8.put(r0, r7)
            java.lang.String r7 = "offline_notification_failed"
        Ld1:
            r6.H6(r1, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l8d.Y2(ee3, com.google.android.gms.ads.internal.offline.buffering.zza):void");
    }

    @Override // defpackage.d7b
    public final void s0(ee3 ee3Var) {
        n8d n8dVar = (n8d) fc5.Q1(ee3Var);
        final Activity a = n8dVar.a();
        final h b = n8dVar.b();
        this.g = n8dVar.c();
        this.h = n8dVar.d();
        if (((Boolean) pla.c().a(mpa.p8)).booleanValue()) {
            I6(a, b);
            return;
        }
        H6(this.g, "dialog_impression", zzgad.f());
        dyf.r();
        AlertDialog.Builder j = wxf.j(a);
        j.setTitle(G6(tj6.offline_opt_in_title, "Open ad when you're back online.")).setMessage(G6(tj6.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(G6(tj6.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: h8d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                l8d.this.B6(a, b, dialogInterface, i);
            }
        }).setNegativeButton(G6(tj6.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: i8d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                l8d.this.C6(b, dialogInterface, i);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: j8d
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                l8d.this.D6(b, dialogInterface);
            }
        });
        j.create().show();
    }

    @Override // defpackage.d7b
    public final void t0(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean z = dyf.q().z(this.b);
            HashMap hashMap = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                r8 = true == z ? (char) 1 : (char) 2;
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Intent launchIntentForPackage = this.b.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.b.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            H6(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.e.getWritableDatabase();
                if (r8 == 1) {
                    this.e.l(writableDatabase, this.d, stringExtra2);
                } else {
                    a8d.r(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                fgb.d("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    @Override // defpackage.d7b
    public final void u0(ee3 ee3Var, String str, String str2) {
        Y2(ee3Var, new zza(str, str2, ""));
    }

    @Override // defpackage.d7b
    public final void w0(String[] strArr, int[] iArr, ee3 ee3Var) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                n8d n8dVar = (n8d) fc5.Q1(ee3Var);
                Activity a = n8dVar.a();
                h b = n8dVar.b();
                HashMap hashMap = new HashMap();
                if (iArr[i] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    g();
                    J6(a, b);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (b != null) {
                        b.zzb();
                    }
                }
                H6(this.g, "asnpdc", hashMap);
                return;
            }
        }
    }

    final /* synthetic */ void y6(Activity activity, h hVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        H6(this.g, "rtsdc", hashMap);
        activity.startActivity(dyf.s().e(activity));
        g();
        if (hVar != null) {
            hVar.zzb();
        }
    }

    final /* synthetic */ void z6(h hVar, DialogInterface dialogInterface, int i) {
        this.e.d(this.g);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        H6(this.g, "rtsdc", hashMap);
        if (hVar != null) {
            hVar.zzb();
        }
    }

    @Override // defpackage.d7b
    public final void zzh() {
        final jgb jgbVar = this.d;
        this.e.i(new f5e() { // from class: t7d
            @Override // defpackage.f5e
            public final Object zza(Object obj) {
                a8d.b(jgb.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }
}
