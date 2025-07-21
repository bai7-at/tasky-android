package com.nytimes.android.api.config.model;

import defpackage.zq3;
import java.util.List;

/* loaded from: classes3.dex */
public final class MessageTargets {
    private final List<Entitlement> entitlements;
    private final String relationship;

    public MessageTargets(String str, List<Entitlement> list) {
        zq3.h(str, "relationship");
        zq3.h(list, "entitlements");
        this.relationship = str;
        this.entitlements = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageTargets copy$default(MessageTargets messageTargets, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageTargets.relationship;
        }
        if ((i & 2) != 0) {
            list = messageTargets.entitlements;
        }
        return messageTargets.copy(str, list);
    }

    public final String component1() {
        return this.relationship;
    }

    public final List<Entitlement> component2() {
        return this.entitlements;
    }

    public final MessageTargets copy(String str, List<Entitlement> list) {
        zq3.h(str, "relationship");
        zq3.h(list, "entitlements");
        return new MessageTargets(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageTargets)) {
            return false;
        }
        MessageTargets messageTargets = (MessageTargets) obj;
        return zq3.c(this.relationship, messageTargets.relationship) && zq3.c(this.entitlements, messageTargets.entitlements);
    }

    public final List<Entitlement> getEntitlements() {
        return this.entitlements;
    }

    public final String getRelationship() {
        return this.relationship;
    }

    public int hashCode() {
        return (this.relationship.hashCode() * 31) + this.entitlements.hashCode();
    }

    public String toString() {
        return "MessageTargets(relationship=" + this.relationship + ", entitlements=" + this.entitlements + ")";
    }
}
