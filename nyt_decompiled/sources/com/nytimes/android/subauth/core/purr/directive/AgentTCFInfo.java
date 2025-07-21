package com.nytimes.android.subauth.core.purr.directive;

import defpackage.zq3;

/* loaded from: classes4.dex */
public final class AgentTCFInfo {
    private final String agentTCFNoticesHash;
    private final String agentTcfString;

    public AgentTCFInfo(String str, String str2) {
        zq3.h(str, "agentTcfString");
        zq3.h(str2, "agentTCFNoticesHash");
        this.agentTcfString = str;
        this.agentTCFNoticesHash = str2;
    }

    public static /* synthetic */ AgentTCFInfo copy$default(AgentTCFInfo agentTCFInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agentTCFInfo.agentTcfString;
        }
        if ((i & 2) != 0) {
            str2 = agentTCFInfo.agentTCFNoticesHash;
        }
        return agentTCFInfo.copy(str, str2);
    }

    public final String component1() {
        return this.agentTcfString;
    }

    public final String component2() {
        return this.agentTCFNoticesHash;
    }

    public final AgentTCFInfo copy(String str, String str2) {
        zq3.h(str, "agentTcfString");
        zq3.h(str2, "agentTCFNoticesHash");
        return new AgentTCFInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgentTCFInfo)) {
            return false;
        }
        AgentTCFInfo agentTCFInfo = (AgentTCFInfo) obj;
        return zq3.c(this.agentTcfString, agentTCFInfo.agentTcfString) && zq3.c(this.agentTCFNoticesHash, agentTCFInfo.agentTCFNoticesHash);
    }

    public final String getAgentTCFNoticesHash() {
        return this.agentTCFNoticesHash;
    }

    public final String getAgentTcfString() {
        return this.agentTcfString;
    }

    public int hashCode() {
        return (this.agentTcfString.hashCode() * 31) + this.agentTCFNoticesHash.hashCode();
    }

    public String toString() {
        return "AgentTCFInfo(agentTcfString=" + this.agentTcfString + ", agentTCFNoticesHash=" + this.agentTCFNoticesHash + ")";
    }
}
