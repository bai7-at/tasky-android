package com.nytimes.android.features.games.gameshub.configuration.models;

import defpackage.b22;
import defpackage.c04;
import defpackage.d22;
import defpackage.lk7;
import defpackage.qs2;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.c;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@lk7
/* loaded from: classes4.dex */
public final class CardType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ CardType[] $VALUES;
    private static final c04 $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String id;
    public static final CardType HERO = new CardType("HERO", 0, "hero");
    public static final CardType SIDEKICK = new CardType("SIDEKICK", 1, "sidekick");
    public static final CardType LIST = new CardType("LIST", 2, "list");

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) CardType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer serializer() {
            return a();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ CardType[] $values() {
        return new CardType[]{HERO, SIDEKICK, LIST};
    }

    static {
        CardType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = c.b(LazyThreadSafetyMode.PUBLICATION, new qs2() { // from class: com.nytimes.android.features.games.gameshub.configuration.models.CardType.Companion.1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final KSerializer mo865invoke() {
                return d22.a("com.nytimes.android.features.games.gameshub.configuration.models.CardType", CardType.values(), new String[]{"hero", "sidekick", "list"}, new Annotation[][]{null, null, null}, null);
            }
        });
    }

    private CardType(String str, int i, String str2) {
        this.id = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static CardType valueOf(String str) {
        return (CardType) Enum.valueOf(CardType.class, str);
    }

    public static CardType[] values() {
        return (CardType[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
