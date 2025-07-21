package com.nytimes.android.features.games.gameshub.playtab;

import com.nytimes.android.features.games.gameshub.progress.api.data.EntitledSpellingBeeProgress;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.wv5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes4.dex */
public final class SpellingBeePuzzleState {
    public static final Companion Companion = new Companion(null);
    private static final SpellingBeePuzzleState c = new SpellingBeePuzzleState(0, EntitledSpellingBeeProgress.EMPTY.getRank());
    private final int a;
    private final String b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SpellingBeePuzzleState a() {
            return SpellingBeePuzzleState.c;
        }

        public final KSerializer serializer() {
            return SpellingBeePuzzleState$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SpellingBeePuzzleState(int i, int i2, String str, mk7 mk7Var) {
        if (3 != (i & 3)) {
            wv5.a(i, 3, SpellingBeePuzzleState$$serializer.INSTANCE.getDescriptor());
        }
        this.a = i2;
        this.b = str;
    }

    public static final /* synthetic */ void d(SpellingBeePuzzleState spellingBeePuzzleState, d dVar, SerialDescriptor serialDescriptor) {
        dVar.w(serialDescriptor, 0, spellingBeePuzzleState.b());
        dVar.y(serialDescriptor, 1, spellingBeePuzzleState.b);
    }

    public int b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpellingBeePuzzleState)) {
            return false;
        }
        SpellingBeePuzzleState spellingBeePuzzleState = (SpellingBeePuzzleState) obj;
        return this.a == spellingBeePuzzleState.a && zq3.c(this.b, spellingBeePuzzleState.b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "SpellingBeePuzzleState(puzzleId=" + this.a + ", rank=" + this.b + ")";
    }

    public SpellingBeePuzzleState(int i, String str) {
        zq3.h(str, "rank");
        this.a = i;
        this.b = str;
    }
}
