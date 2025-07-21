package defpackage;

import android.util.Patterns;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.collections.t;
import kotlin.text.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ab2 {
    public static final ab2 a = new ab2();
    private static Map b;
    private static Map c;
    private static Map d;
    private static JSONObject e;
    private static boolean f;

    private ab2() {
    }

    public static final float[] a(JSONObject jSONObject, String str) {
        String lowerCase;
        JSONObject jSONObject2;
        String optString;
        JSONArray jSONArray;
        ab2 ab2Var;
        JSONObject b2;
        if (c11.d(ab2.class)) {
            return null;
        }
        try {
            zq3.h(jSONObject, "viewHierarchy");
            zq3.h(str, "appName");
            if (!f) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            try {
                lowerCase = str.toLowerCase();
                zq3.g(lowerCase, "(this as java.lang.String).toLowerCase()");
                jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                optString = jSONObject.optString("screenname");
                jSONArray = new JSONArray();
                ab2Var = a;
                ab2Var.j(jSONObject2, jSONArray);
                ab2Var.m(fArr, ab2Var.i(jSONObject2));
                b2 = ab2Var.b(jSONObject2);
            } catch (JSONException unused) {
            }
            if (b2 == null) {
                return null;
            }
            zq3.g(optString, "screenName");
            String jSONObject3 = jSONObject2.toString();
            zq3.g(jSONObject3, "viewTree.toString()");
            ab2Var.m(fArr, ab2Var.h(b2, jSONArray, optString, jSONObject3, lowerCase));
            return fArr;
        } catch (Throwable th) {
            c11.b(th, ab2.class);
            return null;
        }
    }

    private final JSONObject b(JSONObject jSONObject) {
        int length;
        if (c11.d(this)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th) {
            c11.b(th, this);
        }
        if (jSONObject.optBoolean("is_interacted")) {
            return jSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                zq3.g(jSONObject2, "children.getJSONObject(i)");
                JSONObject b2 = b(jSONObject2);
                if (b2 != null) {
                    return b2;
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return null;
    }

    public static final String c(String str, String str2, String str3) {
        if (c11.d(ab2.class)) {
            return null;
        }
        try {
            zq3.h(str, "buttonText");
            zq3.h(str2, "activityName");
            zq3.h(str3, "appName");
            String str4 = str3 + " | " + str2 + ", " + str;
            if (str4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = str4.toLowerCase();
            zq3.g(lowerCase, "(this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (Throwable th) {
            c11.b(th, ab2.class);
            return null;
        }
    }

    public static final void d(File file) {
        if (c11.d(ab2.class)) {
            return;
        }
        try {
            try {
                e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                e = new JSONObject(new String(bArr, yj0.b));
                b = t.m(du8.a("ENGLISH", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE), du8.a("GERMAN", "2"), du8.a("SPANISH", "3"), du8.a("JAPANESE", "4"));
                c = t.m(du8.a("VIEW_CONTENT", "0"), du8.a("SEARCH", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE), du8.a("ADD_TO_CART", "2"), du8.a("ADD_TO_WISHLIST", "3"), du8.a("INITIATE_CHECKOUT", "4"), du8.a("ADD_PAYMENT_INFO", "5"), du8.a("PURCHASE", "6"), du8.a("LEAD", "7"), du8.a("COMPLETE_REGISTRATION", "8"));
                d = t.m(du8.a("BUTTON_TEXT", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE), du8.a("PAGE_TITLE", "2"), du8.a("RESOLVED_DOCUMENT_LINK", "3"), du8.a("BUTTON_ID", "4"));
                f = true;
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            c11.b(th, ab2.class);
        }
    }

    private final boolean e(JSONObject jSONObject) {
        if (c11.d(this)) {
            return false;
        }
        try {
            return ((jSONObject.optInt("classtypebitmask") & 1) << 5) > 0;
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }

    public static final boolean f() {
        if (c11.d(ab2.class)) {
            return false;
        }
        try {
            return f;
        } catch (Throwable th) {
            c11.b(th, ab2.class);
            return false;
        }
    }

    private final boolean g(String[] strArr, String[] strArr2) {
        if (c11.d(this)) {
            return false;
        }
        try {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                i++;
                int length2 = strArr2.length;
                int i2 = 0;
                while (i2 < length2) {
                    String str2 = strArr2[i2];
                    i2++;
                    if (h.P(str2, str, false, 2, null)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }

    private final float[] h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        if (c11.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            int length = jSONArray.length();
            fArr[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                if (length2 > 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        zq3.g(jSONObject2, "siblings.getJSONObject(i)");
                        if (e(jSONObject2)) {
                            fArr[9] = fArr[9] + 1.0f;
                        }
                        if (i3 >= length2) {
                            break;
                        }
                        i2 = i3;
                    }
                }
            } catch (JSONException unused) {
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            n(jSONObject, sb2, sb);
            String sb3 = sb.toString();
            zq3.g(sb3, "hintSB.toString()");
            String sb4 = sb2.toString();
            zq3.g(sb4, "textSB.toString()");
            fArr[15] = l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[16] = l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[17] = l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", sb3) ? 1.0f : 0.0f;
            fArr[18] = h.P(str2, "password", false, 2, null) ? 1.0f : 0.0f;
            fArr[19] = k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? 1.0f : 0.0f;
            fArr[20] = k("(?i)(sign in)|login|signIn", str2) ? 1.0f : 0.0f;
            fArr[21] = k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? 1.0f : 0.0f;
            fArr[22] = l("ENGLISH", "PURCHASE", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[24] = l("ENGLISH", "PURCHASE", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[25] = k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb4) ? 1.0f : 0.0f;
            fArr[27] = k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? 1.0f : 0.0f;
            fArr[28] = l("ENGLISH", "LEAD", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[29] = l("ENGLISH", "LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            return fArr;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private final float[] i(JSONObject jSONObject) {
        if (c11.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            int i = 0;
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            String optString = jSONObject.optString("text");
            zq3.g(optString, "node.optString(TEXT_KEY)");
            String lowerCase = optString.toLowerCase();
            zq3.g(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint");
            zq3.g(optString2, "node.optString(HINT_KEY)");
            String lowerCase2 = optString2.toLowerCase();
            zq3.g(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String optString3 = jSONObject.optString("classname");
            zq3.g(optString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = optString3.toLowerCase();
            zq3.g(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (g(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (g(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (g(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (g(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 3 || optInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (h.P(lowerCase3, "checkbox", false, 2, null)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (h.P(lowerCase3, "radio", false, 2, null) && h.P(lowerCase3, "button", false, 2, null)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i3 = i + 1;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        zq3.g(jSONObject2, "childViews.getJSONObject(i)");
                        m(fArr, i(jSONObject2));
                        if (i3 >= length) {
                            break;
                        }
                        i = i3;
                    }
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private final boolean j(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        if (c11.d(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int length = optJSONArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (optJSONArray.getJSONObject(i).optBoolean("is_interacted")) {
                        z = true;
                        break;
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            z = false;
            boolean z2 = z;
            JSONArray jSONArray2 = new JSONArray();
            if (z) {
                int length2 = optJSONArray.length();
                if (length2 > 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        jSONArray.put(optJSONArray.getJSONObject(i3));
                        if (i4 >= length2) {
                            break;
                        }
                        i3 = i4;
                    }
                }
            } else {
                int length3 = optJSONArray.length();
                if (length3 > 0) {
                    int i5 = 0;
                    while (true) {
                        int i6 = i5 + 1;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i5);
                        zq3.g(jSONObject2, "child");
                        if (j(jSONObject2, jSONArray)) {
                            jSONArray2.put(jSONObject2);
                            z2 = true;
                        }
                        if (i6 >= length3) {
                            break;
                        }
                        i5 = i6;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z2;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }

    private final boolean k(String str, String str2) {
        if (c11.d(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:6:0x0008, B:8:0x000d, B:18:0x005d, B:20:0x0043, B:23:0x004c, B:25:0x0050, B:26:0x0064, B:27:0x0069, B:28:0x0029, B:31:0x0032, B:33:0x0036, B:34:0x006a, B:35:0x006f, B:36:0x0017, B:38:0x001b, B:39:0x0070, B:40:0x0075, B:41:0x0076, B:42:0x007b), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:6:0x0008, B:8:0x000d, B:18:0x005d, B:20:0x0043, B:23:0x004c, B:25:0x0050, B:26:0x0064, B:27:0x0069, B:28:0x0029, B:31:0x0032, B:33:0x0036, B:34:0x006a, B:35:0x006f, B:36:0x0017, B:38:0x001b, B:39:0x0070, B:40:0x0075, B:41:0x0076, B:42:0x007b), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:6:0x0008, B:8:0x000d, B:18:0x005d, B:20:0x0043, B:23:0x004c, B:25:0x0050, B:26:0x0064, B:27:0x0069, B:28:0x0029, B:31:0x0032, B:33:0x0036, B:34:0x006a, B:35:0x006f, B:36:0x0017, B:38:0x001b, B:39:0x0070, B:40:0x0075, B:41:0x0076, B:42:0x007b), top: B:5:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean l(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            boolean r0 = defpackage.c11.d(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONObject r0 = defpackage.ab2.e     // Catch: java.lang.Throwable -> L62
            r2 = 0
            if (r0 == 0) goto L76
            java.lang.String r3 = "rulesForLanguage"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L17
            r5 = r2
            goto L25
        L17:
            java.util.Map r3 = defpackage.ab2.b     // Catch: java.lang.Throwable -> L62
            if (r3 == 0) goto L70
            java.lang.Object r5 = r3.get(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L62
            org.json.JSONObject r5 = r0.optJSONObject(r5)     // Catch: java.lang.Throwable -> L62
        L25:
            if (r5 != 0) goto L29
        L27:
            r5 = r2
            goto L40
        L29:
            java.lang.String r0 = "rulesForEvent"
            org.json.JSONObject r5 = r5.optJSONObject(r0)     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L32
            goto L27
        L32:
            java.util.Map r0 = defpackage.ab2.c     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L6a
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L62
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch: java.lang.Throwable -> L62
        L40:
            if (r5 != 0) goto L43
            goto L5a
        L43:
            java.lang.String r6 = "positiveRules"
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L4c
            goto L5a
        L4c:
            java.util.Map r6 = defpackage.ab2.d     // Catch: java.lang.Throwable -> L62
            if (r6 == 0) goto L64
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = r5.optString(r6)     // Catch: java.lang.Throwable -> L62
        L5a:
            if (r2 != 0) goto L5d
            goto L61
        L5d:
            boolean r1 = r4.k(r2, r8)     // Catch: java.lang.Throwable -> L62
        L61:
            return r1
        L62:
            r5 = move-exception
            goto L7c
        L64:
            java.lang.String r5 = "textTypeInfo"
            defpackage.zq3.z(r5)     // Catch: java.lang.Throwable -> L62
            throw r2     // Catch: java.lang.Throwable -> L62
        L6a:
            java.lang.String r5 = "eventInfo"
            defpackage.zq3.z(r5)     // Catch: java.lang.Throwable -> L62
            throw r2     // Catch: java.lang.Throwable -> L62
        L70:
            java.lang.String r5 = "languageInfo"
            defpackage.zq3.z(r5)     // Catch: java.lang.Throwable -> L62
            throw r2     // Catch: java.lang.Throwable -> L62
        L76:
            java.lang.String r5 = "rules"
            defpackage.zq3.z(r5)     // Catch: java.lang.Throwable -> L62
            throw r2     // Catch: java.lang.Throwable -> L62
        L7c:
            defpackage.c11.b(r5, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab2.l(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    private final void m(float[] fArr, float[] fArr2) {
        if (c11.d(this)) {
            return;
        }
        try {
            int length = fArr.length - 1;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                fArr[i] = fArr[i] + fArr2[i];
                if (i2 > length) {
                    return;
                } else {
                    i = i2;
                }
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private final void n(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        int length;
        if (c11.d(this)) {
            return;
        }
        try {
            String optString = jSONObject.optString("text", "");
            zq3.g(optString, "view.optString(TEXT_KEY, \"\")");
            String lowerCase = optString.toLowerCase();
            zq3.g(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint", "");
            zq3.g(optString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = optString2.toLowerCase();
            zq3.g(lowerCase2, "(this as java.lang.String).toLowerCase()");
            if (lowerCase.length() > 0) {
                sb.append(lowerCase);
                sb.append(" ");
            }
            if (lowerCase2.length() > 0) {
                sb2.append(lowerCase2);
                sb2.append(" ");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null || (length = optJSONArray.length()) <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                try {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    zq3.g(jSONObject2, "currentChildView");
                    n(jSONObject2, sb, sb2);
                } catch (JSONException unused) {
                }
                if (i2 >= length) {
                    return;
                } else {
                    i = i2;
                }
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }
}
