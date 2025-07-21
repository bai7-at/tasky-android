package com.nytimes.android.messaging.dock;

import com.nytimes.android.logging.NYTLogger;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class DockDataKt {
    public static final Dock config(DockData dockData, Boolean bool, DockConfig dockConfig) {
        Object obj;
        zq3.h(dockData, "<this>");
        zq3.h(dockConfig, "config");
        if (dockConfig == DockConfig.DEFAULT) {
            return new Dock(dockData.isActive(), dockData.getDefaultDockText(), dockData.getDefaultLinkLocation());
        }
        DockConfig dockConfig2 = DockConfig.PLAY_TAB;
        if (dockConfig == dockConfig2 && zq3.c(bool, Boolean.TRUE)) {
            return new Dock(false, null, null, 6, null);
        }
        if (dockConfig != dockConfig2) {
            NYTLogger.g("GMAX: unable to determine display logic for dock with config " + dockConfig.name(), new Object[0]);
            return new Dock(false, null, null, 6, null);
        }
        String playTabDockText = dockData.getPlayTabDockText();
        List<DockUrgencyMessage> playTabUrgencyMessages = dockData.getPlayTabUrgencyMessages();
        if (playTabUrgencyMessages != null) {
            Iterator<T> it2 = playTabUrgencyMessages.iterator();
            while (true) {
                obj = null;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (isActive$default((DockUrgencyMessage) next, 0L, 1, null)) {
                    obj = next;
                    break;
                }
            }
            DockUrgencyMessage dockUrgencyMessage = (DockUrgencyMessage) obj;
            if (dockUrgencyMessage != null) {
                playTabDockText = dockUrgencyMessage.getText();
            }
        }
        return new Dock(dockData.isActive(), playTabDockText, dockData.getPlayTabLinkLocation());
    }

    public static final boolean isActive(DockUrgencyMessage dockUrgencyMessage, long j) {
        zq3.h(dockUrgencyMessage, "<this>");
        return j <= dockUrgencyMessage.getEndTimeInterval() && dockUrgencyMessage.getStartTimeInterval() <= j;
    }

    public static /* synthetic */ boolean isActive$default(DockUrgencyMessage dockUrgencyMessage, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Instant.now().getEpochSecond();
        }
        return isActive(dockUrgencyMessage, j);
    }
}
