package com.nytimes.android.api.config.model;

import defpackage.zq3;
import java.util.List;

/* loaded from: classes3.dex */
public final class NotificationsGroup {
    private final List<Channel> channels;
    private final String title;

    public NotificationsGroup(String str, List<Channel> list) {
        zq3.h(str, "title");
        zq3.h(list, "channels");
        this.title = str;
        this.channels = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationsGroup copy$default(NotificationsGroup notificationsGroup, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationsGroup.title;
        }
        if ((i & 2) != 0) {
            list = notificationsGroup.channels;
        }
        return notificationsGroup.copy(str, list);
    }

    public final String component1() {
        return this.title;
    }

    public final List<Channel> component2() {
        return this.channels;
    }

    public final NotificationsGroup copy(String str, List<Channel> list) {
        zq3.h(str, "title");
        zq3.h(list, "channels");
        return new NotificationsGroup(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsGroup)) {
            return false;
        }
        NotificationsGroup notificationsGroup = (NotificationsGroup) obj;
        return zq3.c(this.title, notificationsGroup.title) && zq3.c(this.channels, notificationsGroup.channels);
    }

    public final List<Channel> getChannels() {
        return this.channels;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.channels.hashCode();
    }

    public String toString() {
        return "NotificationsGroup(title=" + this.title + ", channels=" + this.channels + ")";
    }
}
