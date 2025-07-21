package com.nytimes.xwords.hybrid.config;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Environments {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ Environments[] $VALUES;
    private final String baseUrl;
    private final String connections;
    private final String letterBoxed;
    private final String spellingBeeUrl;
    private final String sudokuUrl;
    private final String tilesUrl;
    private final String wordleArchiveUrl;
    private final String wordleUrl;
    public static final Environments PROD = new Environments("PROD", 0, "https://www.nytimes.com", "https://www.nytimes.com/puzzles/spelling-bee", "https://www.nytimes.com/games/wordle/index.html", "https://www.nytimes.com/games/wordle", "https://www.nytimes.com/puzzles/sudoku", "https://www.nytimes.com/puzzles/tiles", "https://www.nytimes.com/puzzles/letter-boxed", "https://www.nytimes.com/games/connections");
    public static final Environments STAGING = new Environments("STAGING", 1, "https://www.stg.nytimes.com", "https://www.stg.nytimes.com/puzzles/spelling-bee", "https://www.stg.nytimes.com/games/wordle/index.html", "https://www.stg.nytimes.com/games/wordle", "https://www.stg.nytimes.com/puzzles/sudoku", "https://www.stg.nytimes.com/puzzles/tiles", "https://www.stg.nytimes.com/puzzles/letter-boxed", "https://www.stg.nytimes.com/games/connections");
    public static final Environments LOCAL = new Environments("LOCAL", 2, "https://local.nytimes.com", "https://local.nytimes.com/puzzles/spelling-bee", "https://local.nytimes.com/games/wordle/index.html", "https://local.nytimes.com/games/wordle", "https://local.nytimes.com/puzzles/sudoku", "https://local.nytimes.com/puzzles/tiles", "https://local.nytimes.com/puzzles/letter-boxed", "https://local.nytimes.com/games/prototype/connections");

    private static final /* synthetic */ Environments[] $values() {
        return new Environments[]{PROD, STAGING, LOCAL};
    }

    static {
        Environments[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private Environments(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.baseUrl = str2;
        this.spellingBeeUrl = str3;
        this.wordleUrl = str4;
        this.wordleArchiveUrl = str5;
        this.sudokuUrl = str6;
        this.tilesUrl = str7;
        this.letterBoxed = str8;
        this.connections = str9;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static Environments valueOf(String str) {
        return (Environments) Enum.valueOf(Environments.class, str);
    }

    public static Environments[] values() {
        return (Environments[]) $VALUES.clone();
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final String getConnections() {
        return this.connections;
    }

    public final String getLetterBoxed() {
        return this.letterBoxed;
    }

    public final String getSpellingBeeUrl() {
        return this.spellingBeeUrl;
    }

    public final String getSudokuUrl() {
        return this.sudokuUrl;
    }

    public final String getTilesUrl() {
        return this.tilesUrl;
    }

    public final String getWordleArchiveUrl() {
        return this.wordleArchiveUrl;
    }

    public final String getWordleUrl() {
        return this.wordleUrl;
    }
}
