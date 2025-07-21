package com.nytimes.android.designsystem.uicompose.ui;

import defpackage.b22;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HomeDesignSystemColor {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ HomeDesignSystemColor[] $VALUES;
    private final long darkHex;
    private final long lightHex;
    public static final HomeDesignSystemColor permaWhite = new HomeDesignSystemColor("permaWhite", 0, 4294967295L, 4294440951L);
    public static final HomeDesignSystemColor times_black = new HomeDesignSystemColor("times_black", 1, 4278190080L, 4293256677L);
    public static final HomeDesignSystemColor gray10 = new HomeDesignSystemColor("gray10", 2, 4279374354L, 4293848814L);
    public static final HomeDesignSystemColor gray55 = new HomeDesignSystemColor("gray55", 3, 4283782485L, 4289901234L);
    public static final HomeDesignSystemColor gray66 = new HomeDesignSystemColor("gray66", 4, 4284900966L, 4288256409L);
    public static final HomeDesignSystemColor gray88 = new HomeDesignSystemColor("gray88", 5, 4287137928L, 4286611584L);
    public static final HomeDesignSystemColor grayB3 = new HomeDesignSystemColor("grayB3", 6, 4289967027L, 4285756275L);
    public static final HomeDesignSystemColor grayCC = new HomeDesignSystemColor("grayCC", 7, 4291611852L, 4284900966L);
    public static final HomeDesignSystemColor grayE2 = new HomeDesignSystemColor("grayE2", 8, 4293059298L, 4283190348L);
    public static final HomeDesignSystemColor grayF7 = new HomeDesignSystemColor("grayF7", 9, 4294440951L, 4280690214L);
    public static final HomeDesignSystemColor times_white = new HomeDesignSystemColor("times_white", 10, 4294967295L, 4279900698L);
    public static final HomeDesignSystemColor opinion = new HomeDesignSystemColor("opinion", 11, 4288781724L, 4288057487L);
    public static final HomeDesignSystemColor blue30 = new HomeDesignSystemColor("blue30", 12, 4284647589L, 4282345865L);
    public static final HomeDesignSystemColor developing = new HomeDesignSystemColor("developing", 13, 4294215505L, 4294014264L);

    private static final /* synthetic */ HomeDesignSystemColor[] $values() {
        return new HomeDesignSystemColor[]{permaWhite, times_black, gray10, gray55, gray66, gray88, grayB3, grayCC, grayE2, grayF7, times_white, opinion, blue30, developing};
    }

    static {
        HomeDesignSystemColor[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private HomeDesignSystemColor(String str, int i, long j, long j2) {
        this.lightHex = j;
        this.darkHex = j2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static HomeDesignSystemColor valueOf(String str) {
        return (HomeDesignSystemColor) Enum.valueOf(HomeDesignSystemColor.class, str);
    }

    public static HomeDesignSystemColor[] values() {
        return (HomeDesignSystemColor[]) $VALUES.clone();
    }

    public final long getDarkHex() {
        return this.darkHex;
    }

    public final long getLightHex() {
        return this.lightHex;
    }

    /* synthetic */ HomeDesignSystemColor(String str, int i, long j, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, j, (i2 & 2) != 0 ? j : j2);
    }
}
