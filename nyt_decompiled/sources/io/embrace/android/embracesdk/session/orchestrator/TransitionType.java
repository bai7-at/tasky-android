package io.embrace.android.embracesdk.session.orchestrator;

import defpackage.zq3;
import io.embrace.android.embracesdk.payload.Session;
import io.embrace.android.embracesdk.session.lifecycle.ProcessState;

/* loaded from: classes5.dex */
public enum TransitionType {
    INITIAL,
    END_MANUAL,
    ON_FOREGROUND,
    ON_BACKGROUND,
    CRASH;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[TransitionType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[TransitionType.ON_FOREGROUND.ordinal()] = 1;
            iArr[TransitionType.ON_BACKGROUND.ordinal()] = 2;
            int[] iArr2 = new int[ProcessState.values().length];
            $EnumSwitchMapping$1 = iArr2;
            ProcessState processState = ProcessState.FOREGROUND;
            iArr2[processState.ordinal()] = 1;
            int[] iArr3 = new int[ProcessState.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[processState.ordinal()] = 1;
            int[] iArr4 = new int[TransitionType.values().length];
            $EnumSwitchMapping$3 = iArr4;
            iArr4[TransitionType.END_MANUAL.ordinal()] = 1;
        }
    }

    public final ProcessState endState(ProcessState processState) {
        zq3.h(processState, "currentState");
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        return i != 1 ? i != 2 ? processState : ProcessState.BACKGROUND : ProcessState.FOREGROUND;
    }

    public final Session.LifeEventType lifeEventType(ProcessState processState) {
        zq3.h(processState, "currentState");
        return WhenMappings.$EnumSwitchMapping$3[ordinal()] != 1 ? WhenMappings.$EnumSwitchMapping$2[processState.ordinal()] != 1 ? Session.LifeEventType.BKGND_STATE : Session.LifeEventType.STATE : WhenMappings.$EnumSwitchMapping$1[processState.ordinal()] != 1 ? Session.LifeEventType.BKGND_MANUAL : Session.LifeEventType.MANUAL;
    }
}
