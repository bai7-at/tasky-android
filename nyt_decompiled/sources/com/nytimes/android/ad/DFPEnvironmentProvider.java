package com.nytimes.android.ad;

import defpackage.b22;

/* loaded from: classes2.dex */
public interface DFPEnvironmentProvider {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Environment {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ Environment[] $VALUES;
        public static final Environment GOOGLE = new Environment("GOOGLE", 0);
        public static final Environment STAGING = new Environment("STAGING", 1);
        public static final Environment PROD = new Environment("PROD", 2);

        private static final /* synthetic */ Environment[] $values() {
            return new Environment[]{GOOGLE, STAGING, PROD};
        }

        static {
            Environment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Environment(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static Environment valueOf(String str) {
            return (Environment) Enum.valueOf(Environment.class, str);
        }

        public static Environment[] values() {
            return (Environment[]) $VALUES.clone();
        }
    }

    Environment a();
}
