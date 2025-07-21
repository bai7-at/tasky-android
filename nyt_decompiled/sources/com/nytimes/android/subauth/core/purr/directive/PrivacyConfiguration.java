package com.nytimes.android.subauth.core.purr.directive;

import defpackage.zq3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class PrivacyConfiguration {
    public static final int CACHED = 1;
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT = 0;
    public static final int FRESH = 2;
    public static final int STALE_CACHED = 3;
    private final List<PurrPrivacyDirective> directives;
    private final List<PurrUserPrivacyPreference> preferences;
    private final int state;
    private final long timestamp_milli;

    public static final class Companion {

        @Retention(RetentionPolicy.SOURCE)
        public @interface PrivacyConfigurationState {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PrivacyConfiguration(List<? extends PurrPrivacyDirective> list, List<PurrUserPrivacyPreference> list2, int i, long j) {
        zq3.h(list, "directives");
        this.directives = list;
        this.preferences = list2;
        this.state = i;
        this.timestamp_milli = j;
    }

    public static /* synthetic */ PrivacyConfiguration copy$default(PrivacyConfiguration privacyConfiguration, List list, List list2, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = privacyConfiguration.directives;
        }
        if ((i2 & 2) != 0) {
            list2 = privacyConfiguration.preferences;
        }
        List list3 = list2;
        if ((i2 & 4) != 0) {
            i = privacyConfiguration.state;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j = privacyConfiguration.timestamp_milli;
        }
        return privacyConfiguration.copy(list, list3, i3, j);
    }

    public final List<PurrPrivacyDirective> component1() {
        return this.directives;
    }

    public final List<PurrUserPrivacyPreference> component2() {
        return this.preferences;
    }

    public final int component3() {
        return this.state;
    }

    public final long component4() {
        return this.timestamp_milli;
    }

    public final PrivacyConfiguration copy(List<? extends PurrPrivacyDirective> list, List<PurrUserPrivacyPreference> list2, int i, long j) {
        zq3.h(list, "directives");
        return new PrivacyConfiguration(list, list2, i, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyConfiguration)) {
            return false;
        }
        PrivacyConfiguration privacyConfiguration = (PrivacyConfiguration) obj;
        return zq3.c(this.directives, privacyConfiguration.directives) && zq3.c(this.preferences, privacyConfiguration.preferences) && this.state == privacyConfiguration.state && this.timestamp_milli == privacyConfiguration.timestamp_milli;
    }

    public final <E extends PurrPrivacyDirective> E getDirective(Class<E> cls) {
        Object obj;
        zq3.h(cls, "jClass");
        Iterator<T> it2 = this.directives.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (zq3.c(cls, ((PurrPrivacyDirective) obj).getClass())) {
                break;
            }
        }
        if (obj instanceof PurrPrivacyDirective) {
            return (E) obj;
        }
        return null;
    }

    public final List<PurrPrivacyDirective> getDirectives() {
        return this.directives;
    }

    public final List<PurrUserPrivacyPreference> getPreferences() {
        return this.preferences;
    }

    public final int getState() {
        return this.state;
    }

    public final long getTimestamp_milli() {
        return this.timestamp_milli;
    }

    public int hashCode() {
        int hashCode = this.directives.hashCode() * 31;
        List<PurrUserPrivacyPreference> list = this.preferences;
        return ((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.state)) * 31) + Long.hashCode(this.timestamp_milli);
    }

    public String toString() {
        return "PrivacyConfiguration(directives=" + this.directives + ", preferences=" + this.preferences + ", state=" + this.state + ", timestamp_milli=" + this.timestamp_milli + ")";
    }

    public /* synthetic */ PrivacyConfiguration(List list, List list2, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? Instant.now().toEpochMilli() : j);
    }
}
