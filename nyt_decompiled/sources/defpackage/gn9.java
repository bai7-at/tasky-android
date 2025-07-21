package defpackage;

import co.datadome.sdk.DataDomeSDK;

/* loaded from: classes.dex */
public abstract /* synthetic */ class gn9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DataDomeSDK.BackBehaviour.values().length];
        a = iArr;
        iArr[DataDomeSDK.BackBehaviour.BLOCKED.ordinal()] = 1;
        iArr[DataDomeSDK.BackBehaviour.GO_BACKGROUND.ordinal()] = 2;
        iArr[DataDomeSDK.BackBehaviour.GO_BACK.ordinal()] = 3;
    }
}
