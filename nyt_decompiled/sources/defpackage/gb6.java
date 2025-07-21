package defpackage;

import android.os.PowerManager;
import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes4.dex */
public final class gb6 implements wk8 {
    private final PowerManager a;

    public gb6(PowerManager powerManager) {
        zq3.h(powerManager, "powerManager");
        this.a = powerManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ss2 ss2Var, int i) {
        zq3.h(ss2Var, "$f");
        ss2Var.invoke(Integer.valueOf(i));
    }

    @Override // defpackage.wk8
    public void a(final ss2 ss2Var) {
        zq3.h(ss2Var, QueryKeys.VISIT_FREQUENCY);
        this.a.addThermalStatusListener(new PowerManager.OnThermalStatusChangedListener() { // from class: fb6
            @Override // android.os.PowerManager.OnThermalStatusChangedListener
            public final void onThermalStatusChanged(int i) {
                gb6.c(ss2.this, i);
            }
        });
    }
}
