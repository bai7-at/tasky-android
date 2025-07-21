package com.nytimes.android.subauth.core.purr.network;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Environment {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ Environment[] $VALUES;
    private final String description;
    private final String url;
    public static final Environment PRODUCTION = new Environment("PRODUCTION", 0, "Production", "https://samizdat-graphql.nytimes.com/graphql/v2");
    public static final Environment DEV = new Environment("DEV", 1, "Dev", "https://samizdat-graphql.dev.nytimes.com/graphql/v2");
    public static final Environment EXPERIMENTAL2 = new Environment("EXPERIMENTAL2", 2, "Samizdat Labs Experiment 2", "https://samizdat-graphql-experimental-lab-2.dev.nytimes.com/graphql/v2");
    public static final Environment EXPERIMENTAL3 = new Environment("EXPERIMENTAL3", 3, "Samizdat Labs Experiment 3", "https://samizdat-graphql-experimental-lab-3.dev.nytimes.com/graphql/v2");
    public static final Environment EXPERIMENTAL5 = new Environment("EXPERIMENTAL5", 4, "Samizdat Labs Experiment 5", "https://samizdat-graphql-experimental-lab-5.dev.nytimes.com/graphql/v2");

    private static final /* synthetic */ Environment[] $values() {
        return new Environment[]{PRODUCTION, DEV, EXPERIMENTAL2, EXPERIMENTAL3, EXPERIMENTAL5};
    }

    static {
        Environment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private Environment(String str, int i, String str2, String str3) {
        this.description = str2;
        this.url = str3;
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

    public final String getDescription() {
        return this.description;
    }

    public final String getUrl() {
        return this.url;
    }
}
