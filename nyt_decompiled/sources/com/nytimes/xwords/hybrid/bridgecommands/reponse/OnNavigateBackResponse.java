package com.nytimes.xwords.hybrid.bridgecommands.reponse;

import defpackage.et3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class OnNavigateBackResponse {
    private final boolean a;

    public OnNavigateBackResponse(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnNavigateBackResponse) && this.a == ((OnNavigateBackResponse) obj).a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public String toString() {
        return "OnNavigateBackResponse(gamesOnNavigateBack=" + this.a + ")";
    }
}
