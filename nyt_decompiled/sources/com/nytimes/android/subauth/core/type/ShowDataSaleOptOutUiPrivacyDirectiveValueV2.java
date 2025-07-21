package com.nytimes.android.subauth.core.type;

import defpackage.b22;
import defpackage.c22;
import defpackage.zq3;
import java.util.Iterator;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ShowDataSaleOptOutUiPrivacyDirectiveValueV2 {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ShowDataSaleOptOutUiPrivacyDirectiveValueV2[] $VALUES;
    public static final a Companion;
    public static final ShowDataSaleOptOutUiPrivacyDirectiveValueV2 HIDE = new ShowDataSaleOptOutUiPrivacyDirectiveValueV2("HIDE", 0, "HIDE");
    public static final ShowDataSaleOptOutUiPrivacyDirectiveValueV2 SHOW = new ShowDataSaleOptOutUiPrivacyDirectiveValueV2("SHOW", 1, "SHOW");
    public static final ShowDataSaleOptOutUiPrivacyDirectiveValueV2 SHOW_OPTED_OUT = new ShowDataSaleOptOutUiPrivacyDirectiveValueV2("SHOW_OPTED_OUT", 2, "SHOW_OPTED_OUT");
    public static final ShowDataSaleOptOutUiPrivacyDirectiveValueV2 UNKNOWN__ = new ShowDataSaleOptOutUiPrivacyDirectiveValueV2("UNKNOWN__", 3, "UNKNOWN__");

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f70type;
    private final String rawValue;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ShowDataSaleOptOutUiPrivacyDirectiveValueV2 a(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = ShowDataSaleOptOutUiPrivacyDirectiveValueV2.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((ShowDataSaleOptOutUiPrivacyDirectiveValueV2) obj).getRawValue(), str)) {
                    break;
                }
            }
            ShowDataSaleOptOutUiPrivacyDirectiveValueV2 showDataSaleOptOutUiPrivacyDirectiveValueV2 = (ShowDataSaleOptOutUiPrivacyDirectiveValueV2) obj;
            return showDataSaleOptOutUiPrivacyDirectiveValueV2 == null ? ShowDataSaleOptOutUiPrivacyDirectiveValueV2.UNKNOWN__ : showDataSaleOptOutUiPrivacyDirectiveValueV2;
        }

        private a() {
        }
    }

    private static final /* synthetic */ ShowDataSaleOptOutUiPrivacyDirectiveValueV2[] $values() {
        return new ShowDataSaleOptOutUiPrivacyDirectiveValueV2[]{HIDE, SHOW, SHOW_OPTED_OUT, UNKNOWN__};
    }

    static {
        ShowDataSaleOptOutUiPrivacyDirectiveValueV2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        f70type = new c22("ShowDataSaleOptOutUiPrivacyDirectiveValueV2", i.o("HIDE", "SHOW", "SHOW_OPTED_OUT"));
    }

    private ShowDataSaleOptOutUiPrivacyDirectiveValueV2(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ShowDataSaleOptOutUiPrivacyDirectiveValueV2 valueOf(String str) {
        return (ShowDataSaleOptOutUiPrivacyDirectiveValueV2) Enum.valueOf(ShowDataSaleOptOutUiPrivacyDirectiveValueV2.class, str);
    }

    public static ShowDataSaleOptOutUiPrivacyDirectiveValueV2[] values() {
        return (ShowDataSaleOptOutUiPrivacyDirectiveValueV2[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
