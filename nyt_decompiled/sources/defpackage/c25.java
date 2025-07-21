package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginTargetApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class c25 {
    public static final c25 a;
    private static final String b;
    private static final List c;
    private static final List d;
    private static final Map e;
    private static final AtomicBoolean f;
    private static final Integer[] g;

    private static final class a extends e {
        @Override // c25.e
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        @Override // c25.e
        public String d() {
            return "com.facebook.arstudio.player";
        }

        public Void g() {
            return null;
        }
    }

    private static final class b extends e {
        @Override // c25.e
        public String c() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // c25.e
        public String d() {
            return "com.instagram.android";
        }

        @Override // c25.e
        public String e() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    private static final class c extends e {
        private final boolean g() {
            return w92.l().getApplicationInfo().targetSdkVersion >= 30;
        }

        @Override // c25.e
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // c25.e
        public String d() {
            return "com.facebook.katana";
        }

        @Override // c25.e
        public void f() {
            if (g()) {
                Log.w(c25.c(), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }
    }

    private static final class d extends e {
        @Override // c25.e
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        @Override // c25.e
        public String d() {
            return "com.facebook.orca";
        }

        public Void g() {
            return null;
        }
    }

    public static abstract class e {
        private TreeSet a;

        public final synchronized void a(boolean z) {
            TreeSet treeSet;
            if (!z) {
                try {
                    TreeSet treeSet2 = this.a;
                    if (treeSet2 != null) {
                        if (!zq3.c(treeSet2 == null ? null : Boolean.valueOf(treeSet2.isEmpty()), Boolean.FALSE)) {
                        }
                        treeSet = this.a;
                        if (treeSet != null || treeSet.isEmpty()) {
                            f();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.a = c25.b(c25.a, this);
            treeSet = this.a;
            if (treeSet != null) {
            }
            f();
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
        
            if (defpackage.zq3.c(r0 == null ? null : java.lang.Boolean.valueOf(r0.isEmpty()), java.lang.Boolean.FALSE) == false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.TreeSet b() {
            /*
                r2 = this;
                java.util.TreeSet r0 = r2.a
                if (r0 == 0) goto L18
                if (r0 != 0) goto L8
                r0 = 0
                goto L10
            L8:
                boolean r0 = r0.isEmpty()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            L10:
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                boolean r0 = defpackage.zq3.c(r0, r1)
                if (r0 != 0) goto L1c
            L18:
                r0 = 0
                r2.a(r0)
            L1c:
                java.util.TreeSet r2 = r2.a
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: c25.e.b():java.util.TreeSet");
        }

        public abstract String c();

        public abstract String d();

        public String e() {
            return "id_token,token,signed_request,graph_domain";
        }

        public void f() {
        }
    }

    public static final class f {
        public static final a c = new a(null);
        private e a;
        private int b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final f a(e eVar, int i) {
                f fVar = new f(null);
                fVar.a = eVar;
                fVar.b = i;
                return fVar;
            }

            public final f b() {
                f fVar = new f(null);
                fVar.b = -1;
                return fVar;
            }

            private a() {
            }
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e c() {
            return this.a;
        }

        public final int d() {
            return this.b;
        }

        private f() {
        }
    }

    private static final class g extends e {
        @Override // c25.e
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // c25.e
        public String d() {
            return "com.facebook.wakizashi";
        }
    }

    static {
        c25 c25Var = new c25();
        a = c25Var;
        String name = c25.class.getName();
        zq3.g(name, "NativeProtocol::class.java.name");
        b = name;
        c = c25Var.f();
        d = c25Var.e();
        e = c25Var.d();
        f = new AtomicBoolean(false);
        g = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    private c25() {
    }

    public static final Bundle A(Intent intent) {
        if (c11.d(c25.class)) {
            return null;
        }
        try {
            zq3.h(intent, "resultIntent");
            int z = z(intent);
            Bundle extras = intent.getExtras();
            if (C(z) && extras != null) {
                return extras.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
            }
            return extras;
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return null;
        }
    }

    public static final boolean B(Intent intent) {
        if (c11.d(c25.class)) {
            return false;
        }
        try {
            zq3.h(intent, "resultIntent");
            Bundle q = q(intent);
            Boolean valueOf = q == null ? null : Boolean.valueOf(q.containsKey("error"));
            return valueOf == null ? intent.hasExtra("com.facebook.platform.status.ERROR_TYPE") : valueOf.booleanValue();
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return false;
        }
    }

    public static final boolean C(int i) {
        if (c11.d(c25.class)) {
            return false;
        }
        try {
            return kotlin.collections.d.W(g, Integer.valueOf(i)) && i >= 20140701;
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return false;
        }
    }

    public static final void D(Intent intent, String str, String str2, int i, Bundle bundle) {
        if (c11.d(c25.class)) {
            return;
        }
        try {
            zq3.h(intent, "intent");
            String m = w92.m();
            String n = w92.n();
            intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", m);
            if (!C(i)) {
                intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
                if (!g29.Y(n)) {
                    intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", n);
                }
                if (bundle != null) {
                    intent.putExtras(bundle);
                    return;
                }
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", str);
            g29.m0(bundle2, "app_name", n);
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle);
        } catch (Throwable th) {
            c11.b(th, c25.class);
        }
    }

    public static final void E() {
        if (c11.d(c25.class)) {
            return;
        }
        try {
            if (f.compareAndSet(false, true)) {
                w92.t().execute(new Runnable() { // from class: b25
                    @Override // java.lang.Runnable
                    public final void run() {
                        c25.F();
                    }
                });
            }
        } catch (Throwable th) {
            c11.b(th, c25.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F() {
        if (c11.d(c25.class)) {
            return;
        }
        try {
            try {
                Iterator it2 = c.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).a(true);
                }
            } finally {
                f.set(false);
            }
        } catch (Throwable th) {
            c11.b(th, c25.class);
        }
    }

    public static final Intent G(Context context, Intent intent, e eVar) {
        ResolveInfo resolveActivity;
        if (c11.d(c25.class)) {
            return null;
        }
        try {
            zq3.h(context, "context");
            if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
                return null;
            }
            x92 x92Var = x92.a;
            String str = resolveActivity.activityInfo.packageName;
            zq3.g(str, "resolveInfo.activityInfo.packageName");
            if (x92.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return null;
        }
    }

    public static final Intent H(Context context, Intent intent, e eVar) {
        ResolveInfo resolveService;
        if (c11.d(c25.class)) {
            return null;
        }
        try {
            zq3.h(context, "context");
            if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            x92 x92Var = x92.a;
            String str = resolveService.serviceInfo.packageName;
            zq3.g(str, "resolveInfo.serviceInfo.packageName");
            if (x92.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return null;
        }
    }

    public static final /* synthetic */ TreeSet b(c25 c25Var, e eVar) {
        if (c11.d(c25.class)) {
            return null;
        }
        try {
            return c25Var.p(eVar);
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (c11.d(c25.class)) {
            return null;
        }
        try {
            return b;
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return null;
        }
    }

    private final Map d() {
        if (c11.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new d());
            List list = c;
            hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", d);
            hashMap.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return hashMap;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private final List e() {
        if (c11.d(this)) {
            return null;
        }
        try {
            ArrayList h = i.h(new a());
            h.addAll(f());
            return h;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private final List f() {
        if (c11.d(this)) {
            return null;
        }
        try {
            return i.h(new c(), new g());
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private final Uri g(e eVar) {
        if (c11.d(this)) {
            return null;
        }
        try {
            Uri parse = Uri.parse("content://" + eVar.d() + ".provider.PlatformProvider/versions");
            zq3.g(parse, "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)");
            return parse;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public static final int h(TreeSet treeSet, int i, int[] iArr) {
        if (c11.d(c25.class)) {
            return 0;
        }
        try {
            zq3.h(iArr, "versionSpec");
            if (treeSet == null) {
                return -1;
            }
            int length = iArr.length - 1;
            Iterator descendingIterator = treeSet.descendingIterator();
            int i2 = -1;
            while (descendingIterator.hasNext()) {
                Integer num = (Integer) descendingIterator.next();
                zq3.g(num, "fbAppVersion");
                i2 = Math.max(i2, num.intValue());
                while (length >= 0 && iArr[length] > num.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (iArr[length] == num.intValue()) {
                    if (length % 2 == 0) {
                        return Math.min(i2, i);
                    }
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return 0;
        }
    }

    public static final Bundle i(FacebookException facebookException) {
        if (c11.d(c25.class) || facebookException == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", facebookException.toString());
            if (facebookException instanceof FacebookOperationCanceledException) {
                bundle.putString("error_type", "UserCanceled");
            }
            return bundle;
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return null;
        }
    }

    public static final Intent j(Context context, String str, Collection collection, String str2, boolean z, boolean z2, DefaultAudience defaultAudience, String str3, String str4, String str5, boolean z3, boolean z4, boolean z5) {
        if (c11.d(c25.class)) {
            return null;
        }
        try {
            zq3.h(context, "context");
            zq3.h(str, "applicationId");
            zq3.h(collection, "permissions");
            zq3.h(str2, "e2e");
            zq3.h(defaultAudience, "defaultAudience");
            zq3.h(str3, "clientState");
            zq3.h(str4, "authType");
            b bVar = new b();
            return G(context, a.k(bVar, str, collection, str2, z2, defaultAudience, str3, str4, false, str5, z3, LoginTargetApp.INSTAGRAM, z4, z5, "", null, null), bVar);
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return null;
        }
    }

    private final Intent k(e eVar, String str, Collection collection, String str2, boolean z, DefaultAudience defaultAudience, String str3, String str4, boolean z2, String str5, boolean z3, LoginTargetApp loginTargetApp, boolean z4, boolean z5, String str6, String str7, String str8) {
        if (c11.d(this)) {
            return null;
        }
        try {
            String c2 = eVar.c();
            if (c2 == null) {
                return null;
            }
            Intent putExtra = new Intent().setClassName(eVar.d(), c2).putExtra("client_id", str);
            zq3.g(putExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            putExtra.putExtra("facebook_sdk_version", w92.A());
            if (!g29.Z(collection)) {
                putExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!g29.Y(str2)) {
                putExtra.putExtra("e2e", str2);
            }
            putExtra.putExtra(TransferTable.COLUMN_STATE, str3);
            putExtra.putExtra("response_type", eVar.e());
            putExtra.putExtra(AuthenticationTokenClaims.JSON_KEY_NONCE, str6);
            putExtra.putExtra("return_scopes", "true");
            if (z) {
                putExtra.putExtra("default_audience", defaultAudience.getNativeProtocolAudience());
            }
            putExtra.putExtra("legacy_override", w92.v());
            putExtra.putExtra("auth_type", str4);
            if (z2) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            putExtra.putExtra("messenger_page_id", str5);
            putExtra.putExtra("reset_messenger_state", z3);
            if (z4) {
                putExtra.putExtra("fx_app", loginTargetApp.toString());
            }
            if (z5) {
                putExtra.putExtra("skip_dedupe", true);
            }
            return putExtra;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public static final Intent l(Context context, String str, String str2, f fVar, Bundle bundle) {
        e c2;
        Intent G;
        if (c11.d(c25.class)) {
            return null;
        }
        try {
            zq3.h(context, "context");
            if (fVar == null || (c2 = fVar.c()) == null || (G = G(context, new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(c2.d()).addCategory("android.intent.category.DEFAULT"), c2)) == null) {
                return null;
            }
            D(G, str, str2, fVar.d(), bundle);
            return G;
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return null;
        }
    }

    public static final Intent m(Context context) {
        if (c11.d(c25.class)) {
            return null;
        }
        try {
            zq3.h(context, "context");
            for (e eVar : c) {
                Intent H = H(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(eVar.d()).addCategory("android.intent.category.DEFAULT"), eVar);
                if (H != null) {
                    return H;
                }
            }
            return null;
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return null;
        }
    }

    public static final Intent n(Intent intent, Bundle bundle, FacebookException facebookException) {
        if (c11.d(c25.class)) {
            return null;
        }
        try {
            zq3.h(intent, "requestIntent");
            UUID r = r(intent);
            if (r == null) {
                return null;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", z(intent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", r.toString());
            if (facebookException != null) {
                bundle2.putBundle("error", i(facebookException));
            }
            intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent2;
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return null;
        }
    }

    public static final List o(Context context, String str, Collection collection, String str2, boolean z, boolean z2, DefaultAudience defaultAudience, String str3, String str4, boolean z3, String str5, boolean z4, boolean z5, boolean z6, String str6, String str7, String str8) {
        if (c11.d(c25.class)) {
            return null;
        }
        try {
            zq3.h(str, "applicationId");
            zq3.h(collection, "permissions");
            zq3.h(str2, "e2e");
            zq3.h(defaultAudience, "defaultAudience");
            zq3.h(str3, "clientState");
            zq3.h(str4, "authType");
            List list = c;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ArrayList arrayList2 = arrayList;
                Intent k = a.k((e) it2.next(), str, collection, str2, z2, defaultAudience, str3, str4, z3, str5, z4, LoginTargetApp.FACEBOOK, z5, z6, str6, str7, str8);
                if (k != null) {
                    arrayList2.add(k);
                }
                arrayList = arrayList2;
            }
            return arrayList;
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #1 {all -> 0x0085, blocks: (B:6:0x000c, B:30:0x008d, B:31:0x008a, B:18:0x0081), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[EXC_TOP_SPLITTER, LOOP:0: B:20:0x0062->B:23:0x0068, LOOP_START, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.TreeSet p(c25.e r13) {
        /*
            r12 = this;
            java.lang.String r0 = "version"
            java.lang.String r1 = "Failed to query content resolver."
            boolean r2 = defpackage.c11.d(r12)
            r3 = 0
            if (r2 == 0) goto Lc
            return r3
        Lc:
            java.util.TreeSet r2 = new java.util.TreeSet     // Catch: java.lang.Throwable -> L85
            r2.<init>()     // Catch: java.lang.Throwable -> L85
            android.content.Context r4 = defpackage.w92.l()     // Catch: java.lang.Throwable -> L85
            android.content.ContentResolver r5 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L85
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L85
            android.net.Uri r6 = r12.g(r13)     // Catch: java.lang.Throwable -> L85
            android.content.Context r4 = defpackage.w92.l()     // Catch: java.lang.Throwable -> L39
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L39
            java.lang.String r13 = r13.d()     // Catch: java.lang.Throwable -> L39
            java.lang.String r8 = ".provider.PlatformProvider"
            java.lang.String r13 = defpackage.zq3.q(r13, r8)     // Catch: java.lang.Throwable -> L39
            r8 = 0
            android.content.pm.ProviderInfo r13 = r4.resolveContentProvider(r13, r8)     // Catch: java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c
            goto L43
        L39:
            r13 = move-exception
            r0 = r3
            goto L87
        L3c:
            r13 = move-exception
            java.lang.String r4 = defpackage.c25.b     // Catch: java.lang.Throwable -> L39
            android.util.Log.e(r4, r1, r13)     // Catch: java.lang.Throwable -> L39
            r13 = r3
        L43:
            if (r13 == 0) goto L7d
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L39 java.lang.IllegalArgumentException -> L4d java.lang.SecurityException -> L54 java.lang.NullPointerException -> L5a
            goto L60
        L4d:
            java.lang.String r13 = defpackage.c25.b     // Catch: java.lang.Throwable -> L39
            android.util.Log.e(r13, r1)     // Catch: java.lang.Throwable -> L39
        L52:
            r13 = r3
            goto L60
        L54:
            java.lang.String r13 = defpackage.c25.b     // Catch: java.lang.Throwable -> L39
            android.util.Log.e(r13, r1)     // Catch: java.lang.Throwable -> L39
            goto L52
        L5a:
            java.lang.String r13 = defpackage.c25.b     // Catch: java.lang.Throwable -> L39
            android.util.Log.e(r13, r1)     // Catch: java.lang.Throwable -> L39
            goto L52
        L60:
            if (r13 == 0) goto L7e
        L62:
            boolean r1 = r13.moveToNext()     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L7e
            int r1 = r13.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L78
            int r1 = r13.getInt(r1)     // Catch: java.lang.Throwable -> L78
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L78
            r2.add(r1)     // Catch: java.lang.Throwable -> L78
            goto L62
        L78:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
            goto L87
        L7d:
            r13 = r3
        L7e:
            if (r13 != 0) goto L81
            goto L84
        L81:
            r13.close()     // Catch: java.lang.Throwable -> L85
        L84:
            return r2
        L85:
            r13 = move-exception
            goto L8e
        L87:
            if (r0 != 0) goto L8a
            goto L8d
        L8a:
            r0.close()     // Catch: java.lang.Throwable -> L85
        L8d:
            throw r13     // Catch: java.lang.Throwable -> L85
        L8e:
            defpackage.c11.b(r13, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c25.p(c25$e):java.util.TreeSet");
    }

    public static final Bundle q(Intent intent) {
        if (c11.d(c25.class)) {
            return null;
        }
        try {
            zq3.h(intent, "intent");
            if (C(z(intent))) {
                return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            }
            return null;
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return null;
        }
    }

    public static final UUID r(Intent intent) {
        String stringExtra;
        if (c11.d(c25.class) || intent == null) {
            return null;
        }
        try {
            if (C(z(intent))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
            } else {
                stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (stringExtra == null) {
                return null;
            }
            try {
                return UUID.fromString(stringExtra);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return null;
        }
    }

    public static final Bundle s(Intent intent) {
        if (c11.d(c25.class)) {
            return null;
        }
        try {
            zq3.h(intent, "resultIntent");
            if (!B(intent)) {
                return null;
            }
            Bundle q = q(intent);
            return q != null ? q.getBundle("error") : intent.getExtras();
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return null;
        }
    }

    public static final FacebookException t(Bundle bundle) {
        if (c11.d(c25.class) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            return (string == null || !h.w(string, "UserCanceled", true)) ? new FacebookException(string2) : new FacebookOperationCanceledException(string2);
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return null;
        }
    }

    public static final f u(String str, int[] iArr) {
        if (c11.d(c25.class)) {
            return null;
        }
        try {
            zq3.h(str, "action");
            zq3.h(iArr, "versionSpec");
            List list = (List) e.get(str);
            if (list == null) {
                list = i.l();
            }
            return a.v(list, iArr);
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return null;
        }
    }

    private final f v(List list, int[] iArr) {
        if (c11.d(this)) {
            return null;
        }
        try {
            E();
            if (list == null) {
                return f.c.b();
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                int h = h(eVar.b(), x(), iArr);
                if (h != -1) {
                    return f.c.a(eVar, h);
                }
            }
            return f.c.b();
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public static final int w(int i) {
        if (c11.d(c25.class)) {
            return 0;
        }
        try {
            return a.v(c, new int[]{i}).d();
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return 0;
        }
    }

    public static final int x() {
        if (c11.d(c25.class)) {
            return 0;
        }
        try {
            return g[0].intValue();
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return 0;
        }
    }

    public static final Bundle y(Intent intent) {
        if (c11.d(c25.class)) {
            return null;
        }
        try {
            zq3.h(intent, "intent");
            return !C(z(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return null;
        }
    }

    public static final int z(Intent intent) {
        if (c11.d(c25.class)) {
            return 0;
        }
        try {
            zq3.h(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            c11.b(th, c25.class);
            return 0;
        }
    }
}
