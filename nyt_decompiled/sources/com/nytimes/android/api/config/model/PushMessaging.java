package com.nytimes.android.api.config.model;

import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class PushMessaging {
    private final List<NotificationsGroup> notificationsGroups;

    public PushMessaging(List<NotificationsGroup> list) {
        this.notificationsGroups = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PushMessaging copy$default(PushMessaging pushMessaging, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pushMessaging.notificationsGroups;
        }
        return pushMessaging.copy(list);
    }

    public final List<NotificationsGroup> component1() {
        return this.notificationsGroups;
    }

    public final PushMessaging copy(List<NotificationsGroup> list) {
        return new PushMessaging(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PushMessaging) && zq3.c(this.notificationsGroups, ((PushMessaging) obj).notificationsGroups);
    }

    public final List<Channel> getAllChannels() {
        ArrayList arrayList;
        List<NotificationsGroup> list = this.notificationsGroups;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                i.B(arrayList, ((NotificationsGroup) it2.next()).getChannels());
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? i.l() : arrayList;
    }

    public final List<NotificationsGroup> getNotificationsGroups() {
        return this.notificationsGroups;
    }

    public int hashCode() {
        List<NotificationsGroup> list = this.notificationsGroups;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "PushMessaging(notificationsGroups=" + this.notificationsGroups + ")";
    }
}
