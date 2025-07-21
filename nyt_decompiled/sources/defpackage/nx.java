package defpackage;

import android.view.View;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public abstract class nx {
    public static final MutableStateFlow a(View view) {
        zq3.h(view, "<this>");
        Object tag = view.getTag(fg6.balloon_height);
        MutableStateFlow mutableStateFlow = tag instanceof MutableStateFlow ? (MutableStateFlow) tag : null;
        if (mutableStateFlow != null) {
            return mutableStateFlow;
        }
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Integer.MAX_VALUE);
        view.setTag(fg6.balloon_height, MutableStateFlow);
        return MutableStateFlow;
    }
}
