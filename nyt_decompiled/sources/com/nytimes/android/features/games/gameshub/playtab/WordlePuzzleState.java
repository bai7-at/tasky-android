package com.nytimes.android.features.games.gameshub.playtab;

import defpackage.lk7;
import defpackage.mk7;
import defpackage.wv5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes4.dex */
public final class WordlePuzzleState {
    public static final Companion Companion = new Companion(null);
    private static final WordlePuzzleState d = new WordlePuzzleState(0, false, 0);
    private final int a;
    private final boolean b;
    private final int c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WordlePuzzleState a() {
            return WordlePuzzleState.d;
        }

        public final KSerializer serializer() {
            return WordlePuzzleState$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WordlePuzzleState(int i, int i2, boolean z, int i3, mk7 mk7Var) {
        if (7 != (i & 7)) {
            wv5.a(i, 7, WordlePuzzleState$$serializer.INSTANCE.getDescriptor());
        }
        this.a = i2;
        this.b = z;
        this.c = i3;
    }

    public static final /* synthetic */ void e(WordlePuzzleState wordlePuzzleState, d dVar, SerialDescriptor serialDescriptor) {
        dVar.w(serialDescriptor, 0, wordlePuzzleState.c());
        dVar.x(serialDescriptor, 1, wordlePuzzleState.b);
        dVar.w(serialDescriptor, 2, wordlePuzzleState.c);
    }

    public final int b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WordlePuzzleState)) {
            return false;
        }
        WordlePuzzleState wordlePuzzleState = (WordlePuzzleState) obj;
        return this.a == wordlePuzzleState.a && this.b == wordlePuzzleState.b && this.c == wordlePuzzleState.c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.a) * 31) + Boolean.hashCode(this.b)) * 31) + Integer.hashCode(this.c);
    }

    public String toString() {
        return "WordlePuzzleState(puzzleId=" + this.a + ", win=" + this.b + ", guesses=" + this.c + ")";
    }

    public WordlePuzzleState(int i, boolean z, int i2) {
        this.a = i;
        this.b = z;
        this.c = i2;
    }
}
