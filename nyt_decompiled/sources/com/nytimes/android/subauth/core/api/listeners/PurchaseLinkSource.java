package com.nytimes.android.subauth.core.api.listeners;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PurchaseLinkSource {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PurchaseLinkSource[] $VALUES;
    public static final PurchaseLinkSource ORIG_PURCHASE_LINK = new PurchaseLinkSource("ORIG_PURCHASE_LINK", 0);
    public static final PurchaseLinkSource LINK_PURCHASE_AFTER_LOGIN = new PurchaseLinkSource("LINK_PURCHASE_AFTER_LOGIN", 1);
    public static final PurchaseLinkSource RE_LINK_ON_APP_OPEN = new PurchaseLinkSource("RE_LINK_ON_APP_OPEN", 2);
    public static final PurchaseLinkSource RE_LINK_USER_INIT = new PurchaseLinkSource("RE_LINK_USER_INIT", 3);

    private static final /* synthetic */ PurchaseLinkSource[] $values() {
        return new PurchaseLinkSource[]{ORIG_PURCHASE_LINK, LINK_PURCHASE_AFTER_LOGIN, RE_LINK_ON_APP_OPEN, RE_LINK_USER_INIT};
    }

    static {
        PurchaseLinkSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PurchaseLinkSource(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PurchaseLinkSource valueOf(String str) {
        return (PurchaseLinkSource) Enum.valueOf(PurchaseLinkSource.class, str);
    }

    public static PurchaseLinkSource[] values() {
        return (PurchaseLinkSource[]) $VALUES.clone();
    }
}
