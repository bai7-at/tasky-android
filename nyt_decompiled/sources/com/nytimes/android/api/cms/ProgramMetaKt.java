package com.nytimes.android.api.cms;

import defpackage.zq3;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ProgramMetaKt {
    public static final ProgramMeta getHomeProgramMeta(LatestFeed latestFeed) {
        zq3.h(latestFeed, "<this>");
        Map<String, ProgramMeta> programs = latestFeed.getPrograms();
        zq3.e(programs);
        ProgramMeta programMeta = programs.get("home");
        zq3.e(programMeta);
        return programMeta;
    }
}
