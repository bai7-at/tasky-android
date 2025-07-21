package defpackage;

import android.net.Uri;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class rd2 {
    public static final a t = new a(null);
    private final boolean a;
    private final String b;
    private final boolean c;
    private final int d;
    private final EnumSet e;
    private final Map f;
    private final boolean g;
    private final m92 h;
    private final String i;
    private final String j;
    private final boolean k;
    private final boolean l;
    private final JSONArray m;
    private final String n;
    private final boolean o;
    private final boolean p;
    private final String q;
    private final String r;
    private final String s;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(String str, String str2, String str3) {
            zq3.h(str, "applicationId");
            zq3.h(str2, "actionName");
            zq3.h(str3, "featureName");
            if (str2.length() == 0 || str3.length() == 0) {
                return null;
            }
            rd2 f = FetchedAppSettingsManager.f(str);
            Map map = f == null ? null : (Map) f.c().get(str2);
            if (map != null) {
                return (b) map.get(str3);
            }
            return null;
        }

        private a() {
        }
    }

    public static final class b {
        public static final a e = new a(null);
        private final String a;
        private final String b;
        private final Uri c;
        private final int[] d;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final int[] b(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                int length = jSONArray.length();
                int[] iArr = new int[length];
                if (length <= 0) {
                    return iArr;
                }
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    int i3 = -1;
                    int optInt = jSONArray.optInt(i, -1);
                    if (optInt == -1) {
                        String optString = jSONArray.optString(i);
                        if (!g29.Y(optString)) {
                            try {
                                zq3.g(optString, "versionString");
                                i3 = Integer.parseInt(optString);
                            } catch (NumberFormatException e) {
                                g29.e0("FacebookSDK", e);
                            }
                            optInt = i3;
                        }
                    }
                    iArr[i] = optInt;
                    if (i2 >= length) {
                        return iArr;
                    }
                    i = i2;
                }
            }

            public final b a(JSONObject jSONObject) {
                zq3.h(jSONObject, "dialogConfigJSON");
                String optString = jSONObject.optString(AuthenticationTokenClaims.JSON_KEY_NAME);
                if (g29.Y(optString)) {
                    return null;
                }
                zq3.g(optString, "dialogNameWithFeature");
                List F0 = h.F0(optString, new String[]{"|"}, false, 0, 6, null);
                if (F0.size() != 2) {
                    return null;
                }
                String str = (String) i.k0(F0);
                String str2 = (String) i.w0(F0);
                if (g29.Y(str) || g29.Y(str2)) {
                    return null;
                }
                String optString2 = jSONObject.optString("url");
                return new b(str, str2, g29.Y(optString2) ? null : Uri.parse(optString2), b(jSONObject.optJSONArray("versions")), null);
            }

            private a() {
            }
        }

        public /* synthetic */ b(String str, String str2, Uri uri, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, uri, iArr);
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final int[] c() {
            return this.d;
        }

        private b(String str, String str2, Uri uri, int[] iArr) {
            this.a = str;
            this.b = str2;
            this.c = uri;
            this.d = iArr;
        }
    }

    public rd2(boolean z, String str, boolean z2, int i, EnumSet enumSet, Map map, boolean z3, m92 m92Var, String str2, String str3, boolean z4, boolean z5, JSONArray jSONArray, String str4, boolean z6, boolean z7, String str5, String str6, String str7) {
        zq3.h(str, "nuxContent");
        zq3.h(enumSet, "smartLoginOptions");
        zq3.h(map, "dialogConfigurations");
        zq3.h(m92Var, "errorClassification");
        zq3.h(str2, "smartLoginBookmarkIconURL");
        zq3.h(str3, "smartLoginMenuIconURL");
        zq3.h(str4, "sdkUpdateMessage");
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = i;
        this.e = enumSet;
        this.f = map;
        this.g = z3;
        this.h = m92Var;
        this.i = str2;
        this.j = str3;
        this.k = z4;
        this.l = z5;
        this.m = jSONArray;
        this.n = str4;
        this.o = z6;
        this.p = z7;
        this.q = str5;
        this.r = str6;
        this.s = str7;
    }

    public final boolean a() {
        return this.g;
    }

    public final boolean b() {
        return this.l;
    }

    public final Map c() {
        return this.f;
    }

    public final m92 d() {
        return this.h;
    }

    public final JSONArray e() {
        return this.m;
    }

    public final boolean f() {
        return this.k;
    }

    public final String g() {
        return this.q;
    }

    public final String h() {
        return this.s;
    }

    public final String i() {
        return this.n;
    }

    public final int j() {
        return this.d;
    }

    public final EnumSet k() {
        return this.e;
    }

    public final String l() {
        return this.r;
    }

    public final boolean m() {
        return this.a;
    }
}
