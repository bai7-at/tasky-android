package com.nytimes.android.utils.snackbar;

import androidx.compose.material.SnackbarDuration;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.qs2;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public interface b {
    SnackbarDuration getDuration();

    String getKey();

    public static final class a implements b {
        private final CharSequence a;
        private final SnackbarDuration b;
        private final String c;

        public a(CharSequence charSequence, SnackbarDuration snackbarDuration, String str) {
            zq3.h(charSequence, "message");
            zq3.h(snackbarDuration, "duration");
            zq3.h(str, TransferTable.COLUMN_KEY);
            this.a = charSequence;
            this.b = snackbarDuration;
            this.c = str;
        }

        public final CharSequence a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && this.b == aVar.b && zq3.c(this.c, aVar.c);
        }

        @Override // com.nytimes.android.utils.snackbar.b
        public SnackbarDuration getDuration() {
            return this.b;
        }

        @Override // com.nytimes.android.utils.snackbar.b
        public String getKey() {
            return this.c;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            CharSequence charSequence = this.a;
            return "Message(message=" + ((Object) charSequence) + ", duration=" + this.b + ", key=" + this.c + ")";
        }

        public /* synthetic */ a(CharSequence charSequence, SnackbarDuration snackbarDuration, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(charSequence, (i & 2) != 0 ? SnackbarDuration.Short : snackbarDuration, (i & 4) != 0 ? String.valueOf(System.currentTimeMillis()) : str);
        }
    }

    /* renamed from: com.nytimes.android.utils.snackbar.b$b, reason: collision with other inner class name */
    public static final class C0444b implements b {
        private final CharSequence a;
        private final SnackbarDuration b;
        private final String c;
        private final qs2 d;
        private final String e;

        public C0444b(CharSequence charSequence, SnackbarDuration snackbarDuration, String str, qs2 qs2Var, String str2) {
            zq3.h(charSequence, "message");
            zq3.h(snackbarDuration, "duration");
            zq3.h(str, "actionText");
            zq3.h(qs2Var, "actionListener");
            zq3.h(str2, TransferTable.COLUMN_KEY);
            this.a = charSequence;
            this.b = snackbarDuration;
            this.c = str;
            this.d = qs2Var;
            this.e = str2;
        }

        public final qs2 a() {
            return this.d;
        }

        public final String b() {
            return this.c;
        }

        public final CharSequence c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0444b)) {
                return false;
            }
            C0444b c0444b = (C0444b) obj;
            return zq3.c(this.a, c0444b.a) && this.b == c0444b.b && zq3.c(this.c, c0444b.c) && zq3.c(this.d, c0444b.d) && zq3.c(this.e, c0444b.e);
        }

        @Override // com.nytimes.android.utils.snackbar.b
        public SnackbarDuration getDuration() {
            return this.b;
        }

        @Override // com.nytimes.android.utils.snackbar.b
        public String getKey() {
            return this.e;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            CharSequence charSequence = this.a;
            return "MessageWithAction(message=" + ((Object) charSequence) + ", duration=" + this.b + ", actionText=" + this.c + ", actionListener=" + this.d + ", key=" + this.e + ")";
        }

        public /* synthetic */ C0444b(CharSequence charSequence, SnackbarDuration snackbarDuration, String str, qs2 qs2Var, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(charSequence, (i & 2) != 0 ? SnackbarDuration.Short : snackbarDuration, str, qs2Var, (i & 16) != 0 ? String.valueOf(System.currentTimeMillis()) : str2);
        }
    }
}
