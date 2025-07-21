package com.nytimes.android.navigation;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class NavigationSource {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ NavigationSource[] $VALUES;
    public static final NavigationSource FOLLOW = new NavigationSource("FOLLOW", 0);
    public static final NavigationSource SECTION_FRONT = new NavigationSource("SECTION_FRONT", 1);
    public static final NavigationSource SAVED_SECTION_FRONT = new NavigationSource("SAVED_SECTION_FRONT", 2);
    public static final NavigationSource SAVED_SETTINGS = new NavigationSource("SAVED_SETTINGS", 3);
    public static final NavigationSource YOU_TAB_SAVES = new NavigationSource("YOU_TAB_SAVES", 4);
    public static final NavigationSource YOU_TAB_FLASHBACK = new NavigationSource("YOU_TAB_FLASHBACK", 5);
    public static final NavigationSource YOU_TAB_FILTER = new NavigationSource("YOU_TAB_FILTER", 6);
    public static final NavigationSource YOU_TAB_BOOKS = new NavigationSource("YOU_TAB_BOOKS", 7);
    public static final NavigationSource YOU_TAB_NEWSQUIZ = new NavigationSource("YOU_TAB_NEWSQUIZ", 8);
    public static final NavigationSource YOU_TAB_RECENTS = new NavigationSource("YOU_TAB_RECENTS", 9);
    public static final NavigationSource GIFT_HUB = new NavigationSource("GIFT_HUB", 10);
    public static final NavigationSource YOU_TAB_SHUFFLE = new NavigationSource("YOU_TAB_SHUFFLE", 11);
    public static final NavigationSource YOU_TAB_COLUMN = new NavigationSource("YOU_TAB_COLUMN", 12);
    public static final NavigationSource XPN_PANEL = new NavigationSource("XPN_PANEL", 13);
    public static final NavigationSource XPN_CTA = new NavigationSource("XPN_CTA", 14);

    private static final /* synthetic */ NavigationSource[] $values() {
        return new NavigationSource[]{FOLLOW, SECTION_FRONT, SAVED_SECTION_FRONT, SAVED_SETTINGS, YOU_TAB_SAVES, YOU_TAB_FLASHBACK, YOU_TAB_FILTER, YOU_TAB_BOOKS, YOU_TAB_NEWSQUIZ, YOU_TAB_RECENTS, GIFT_HUB, YOU_TAB_SHUFFLE, YOU_TAB_COLUMN, XPN_PANEL, XPN_CTA};
    }

    static {
        NavigationSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private NavigationSource(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static NavigationSource valueOf(String str) {
        return (NavigationSource) Enum.valueOf(NavigationSource.class, str);
    }

    public static NavigationSource[] values() {
        return (NavigationSource[]) $VALUES.clone();
    }
}
