package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PushPromoArticleVariants implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PushPromoArticleVariants[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final PushPromoArticleVariants CONTROL = new PushPromoArticleVariants("CONTROL", 0, "0_control");
    public static final PushPromoArticleVariants ARTICLE_CTA = new PushPromoArticleVariants("ARTICLE_CTA", 1, "1_articleCTA");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return PushPromoArticleVariants.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ PushPromoArticleVariants[] $values() {
        return new PushPromoArticleVariants[]{CONTROL, ARTICLE_CTA};
    }

    static {
        PushPromoArticleVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_push_promo_article", values(), null, false, 12, null);
    }

    private PushPromoArticleVariants(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PushPromoArticleVariants valueOf(String str) {
        return (PushPromoArticleVariants) Enum.valueOf(PushPromoArticleVariants.class, str);
    }

    public static PushPromoArticleVariants[] values() {
        return (PushPromoArticleVariants[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
