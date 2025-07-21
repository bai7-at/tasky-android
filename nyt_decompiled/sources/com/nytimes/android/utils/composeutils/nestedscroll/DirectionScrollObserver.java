package com.nytimes.android.utils.composeutils.nestedscroll;

import defpackage.b22;
import defpackage.d35;
import defpackage.fd5;
import defpackage.iv3;
import defpackage.lp6;
import defpackage.sc5;
import defpackage.ss2;
import defpackage.tl1;
import defpackage.zq3;
import defpackage.zt6;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes4.dex */
public final class DirectionScrollObserver implements d35 {
    static final /* synthetic */ iv3[] c = {zt6.f(new MutablePropertyReference1Impl(DirectionScrollObserver.class, "direction", "getDirection()Lcom/nytimes/android/utils/composeutils/nestedscroll/DirectionScrollObserver$Direction;", 0))};
    public static final int d = 8;
    private final ss2 a;
    private final lp6 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Direction {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction NONE = new Direction("NONE", 0);
        public static final Direction UP = new Direction("UP", 1);
        public static final Direction DOWN = new Direction("DOWN", 2);

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{NONE, UP, DOWN};
        }

        static {
            Direction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Direction(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    public static final class a extends sc5 {
        final /* synthetic */ DirectionScrollObserver b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, DirectionScrollObserver directionScrollObserver) {
            super(obj);
            this.b = directionScrollObserver;
        }

        @Override // defpackage.sc5
        protected void b(iv3 iv3Var, Object obj, Object obj2) {
            zq3.h(iv3Var, "property");
            this.b.a.invoke((Direction) obj2);
        }
    }

    public DirectionScrollObserver(ss2 ss2Var) {
        zq3.h(ss2Var, "onDirection");
        this.a = ss2Var;
        tl1 tl1Var = tl1.a;
        this.b = new a(Direction.NONE, this);
    }

    private final void b(Direction direction) {
        this.b.a(this, c[0], direction);
    }

    @Override // defpackage.d35
    public long r0(long j, long j2, int i) {
        float p = fd5.p(j);
        b(p > 0.0f ? Direction.UP : p < 0.0f ? Direction.DOWN : Direction.NONE);
        return fd5.b.c();
    }
}
