package defpackage;

import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class dx8 {
    public static final dx8 a = new dx8();
    private static final String b = dx8.class.getCanonicalName();
    private static Class c;

    private dx8() {
    }

    public static final void a() {
        d("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    private final Class b() {
        Class<?> cls = Class.forName("com.unity3d.player.UnityPlayer");
        zq3.g(cls, "forName(UNITY_PLAYER_CLASS)");
        return cls;
    }

    public static final void c(String str) {
        d("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    public static final void d(String str, String str2, String str3) {
        try {
            if (c == null) {
                c = a.b();
            }
            Class cls = c;
            if (cls == null) {
                zq3.z("unityPlayer");
                throw null;
            }
            Method method = cls.getMethod("UnitySendMessage", String.class, String.class, String.class);
            zq3.g(method, "unityPlayer.getMethod(\n              UNITY_SEND_MESSAGE_METHOD, String::class.java, String::class.java, String::class.java)");
            Class cls2 = c;
            if (cls2 != null) {
                method.invoke(cls2, str, str2, str3);
            } else {
                zq3.z("unityPlayer");
                throw null;
            }
        } catch (Exception e) {
            Log.e(b, "Failed to send message to Unity", e);
        }
    }
}
