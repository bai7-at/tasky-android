package defpackage;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public class qf9 {
    private final WebkitToCompatConverterBoundaryInterface a;

    public qf9(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.a = webkitToCompatConverterBoundaryInterface;
    }

    public fe9 a(WebSettings webSettings) {
        return new fe9((WebSettingsBoundaryInterface) zb0.a(WebSettingsBoundaryInterface.class, this.a.convertSettings(webSettings)));
    }
}
