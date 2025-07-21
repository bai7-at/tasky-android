package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Resources;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.provider.Settings;
import com.facebook.AuthenticationTokenClaims;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class nn9 implements bo9 {
    public static final a c = new a(null);
    private final UiModeManager a;
    private final Context b;

    public static final class a {
        private a() {
        }

        private final boolean b(CameraCharacteristics cameraCharacteristics) {
            Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        private final so c(Context context) {
            so soVar = new so();
            try {
                CameraManager cameraManager = (CameraManager) context.getApplicationContext().getSystemService("camera");
                if (cameraManager == null) {
                    return soVar;
                }
                String[] cameraIdList = cameraManager.getCameraIdList();
                zq3.d(cameraIdList, "manager.cameraIdList");
                if (cameraIdList.length == 0) {
                    return soVar;
                }
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraIdList[0]);
                zq3.d(cameraCharacteristics, "manager.getCameraCharacteristics(ids[0])");
                return d(cameraCharacteristics);
            } catch (Exception unused) {
                return soVar;
            }
        }

        private final so d(CameraCharacteristics cameraCharacteristics) {
            so soVar = new so();
            soVar.put(AuthenticationTokenClaims.JSON_KEY_NAME, (String) cameraCharacteristics.get(CameraCharacteristics.INFO_VERSION));
            soVar.put("flash", String.valueOf(b(cameraCharacteristics)));
            return soVar;
        }

        public final String a(Context context) {
            zq3.i(context, "context");
            so soVar = new so();
            boolean z = mx0.a(context, "android.permission.CAMERA") == 0;
            if (z) {
                soVar = c(context);
            }
            String a = new kn9(z, soVar).a();
            zq3.d(a, "CameraData(auth, info).customJsonString()");
            return a;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public nn9(Context context) {
        zq3.i(context, "context");
        this.b = context;
        Object systemService = context.getSystemService("uimode");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.UiModeManager");
        }
        this.a = (UiModeManager) systemService;
    }

    private final String b() {
        int currentModeType = this.a.getCurrentModeType();
        if (currentModeType == 4) {
            return "tv";
        }
        if (currentModeType == 3) {
            return "car";
        }
        if (currentModeType == 6) {
            return "watch";
        }
        if (currentModeType == 7) {
            return "headset";
        }
        Resources resources = this.b.getResources();
        zq3.d(resources, "context.resources");
        int i = resources.getConfiguration().screenLayout & 15;
        if (i == 1 || i == 2) {
            return "phone";
        }
        if (i == 3 || i == 4) {
            return "tablet";
        }
        return "n:" + currentModeType;
    }

    private final String c() {
        String string = Settings.Global.getString(this.b.getContentResolver(), "device_name");
        String string2 = string != null ? string : Settings.Secure.getString(this.b.getContentResolver(), "bluetooth_name");
        return string2 != null ? string2 : string;
    }

    @Override // defpackage.bo9
    public Map a() {
        Map m = t.m(du8.a("d_name", c()), du8.a("mnf", Build.MANUFACTURER), du8.a("mdl", Build.MODEL), du8.a("d_uii", b()), du8.a("dev", Build.DEVICE), du8.a("d_board", Build.BOARD), du8.a("fgp", Build.FINGERPRINT), du8.a("hrd", Build.HARDWARE), du8.a("prd", Build.PRODUCT), du8.a("camera", c.a(this.b)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : m.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }
}
