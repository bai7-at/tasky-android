package com.nytimes.android.room.common;

import defpackage.b22;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CompositeState {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ CompositeState[] $VALUES;
    public static final a Companion;
    private final int state;
    private final String value;
    public static final CompositeState PAUSED = new CompositeState("PAUSED", 0, 2, "PAUSED");
    public static final CompositeState BUFFERING = new CompositeState("BUFFERING", 1, 6, "BUFFERING");
    public static final CompositeState PLAYING = new CompositeState("PLAYING", 2, 3, "PLAYING");
    public static final CompositeState STOPPED = new CompositeState("STOPPED", 3, 1, "STOPPED");
    public static final CompositeState UNKNOWN = new CompositeState("UNKNOWN", 4, 0, "UNKNOWN");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CompositeState a(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 6 ? CompositeState.UNKNOWN : CompositeState.BUFFERING : CompositeState.PLAYING : CompositeState.PAUSED : CompositeState.STOPPED;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final CompositeState b(String str) {
            zq3.h(str, "value");
            switch (str.hashCode()) {
                case -1941992146:
                    if (str.equals("PAUSED")) {
                        return CompositeState.PAUSED;
                    }
                    break;
                case -1446859902:
                    if (str.equals("BUFFERING")) {
                        return CompositeState.BUFFERING;
                    }
                    break;
                case -1166336595:
                    if (str.equals("STOPPED")) {
                        return CompositeState.STOPPED;
                    }
                    break;
                case 224418830:
                    if (str.equals("PLAYING")) {
                        return CompositeState.BUFFERING;
                    }
                    break;
            }
            return CompositeState.UNKNOWN;
        }

        private a() {
        }
    }

    private static final /* synthetic */ CompositeState[] $values() {
        return new CompositeState[]{PAUSED, BUFFERING, PLAYING, STOPPED, UNKNOWN};
    }

    static {
        CompositeState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private CompositeState(String str, int i, int i2, String str2) {
        this.state = i2;
        this.value = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static CompositeState valueOf(String str) {
        return (CompositeState) Enum.valueOf(CompositeState.class, str);
    }

    public static CompositeState[] values() {
        return (CompositeState[]) $VALUES.clone();
    }

    public final int getState() {
        return this.state;
    }

    public final String getValue() {
        return this.value;
    }
}
