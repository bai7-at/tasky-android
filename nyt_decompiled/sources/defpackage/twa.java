package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class twa implements uxa {
    twa() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxa
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        wlb wlbVar = (wlb) obj;
        WindowManager windowManager = (WindowManager) wlbVar.getContext().getSystemService("window");
        dyf.r();
        DisplayMetrics U = wxf.U(windowManager);
        int i = U.widthPixels;
        int i2 = U.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) wlbVar).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        wlbVar.t("locationReady", hashMap);
        fgb.g("GET LOCATION COMPILED");
    }
}
