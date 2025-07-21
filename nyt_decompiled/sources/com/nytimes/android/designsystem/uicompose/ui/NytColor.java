package com.nytimes.android.designsystem.uicompose.ui;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class NytColor {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ NytColor[] $VALUES;
    public static final NytColor times_black = new NytColor("times_black", 0);
    public static final NytColor gray66 = new NytColor("gray66", 1);
    public static final NytColor grayE2 = new NytColor("grayE2", 2);
    public static final NytColor grayF7 = new NytColor("grayF7", 3);
    public static final NytColor developing = new NytColor("developing", 4);
    public static final NytColor background_primary_inverse = new NytColor("background_primary_inverse", 5);
    public static final NytColor stroke_secondary = new NytColor("stroke_secondary", 6);
    public static final NytColor gray10 = new NytColor("gray10", 7);
    public static final NytColor content_primary_inverse = new NytColor("content_primary_inverse", 8);
    public static final NytColor content_primary = new NytColor("content_primary", 9);
    public static final NytColor text_primary = new NytColor("text_primary", 10);
    public static final NytColor stroke_quaternary = new NytColor("stroke_quaternary", 11);
    public static final NytColor content_secondary = new NytColor("content_secondary", 12);
    public static final NytColor signal_breaking = new NytColor("signal_breaking", 13);
    public static final NytColor signal_highlight = new NytColor("signal_highlight", 14);
    public static final NytColor stroke_primary = new NytColor("stroke_primary", 15);
    public static final NytColor signal_positive = new NytColor("signal_positive", 16);
    public static final NytColor content_quintary = new NytColor("content_quintary", 17);
    public static final NytColor background_primary = new NytColor("background_primary", 18);
    public static final NytColor background_secondary_inverse = new NytColor("background_secondary_inverse", 19);
    public static final NytColor background_overlay = new NytColor("background_overlay", 20);
    public static final NytColor background_tertiary = new NytColor("background_tertiary", 21);
    public static final NytColor background_secondary = new NytColor("background_secondary", 22);
    public static final NytColor text_primary_inverse = new NytColor("text_primary_inverse", 23);
    public static final NytColor signal_negative = new NytColor("signal_negative", 24);
    public static final NytColor signal_editorial = new NytColor("signal_editorial", 25);
    public static final NytColor static_gray_100 = new NytColor("static_gray_100", 26);
    public static final NytColor static_white = new NytColor("static_white", 27);
    public static final NytColor content_tertiary = new NytColor("content_tertiary", 28);
    public static final NytColor content_quaternary = new NytColor("content_quaternary", 29);
    public static final NytColor stroke_tertiary = new NytColor("stroke_tertiary", 30);
    public static final NytColor opinion_gray = new NytColor("opinion_gray", 31);
    public static final NytColor stroke_primary_inverse = new NytColor("stroke_primary_inverse", 32);

    private static final /* synthetic */ NytColor[] $values() {
        return new NytColor[]{times_black, gray66, grayE2, grayF7, developing, background_primary_inverse, stroke_secondary, gray10, content_primary_inverse, content_primary, text_primary, stroke_quaternary, content_secondary, signal_breaking, signal_highlight, stroke_primary, signal_positive, content_quintary, background_primary, background_secondary_inverse, background_overlay, background_tertiary, background_secondary, text_primary_inverse, signal_negative, signal_editorial, static_gray_100, static_white, content_tertiary, content_quaternary, stroke_tertiary, opinion_gray, stroke_primary_inverse};
    }

    static {
        NytColor[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private NytColor(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static NytColor valueOf(String str) {
        return (NytColor) Enum.valueOf(NytColor.class, str);
    }

    public static NytColor[] values() {
        return (NytColor[]) $VALUES.clone();
    }
}
