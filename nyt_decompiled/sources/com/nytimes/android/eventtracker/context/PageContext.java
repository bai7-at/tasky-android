package com.nytimes.android.eventtracker.context;

import android.os.Parcel;
import android.os.Parcelable;
import com.nytimes.android.eventtracker.EventTracker;
import defpackage.e52;
import defpackage.o36;
import defpackage.qs2;
import defpackage.zq3;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PageContext implements Parcelable {
    private String contextId;
    private boolean hasSentPageEvent;
    private final String id;
    private String lastContextId;
    private String lastPageviewId;
    private c mutateCallback;
    private int pageEntrances;
    private String pageviewId;
    public static final a Companion = new a(null);
    public static final Parcelable.Creator<PageContext> CREATOR = new b();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b() {
            String uuid = UUID.randomUUID().toString();
            zq3.g(uuid, "toString(...)");
            return uuid;
        }

        private a() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PageContext createFromParcel(Parcel parcel) {
            zq3.h(parcel, "parcel");
            return new PageContext(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PageContext[] newArray(int i) {
            return new PageContext[i];
        }
    }

    public interface c {
        void a(PageContext pageContext, PageContext pageContext2);
    }

    public PageContext(String str, String str2, String str3, String str4, int i) {
        zq3.h(str, "contextId");
        zq3.h(str2, "pageviewId");
        this.contextId = str;
        this.pageviewId = str2;
        this.lastContextId = str3;
        this.lastPageviewId = str4;
        this.pageEntrances = i;
        this.hasSentPageEvent = i > 0;
        this.id = Companion.b();
    }

    public final String a() {
        return this.contextId;
    }

    public final String b(final e52 e52Var) {
        zq3.h(e52Var, "subject");
        EventTracker.Guard.Companion.a(e52Var.a() + " sent before Page", new qs2() { // from class: com.nytimes.android.eventtracker.context.PageContext$generateEventIds$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                return Boolean.valueOf(((e52.this instanceof e52.g) || this.c()) ? false : true);
            }
        });
        boolean z = e52Var instanceof e52.g;
        if (z) {
            PageContext pageContext = new PageContext(this);
            h(true);
            o36 o36Var = o36.a;
            this.lastContextId = o36Var.b();
            this.lastPageviewId = o36Var.c();
            if (this.pageEntrances > 0) {
                a aVar = Companion;
                this.contextId = aVar.b();
                this.pageviewId = aVar.b();
            }
            o36Var.e(this.contextId);
            o36Var.f(this.pageviewId);
            this.pageEntrances++;
            c cVar = this.mutateCallback;
            if (cVar != null) {
                cVar.a(pageContext, this);
            }
        } else if (e52Var instanceof e52.i) {
            PageContext pageContext2 = new PageContext(this);
            o36 o36Var2 = o36.a;
            this.lastPageviewId = o36Var2.c();
            if (this.pageEntrances > 0) {
                this.pageviewId = Companion.b();
            }
            o36Var2.f(this.pageviewId);
            this.pageEntrances++;
            c cVar2 = this.mutateCallback;
            if (cVar2 != null) {
                cVar2.a(pageContext2, this);
            }
        }
        if (e52Var instanceof e52.i) {
            z = true;
        }
        return z ? this.pageviewId : Companion.b();
    }

    public final boolean c() {
        return this.hasSentPageEvent;
    }

    public final String d() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.lastContextId;
    }

    public final String f() {
        return this.lastPageviewId;
    }

    public final String g() {
        return this.pageviewId;
    }

    public final void h(boolean z) {
        o36.a.d(true);
        this.hasSentPageEvent = z;
    }

    public final void i(c cVar) {
        this.mutateCallback = cVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "out");
        parcel.writeString(this.contextId);
        parcel.writeString(this.pageviewId);
        parcel.writeString(this.lastContextId);
        parcel.writeString(this.lastPageviewId);
        parcel.writeInt(this.pageEntrances);
    }

    public /* synthetic */ PageContext(String str, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Companion.b() : str, (i2 & 2) != 0 ? Companion.b() : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) == 0 ? str4 : null, (i2 & 16) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PageContext(PageContext pageContext) {
        this(pageContext.contextId, pageContext.pageviewId, pageContext.lastContextId, pageContext.lastPageviewId, pageContext.pageEntrances);
        zq3.h(pageContext, "pageContext");
    }
}
