package com.nytimes.android.resourcedownloader.data;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.f;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class ResourceDatabase extends RoomDatabase {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ResourceDatabase build(Context context) {
            zq3.h(context, "context");
            return (ResourceDatabase) f.a(context, ResourceDatabase.class, "resource-database").e().d();
        }

        private Companion() {
        }
    }

    public abstract ResourceDao resourceDao();

    public abstract SourceDao sourceDao();
}
