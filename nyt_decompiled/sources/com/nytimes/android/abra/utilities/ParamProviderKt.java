package com.nytimes.android.abra.utilities;

import android.graphics.PointF;
import defpackage.zq3;

/* loaded from: classes2.dex */
public final class ParamProviderKt {
    public static final String PARAM_AGENT_ID = "agent_id";
    public static final String PARAM_INTEGRATION = "integration";
    public static final String PARAM_OVERRIDES = "overrides";
    public static final String PARAM_SMALLEST_WIDTH = "smallest_width";
    public static final String PARAM_TESTS = "tests";
    public static final String PARAM_TIMEZONE = "timezone";
    public static final String PARAM_VIEWPORT_HEIGHT = "viewport_height";
    public static final String PARAM_VIEWPORT_WIDTH = "viewport_width";

    public static final float min(PointF pointF) {
        zq3.h(pointF, "<this>");
        return Math.min(pointF.x, pointF.y);
    }
}
