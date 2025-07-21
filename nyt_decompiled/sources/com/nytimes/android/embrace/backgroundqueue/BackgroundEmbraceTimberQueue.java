package com.nytimes.android.embrace.backgroundqueue;

import com.comscore.streaming.ContentFeedType;
import defpackage.kt2;
import defpackage.rz1;
import defpackage.zq3;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class BackgroundEmbraceTimberQueue {
    public static final a Companion = new a(null);
    private final int a;
    private final kt2 b;
    private final CoroutineScope c;
    private final ConcurrentLinkedQueue d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public BackgroundEmbraceTimberQueue(int i, kt2 kt2Var, CoroutineScope coroutineScope) {
        zq3.h(kt2Var, "handleEmbraceLoggingLambda");
        zq3.h(coroutineScope, "scope");
        this.a = i;
        this.b = kt2Var;
        this.c = coroutineScope;
        this.d = new ConcurrentLinkedQueue();
    }

    private final void e(rz1 rz1Var) {
        BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new BackgroundEmbraceTimberQueue$add$1(this, rz1Var, null), 3, null);
    }

    public final void d(int i, String str, String str2, Throwable th) {
        zq3.h(str2, "message");
        e(new rz1(i, str, str2, th));
    }

    public final void f() {
        List X0 = i.X0(this.d);
        int size = X0.size();
        this.d.clear();
        BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new BackgroundEmbraceTimberQueue$flush$1(size, X0, this, null), 3, null);
    }

    public final boolean g() {
        return !this.d.isEmpty();
    }

    public /* synthetic */ BackgroundEmbraceTimberQueue(int i, kt2 kt2Var, CoroutineScope coroutineScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ContentFeedType.OTHER : i, kt2Var, (i2 & 4) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()) : coroutineScope);
    }
}
