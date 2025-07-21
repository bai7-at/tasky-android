package com.nytimes.android.resourcedownloader.model;

import defpackage.b22;
import defpackage.et3;
import defpackage.zq3;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class GlobalResourceSource extends ResourceSource {
    private final Global globalSource;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Global {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ Global[] $VALUES;
        public static final Global LatestFeed = new Global("LatestFeed", 0);

        private static final /* synthetic */ Global[] $values() {
            return new Global[]{LatestFeed};
        }

        static {
            Global[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private Global(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static Global valueOf(String str) {
            return (Global) Enum.valueOf(Global.class, str);
        }

        public static Global[] values() {
            return (Global[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GlobalResourceSource() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GlobalResourceSource copy$default(GlobalResourceSource globalResourceSource, Global global, int i, Object obj) {
        if ((i & 1) != 0) {
            global = globalResourceSource.globalSource;
        }
        return globalResourceSource.copy(global);
    }

    public final Global component1() {
        return this.globalSource;
    }

    public final GlobalResourceSource copy(Global global) {
        zq3.h(global, "globalSource");
        return new GlobalResourceSource(global);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GlobalResourceSource) && this.globalSource == ((GlobalResourceSource) obj).globalSource;
    }

    public final Global getGlobalSource() {
        return this.globalSource;
    }

    public int hashCode() {
        return this.globalSource.hashCode();
    }

    public String toString() {
        return "GlobalResourceSource(globalSource=" + this.globalSource + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalResourceSource(Global global) {
        super(null);
        zq3.h(global, "globalSource");
        this.globalSource = global;
    }

    public /* synthetic */ GlobalResourceSource(Global global, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Global.LatestFeed : global);
    }
}
