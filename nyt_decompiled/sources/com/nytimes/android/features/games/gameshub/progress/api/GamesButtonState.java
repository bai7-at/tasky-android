package com.nytimes.android.features.games.gameshub.progress.api;

import defpackage.b22;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class GamesButtonState {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ GamesButtonState[] $VALUES;
    public static final a Companion;
    private final String ctaText;
    public static final GamesButtonState PLAY = new GamesButtonState("PLAY", 0, "Play");
    public static final GamesButtonState CONTINUE = new GamesButtonState("CONTINUE", 1, "Continue");
    public static final GamesButtonState SOLVED = new GamesButtonState("SOLVED", 2, "Solved");
    public static final GamesButtonState LOCKED = new GamesButtonState("LOCKED", 3, "Locked");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final /* synthetic */ GamesButtonState[] $values() {
        return new GamesButtonState[]{PLAY, CONTINUE, SOLVED, LOCKED};
    }

    static {
        GamesButtonState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private GamesButtonState(String str, int i, String str2) {
        this.ctaText = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static GamesButtonState valueOf(String str) {
        return (GamesButtonState) Enum.valueOf(GamesButtonState.class, str);
    }

    public static GamesButtonState[] values() {
        return (GamesButtonState[]) $VALUES.clone();
    }

    public final String getCtaText() {
        return this.ctaText;
    }
}
