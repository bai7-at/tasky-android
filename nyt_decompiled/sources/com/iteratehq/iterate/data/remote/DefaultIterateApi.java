package com.iteratehq.iterate.data.remote;

import com.iteratehq.iterate.model.EmbedContext;
import com.iteratehq.iterate.model.Survey;
import defpackage.by0;
import defpackage.qj;
import defpackage.ss2;
import defpackage.vr3;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes3.dex */
public final class DefaultIterateApi implements vr3 {
    public static final a d = new a(null);
    private final String a;
    private final String b;
    private final CoroutineContext c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public DefaultIterateApi(String str, String str2, CoroutineContext coroutineContext) {
        zq3.h(str, "apiKey");
        zq3.h(str2, "apiHost");
        zq3.h(coroutineContext, "workContext");
        this.a = str;
        this.b = str2;
        this.c = coroutineContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(Object obj, qj qjVar, by0 by0Var) {
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new DefaultIterateApi$dispatchResult$2(qjVar, obj, null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }

    private final void f(qj qjVar, ss2 ss2Var) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.c), null, null, new DefaultIterateApi$executeAsync$1(this, qjVar, ss2Var, null), 3, null);
    }

    @Override // defpackage.vr3
    public void i(EmbedContext embedContext, qj qjVar) {
        zq3.h(embedContext, "embedContext");
        f(qjVar, new DefaultIterateApi$embed$1(this, embedContext, null));
    }

    @Override // defpackage.vr3
    public void j(Survey survey, qj qjVar) {
        zq3.h(survey, "survey");
        f(qjVar, new DefaultIterateApi$displayed$1(survey, this, null));
    }

    @Override // defpackage.vr3
    public void k(Survey survey, qj qjVar) {
        zq3.h(survey, "survey");
        f(qjVar, new DefaultIterateApi$dismissed$1(survey, this, null));
    }

    public /* synthetic */ DefaultIterateApi(String str, String str2, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "https://iteratehq.com" : str2, (i & 4) != 0 ? Dispatchers.getIO() : coroutineContext);
    }
}
