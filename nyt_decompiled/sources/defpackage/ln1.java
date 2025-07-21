package defpackage;

import com.nytimes.android.ribbon.config.RibbonConfig;
import java.util.UUID;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class ln1 {
    private final MutableStateFlow a = StateFlowKt.MutableStateFlow(f02.a);
    private b65 b;

    public final StateFlow a() {
        return this.a;
    }

    public final b65 b() {
        return this.b;
    }

    public final Object c(String str, by0 by0Var) {
        RibbonConfig a = RibbonConfig.Companion.a(str);
        if (a == null) {
            a = RibbonConfig.TODAY;
        }
        MutableStateFlow mutableStateFlow = this.a;
        UUID randomUUID = UUID.randomUUID();
        zq3.g(randomUUID, "randomUUID(...)");
        Object emit = mutableStateFlow.emit(new yl9(a, randomUUID), by0Var);
        return emit == a.h() ? emit : ww8.a;
    }

    public final void d(b65 b65Var) {
        this.b = b65Var;
    }
}
