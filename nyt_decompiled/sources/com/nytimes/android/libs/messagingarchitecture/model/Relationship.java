package com.nytimes.android.libs.messagingarchitecture.model;

import defpackage.b22;
import defpackage.c04;
import defpackage.d22;
import defpackage.lk7;
import defpackage.qs2;
import kotlin.LazyThreadSafetyMode;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@lk7
/* loaded from: classes4.dex */
public final class Relationship {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ Relationship[] $VALUES;
    private static final c04 $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String string;
    public static final Relationship AND = new Relationship("AND", 0, "and");
    public static final Relationship OR = new Relationship("OR", 1, "or");

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) Relationship.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer serializer() {
            return a();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ Relationship[] $values() {
        return new Relationship[]{AND, OR};
    }

    static {
        Relationship[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = c.b(LazyThreadSafetyMode.PUBLICATION, new qs2() { // from class: com.nytimes.android.libs.messagingarchitecture.model.Relationship.Companion.1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final KSerializer mo865invoke() {
                return d22.b("com.nytimes.android.libs.messagingarchitecture.model.Relationship", Relationship.values());
            }
        });
    }

    private Relationship(String str, int i, String str2) {
        this.string = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static Relationship valueOf(String str) {
        return (Relationship) Enum.valueOf(Relationship.class, str);
    }

    public static Relationship[] values() {
        return (Relationship[]) $VALUES.clone();
    }

    public final String getString() {
        return this.string;
    }
}
