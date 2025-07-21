package com.nytimes.android.eventtracker.model;

import defpackage.bt3;
import defpackage.et3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class State {
    private final boolean a;

    public State(@bt3(name = "foreground") boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final State copy(@bt3(name = "foreground") boolean z) {
        return new State(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof State) && this.a == ((State) obj).a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public String toString() {
        return "State(foreground=" + this.a + ")";
    }
}
