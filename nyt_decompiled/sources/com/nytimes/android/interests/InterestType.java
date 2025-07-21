package com.nytimes.android.interests;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.logging.NYTLogger;
import defpackage.b22;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class InterestType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ InterestType[] $VALUES;
    public static final a Companion;

    /* renamed from: type, reason: collision with root package name */
    private final String f61type;
    public static final InterestType COLUMN = new InterestType("COLUMN", 0, "COLUMN");
    public static final InterestType SHUFFLE = new InterestType("SHUFFLE", 1, "SHUFFLE");
    public static final InterestType NEWSLETTER = new InterestType("NEWSLETTER", 2, "NEWSLETTER");
    public static final InterestType FLASHBACK = new InterestType("FLASHBACK", 3, "FLASHBACK");
    public static final InterestType FILTER = new InterestType("FILTER", 4, "FILTER");
    public static final InterestType BOOKS = new InterestType("BOOKS", 5, "BOOKS");
    public static final InterestType NEWSQUIZ = new InterestType("NEWSQUIZ", 6, "NEWSQUIZ");
    public static final InterestType UNKNOWN = new InterestType("UNKNOWN", 7, "");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterestType a(String str) {
            zq3.h(str, TransferTable.COLUMN_TYPE);
            try {
                return InterestType.valueOf(str);
            } catch (IllegalArgumentException e) {
                NYTLogger.C(e, "Unknown interest type encountered, returning UNKNOWN", new Object[0]);
                return InterestType.UNKNOWN;
            }
        }

        private a() {
        }
    }

    private static final /* synthetic */ InterestType[] $values() {
        return new InterestType[]{COLUMN, SHUFFLE, NEWSLETTER, FLASHBACK, FILTER, BOOKS, NEWSQUIZ, UNKNOWN};
    }

    static {
        InterestType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private InterestType(String str, int i, String str2) {
        this.f61type = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static InterestType valueOf(String str) {
        return (InterestType) Enum.valueOf(InterestType.class, str);
    }

    public static InterestType[] values() {
        return (InterestType[]) $VALUES.clone();
    }

    public final String getType() {
        return this.f61type;
    }
}
