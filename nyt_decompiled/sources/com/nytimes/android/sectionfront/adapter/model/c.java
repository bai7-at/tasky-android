package com.nytimes.android.sectionfront.adapter.model;

import android.app.Application;
import defpackage.b24;
import defpackage.bt5;
import defpackage.op4;
import defpackage.u57;

/* loaded from: classes4.dex */
public abstract class c implements op4 {
    public static void a(SFSummaryController sFSummaryController, Application application) {
        sFSummaryController.application = application;
    }

    public static void b(SFSummaryController sFSummaryController, b24 b24Var) {
        sFSummaryController.ledeSFSummaryProcessor = b24Var;
    }

    public static void c(SFSummaryController sFSummaryController, bt5 bt5Var) {
        sFSummaryController.phoenixDeviceUtils = bt5Var;
    }

    public static void d(SFSummaryController sFSummaryController, u57 u57Var) {
        sFSummaryController.sfSummaryProcessor = u57Var;
    }
}
