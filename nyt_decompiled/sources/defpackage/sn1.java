package defpackage;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class sn1 {
    public static final sn1 a = new sn1();
    private static MutableStateFlow b;
    private static final StateFlow c;
    public static final int d;

    static {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        b = MutableStateFlow;
        c = MutableStateFlow;
        d = 8;
    }

    private sn1() {
    }

    public final StateFlow a() {
        return c;
    }

    public final void b() {
        b.setValue(Boolean.TRUE);
    }
}
