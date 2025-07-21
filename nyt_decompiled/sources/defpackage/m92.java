package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.FacebookRequestError;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class m92 {
    public static final a g = new a(null);
    private static m92 h;
    private final Map a;
    private final Map b;
    private final Map c;
    private final String d;
    private final String e;
    private final String f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final m92 c() {
            return new m92(null, t.k(du8.a(2, null), du8.a(4, null), du8.a(9, null), du8.a(17, null), du8.a(341, null)), t.k(du8.a(102, null), du8.a(190, null), du8.a(Integer.valueOf(Constants.FAILED_PRECONDITION_STATUS_CODE), null)), null, null, null);
        }

        private final Map d(JSONObject jSONObject) {
            int optInt;
            HashSet hashSet;
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray.length() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            int length = optJSONArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                        if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                            hashSet = null;
                        } else {
                            hashSet = new HashSet();
                            int length2 = optJSONArray2.length();
                            if (length2 > 0) {
                                int i3 = 0;
                                while (true) {
                                    int i4 = i3 + 1;
                                    int optInt2 = optJSONArray2.optInt(i3);
                                    if (optInt2 != 0) {
                                        hashSet.add(Integer.valueOf(optInt2));
                                    }
                                    if (i4 >= length2) {
                                        break;
                                    }
                                    i3 = i4;
                                }
                            }
                        }
                        hashMap.put(Integer.valueOf(optInt), hashSet);
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            return hashMap;
        }

        public final m92 a(JSONArray jSONArray) {
            Map map;
            Map map2;
            Map map3;
            String str;
            String str2;
            String str3;
            String optString;
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            if (length > 0) {
                int i = 0;
                Map map4 = null;
                Map map5 = null;
                Map map6 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                while (true) {
                    int i2 = i + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null && (optString = optJSONObject.optString(AuthenticationTokenClaims.JSON_KEY_NAME)) != null) {
                        if (h.w(optString, "other", true)) {
                            str4 = optJSONObject.optString("recovery_message", null);
                            map4 = d(optJSONObject);
                        } else if (h.w(optString, "transient", true)) {
                            str5 = optJSONObject.optString("recovery_message", null);
                            map5 = d(optJSONObject);
                        } else if (h.w(optString, "login_recoverable", true)) {
                            str6 = optJSONObject.optString("recovery_message", null);
                            map6 = d(optJSONObject);
                        }
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
                map = map4;
                map2 = map5;
                map3 = map6;
                str = str4;
                str2 = str5;
                str3 = str6;
            } else {
                map = null;
                map2 = null;
                map3 = null;
                str = null;
                str2 = null;
                str3 = null;
            }
            return new m92(map, map2, map3, str, str2, str3);
        }

        public final synchronized m92 b() {
            m92 m92Var;
            try {
                if (m92.h == null) {
                    m92.h = c();
                }
                m92Var = m92.h;
                if (m92Var == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
                }
            } catch (Throwable th) {
                throw th;
            }
            return m92Var;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[FacebookRequestError.Category.valuesCustom().length];
            iArr[FacebookRequestError.Category.OTHER.ordinal()] = 1;
            iArr[FacebookRequestError.Category.LOGIN_RECOVERABLE.ordinal()] = 2;
            iArr[FacebookRequestError.Category.TRANSIENT.ordinal()] = 3;
            a = iArr;
        }
    }

    public m92(Map map, Map map2, Map map3, String str, String str2, String str3) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final FacebookRequestError.Category c(int i, int i2, boolean z) {
        Set set;
        Set set2;
        Set set3;
        if (z) {
            return FacebookRequestError.Category.TRANSIENT;
        }
        Map map = this.a;
        if (map != null && map.containsKey(Integer.valueOf(i)) && ((set3 = (Set) this.a.get(Integer.valueOf(i))) == null || set3.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.Category.OTHER;
        }
        Map map2 = this.c;
        if (map2 != null && map2.containsKey(Integer.valueOf(i)) && ((set2 = (Set) this.c.get(Integer.valueOf(i))) == null || set2.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.Category.LOGIN_RECOVERABLE;
        }
        Map map3 = this.b;
        return (map3 != null && map3.containsKey(Integer.valueOf(i)) && ((set = (Set) this.b.get(Integer.valueOf(i))) == null || set.contains(Integer.valueOf(i2)))) ? FacebookRequestError.Category.TRANSIENT : FacebookRequestError.Category.OTHER;
    }

    public final String d(FacebookRequestError.Category category) {
        int i = category == null ? -1 : b.a[category.ordinal()];
        if (i == 1) {
            return this.d;
        }
        if (i == 2) {
            return this.f;
        }
        if (i != 3) {
            return null;
        }
        return this.e;
    }
}
