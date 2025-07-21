package com.nytimes.android;

import defpackage.cb2;
import defpackage.op4;
import defpackage.qv6;

/* loaded from: classes2.dex */
public abstract class i implements op4 {
    public static void a(InstallReferrerReceiver installReferrerReceiver, cb2 cb2Var) {
        installReferrerReceiver.featureFlagUtil = cb2Var;
    }

    public static void b(InstallReferrerReceiver installReferrerReceiver, qv6 qv6Var) {
        installReferrerReceiver.remoteConfig = qv6Var;
    }
}
