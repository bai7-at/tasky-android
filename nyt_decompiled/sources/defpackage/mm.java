package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEventsLogger;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class mm {
    private static final String g = "mm";
    public static final /* synthetic */ int h = 0;
    private String a;
    private Uri b;
    private JSONObject c;
    private Bundle d;
    private String e;
    private JSONObject f;

    static class a implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ b c;

        a(Context context, String str, b bVar) {
            this.a = context;
            this.b = str;
            this.c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c11.d(this)) {
                return;
            }
            try {
                mm.e(this.a, this.b, this.c);
            } catch (Throwable th) {
                c11.b(th, this);
            }
        }
    }

    public interface b {
        void a(mm mmVar);
    }

    private mm() {
    }

    private static mm b(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("version");
            if (jSONObject.getJSONObject("bridge_args").getString("method").equals("applink") && string.equals("2")) {
                mm mmVar = new mm();
                JSONObject jSONObject2 = jSONObject.getJSONObject("method_args");
                mmVar.c = jSONObject2;
                if (jSONObject2.has("ref")) {
                    mmVar.a = mmVar.c.getString("ref");
                } else if (mmVar.c.has("referer_data")) {
                    JSONObject jSONObject3 = mmVar.c.getJSONObject("referer_data");
                    if (jSONObject3.has("fb_ref")) {
                        mmVar.a = jSONObject3.getString("fb_ref");
                    }
                }
                if (mmVar.c.has("target_url")) {
                    Uri parse = Uri.parse(mmVar.c.getString("target_url"));
                    mmVar.b = parse;
                    mmVar.f = f(parse);
                }
                if (mmVar.c.has("extras")) {
                    JSONObject jSONObject4 = mmVar.c.getJSONObject("extras");
                    if (jSONObject4.has("deeplink_context")) {
                        JSONObject jSONObject5 = jSONObject4.getJSONObject("deeplink_context");
                        if (jSONObject5.has("promo_code")) {
                            mmVar.e = jSONObject5.getString("promo_code");
                        }
                    }
                }
                mmVar.d = h(mmVar.c);
                return mmVar;
            }
        } catch (FacebookException e) {
            g29.g0(g, "Unable to parse AppLink JSON", e);
        } catch (JSONException e2) {
            g29.g0(g, "Unable to parse AppLink JSON", e2);
        }
        return null;
    }

    public static void c(Context context, b bVar) {
        d(context, null, bVar);
    }

    public static void d(Context context, String str, b bVar) {
        v29.m(context, "context");
        v29.m(bVar, "completionHandler");
        if (str == null) {
            str = g29.F(context);
        }
        v29.m(str, "applicationId");
        w92.t().execute(new a(context.getApplicationContext(), str, bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Context context, String str, b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", "DEFERRED_APP_LINK");
            g29.z0(jSONObject, kv.k(context), AppEventsLogger.b(context), w92.y(context), context);
            g29.A0(jSONObject, w92.l());
            jSONObject.put("application_package_name", context.getPackageName());
            String format = String.format("%s/activities", str);
            mm mmVar = null;
            try {
                JSONObject c = GraphRequest.B(null, format, jSONObject, null).k().c();
                if (c != null) {
                    String optString = c.optString("applink_args");
                    long optLong = c.optLong("click_time", -1L);
                    String optString2 = c.optString("applink_class");
                    String optString3 = c.optString("applink_url");
                    if (!TextUtils.isEmpty(optString) && (mmVar = b(optString)) != null) {
                        if (optLong != -1) {
                            try {
                                JSONObject jSONObject2 = mmVar.c;
                                if (jSONObject2 != null) {
                                    jSONObject2.put("com.facebook.platform.APPLINK_TAP_TIME_UTC", optLong);
                                }
                                Bundle bundle = mmVar.d;
                                if (bundle != null) {
                                    bundle.putString("com.facebook.platform.APPLINK_TAP_TIME_UTC", Long.toString(optLong));
                                }
                            } catch (JSONException unused) {
                                g29.f0(g, "Unable to put tap time in AppLinkData.arguments");
                            }
                        }
                        if (optString2 != null) {
                            try {
                                JSONObject jSONObject3 = mmVar.c;
                                if (jSONObject3 != null) {
                                    jSONObject3.put("com.facebook.platform.APPLINK_NATIVE_CLASS", optString2);
                                }
                                Bundle bundle2 = mmVar.d;
                                if (bundle2 != null) {
                                    bundle2.putString("com.facebook.platform.APPLINK_NATIVE_CLASS", optString2);
                                }
                            } catch (JSONException unused2) {
                                g29.f0(g, "Unable to put app link class name in AppLinkData.arguments");
                            }
                        }
                        if (optString3 != null) {
                            try {
                                JSONObject jSONObject4 = mmVar.c;
                                if (jSONObject4 != null) {
                                    jSONObject4.put("com.facebook.platform.APPLINK_NATIVE_URL", optString3);
                                }
                                Bundle bundle3 = mmVar.d;
                                if (bundle3 != null) {
                                    bundle3.putString("com.facebook.platform.APPLINK_NATIVE_URL", optString3);
                                }
                            } catch (JSONException unused3) {
                                g29.f0(g, "Unable to put app link URL in AppLinkData.arguments");
                            }
                        }
                    }
                }
            } catch (Exception unused4) {
                g29.f0(g, "Unable to fetch deferred applink from server");
            }
            bVar.a(mmVar);
        } catch (JSONException e) {
            throw new FacebookException("An error occurred while preparing deferred app link", e);
        }
    }

    private static JSONObject f(Uri uri) {
        if (c11.d(mm.class) || uri == null) {
            return null;
        }
        try {
            String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return null;
            }
            try {
                return new JSONObject(queryParameter);
            } catch (JSONException unused) {
                return null;
            }
        } catch (Throwable th) {
            c11.b(th, mm.class);
            return null;
        }
    }

    private static Bundle h(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                bundle.putBundle(next, h((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int i = 0;
                if (jSONArray.length() == 0) {
                    bundle.putStringArray(next, new String[0]);
                } else {
                    Object obj2 = jSONArray.get(0);
                    if (obj2 instanceof JSONObject) {
                        Bundle[] bundleArr = new Bundle[jSONArray.length()];
                        while (i < jSONArray.length()) {
                            bundleArr[i] = h(jSONArray.getJSONObject(i));
                            i++;
                        }
                        bundle.putParcelableArray(next, bundleArr);
                    } else {
                        if (obj2 instanceof JSONArray) {
                            throw new FacebookException("Nested arrays are not supported.");
                        }
                        String[] strArr = new String[jSONArray.length()];
                        while (i < jSONArray.length()) {
                            strArr[i] = jSONArray.get(i).toString();
                            i++;
                        }
                        bundle.putStringArray(next, strArr);
                    }
                }
            } else {
                bundle.putString(next, obj.toString());
            }
        }
        return bundle;
    }

    public Uri g() {
        return this.b;
    }
}
