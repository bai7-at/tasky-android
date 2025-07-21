package com.nytimes.android.coroutinesutils;

import androidx.annotation.Keep;
import com.nytimes.android.coroutinesutils.DownloadState;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* loaded from: classes4.dex */
public abstract class FetchResult<T> {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static abstract class b extends FetchResult {

        public static final class a extends b {
            private final Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th) {
                super(null);
                zq3.h(th, "error");
                this.a = th;
            }

            @Override // com.nytimes.android.coroutinesutils.FetchResult.b
            public DownloadState a(Object obj) {
                return c(obj);
            }

            public final Throwable b() {
                return this.a;
            }

            public final DownloadState c(Object obj) {
                return DownloadState.Companion.a(obj, this.a);
            }
        }

        /* renamed from: com.nytimes.android.coroutinesutils.FetchResult$b$b, reason: collision with other inner class name */
        public static final class C0251b extends b {
            private final Object a;

            public C0251b(Object obj) {
                super(null);
                this.a = obj;
            }

            public final Object b() {
                return this.a;
            }

            public final DownloadState.e c() {
                return new DownloadState.e(this.a);
            }

            @Override // com.nytimes.android.coroutinesutils.FetchResult.b
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public DownloadState.e a(Object obj) {
                return c();
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract DownloadState a(Object obj);

        private b() {
            super(null);
        }
    }

    public static final class c extends FetchResult {
        public c() {
            super(null);
        }
    }

    public /* synthetic */ FetchResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FetchResult() {
    }
}
