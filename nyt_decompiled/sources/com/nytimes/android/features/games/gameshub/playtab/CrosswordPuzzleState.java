package com.nytimes.android.features.games.gameshub.playtab;

import defpackage.l48;
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
public final class CrosswordPuzzleState {
    public static final Companion Companion = new Companion(null);
    private static final CrosswordPuzzleState e = new CrosswordPuzzleState(0, false, 0, (String) null, 8, (DefaultConstructorMarker) null);
    private final int a;
    private final boolean b;
    private final int c;
    private final String d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CrosswordPuzzleState a() {
            return CrosswordPuzzleState.e;
        }

        public final KSerializer serializer() {
            return CrosswordPuzzleState$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CrosswordPuzzleState(int i, int i2, boolean z, int i3, String str, mk7 mk7Var) {
        if (7 != (i & 7)) {
            wv5.a(i, 7, CrosswordPuzzleState$$serializer.INSTANCE.getDescriptor());
        }
        this.a = i2;
        this.b = z;
        this.c = i3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }

    public static final /* synthetic */ void d(CrosswordPuzzleState crosswordPuzzleState, d dVar, SerialDescriptor serialDescriptor) {
        dVar.w(serialDescriptor, 0, crosswordPuzzleState.c());
        dVar.x(serialDescriptor, 1, crosswordPuzzleState.b);
        dVar.w(serialDescriptor, 2, crosswordPuzzleState.c);
        if (!dVar.A(serialDescriptor, 3) && crosswordPuzzleState.d == null) {
            return;
        }
        dVar.l(serialDescriptor, 3, l48.a, crosswordPuzzleState.d);
    }

    public final int b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrosswordPuzzleState)) {
            return false;
        }
        CrosswordPuzzleState crosswordPuzzleState = (CrosswordPuzzleState) obj;
        return this.a == crosswordPuzzleState.a && this.b == crosswordPuzzleState.b && this.c == crosswordPuzzleState.c && zq3.c(this.d, crosswordPuzzleState.d);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.a) * 31) + Boolean.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CrosswordPuzzleState(puzzleId=" + this.a + ", solved=" + this.b + ", percentFilled=" + this.c + ", printDate=" + this.d + ")";
    }

    public CrosswordPuzzleState(int i, boolean z, int i2, String str) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = str;
    }

    public /* synthetic */ CrosswordPuzzleState(int i, boolean z, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, i2, (i3 & 8) != 0 ? null : str);
    }
}
