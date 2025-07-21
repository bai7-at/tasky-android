package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* loaded from: classes.dex */
public class fe9 {
    private final WebSettingsBoundaryInterface a;

    public fe9(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.a = webSettingsBoundaryInterface;
    }

    public void a(boolean z) {
        this.a.setAlgorithmicDarkeningAllowed(z);
    }

    public void b(int i) {
        this.a.setForceDark(i);
    }
}
