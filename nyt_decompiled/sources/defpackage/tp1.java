package defpackage;

import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.h;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class tp1 {
    public static final tp1 a = new tp1();
    private static final String b = tp1.class.getCanonicalName();
    private static final HashMap c = new HashMap();

    public static final class a implements NsdManager.RegistrationListener {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            zq3.h(nsdServiceInfo, "serviceInfo");
            tp1 tp1Var = tp1.a;
            tp1.a(this.b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            zq3.h(nsdServiceInfo, "NsdServiceInfo");
            if (zq3.c(this.a, nsdServiceInfo.getServiceName())) {
                return;
            }
            tp1 tp1Var = tp1.a;
            tp1.a(this.b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            zq3.h(nsdServiceInfo, "serviceInfo");
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            zq3.h(nsdServiceInfo, "serviceInfo");
        }
    }

    private tp1() {
    }

    public static final void a(String str) {
        if (c11.d(tp1.class)) {
            return;
        }
        try {
            a.b(str);
        } catch (Throwable th) {
            c11.b(th, tp1.class);
        }
    }

    private final void b(String str) {
        if (c11.d(this)) {
            return;
        }
        try {
            NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) c.get(str);
            if (registrationListener != null) {
                Object systemService = w92.l().getSystemService("servicediscovery");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
                }
                try {
                    ((NsdManager) systemService).unregisterService(registrationListener);
                } catch (IllegalArgumentException e) {
                    g29 g29Var = g29.a;
                    g29.e0(b, e);
                }
                c.remove(str);
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public static final Bitmap c(String str) {
        int e;
        int f;
        int[] iArr;
        Bitmap createBitmap;
        Bitmap bitmap = null;
        if (c11.d(tp1.class)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(EncodeHintType.class);
            enumMap.put((EnumMap) EncodeHintType.MARGIN, (EncodeHintType) 2);
            try {
                m80 a2 = new ex4().a(str, BarcodeFormat.QR_CODE, 200, 200, enumMap);
                e = a2.e();
                f = a2.f();
                iArr = new int[e * f];
                if (e > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        int i3 = i * f;
                        if (f > 0) {
                            int i4 = 0;
                            while (true) {
                                int i5 = i4 + 1;
                                iArr[i3 + i4] = a2.d(i4, i) ? -16777216 : -1;
                                if (i5 >= f) {
                                    break;
                                }
                                i4 = i5;
                            }
                        }
                        if (i2 >= e) {
                            break;
                        }
                        i = i2;
                    }
                }
                createBitmap = Bitmap.createBitmap(f, e, Bitmap.Config.ARGB_8888);
            } catch (WriterException unused) {
            }
            try {
                createBitmap.setPixels(iArr, 0, f, 0, 0, f, e);
                return createBitmap;
            } catch (WriterException unused2) {
                bitmap = createBitmap;
                return bitmap;
            }
        } catch (Throwable th) {
            c11.b(th, tp1.class);
            return null;
        }
    }

    public static final String d(Map map) {
        if (c11.d(tp1.class)) {
            return null;
        }
        if (map == null) {
            try {
                map = new HashMap();
            } catch (Throwable th) {
                c11.b(th, tp1.class);
                return null;
            }
        }
        String str = Build.DEVICE;
        zq3.g(str, "DEVICE");
        map.put("device", str);
        String str2 = Build.MODEL;
        zq3.g(str2, "MODEL");
        map.put("model", str2);
        String jSONObject = new JSONObject(map).toString();
        zq3.g(jSONObject, "JSONObject(deviceInfo as Map<*, *>).toString()");
        return jSONObject;
    }

    public static final boolean e() {
        if (c11.d(tp1.class)) {
            return false;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.a;
            rd2 f = FetchedAppSettingsManager.f(w92.m());
            if (f != null) {
                return f.k().contains(SmartLoginOption.Enabled);
            }
            return false;
        } catch (Throwable th) {
            c11.b(th, tp1.class);
            return false;
        }
    }

    public static final boolean f(String str) {
        if (c11.d(tp1.class)) {
            return false;
        }
        try {
            if (e()) {
                return a.g(str);
            }
            return false;
        } catch (Throwable th) {
            c11.b(th, tp1.class);
            return false;
        }
    }

    private final boolean g(String str) {
        if (c11.d(this)) {
            return false;
        }
        try {
            HashMap hashMap = c;
            if (hashMap.containsKey(str)) {
                return true;
            }
            String str2 = "fbsdk_" + zq3.q("android-", h.E(w92.A(), '.', '|', false, 4, null)) + '_' + ((Object) str);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = w92.l().getSystemService("servicediscovery");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
            }
            a aVar = new a(str2, str);
            hashMap.put(str, aVar);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, aVar);
            return true;
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }
}
