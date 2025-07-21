package com.nytimes.android.ribbon.destinations.audio;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.home.ui.hybrid.DestinationTabState;
import com.nytimes.android.ribbon.config.RibbonConfig;
import com.nytimes.android.ribbon.et2.DestinationEventTracker;
import com.nytimes.android.ribbon.et2.Key;
import defpackage.ai0;
import defpackage.c58;
import defpackage.di0;
import defpackage.g90;
import defpackage.mz;
import defpackage.pz;
import defpackage.s42;
import defpackage.s63;
import defpackage.tr3;
import defpackage.y25;
import defpackage.zq3;
import java.util.Locale;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class AudioViewModel extends q {
    private final tr3 a;
    private final mz b;
    private final DestinationEventTracker c;
    private final s63 d;
    private final DestinationTabState e;
    private final MutableStateFlow f;
    private final StateFlow g;

    public AudioViewModel(tr3 tr3Var, mz mzVar, DestinationEventTracker destinationEventTracker, s63 s63Var, DestinationTabState destinationTabState) {
        zq3.h(tr3Var, "itemToDetailNavigator");
        zq3.h(mzVar, "repo");
        zq3.h(destinationEventTracker, "destinationEventTracker");
        zq3.h(s63Var, "handoffManager");
        zq3.h(destinationTabState, "tabState");
        this.a = tr3Var;
        this.b = mzVar;
        this.c = destinationEventTracker;
        this.d = s63Var;
        this.e = destinationTabState;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(DownloadState.c.b);
        this.f = MutableStateFlow;
        this.g = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static /* synthetic */ Job m(AudioViewModel audioViewModel, pz pzVar, int i, Object obj) {
        if ((i & 1) != 0) {
            pzVar = null;
        }
        return audioViewModel.l(pzVar);
    }

    public final StateFlow g() {
        return this.g;
    }

    public final void i(ComponentActivity componentActivity) {
        this.d.a(c58.a.a, componentActivity);
    }

    public final boolean j() {
        return this.e.d(RibbonConfig.AUDIO.getId());
    }

    public final void k(ComponentActivity componentActivity, y25 y25Var) {
        zq3.h(y25Var, "item");
        this.a.a(componentActivity, y25Var);
    }

    public final Job l(pz pzVar) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new AudioViewModel$refreshAudioAssets$1(this, pzVar, null), 3, null);
        return launch$default;
    }

    public final void n(Key key) {
        zq3.h(key, TransferTable.COLUMN_KEY);
        this.c.r(key, RibbonConfig.AUDIO, new s42("view all audio", null, null, null, null, null, null, null, "audio panel", 254, null));
    }

    public final void o(Key key, int i, String str, int i2, String str2, String str3, String str4) {
        zq3.h(key, TransferTable.COLUMN_KEY);
        zq3.h(str, "blockLabel");
        zq3.h(str2, "contentUri");
        zq3.h(str3, "cardContentUrl");
        zq3.h(str4, "cardContentUri");
        DestinationEventTracker destinationEventTracker = this.c;
        RibbonConfig ribbonConfig = RibbonConfig.AUDIO;
        s42 s42Var = new s42(null, str2, null, null, null, null, null, null, "audio panel", 253, null);
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        destinationEventTracker.u(key, ribbonConfig, s42Var, new di0(new g90(lowerCase, null, null, Integer.valueOf(i), 2, null), new ai0(str4, str3, i2, null, null, 24, null), null, 4, null));
    }
}
