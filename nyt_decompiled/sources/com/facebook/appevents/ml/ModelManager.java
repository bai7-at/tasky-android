package com.facebook.appevents.ml;

import android.os.Bundle;
import android.text.TextUtils;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.GraphRequest;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.FeatureManager;
import defpackage.an3;
import defpackage.c11;
import defpackage.de2;
import defpackage.fc8;
import defpackage.g29;
import defpackage.ld4;
import defpackage.m29;
import defpackage.qm3;
import defpackage.qn3;
import defpackage.uo6;
import defpackage.wu4;
import defpackage.zq3;
import io.embrace.android.embracesdk.payload.Session;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ModelManager {
    public static final ModelManager a = new ModelManager();
    private static final Map b = new ConcurrentHashMap();
    private static final List c = i.o("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");
    private static final List d = i.o("none", "address", "health");

    public enum Task {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[Task.valuesCustom().length];
                iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                a = iArr;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static Task[] valuesCustom() {
            Task[] valuesCustom = values();
            return (Task[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final String toKey() {
            int i = a.a[ordinal()];
            if (i == 1) {
                return "integrity_detect";
            }
            if (i == 2) {
                return "app_event_pred";
            }
            throw new NoWhenBranchMatchedException();
        }

        public final String toUseCase() {
            int i = a.a[ordinal()];
            if (i == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: private */
    public static final class a {
        public static final C0170a i = new C0170a(null);
        private String a;
        private String b;
        private String c;
        private int d;
        private float[] e;
        private File f;
        private wu4 g;
        private Runnable h;

        /* renamed from: com.facebook.appevents.ml.ModelManager$a$a, reason: collision with other inner class name */
        public static final class C0170a {
            public /* synthetic */ C0170a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final void d(String str, int i) {
                File[] listFiles;
                File a = m29.a();
                if (a == null || (listFiles = a.listFiles()) == null || listFiles.length == 0) {
                    return;
                }
                String str2 = str + '_' + i;
                int length = listFiles.length;
                int i2 = 0;
                while (i2 < length) {
                    File file = listFiles[i2];
                    i2++;
                    String name = file.getName();
                    zq3.g(name, AuthenticationTokenClaims.JSON_KEY_NAME);
                    if (h.K(name, str, false, 2, null) && !h.K(name, str2, false, 2, null)) {
                        file.delete();
                    }
                }
            }

            private final void e(String str, String str2, de2.a aVar) {
                File file = new File(m29.a(), str2);
                if (str == null || file.exists()) {
                    aVar.a(file);
                } else {
                    new de2(str, file, aVar).execute(new String[0]);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void g(List list, File file) {
                zq3.h(list, "$slaves");
                zq3.h(file, TransferTable.COLUMN_FILE);
                final wu4 a = wu4.m.a(file);
                if (a != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        final a aVar = (a) it2.next();
                        a.i.e(aVar.e(), aVar.g() + '_' + aVar.h() + "_rule", new de2.a() { // from class: com.facebook.appevents.ml.a
                            @Override // de2.a
                            public final void a(File file2) {
                                ModelManager.a.C0170a.h(ModelManager.a.this, a, file2);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void h(a aVar, wu4 wu4Var, File file) {
                zq3.h(aVar, "$slave");
                zq3.h(file, TransferTable.COLUMN_FILE);
                aVar.i(wu4Var);
                aVar.k(file);
                Runnable runnable = aVar.h;
                if (runnable == null) {
                    return;
                }
                runnable.run();
            }

            public final a c(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String string = jSONObject.getString("use_case");
                    String string2 = jSONObject.getString("asset_uri");
                    String optString = jSONObject.optString("rules_uri", null);
                    int i = jSONObject.getInt(TransferTable.COLUMN_VERSION_ID);
                    float[] d = ModelManager.d(ModelManager.a, jSONObject.getJSONArray("thresholds"));
                    zq3.g(string, "useCase");
                    zq3.g(string2, "assetUri");
                    return new a(string, string2, optString, i, d);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void f(a aVar, final List list) {
                zq3.h(aVar, "master");
                zq3.h(list, "slaves");
                d(aVar.g(), aVar.h());
                e(aVar.b(), aVar.g() + '_' + aVar.h(), new de2.a() { // from class: ev4
                    @Override // de2.a
                    public final void a(File file) {
                        ModelManager.a.C0170a.g(list, file);
                    }
                });
            }

            private C0170a() {
            }
        }

        public a(String str, String str2, String str3, int i2, float[] fArr) {
            zq3.h(str, "useCase");
            zq3.h(str2, "assetUri");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = i2;
            this.e = fArr;
        }

        public final String b() {
            return this.b;
        }

        public final wu4 c() {
            return this.g;
        }

        public final File d() {
            return this.f;
        }

        public final String e() {
            return this.c;
        }

        public final float[] f() {
            return this.e;
        }

        public final String g() {
            return this.a;
        }

        public final int h() {
            return this.d;
        }

        public final void i(wu4 wu4Var) {
            this.g = wu4Var;
        }

        public final a j(Runnable runnable) {
            this.h = runnable;
            return this;
        }

        public final void k(File file) {
            this.f = file;
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Task.valuesCustom().length];
            iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            a = iArr;
        }
    }

    private ModelManager() {
    }

    public static final /* synthetic */ float[] d(ModelManager modelManager, JSONArray jSONArray) {
        if (c11.d(ModelManager.class)) {
            return null;
        }
        try {
            return modelManager.o(jSONArray);
        } catch (Throwable th) {
            c11.b(th, ModelManager.class);
            return null;
        }
    }

    private final void e(JSONObject jSONObject) {
        if (c11.d(this)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    a c2 = a.i.c(jSONObject.getJSONObject(keys.next()));
                    if (c2 != null) {
                        b.put(c2.g(), c2);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public static final void f() {
        if (c11.d(ModelManager.class)) {
            return;
        }
        try {
            g29 g29Var = g29.a;
            g29.y0(new Runnable() { // from class: bv4
                @Override // java.lang.Runnable
                public final void run() {
                    ModelManager.g();
                }
            });
        } catch (Throwable th) {
            c11.b(th, ModelManager.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[Catch: all -> 0x002c, Exception -> 0x007d, TryCatch #2 {Exception -> 0x007d, all -> 0x002c, blocks: (B:6:0x000d, B:8:0x001f, B:11:0x0026, B:12:0x0033, B:14:0x0043, B:16:0x0049, B:18:0x0071, B:21:0x0051, B:24:0x005a, B:25:0x002e), top: B:5:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g() {
        /*
            java.lang.String r0 = "model_request_timestamp"
            java.lang.String r1 = "models"
            java.lang.Class<com.facebook.appevents.ml.ModelManager> r2 = com.facebook.appevents.ml.ModelManager.class
            boolean r3 = defpackage.c11.d(r2)
            if (r3 == 0) goto Ld
            return
        Ld:
            android.content.Context r3 = defpackage.w92.l()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            java.lang.String r4 = "com.facebook.internal.MODEL_STORE"
            r5 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r5)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            r4 = 0
            java.lang.String r4 = r3.getString(r1, r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            if (r4 == 0) goto L2e
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            if (r5 != 0) goto L26
            goto L2e
        L26:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            goto L33
        L2c:
            r0 = move-exception
            goto L7a
        L2e:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            r5.<init>()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
        L33:
            r6 = 0
            long r6 = r3.getLong(r0, r6)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            com.facebook.internal.FeatureManager r4 = com.facebook.internal.FeatureManager.a     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            com.facebook.internal.FeatureManager$Feature r4 = com.facebook.internal.FeatureManager.Feature.ModelRequest     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            boolean r4 = com.facebook.internal.FeatureManager.g(r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            if (r4 == 0) goto L51
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            if (r4 == 0) goto L51
            com.facebook.appevents.ml.ModelManager r4 = com.facebook.appevents.ml.ModelManager.a     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            boolean r4 = r4.n(r6)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            if (r4 != 0) goto L71
        L51:
            com.facebook.appevents.ml.ModelManager r4 = com.facebook.appevents.ml.ModelManager.a     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            org.json.JSONObject r5 = r4.k()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            if (r5 != 0) goto L5a
            return
        L5a:
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            android.content.SharedPreferences$Editor r1 = r3.putString(r1, r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r3)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            r0.apply()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
        L71:
            com.facebook.appevents.ml.ModelManager r0 = com.facebook.appevents.ml.ModelManager.a     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            r0.e(r5)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            r0.h()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            goto L7d
        L7a:
            defpackage.c11.b(r0, r2)
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.ml.ModelManager.g():void");
    }

    private final void h() {
        if (c11.d(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String str = null;
            int i = 0;
            for (Map.Entry entry : b.entrySet()) {
                String str2 = (String) entry.getKey();
                a aVar = (a) entry.getValue();
                if (zq3.c(str2, Task.MTML_APP_EVENT_PREDICTION.toUseCase())) {
                    String b2 = aVar.b();
                    int max = Math.max(i, aVar.h());
                    FeatureManager featureManager = FeatureManager.a;
                    if (FeatureManager.g(FeatureManager.Feature.SuggestedEvents) && m()) {
                        arrayList.add(aVar.j(new Runnable() { // from class: cv4
                            @Override // java.lang.Runnable
                            public final void run() {
                                ModelManager.i();
                            }
                        }));
                    }
                    str = b2;
                    i = max;
                }
                if (zq3.c(str2, Task.MTML_INTEGRITY_DETECT.toUseCase())) {
                    str = aVar.b();
                    i = Math.max(i, aVar.h());
                    FeatureManager featureManager2 = FeatureManager.a;
                    if (FeatureManager.g(FeatureManager.Feature.IntelligentIntegrity)) {
                        arrayList.add(aVar.j(new Runnable() { // from class: dv4
                            @Override // java.lang.Runnable
                            public final void run() {
                                ModelManager.j();
                            }
                        }));
                    }
                }
            }
            if (str == null || i <= 0 || arrayList.isEmpty()) {
                return;
            }
            a.i.f(new a("MTML", str, null, i, null), arrayList);
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i() {
        if (c11.d(ModelManager.class)) {
            return;
        }
        try {
            fc8.b();
        } catch (Throwable th) {
            c11.b(th, ModelManager.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j() {
        if (c11.d(ModelManager.class)) {
            return;
        }
        try {
            qn3.a();
        } catch (Throwable th) {
            c11.b(th, ModelManager.class);
        }
    }

    private final JSONObject k() {
        if (c11.d(this)) {
            return null;
        }
        try {
            String[] strArr = {"use_case", TransferTable.COLUMN_VERSION_ID, "asset_uri", "rules_uri", "thresholds"};
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", strArr));
            GraphRequest x = GraphRequest.n.x(null, "app/model_asset", null);
            x.H(bundle);
            JSONObject c2 = x.k().c();
            if (c2 == null) {
                return null;
            }
            return p(c2);
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public static final File l(Task task) {
        if (c11.d(ModelManager.class)) {
            return null;
        }
        try {
            zq3.h(task, "task");
            a aVar = (a) b.get(task.toUseCase());
            if (aVar == null) {
                return null;
            }
            return aVar.d();
        } catch (Throwable th) {
            c11.b(th, ModelManager.class);
            return null;
        }
    }

    private final boolean m() {
        if (c11.d(this)) {
            return false;
        }
        try {
            Locale J = g29.J();
            if (J != null) {
                String language = J.getLanguage();
                zq3.g(language, "locale.language");
                if (!h.P(language, Session.MESSAGE_TYPE_END, false, 2, null)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }

    private final boolean n(long j) {
        if (c11.d(this) || j == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - j < 259200000;
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }

    private final float[] o(JSONArray jSONArray) {
        if (c11.d(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int length = jSONArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    try {
                        String string = jSONArray.getString(i);
                        zq3.g(string, "jsonArray.getString(i)");
                        fArr[i] = Float.parseFloat(string);
                    } catch (JSONException unused) {
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            return fArr;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private final JSONObject p(JSONObject jSONObject) {
        if (c11.d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                if (length <= 0) {
                    return jSONObject2;
                }
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(TransferTable.COLUMN_VERSION_ID, jSONObject3.getString(TransferTable.COLUMN_VERSION_ID));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                    if (i2 >= length) {
                        return jSONObject2;
                    }
                    i = i2;
                }
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public static final String[] q(Task task, float[][] fArr, String[] strArr) {
        if (c11.d(ModelManager.class)) {
            return null;
        }
        try {
            zq3.h(task, "task");
            zq3.h(fArr, "denses");
            zq3.h(strArr, "texts");
            a aVar = (a) b.get(task.toUseCase());
            wu4 c2 = aVar == null ? null : aVar.c();
            if (c2 == null) {
                return null;
            }
            float[] f = aVar.f();
            int length = strArr.length;
            int length2 = fArr[0].length;
            ld4 ld4Var = new ld4(new int[]{length, length2});
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    System.arraycopy(fArr[i], 0, ld4Var.a(), i * length2, length2);
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            ld4 b2 = c2.b(ld4Var, strArr, task.toKey());
            if (b2 != null && f != null && b2.a().length != 0 && f.length != 0) {
                int i3 = b.a[task.ordinal()];
                if (i3 == 1) {
                    return a.s(b2, f);
                }
                if (i3 == 2) {
                    return a.r(b2, f);
                }
                throw new NoWhenBranchMatchedException();
            }
            return null;
        } catch (Throwable th) {
            c11.b(th, ModelManager.class);
            return null;
        }
    }

    private final String[] r(ld4 ld4Var, float[] fArr) {
        if (c11.d(this)) {
            return null;
        }
        try {
            int b2 = ld4Var.b(0);
            int b3 = ld4Var.b(1);
            float[] a2 = ld4Var.a();
            if (b3 != fArr.length) {
                return null;
            }
            an3 u = uo6.u(0, b2);
            ArrayList arrayList = new ArrayList(i.w(u, 10));
            Iterator it2 = u.iterator();
            while (it2.hasNext()) {
                int c2 = ((qm3) it2).c();
                Object obj = "none";
                int length = fArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (a2[(c2 * b3) + i2] >= fArr[i]) {
                        obj = d.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add((String) obj);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private final String[] s(ld4 ld4Var, float[] fArr) {
        if (c11.d(this)) {
            return null;
        }
        try {
            int b2 = ld4Var.b(0);
            int b3 = ld4Var.b(1);
            float[] a2 = ld4Var.a();
            if (b3 != fArr.length) {
                return null;
            }
            an3 u = uo6.u(0, b2);
            ArrayList arrayList = new ArrayList(i.w(u, 10));
            Iterator it2 = u.iterator();
            while (it2.hasNext()) {
                int c2 = ((qm3) it2).c();
                Object obj = "other";
                int length = fArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (a2[(c2 * b3) + i2] >= fArr[i]) {
                        obj = c.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add((String) obj);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }
}
