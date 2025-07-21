package com.nytimes.android.eventtracker.reporting;

import defpackage.b22;
import defpackage.d44;
import defpackage.ei1;
import defpackage.o36;
import defpackage.zq3;
import kotlin.enums.a;

/* loaded from: classes4.dex */
public class AppLaunchObserver implements ei1 {
    private boolean a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LaunchType {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ LaunchType[] $VALUES;
        public static final LaunchType FRESH = new LaunchType("FRESH", 0);
        public static final LaunchType BACKGROUND = new LaunchType("BACKGROUND", 1);

        private static final /* synthetic */ LaunchType[] $values() {
            return new LaunchType[]{FRESH, BACKGROUND};
        }

        static {
            LaunchType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private LaunchType(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static LaunchType valueOf(String str) {
            return (LaunchType) Enum.valueOf(LaunchType.class, str);
        }

        public static LaunchType[] values() {
            return (LaunchType[]) $VALUES.clone();
        }
    }

    public final LaunchType a() {
        if (!o36.a.a()) {
            return LaunchType.FRESH;
        }
        if (this.a) {
            return LaunchType.BACKGROUND;
        }
        return null;
    }

    @Override // defpackage.ei1
    public void onPause(d44 d44Var) {
        zq3.h(d44Var, "owner");
        this.a = true;
    }
}
