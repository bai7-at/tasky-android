package com.airbnb.lottie.compose;

/* loaded from: classes.dex */
public interface c {

    public static final class a implements c {
        private final int a;

        private /* synthetic */ a(int i) {
            this.a = i;
        }

        public static final /* synthetic */ a a(int i) {
            return new a(i);
        }

        public static int b(int i) {
            return i;
        }

        public static boolean c(int i, Object obj) {
            return (obj instanceof a) && i == ((a) obj).f();
        }

        public static int d(int i) {
            return Integer.hashCode(i);
        }

        public static String e(int i) {
            return "RawRes(resId=" + i + ")";
        }

        public boolean equals(Object obj) {
            return c(this.a, obj);
        }

        public final /* synthetic */ int f() {
            return this.a;
        }

        public int hashCode() {
            return d(this.a);
        }

        public String toString() {
            return e(this.a);
        }
    }
}
