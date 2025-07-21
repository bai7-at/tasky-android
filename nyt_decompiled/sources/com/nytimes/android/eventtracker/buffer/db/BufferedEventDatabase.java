package com.nytimes.android.eventtracker.buffer.db;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.f;
import defpackage.nd0;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class BufferedEventDatabase extends RoomDatabase {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BufferedEventDatabase a(Context context) {
            zq3.h(context, "context");
            return (BufferedEventDatabase) f.a(context, BufferedEventDatabase.class, "event-buffer.db").e().d();
        }

        private a() {
        }
    }

    public abstract nd0 d();
}
