package defpackage;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zb;
import defpackage.h51;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class wxf {
    public static final cde l = new jtd(Looper.getMainLooper());
    private String g;
    private volatile String h;
    private final AtomicReference a = new AtomicReference(null);
    private final AtomicReference b = new AtomicReference(null);
    private final AtomicReference c = new AtomicReference(new Bundle());
    private final AtomicBoolean d = new AtomicBoolean();
    private boolean e = true;
    private final Object f = new Object();
    private boolean i = false;
    private boolean j = false;
    private final Executor k = Executors.newSingleThreadExecutor();

    public static int A(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        fgb.g("HTTP timeout too low: " + i + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    private static final void B(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static final String C(final Context context, String str) {
        String str2;
        String str3;
        if (str == null) {
            return S();
        }
        try {
            lmb a = lmb.a();
            if (TextUtils.isEmpty(a.a)) {
                if (ClientLibraryUtils.isPackageSide()) {
                    str3 = (String) ljb.a(context, new Callable() { // from class: qkb
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Context context2 = context;
                            SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                pzc.k("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                            pzc.k("User agent is not initialized on Google Play Services. Initializing.");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                            SharedPreferencesUtils.publishWorldReadableSharedPreferences(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                            return defaultUserAgent;
                        }
                    });
                } else {
                    final Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                    str3 = (String) ljb.a(context, new Callable() { // from class: ilb
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            SharedPreferences sharedPreferences;
                            Context context2 = remoteContext;
                            Context context3 = context;
                            boolean z = false;
                            if (context2 != null) {
                                pzc.k("Attempting to read user agent from Google Play Services.");
                                sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            } else {
                                pzc.k("Attempting to read user agent from local cache.");
                                sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                z = true;
                            }
                            String string = sharedPreferences.getString("user_agent", "");
                            if (TextUtils.isEmpty(string)) {
                                pzc.k("Reading user agent from WebSettings");
                                string = WebSettings.getDefaultUserAgent(context3);
                                if (z) {
                                    sharedPreferences.edit().putString("user_agent", string).apply();
                                    pzc.k("Persisting user agent.");
                                }
                            }
                            return string;
                        }
                    });
                }
                a.a = str3;
            }
            str2 = a.a;
        } catch (Exception unused) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = S();
        }
        String str4 = str2 + " (Mobile; " + str;
        try {
            if (Wrappers.packageManager(context).isCallerInstantApp()) {
                str4 = str4 + ";aia";
            }
        } catch (Exception e) {
            dyf.q().w(e, "AdUtil.getUserAgent");
        }
        return str4.concat(")");
    }

    public static List F() {
        zoa zoaVar = mpa.a;
        List b = pla.a().b();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = b.iterator();
        while (it2.hasNext()) {
            Iterator it3 = dhe.c(dge.b(',')).d((String) it2.next()).iterator();
            while (it3.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it3.next()));
                } catch (NumberFormatException unused) {
                    pzc.k("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean P(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wxf.P(android.view.View):boolean");
    }

    public static final void Q(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String R(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return y(x(context));
    }

    static final String S() {
        StringBuilder sb = new StringBuilder(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String T() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    public static final DisplayMetrics U(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    protected static final int[] V() {
        return new int[]{0, 0};
    }

    public static final Map W(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                    hashMap.put(next, hashSet);
                }
            }
            return hashMap;
        } catch (JSONException e) {
            dyf.q().w(e, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return hashMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long X(View view) {
        float f = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            f = Math.min(f, view2.getAlpha());
            view = view2.getParent();
        } while (f > 0.0f);
        return Math.round((f >= 0.0f ? f : 0.0f) * 100.0f);
    }

    public static final WebResourceResponse Y(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", dyf.r().E(context, str));
            hashMap.put(Headers.CACHE_CONTROL, "max-stale=3600");
            String str3 = (String) new yza(context).b(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", Constants.DEFAULT_ENCODING, new ByteArrayInputStream(str3.getBytes(Constants.DEFAULT_ENCODING)));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            fgb.h("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    public static final String Z() {
        Resources e = dyf.q().e();
        return e != null ? e.getString(tj6.s7) : "Test Ad";
    }

    public static final boolean a(Context context) {
        try {
            return DeviceProperties.isBstar(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final n3b a0(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(newInstance instanceof IBinder)) {
                fgb.d("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof n3b ? (n3b) queryLocalInterface : new h1b(iBinder);
        } catch (Exception e) {
            dyf.q().w(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean b(String str) {
        if (!egb.k()) {
            return false;
        }
        if (!((Boolean) pla.c().a(mpa.Q4)).booleanValue()) {
            return false;
        }
        String str2 = (String) pla.c().a(mpa.S4);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) pla.c().a(mpa.R4);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b0(Context context, String str) {
        Context a = gab.a(context);
        return Wrappers.packageManager(a).checkPermission(str, a.getPackageName()) == 0;
    }

    public static final boolean c(Context context) {
        KeyguardManager w;
        return (context == null || (w = w(context)) == null || !w.isKeyguardLocked()) ? false : true;
    }

    public static final boolean d(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            fgb.e("Error loading class.", th);
            dyf.q().w(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean e() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public static final boolean f(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean g(Context context) {
        try {
            Bundle x = x(context);
            String string = x.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(y(x))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean h(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void i(View view, int i, MotionEvent motionEvent) {
        String str;
        int i2;
        int i3;
        int i4;
        String str2;
        String str3;
        v0e b;
        y0e j;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof xrc) {
                view2 = ((xrc) view2).getChildAt(0);
            }
            if (view2 instanceof u15) {
                str = "NATIVE";
                i2 = 1;
            } else {
                str = "UNKNOWN";
                i2 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i4 = rect.width();
                i3 = rect.height();
            } else {
                i3 = 0;
                i4 = 0;
            }
            dyf.r();
            long X = X(view2);
            view2.getLocationOnScreen(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            if (!(view2 instanceof zmb) || (j = ((zmb) view2).j()) == null) {
                str2 = "none";
            } else {
                String str4 = j.b;
                view2.setContentDescription(str4 + ":" + view2.hashCode());
                str2 = str4;
            }
            if (!(view2 instanceof nlb) || (b = ((nlb) view2).b()) == null) {
                str3 = "none";
            } else {
                str = v0e.a(b.b);
                i2 = b.f;
                str3 = b.F;
            }
            fgb.f(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i2), view2.getClass().getName(), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i4), Integer.valueOf(i3), Long.valueOf(X), Integer.toString(i, 2)));
        } catch (Exception e) {
            fgb.e("Failure getting view location.", e);
        }
    }

    public static final AlertDialog.Builder j(Context context) {
        dyf.s();
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void k(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            new mbb(context, str, (String) it2.next()).b();
        }
    }

    public static final void l(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        try {
            if (((Boolean) esa.b.e()).booleanValue()) {
                CrashUtils.addDynamiteErrorToDropBox(context, th);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static final String m(InputStreamReader inputStreamReader) {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[ProgressEvent.PART_COMPLETED_EVENT_CODE];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    public static final int n(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            fgb.g("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    public static final Map o(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static final int[] p(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? V() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static final int[] q(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] V = (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? V() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        return new int[]{kia.b().e(activity, V[0]), kia.b().e(activity, V[1])};
    }

    public static final boolean r(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = dyf.r().e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || P(view);
        long X = X(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            if (!((Boolean) pla.c().a(mpa.l1)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) pla.c().a(mpa.da)).booleanValue()) {
                    return true;
                }
                if (X >= ((Integer) pla.c().a(mpa.fa)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void s(Context context, Intent intent) {
        if (!((Boolean) pla.c().a(mpa.xa)).booleanValue()) {
            B(context, intent);
            return;
        }
        try {
            B(context, intent);
        } catch (SecurityException e) {
            fgb.h("", e);
            dyf.q().w(e, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void t(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            Q(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            fgb.b("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e) {
            fgb.e("No browser is found.", e);
        }
    }

    public static final int[] u(Activity activity) {
        int[] p = p(activity);
        return new int[]{kia.b().e(activity, p[0]), kia.b().e(activity, p[1])};
    }

    public static final boolean v(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return r(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, w(context));
    }

    private static KeyguardManager w(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static Bundle x(Context context) {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            pzc.l("Error getting metadata", e);
            return null;
        }
    }

    private static String y(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    private static boolean z(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public final j64 D(final Uri uri) {
        return zb.j(new Callable() { // from class: uhf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cde cdeVar = wxf.l;
                dyf.r();
                return wxf.o(uri);
            }
        }, this.k);
    }

    public final String E(Context context, String str) {
        if (((Boolean) pla.c().a(mpa.Ka)).booleanValue()) {
            if (this.h != null) {
                return this.h;
            }
            this.h = C(context, str);
            return this.h;
        }
        synchronized (this.f) {
            try {
                String str2 = this.g;
                if (str2 != null) {
                    return str2;
                }
                String C = C(context, str);
                this.g = C;
                return C;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void H(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int A = A(i);
        fgb.f("HTTP timeout: " + A + " milliseconds.");
        httpURLConnection.setConnectTimeout(A);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(A);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", E(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    final /* synthetic */ void I(Context context, String str, SharedPreferences sharedPreferences, String str2) {
        this.c.set(wv9.b(context, str));
    }

    public final void J(final Context context, final String str, String str2, Bundle bundle, boolean z) {
        dyf.r();
        bundle.putString("device", T());
        zoa zoaVar = mpa.a;
        bundle.putString("eids", TextUtils.join(",", pla.a().a()));
        if (bundle.isEmpty()) {
            fgb.b("Empty or null bundle.");
        } else {
            final String str3 = (String) pla.c().a(mpa.aa);
            if (!this.d.getAndSet(true)) {
                this.c.set(wv9.a(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: eff
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        wxf.this.I(context, str3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((Bundle) this.c.get());
        }
        kia.b();
        tfb.y(context, str, "gmob-apps", bundle, true, new sfb() { // from class: ycf
            @Override // defpackage.sfb
            public final boolean a(String str4) {
                cde cdeVar = wxf.l;
                dyf.r();
                wxf.k(context, str, str4);
                return true;
            }
        });
    }

    public final boolean K(String str) {
        return z(str, this.a, (String) pla.c().a(mpa.b0));
    }

    public final boolean L(String str) {
        return z(str, this.b, (String) pla.c().a(mpa.c0));
    }

    public final boolean M(Context context) {
        if (this.j) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        mpa.a(context);
        uof uofVar = null;
        if (!((Boolean) pla.c().a(mpa.wa)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new esf(this, uofVar), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new esf(this, uofVar), intentFilter, 4);
        }
        this.j = true;
        return true;
    }

    public final boolean N(Context context) {
        if (this.i) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        mpa.a(context);
        vuf vufVar = null;
        if (!((Boolean) pla.c().a(mpa.wa)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new owf(this, vufVar), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new owf(this, vufVar), intentFilter, 4);
        }
        this.i = true;
        return true;
    }

    public final int O(Context context, Uri uri) {
        int i;
        if (context == null) {
            pzc.k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (context instanceof Activity) {
            i = 0;
        } else {
            pzc.k("Chrome Custom Tabs can only work with Activity context.");
            i = 2;
        }
        zoa zoaVar = mpa.x4;
        Boolean bool = (Boolean) pla.c().a(zoaVar);
        zoa zoaVar2 = mpa.y4;
        if (true == bool.equals(pla.c().a(zoaVar2))) {
            i = 9;
        }
        if (i != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i;
        }
        if (((Boolean) pla.c().a(zoaVar)).booleanValue()) {
            tqa tqaVar = new tqa();
            tqaVar.e(new dlf(this, tqaVar, context, uri));
            tqaVar.b((Activity) context);
        }
        if (!((Boolean) pla.c().a(zoaVar2)).booleanValue()) {
            return 5;
        }
        h51 a = new h51.b().a();
        a.a.setPackage(m4f.a(context));
        a.a(context, uri);
        return 5;
    }
}
