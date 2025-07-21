package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.internal.Constants;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFc1ySDK {

    @VisibleForTesting
    private static String AFInAppEventParameterName = null;

    @VisibleForTesting
    private static String AFInAppEventType = null;

    @VisibleForTesting
    private static String AFKeystoreWrapper = null;
    private static int AFLogger = 0;
    private static int AFVersionDeclaration = 1;
    private static int afInfoLog;

    @VisibleForTesting
    private static String valueOf;

    @VisibleForTesting
    private static String values;
    private final AFb1ySDK afDebugLog;
    private final AppsFlyerProperties afErrorLog;
    private final AFb1dSDK afRDLog;

    static {
        AFInAppEventType();
        valueOf = "https://%smonitorsdk.%s/remote-debug?app_id=";
        AFKeystoreWrapper = "https://cdn-settings.appsflyersdk.com/android/v1/%s/settings";
        AFInAppEventType = "https://cdn-testsettings.appsflyersdk.com/android/v1/%s/settings";
        values = "https://%sgcdsdk.%s/install_data/v4.0/";
        AFInAppEventParameterName = "https://%sonelink.%s/shortlink-sdk/v2";
        AFVersionDeclaration = (AFLogger + 57) % 128;
    }

    public AFc1ySDK(AFb1ySDK aFb1ySDK, AFb1dSDK aFb1dSDK, AppsFlyerProperties appsFlyerProperties) {
        this.afDebugLog = aFb1ySDK;
        this.afRDLog = aFb1dSDK;
        this.afErrorLog = appsFlyerProperties;
    }

    static void AFInAppEventType() {
        afInfoLog = 91;
    }

    @NonNull
    public final AFb1bSDK<String> AFInAppEventParameterName(Map<String, Object> map, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("https://%sviap.%s/api/v1/android/validate_purchase?app_id=", AppsFlyerLib.getInstance().getHostPrefix(), AFa1aSDK.values().getHostName()));
        sb.append(this.afRDLog.AFInAppEventType.AFKeystoreWrapper.getPackageName());
        try {
            AFb1bSDK<String> AFInAppEventParameterName2 = AFInAppEventParameterName(new AFb1wSDK(sb.toString(), (byte[]) ((Class) AFa1zSDK.AFInAppEventParameterName((char) (49431 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 62, 31 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("AFKeystoreWrapper", Map.class, String.class).invoke(null, map, str), "POST", Collections.emptyMap(), true), new AFc1vSDK());
            int i = AFLogger + 25;
            AFVersionDeclaration = i % 128;
            if (i % 2 == 0) {
                int i2 = 14 / 0;
            }
            return AFInAppEventParameterName2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @NonNull
    public final AFb1bSDK<AFb1vSDK> AFKeystoreWrapper(boolean z, @NonNull String str, int i) {
        String str2;
        int i2 = (AFVersionDeclaration + 81) % 128;
        AFLogger = i2;
        if (!z) {
            str2 = AFKeystoreWrapper;
        } else {
            str2 = AFInAppEventType;
            AFVersionDeclaration = (i2 + 55) % 128;
        }
        AFb1wSDK aFb1wSDK = new AFb1wSDK(String.format(str2, str), "GET");
        aFb1wSDK.afDebugLog = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        return AFInAppEventParameterName(aFb1wSDK, new AFc1wSDK());
    }

    @NonNull
    public final AFb1bSDK<String> valueOf(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFa1aSDK.values().getHostName()));
        sb.append(this.afRDLog.AFInAppEventType.AFKeystoreWrapper.getPackageName());
        AFb1bSDK<String> AFInAppEventParameterName2 = AFInAppEventParameterName(new AFb1wSDK(sb.toString(), new JSONObject(map).toString().getBytes(), "POST", Collections.emptyMap(), false), new AFc1vSDK());
        AFLogger = (AFVersionDeclaration + 87) % 128;
        return AFInAppEventParameterName2;
    }

    @NonNull
    public final AFb1bSDK<String> AFInAppEventType(Map<String, Object> map, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("https://%sars.%s/api/v2/android/validate_subscription?app_id=", AppsFlyerLib.getInstance().getHostPrefix(), AFa1aSDK.values().getHostName()));
        sb.append(this.afRDLog.AFInAppEventType.AFKeystoreWrapper.getPackageName());
        try {
            AFb1bSDK<String> AFInAppEventParameterName2 = AFInAppEventParameterName(new AFb1wSDK(sb.toString(), (byte[]) ((Class) AFa1zSDK.AFInAppEventParameterName((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 49431), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 62, 31 - (ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("AFKeystoreWrapper", Map.class, String.class).invoke(null, map, str), "POST", Collections.emptyMap(), true), new AFc1vSDK());
            int i = AFVersionDeclaration + 115;
            AFLogger = i % 128;
            if (i % 2 != 0) {
                int i2 = 85 / 0;
            }
            return AFInAppEventParameterName2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final AFb1bSDK<String> AFKeystoreWrapper(AFa1qSDK aFa1qSDK, String str) {
        try {
            AFb1bSDK<String> AFInAppEventParameterName2 = AFInAppEventParameterName(new AFb1wSDK(aFa1qSDK.afErrorLog, (byte[]) ((Class) AFa1zSDK.AFInAppEventParameterName((char) (49431 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 62 - Color.alpha(0), 30 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).getMethod("AFKeystoreWrapper", AFa1qSDK.class, String.class).invoke(null, aFa1qSDK, str), "POST", Collections.emptyMap(), aFa1qSDK.AFKeystoreWrapper()), new AFc1vSDK());
            int i = AFVersionDeclaration + 9;
            AFLogger = i % 128;
            if (i % 2 == 0) {
                return AFInAppEventParameterName2;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final AFb1bSDK<String> valueOf(@NonNull String str, @NonNull Map<String, String> map, @Nullable String str2, @NonNull UUID uuid, @NonNull String str3) {
        String obj = uuid.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", "-1");
        hashMap.put("uuid", obj);
        hashMap.put("data", map);
        hashMap.put("meta", AFInAppEventParameterName());
        if (str2 != null) {
            AFLogger = (AFVersionDeclaration + 81) % 128;
            hashMap.put("brand_domain", str2);
            AFLogger = (AFVersionDeclaration + 97) % 128;
        }
        String jSONObject = AFa1pSDK.valueOf(hashMap).toString();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(AFInAppEventType(12 - TextUtils.indexOf("", "", 0), "￡\u0005\u0012\u0015\u0014\u0001\u000e\u0007\t\ufff3ￍ\u0006", true, TextUtils.getTrimmedLength("") + 1, ((byte) KeyEvent.getModifierMetaStateMask()) + 188).intern(), AFKeystoreWrapper(str3, obj, "POST", jSONObject));
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFa1aSDK.values().getHostName()));
        sb.append("/");
        sb.append(str);
        return valueOf(new AFb1wSDK(sb.toString(), jSONObject.getBytes(Charset.forName(Constants.DEFAULT_ENCODING)), "POST", hashMap2, false), new AFc1vSDK(), true);
    }

    public final AFb1bSDK<Map<String, Object>> AFInAppEventParameterName(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(values, AppsFlyerLib.getInstance().getHostPrefix(), AFa1aSDK.values().getHostName()));
        sb.append(this.afRDLog.AFInAppEventType.AFKeystoreWrapper.getPackageName());
        sb.append(str);
        sb.append("?devkey=");
        sb.append(str2);
        sb.append("&device_id=");
        sb.append(AFb1rSDK.AFInAppEventParameterName(new WeakReference(this.afRDLog.AFInAppEventType.AFKeystoreWrapper)));
        String obj = sb.toString();
        HashMap hashMap = new HashMap();
        hashMap.put(Headers.CONNECTION, "close");
        AFb1wSDK aFb1wSDK = new AFb1wSDK(obj, null, "GET", hashMap, false);
        aFb1wSDK.afDebugLog = Constants.MAXIMUM_UPLOAD_PARTS;
        AFb1bSDK<Map<String, Object>> AFInAppEventParameterName2 = AFInAppEventParameterName(aFb1wSDK, new AFc1zSDK());
        AFLogger = (AFVersionDeclaration + 89) % 128;
        return AFInAppEventParameterName2;
    }

    public final AFb1bSDK<String> AFInAppEventType(@NonNull String str) {
        AFb1wSDK aFb1wSDK = new AFb1wSDK(str, null, "GET", Collections.emptyMap(), false);
        aFb1wSDK.afDebugLog = Constants.MAXIMUM_UPLOAD_PARTS;
        aFb1wSDK.AFInAppEventType = false;
        AFb1bSDK<String> AFInAppEventParameterName2 = AFInAppEventParameterName(aFb1wSDK, new AFc1vSDK());
        AFLogger = (AFVersionDeclaration + 107) % 128;
        return AFInAppEventParameterName2;
    }

    private static String AFKeystoreWrapper(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String AFInAppEventParameterName2 = AFb1sSDK.AFInAppEventParameterName((String[]) arrayList.toArray(new String[0]));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append("v2");
        String AFInAppEventType2 = AFb1sSDK.AFInAppEventType(AFInAppEventParameterName2, sb.toString());
        int i = AFLogger + 57;
        AFVersionDeclaration = i % 128;
        if (i % 2 != 0) {
            return AFInAppEventType2;
        }
        throw null;
    }

    private static String AFInAppEventType(int i, String str, boolean z, int i2, int i3) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (AFf1xSDK.AFInAppEventType) {
            try {
                char[] cArr3 = new char[i];
                AFf1xSDK.AFInAppEventParameterName = 0;
                while (true) {
                    int i4 = AFf1xSDK.AFInAppEventParameterName;
                    if (i4 >= i) {
                        break;
                    }
                    AFf1xSDK.valueOf = cArr2[i4];
                    cArr3[AFf1xSDK.AFInAppEventParameterName] = (char) (AFf1xSDK.valueOf + i3);
                    int i5 = AFf1xSDK.AFInAppEventParameterName;
                    cArr3[i5] = (char) (cArr3[i5] - afInfoLog);
                    AFf1xSDK.AFInAppEventParameterName = i5 + 1;
                }
                if (i2 > 0) {
                    AFf1xSDK.values = i2;
                    char[] cArr4 = new char[i];
                    System.arraycopy(cArr3, 0, cArr4, 0, i);
                    int i6 = AFf1xSDK.values;
                    System.arraycopy(cArr4, 0, cArr3, i - i6, i6);
                    int i7 = AFf1xSDK.values;
                    System.arraycopy(cArr4, i7, cArr3, 0, i - i7);
                }
                if (z) {
                    char[] cArr5 = new char[i];
                    AFf1xSDK.AFInAppEventParameterName = 0;
                    while (true) {
                        int i8 = AFf1xSDK.AFInAppEventParameterName;
                        if (i8 >= i) {
                            break;
                        }
                        cArr5[i8] = cArr3[(i - i8) - 1];
                        AFf1xSDK.AFInAppEventParameterName = i8 + 1;
                    }
                    cArr3 = cArr5;
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    private boolean AFKeystoreWrapper() {
        int i = AFLogger + 87;
        AFVersionDeclaration = i % 128;
        int i2 = i % 2;
        boolean z = this.afErrorLog.getBoolean(AppsFlyerProperties.HTTP_CACHE, true);
        if (i2 == 0) {
            if (z) {
                return false;
            }
        } else if (z) {
            return false;
        }
        AFVersionDeclaration = (AFLogger + 57) % 128;
        return true;
    }

    public final AFb1bSDK<Map<String, String>> valueOf(@NonNull String str, @NonNull String str2, @NonNull UUID uuid, @NonNull String str3) {
        String obj = uuid.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFa1aSDK.values().getHostName()));
        sb.append("/");
        sb.append(str);
        sb.append("?id=");
        sb.append(str2);
        String obj2 = sb.toString();
        Map<String, Object> AFInAppEventParameterName2 = AFInAppEventParameterName();
        String valueOf2 = String.valueOf(AFInAppEventParameterName2.get("build_number"));
        HashMap hashMap = new HashMap();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", valueOf2);
        hashMap.put("Af-Meta-Counter", String.valueOf(AFInAppEventParameterName2.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(AFInAppEventParameterName2.get("model")));
        hashMap.put("Af-Meta-Platform", String.valueOf(AFInAppEventParameterName2.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(AFInAppEventParameterName2.get("sdk")));
        hashMap.put(AFInAppEventType(13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "￡\u0005\u0012\u0015\u0014\u0001\u000e\u0007\t\ufff3ￍ\u0006", true, 1 - View.getDefaultSize(0, 0), TextUtils.lastIndexOf("", '0', 0) + 188).intern(), AFKeystoreWrapper(str3, obj, "GET", obj, str, str2, valueOf2));
        AFb1bSDK<Map<String, String>> AFInAppEventParameterName3 = AFInAppEventParameterName(new AFb1wSDK(obj2, null, "GET", hashMap, false), new AFc1uSDK());
        int i = AFVersionDeclaration + 31;
        AFLogger = i % 128;
        if (i % 2 == 0) {
            return AFInAppEventParameterName3;
        }
        throw null;
    }

    public final AFb1bSDK<String> AFInAppEventParameterName(AFe1wSDK aFe1wSDK) {
        AFb1bSDK<String> AFInAppEventParameterName2 = AFInAppEventParameterName(new AFb1wSDK(aFe1wSDK.afErrorLog, aFe1wSDK.values(), "POST", Collections.emptyMap(), true), new AFc1vSDK());
        AFVersionDeclaration = (AFLogger + 55) % 128;
        return AFInAppEventParameterName2;
    }

    private <T> AFb1bSDK<T> AFInAppEventParameterName(AFb1wSDK aFb1wSDK, AFc1pSDK<T> aFc1pSDK) {
        int i = AFVersionDeclaration + 21;
        AFLogger = i % 128;
        if (i % 2 == 0) {
            AFb1bSDK<T> valueOf2 = valueOf(aFb1wSDK, aFc1pSDK, AFKeystoreWrapper());
            int i2 = AFVersionDeclaration + 5;
            AFLogger = i2 % 128;
            if (i2 % 2 == 0) {
                return valueOf2;
            }
            throw null;
        }
        valueOf(aFb1wSDK, aFc1pSDK, AFKeystoreWrapper());
        throw null;
    }

    @VisibleForTesting
    private Map<String, Object> AFInAppEventParameterName() {
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.8.2");
        hashMap.put("counter", Integer.valueOf(this.afRDLog.valueOf.values("appsFlyerCount")));
        hashMap.put("model", Build.MODEL);
        hashMap.put(AFInAppEventType(5 - KeyEvent.normalizeMetaState(0), "\ufffb\u000b\ufffa\u0007�", false, 5 - TextUtils.getTrimmedLength(""), 194 - TextUtils.getTrimmedLength("")).intern(), Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        Context context = this.afRDLog.AFInAppEventType.AFKeystoreWrapper;
        hashMap.put("app_version_name", AFb1wSDK.valueOf(context, context.getPackageName()));
        hashMap.put("app_id", this.afRDLog.AFInAppEventType.AFKeystoreWrapper.getPackageName());
        hashMap.put("platformextension", new AFb1uSDK().valueOf());
        AFLogger = (AFVersionDeclaration + 17) % 128;
        return hashMap;
    }

    private <T> AFb1bSDK<T> valueOf(AFb1wSDK aFb1wSDK, AFc1pSDK<T> aFc1pSDK, boolean z) {
        aFb1wSDK.valueOf = z;
        AFb1bSDK<T> aFb1bSDK = new AFb1bSDK<>(aFb1wSDK, this.afDebugLog.values, aFc1pSDK);
        AFLogger = (AFVersionDeclaration + 101) % 128;
        return aFb1bSDK;
    }
}
