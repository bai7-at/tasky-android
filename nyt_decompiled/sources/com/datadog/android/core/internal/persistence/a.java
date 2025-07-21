package com.datadog.android.core.internal.persistence;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.zq3;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class a {
    public static final C0158a b = new C0158a(null);
    private final String a;

    /* renamed from: com.datadog.android.core.internal.persistence.a$a, reason: collision with other inner class name */
    public static final class C0158a {
        public /* synthetic */ C0158a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(File file) {
            String absolutePath = file.getAbsolutePath();
            zq3.g(absolutePath, "absolutePath");
            return absolutePath;
        }

        public final a c(File file) {
            zq3.h(file, TransferTable.COLUMN_FILE);
            return new a(b(file));
        }

        private C0158a() {
        }
    }

    public a(String str) {
        zq3.h(str, "id");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b(File file) {
        zq3.h(file, TransferTable.COLUMN_FILE);
        return zq3.c(b.b(file), this.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && zq3.c(this.a, ((a) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "BatchId(id=" + this.a + ")";
    }
}
