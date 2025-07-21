package com.nytimes.android.eventtracker.devsettings;

import android.content.Context;
import com.nytimes.android.devsettings.common.DevSettingChoiceListPreferenceItem;
import com.nytimes.android.devsettings.common.DevSettingSimpleItem;
import com.nytimes.android.eventtracker.EventTracker;
import defpackage.f05;
import defpackage.tn1;
import defpackage.un1;
import defpackage.zn1;
import defpackage.zq3;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class ET2DevSettings {
    public static final ET2DevSettings a = new ET2DevSettings();

    private ET2DevSettings() {
    }

    private final tn1 c(EventTracker.Environment environment) {
        return new zn1(environment.name(), environment.name(), null, true, 4, null);
    }

    public final un1 a(Context context, String str) {
        zq3.h(context, "context");
        EventTracker.Environment[] values = EventTracker.Environment.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (EventTracker.Environment environment : values) {
            arrayList.add(a.c(environment));
        }
        return new DevSettingChoiceListPreferenceItem("Override ET2 Environment", "et2.environment.override", arrayList, c(EventTracker.Environment.PRODUCTION), null, f05.a.b(), str == null ? "Override ET2 Environment" : str, false, true, 144, null).j(context);
    }

    public final un1 b(String str) {
        return new DevSettingSimpleItem("Open ET2 Event Viewer", "WARNING: Requires ET2EventCaptureStreamCallback to be hooked into ET2 library", new ET2DevSettings$showET2EventViewerScreen$1(null), null, null, f05.a.b(), str == null ? "Open ET2 Event Viewer" : str, false, 152, null);
    }
}
