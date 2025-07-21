package io.embrace.android.embracesdk.capture.powersave;

import defpackage.ss2;
import defpackage.ww8;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
final /* synthetic */ class LowPowerDataSource$receiver$1 extends FunctionReferenceImpl implements ss2 {
    LowPowerDataSource$receiver$1(LowPowerDataSource lowPowerDataSource) {
        super(1, lowPowerDataSource, LowPowerDataSource.class, "onPowerSaveModeChanged", "onPowerSaveModeChanged(Z)V", 0);
    }

    @Override // defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return ww8.a;
    }

    public final void invoke(boolean z) {
        ((LowPowerDataSource) this.receiver).onPowerSaveModeChanged(z);
    }
}
