package com.nytimes.android;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.Application;
import android.view.accessibility.AccessibilityManager;
import com.nytimes.android.logging.NYTLogger;
import defpackage.c04;
import defpackage.lc9;
import defpackage.qs2;
import defpackage.zq3;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class VoiceOverDetector {
    private final Application a;
    private final c04 b;

    public VoiceOverDetector(Application application) {
        zq3.h(application, "application");
        this.a = application;
        this.b = kotlin.c.a(new qs2() { // from class: com.nytimes.android.VoiceOverDetector$enabled$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                boolean z = false;
                try {
                    Object systemService = VoiceOverDetector.this.a().getApplicationContext().getSystemService("accessibility");
                    zq3.f(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
                    List<AccessibilityServiceInfo> enabledAccessibilityServiceList = ((AccessibilityManager) systemService).getEnabledAccessibilityServiceList(1);
                    zq3.e(enabledAccessibilityServiceList);
                    List<AccessibilityServiceInfo> list = enabledAccessibilityServiceList;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            String settingsActivityName = ((AccessibilityServiceInfo) it2.next()).getSettingsActivityName();
                            if (settingsActivityName != null && !kotlin.text.h.d0(settingsActivityName) && lc9.a().contains(settingsActivityName)) {
                                z = true;
                                break;
                            }
                        }
                    }
                } catch (Exception e) {
                    NYTLogger.i(e, "Unable to determine VoiceOver(Talkback) support", new Object[0]);
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public final Application a() {
        return this.a;
    }

    public final boolean b() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }
}
