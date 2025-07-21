package com.nytimes.android.eventtracker.model;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class PreviousEventIds {
    public static final a Companion = new a(null);
    private final String a;
    private final String b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PreviousEventIds a(String str, String str2) {
            if (str == null && str2 == null) {
                return null;
            }
            return new PreviousEventIds(str, str2);
        }

        private a() {
        }
    }

    public PreviousEventIds(@bt3(name = "context_id") String str, @bt3(name = "pageview_id") String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final PreviousEventIds copy(@bt3(name = "context_id") String str, @bt3(name = "pageview_id") String str2) {
        return new PreviousEventIds(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviousEventIds)) {
            return false;
        }
        PreviousEventIds previousEventIds = (PreviousEventIds) obj;
        return zq3.c(this.a, previousEventIds.a) && zq3.c(this.b, previousEventIds.b);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PreviousEventIds(contextId=" + this.a + ", pageviewId=" + this.b + ")";
    }
}
