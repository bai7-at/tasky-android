package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.w;
import defpackage.fs1;
import defpackage.hu5;
import defpackage.ss2;
import defpackage.uu8;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapter {
    public static final a c = new a(null);
    public static final int d = 8;
    private static final k e = new k();
    private static final CoroutineExceptionHandler f = new b(CoroutineExceptionHandler.Key);
    private final AsyncTypefaceCache a;
    private CoroutineScope b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
        }
    }

    public FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, CoroutineContext coroutineContext) {
        this.a = asyncTypefaceCache;
        this.b = CoroutineScopeKt.CoroutineScope(f.plus(fs1.a()).plus(coroutineContext).plus(SupervisorKt.SupervisorJob((Job) coroutineContext.get(Job.Key))));
    }

    public w a(uu8 uu8Var, hu5 hu5Var, ss2 ss2Var, ss2 ss2Var2) {
        Pair b2;
        if (!(uu8Var.c() instanceof h)) {
            return null;
        }
        b2 = i.b(e.a(((h) uu8Var.c()).o(), uu8Var.f(), uu8Var.d()), uu8Var, this.a, hu5Var, ss2Var2);
        List list = (List) b2.a();
        Object b3 = b2.b();
        if (list == null) {
            return new w.b(b3, false, 2, null);
        }
        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, b3, uu8Var, this.a, ss2Var, hu5Var);
        BuildersKt__Builders_commonKt.launch$default(this.b, null, CoroutineStart.UNDISPATCHED, new FontListFontFamilyTypefaceAdapter$resolve$1(asyncFontListLoader, null), 1, null);
        return new w.a(asyncFontListLoader);
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AsyncTypefaceCache() : asyncTypefaceCache, (i & 2) != 0 ? EmptyCoroutineContext.a : coroutineContext);
    }
}
