package com.nytimes.android.assetretriever;

import android.content.Context;
import androidx.room.RoomDatabase;
import defpackage.dt;
import defpackage.tt;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class AssetRetrieverDatabase extends RoomDatabase {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AssetRetrieverDatabase a(Context context) {
            zq3.h(context, "context");
            return (AssetRetrieverDatabase) androidx.room.f.a(context, AssetRetrieverDatabase.class, "asset-database").f(1, 2).b(dt.a(), dt.b()).d();
        }

        private a() {
        }
    }

    public abstract com.nytimes.android.assetretriever.a d();

    public abstract i e();

    public abstract tt f();
}
